package Test;

import Test.Person;

public class OtherGender extends Person {
    protected static String CLASS_NAME= "othergender";
    OtherGender(String name, int age){
        this.name= name;
        this.age=age;

    }



    @Override
    public void printClassName() {
        System.out.println("the person name :"+name+"belongs to class\t"+CLASS_NAME);

    }
}
