package ru.isuct;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Cat a = new Cat();
//        System.out.println(a);
//        System.out.println(Integer.parseInt("5") + 1);
//        Calculator calc = new Calculator();
//        calc.taskA(0.4,0.8,3.2,6.2,0.6);
//        double xtmp[] = {4,3,2,5,3};
//        List x = Arrays.asList(4.0, 5.0, 6.0, 7.0, 8.0);
//        ArrayList<Double> res = calc.taskB(0.4,0.8,x);
//        System.out.println(res);
////        System.out.println(String.format("y(%.2f)=%.2f", x, res));
//        Calendar birth = Calendar.getInstance();
//        birth.set(1975, 04, 20);
//
//        Date today = new Date();
//        long diff = today.getTime() - birth.getTimeInMillis();
//        Calendar res = Calendar.getInstance();
//        res.setTimeInMillis(diff);
//
//        System.out.println(birth.getTime());
//        System.out.println(today);
//        System.out.println(String.format("%d %d %d", res.get(Calendar.YEAR) - 1970, res.get(Calendar.MONTH), res.get(Calendar.DAY_OF_MONTH)));

//
//        try {
//            FileWriter fl = new FileWriter("Test.txt");
//            fl.write("Hello world! New Tests 1234 asdfgjasd flka sdjf najdf ");
//            fl.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileReader fr = new FileReader("Test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }



    }
}
