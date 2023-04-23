package com.strr.code.computer;

import com.strr.code.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
