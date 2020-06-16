package main.java.com.globant.rappi.test.test3;

import java.util.HashMap;
import java.util.Map;

public class Rule {
    Map<String, Attribute> attributeList = new HashMap<>();

    public Rule addCondition(Attribute attribute){
        this.attributeList.put((String) attribute.getAttributeName(), attribute); //Me mandaba un error intellij sin el cast
        return this;
    }

    public boolean validate(Map<String, Attribute> order){

        for (Map.Entry<String,Attribute> condition: this.attributeList.entrySet()) {
            Attribute orderValue = order.get(condition.getKey());
            if(orderValue==null){ //Order doesn't have the condition to evaluate
                return true;
            }else if( !(condition.getValue().getValue()==null && orderValue.getValue()==null)){ //Check for both null
                return true;
            }else if( orderValue.getValue()!=null && !condition.getValue().getValue().equals(orderValue.getValue())){
                //One condition not met
                return true;
            }
        }
        return false;
    }
}
