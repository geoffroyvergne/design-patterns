package com.base.interfaces.facade;

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Rectangle::draw()");
  }
}
