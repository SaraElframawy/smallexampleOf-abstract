package Test;

import Test.Person;

public class Female extends Person {
    private static final String class_Name = "female";
    public Female(String name, int age){
        this.name=name ;
        this.age=age;
    }
    @Override
    public void printClassName(){
        System.out.println("the person "+name+"belongs to class\t"+ class_Name);
    }
}
