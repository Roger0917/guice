package org.demo.guicedemo.helloworlddemo;

import java.io.PrintStream;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/7/22 0022 23:40
 * 4
 */
public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    public PrintStreamWriter(PrintStream destination) {
        super();
        this.destination = destination;
    }

    @Override
    public void write(String string) {
        destination.println(string);
    }
}
