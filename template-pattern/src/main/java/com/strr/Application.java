package com.strr;

import com.strr.code.Cricket;
import com.strr.code.Football;
import com.strr.code.Game;

/**
 * 模板模式
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 */
public class Application {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
