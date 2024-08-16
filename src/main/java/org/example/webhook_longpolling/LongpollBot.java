package org.example.webhook_longpolling;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class LongpollBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "YOUR_BOT_USERNAME";
    }

    public String getBotToken() {
        return "YOUR_BOT_TOKEN";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String chatId = update.getMessage().getChatId().toString();
            String receivedMessage = update.getMessage().getText();

            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            message.setText("You said: " + receivedMessage);

            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        LongpollBot bot = new LongpollBot();
        // Запуск бота тут: використання TelegramBotsApi для реєстрації
    }
}
