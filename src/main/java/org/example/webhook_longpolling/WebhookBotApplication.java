package org.example.webhook_longpolling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.bots.DefaultAbsSender;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class WebhookBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebhookBotApplication.class, args);
    }
}

@RestController
class WebhookController {

    private final MyTelegramBot myTelegramBot;

    public WebhookController(MyTelegramBot myTelegramBot) {
        this.myTelegramBot = myTelegramBot;
    }

    @PostMapping("/webhook")
    public void onUpdateReceived(@RequestBody Update update) {
        try {
            myTelegramBot.onWebhookUpdateReceived(update);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

class MyTelegramBot extends DefaultAbsSender {

    private static final String BOT_TOKEN = "YOUR_BOT_TOKEN";

    public MyTelegramBot() {
        super(new DefaultBotOptions());
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    public void onWebhookUpdateReceived(Update update) throws TelegramApiException {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String chatId = update.getMessage().getChatId().toString();
            String receivedMessage = update.getMessage().getText();

            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            message.setText("You said: " + receivedMessage);

            execute(message);
        }
    }
}
