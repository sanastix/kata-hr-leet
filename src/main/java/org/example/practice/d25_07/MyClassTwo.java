package org.example.practice.d25_07;

import java.util.concurrent.*;

public class MyClassTwo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        int result;

        Callable<Integer> c = () -> {
            TimeUnit.SECONDS.sleep(3L);
            return 0;
        };

        Runnable runnable = () -> System.out.println("running");

        // Future як обгортка, що тримає в собі результат обробки іншого потоку
        //Future<Integer> submit = ex.submit(c);
        Future<?> submit = ex.submit(runnable); // нічого не падає, але повертає null
        // Може зависнути в очікуванні: спимо 3 секунди, а чекаємо 2
        System.out.println(submit.get(2L, TimeUnit.SECONDS));


        // TODO: isDone(), not Integer
    }

}
