package org.tanc.proxy;

import java.util.Random;

/**
 * 火箭
 * Created by tanc on 2017/4/11.
 */
public class Rocket implements Movable {

    @Override
    public void move() {
        System.out.println("火箭 move 中。");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("火箭 run 中。");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
