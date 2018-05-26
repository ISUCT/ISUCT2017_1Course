package ru.isuct;

import java.io.IOException;
import java.util.Calendar;

public class Cat {
    public Cat(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        Calculator calc = new Calculator();
        try {
            calc.dateDiff();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "I am cat";


    }


}
