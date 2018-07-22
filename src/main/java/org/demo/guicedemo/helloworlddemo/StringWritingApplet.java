package org.demo.guicedemo.helloworlddemo;

import org.demo.guicedemo.MyApplet;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/7/22 0022 21:26
 * 4
 */
public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private StringProvider stringProvider;

    public StringWritingApplet(MyDestination destination,StringProvider stringProvider) {
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString(){
        stringProvider.get();
    }

    @Override
    public void run() {
        writeString();
    }
}
