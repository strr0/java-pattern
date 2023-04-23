package com.strr.code.computer;

import com.strr.code.ComputerPartVisitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
