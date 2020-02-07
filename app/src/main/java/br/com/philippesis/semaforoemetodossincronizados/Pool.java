package br.com.philippesis.semaforoemetodossincronizados;

import java.util.concurrent.Semaphore;

public class Pool {
    private final Semaphore available = new Semaphore(1);

    public String getItem() throws InterruptedException {
        available.acquire();
        return getNextAvailableItem();
    }

    public void terminate() {
        available.release();
    }

    private synchronized String getNextAvailableItem() throws InterruptedException {
        Thread.sleep(500);
        return "1";
    }

    public Semaphore getAvailable() { return available; }
}
