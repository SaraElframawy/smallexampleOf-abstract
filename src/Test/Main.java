package Test;

public class Main {
    public static void main(String[] args) {
      Male male = new Male("amr",35);
      Female female = new Female("sara",29);
      OtherGender otherGender= new OtherGender("n",22);
      male.printClassName();
      female.printClassName();
      otherGender.printClassName();

    }
}