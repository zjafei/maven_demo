package com.imooc.maven01.model;

import org.junit.*;
import org.junit.Assert.*
;
public class HelloTest {
  @Test
  public void sayHello(){
    Assert.assertEquals("hello world", new Hello().sayHello());
  }
}