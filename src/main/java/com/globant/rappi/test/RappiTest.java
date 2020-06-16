package main.java.com.globant.rappi.test;

import main.java.com.globant.rappi.test.test1.Result;
import main.java.com.globant.rappi.test.test2.Level;
import main.java.com.globant.rappi.test.test3.Attribute;
import main.java.com.globant.rappi.test.test3.Rule;
import main.java.com.globant.rappi.test.test3.Validator;

import java.util.HashMap;
import java.util.Map;

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


        //Test3
        Validator validator = new Validator();

        //        1- Una order con el atributo shopper=true y el atributo cooking_time=0 no puede asignarse
        Rule rule1 = new Rule();
        rule1.addCondition(new Attribute("shopper", true))
                .addCondition(new Attribute("cooking_time", 0));

        //        2- Una order con el atributo partner=true y el atributo cooking_time=0 no puede asignarse
        Rule rule2 = new Rule();
        rule2.addCondition(new Attribute("partner", true))
                .addCondition(new Attribute("cooking_time", 0));

        //        3- Una order con el atributo lat=null y/o el atributo lng=null no puede asignarse
        Rule rule3 = new Rule();
        rule3.addCondition(new Attribute("lat", null)); // por el or lng=null no es relevante

        validator.addRule(rule1).addRule(rule2).addRule(rule3);

        Map<String, Attribute> order = new HashMap<>();
        order.put("shopper", new Attribute("shopper", true));
        //order.put("cooking_time", new Attribute("cooking_time", 0));
        order.put("partner", new Attribute("partner", true));
        //order.put("lat", new Attribute("lat", null));
        order.put("lng", new Attribute("lng", null));

        System.out.println();

        if(validator.validate(order)){
            System.out.println("puede asignarse");
        }else {
            System.out.println("no puede asignarse en esta iteracion");
        }
    }
}
