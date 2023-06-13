package com.design_pattern.design_pattern.singleton;

public class MyObject {

    private final String className;

    public MyObject(String className) {
        this.className = className;
    }

    public void print() {
        SingletonObject singletonObject = SingletonObject.getObject();
        System.out.println("MyObject : " + className + ", ");
        singletonObject.print();
    }
    
}
