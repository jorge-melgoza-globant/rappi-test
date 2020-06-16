package main.java.com.globant.rappi.test.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Validator {
    List<Rule> rules = new ArrayList<>();

    public Validator addRule(Rule rule){
        this.rules.add(rule);
        return this;
    };

    public boolean validate(Map<String, Attribute> order){
        for (Rule rule : this.rules) {
            if(!rule.validate(order)){
                return false;
            }
        }
        return true;
    }
}
