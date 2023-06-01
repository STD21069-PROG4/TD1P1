package com.example.td1;

public class TestClassUniqueInstance {
    public static void main(String[] args) {

        ClassUniqueInstance instance1 = ClassUniqueInstance.getInstance();
        ClassUniqueInstance instance2 = ClassUniqueInstance.getInstance();
        ClassUniqueInstance instance3 = ClassUniqueInstance.getInstance();


        instance1.setClick("Premier click");
        instance2.setClick("Deuxième click");
        instance3.setClick("Troisième click");


        System.out.println("Click 1 : " + instance1.getClick());
        System.out.println("Click 2 : " + instance2.getClick());
        System.out.println("Click 3 : " + instance3.getClick());
    }
}
