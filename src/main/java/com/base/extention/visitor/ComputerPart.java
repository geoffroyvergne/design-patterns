package com.base.extention.visitor;

public interface ComputerPart {
  public void accept(ComputerPartVisitor computerPartVisitor);
}
