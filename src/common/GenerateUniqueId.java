package common;

import java.util.concurrent.atomic.AtomicInteger;

public class GenerateUniqueId {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static int generateUniqueId() {
        int id = counter.incrementAndGet();
        System.out.println("Generated ID: " + id);
        return id;
    }

}
