package Test;

import Test.Person;

public class Male extends Person {
    private static final String class_name= "male";

    public Male(String name, int age) {
     this.name= name;
     this.age=age;
    }
    @Override
    public void printClassName(){
        System.out.println("the person \t"+name +"\t"+"belongs to class\t"+ class_name);
    }
}
