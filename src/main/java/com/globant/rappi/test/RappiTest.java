package main.java.com.globant.rappi.test;

import main.java.com.globant.rappi.test.test1.Result;

public class RappiTest {
    public static void main(String[] args) {
        //Test1
        Result test1 = new Result();
        System.out.println("x(1,2) = " + test1.result(1,2).get());

    }
}
