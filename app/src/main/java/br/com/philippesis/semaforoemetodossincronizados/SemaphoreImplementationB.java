package br.com.philippesis.semaforoemetodossincronizados;

import java.util.concurrent.Semaphore;

public class SemaphoreImplementationB {

    private String name;

    public SemaphoreImplementationB(String name) {
        this.name = name;
    }


    private static Semaphore semaphore = new Semaphore(1);

    public void run() {

        try {

            System.out.println(name + " : acquiring lock...");
            System.out.println(name + " : available Semaphore permits now: "
                    + semaphore.availablePermits());

            semaphore.acquire();
            System.out.println(name + " : got the permit!");

            try {

                for (int i = 1; i <= 5; i++) {

                    System.out.println(name + " : is performing operation " + i
                            + ", available Semaphore permits : "
                            + semaphore.availablePermits());

                    // sleep 1 second
                    Thread.sleep(400);

                }

            } finally {

                // calling release() after a successful acquire()
                System.out.println(name + " : releasing lock...");
                semaphore.release();
                System.out.println(name + " : available Semaphore permits now: "
                        + semaphore.availablePermits());

            }

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

    }

}
