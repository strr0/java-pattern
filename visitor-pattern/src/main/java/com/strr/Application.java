package com.strr;

import com.strr.code.ComputerPartDisplayVisitor;
import com.strr.code.computer.Computer;
import com.strr.code.computer.ComputerPart;

/**
 * 访问者模式
 * 主要将数据结构与数据操作分离。
 */
public class Application {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
