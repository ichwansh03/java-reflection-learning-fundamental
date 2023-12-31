package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increment(){
        counter.incrementAndGet();
    }

    public void decrement(){
        counter.decrementAndGet();
    }

    public void getIncrement(){
        counter.getAndIncrement();
    }

    public Integer getCounter(){
        return counter.get();
    }
}
