package lesson9;

public class Person {
    private int age;
    private String name;
    private String sername;
    private long phoneNumber;

    public Person(){

    }

    public Person(int newAge){
        age=newAge;
       }
    public Person(String newName,String newSername){
        name=newName;
        sername=newSername;
    }
    public Person(long newPhoneNumber){
        phoneNumber=newPhoneNumber;
    }
    public Person(String newName){
        name=newName;
    }

}
