 import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Person extends serialization1{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class serialization1{
    public static void main(String[] args) {
        Person person = new Person("ABC",30);
        try{
            FileOutputStream fileOut = new FileOutputStream("person.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(person);
            objectOut.close();
            fileOut.close();
            System.out.println("Object has been serialized");
        }catch(IOException e){
            e.printStackTrace();
        }
        Person deserializedPerson=null;
        try{
            FileInputStream fileIn=new FileInputStream("person.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            deserializedPerson=(Person) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Object has been deserialized");
        }catch(IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
        if(deserializedPerson!=null){
            System.out.println("Deserialized Person - Name:"+ deserializedPerson.getName()+",Age : "+deserializedPerson.getAge());
        }
    }
}
