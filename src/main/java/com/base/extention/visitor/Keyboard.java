package com.base.extention.visitor;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
    }
}
