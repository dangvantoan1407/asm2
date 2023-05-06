package asm2;

import demo4.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    String name, telephone, address;
    int age;


    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void Add(){
        Scanner sc = new Scanner(System.in);
         name = sc.nextLine();

    }


}
