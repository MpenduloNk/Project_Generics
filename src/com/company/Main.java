package com.company;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {14,15,26,45,74};
        String[] strArr ={"T'bos", "Mpesh", "LootLove", "LKG Kganyakgo"};

        Generic<String> strObject = new Generic<>();
        strObject.setValue("Text");
        System.out.println(strObject.getValue());

        Generic<Integer> intObject = new Generic<>();
        intObject.setValue(1000);
        System.out.println(intObject.getValue());

        intObject.printArrayContent(arr);
        System.out.println("******************"+"\n");

        strObject.printArrayContent(strArr);
    }
}
