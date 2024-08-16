package org.example;

public class DemoException {

    public static void main(String[] args) {
        MyCheckedException mce = new MyCheckedException();
        MyUncheckedException mue = new MyUncheckedException();
        //throw mce;
        throw mue;
    }

}
class MyCheckedException extends Exception {

}

class MyUncheckedException extends RuntimeException {

}