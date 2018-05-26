package ru.isuct;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public double calc(double a, double b, double x){
        double chisl = (Math.pow(a,x) - Math.pow(b,x))*Math.pow(a*b,1/3.0);
        double znamen = Math.log(a/b);
        double y = chisl/znamen;
        return y;
    }

    public double taskA(double a, double b, double xn, double xk, double dx){
        ArrayList<Double> y = new ArrayList<>();
        for(double x=xn; x<=xk; x+=dx){
            double res = calc(a,b,x);
        }
        return 1;
    }

    public ArrayList<Double> taskB(double a, double b, List<Double> x){
        ArrayList<Double> y = new ArrayList<>();

        for(Double item : x){
            double res = calc(a,b,item);
            y.add(res);
        }

        return y;
    }


    public void dateDiff() throws IOException{
        throw new IOException();

    }

}
