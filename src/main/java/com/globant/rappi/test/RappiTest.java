package main.java.com.globant.rappi.test;

import main.java.com.globant.rappi.test.test1.Result;
import main.java.com.globant.rappi.test.test2.Level;

public class RappiTest {
    public static void main(String[] args) {
        //Test1
        Result test1 = new Result();
        System.out.println("x(1,2) = " + test1.result(1,2).get());

        //Test2
        Level level = new Level();
        //>> x(od_tag=4, od_ite=0)  = [4]
        System.out.println("Niveles abiertos: "+ level.checkLevel( 4, 0));
        //>> x(od_tag=4, od_ite=5)  = [4, 3]
        System.out.println("Niveles abiertos: "+ level.checkLevel( 4, 5));
        //>> x(od_tag=4, od_ite=10) = [4, 3, 2]
        System.out.println("Niveles abiertos: "+ level.checkLevel( 4, 10));
        //>> x(od_tag=4, od_ite=15) = [4, 3, 2, 1]
        System.out.println("Niveles abiertos: "+ level.checkLevel( 4, 15));



    }
}
