package org.example.practice.d25_07;

import java.util.Random;
import java.util.TreeSet;

public class MyClass implements AutoCloseable, Comparable{

    public static void print() {
        try(MyClass mc = new MyClass()){
            System.out.println("printing...");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        print();
        MyClass newMC = new MyClass();
        TreeSet<Random> tree = new TreeSet<>((o1, o2) -> 0);
        tree.add(new Random());
    }

    @Override
    public void close() throws Exception {
        System.out.println("finishing");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


