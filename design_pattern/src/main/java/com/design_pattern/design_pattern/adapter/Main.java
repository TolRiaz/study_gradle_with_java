package com.design_pattern.design_pattern.adapter;

public class Main {

    public static void main(String[] args) {

        Radio radio = new Radio();
        connect(radio);
        
        /*
        220v는 110v에서 동작하지 않음
        AirConditioner airConditioner = new AirConditioner();
        connect(airConditioner);
        */

        Computer computer = new Computer();
        PowerAdapter powerAdapter = new PowerAdapter(computer);

        connect(powerAdapter);

    }

    public static void connect(Electronic110v electronic110v) {
        electronic110v.power110vOn();
    }
    
}