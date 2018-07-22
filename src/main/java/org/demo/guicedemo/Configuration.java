package org.demo.guicedemo;


import org.demo.guicedemo.helloworlddemo.PrintStreamWriter;
import org.demo.guicedemo.helloworlddemo.StringProvider;
import org.demo.guicedemo.helloworlddemo.StringWritingApplet;

/**
 * 2 * @Author: Roger
 * 3 * @Date: 2018/7/22 0022 21:33
 * 4
 */
public class Configuration {
    public static MyApplet getMainApplet(){
        return new StringWritingApplet(new PrintStreamWriter(System.out), new StringProvider(){
            @Override
            public String get() {
                return "Hello World";
            }
        });
    }
}
