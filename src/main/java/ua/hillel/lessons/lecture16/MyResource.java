package ua.hillel.lessons.lecture16;

import java.io.Closeable;
import java.io.IOException;

public class MyResource implements Closeable {
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("Creating resource with name " + name);
    }

    @Override
    public void close() {
        System.out.println("Close " + name);
    }
}
