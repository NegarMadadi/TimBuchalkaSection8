package org.example.autoboxingAndUnboxing;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}



public class Main {

    public static void main(String[] args) {
        String[] stringArray =  new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

      //  ArrayList<IntClass> intArrayList = new ArrayList<>();
        ArrayList<IntClass> intClassesArrayList = new ArrayList<>();
        intClassesArrayList.add(new IntClass(54));
        Integer integer = 54;
        Double doubleValue = 12.25;

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0 ; i <= 10; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0 ; i <= 10; i++){
            System.out.println(i + "-->" + intArrayList.get(i).intValue());
        }





        Integer myIntValue = 56;
        int myint = myIntValue;

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double dbl = 0 ; dbl <= 10; dbl+=.5){
            myDoubleValues.add(dbl);
        }

        for (int i = 0 ; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + "-->" + value);
        }



    }
}
