package com.design_pattern.design_pattern.adapter;

public class Computer implements Electronic220v {

    @Override
    public void power220vOn() {
        System.out.println("컴퓨터 전원 On -- 220v");
    }
    
}
