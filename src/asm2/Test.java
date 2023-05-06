package asm2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Person pr1 = new Person();

        Room r = new Room();
        r.Adder();
        r.Remove();

        ArrayList<String> listPerson = new ArrayList<>();
        String st = new String();
        listPerson.add(pr1.name);
        System.out.println(r.name);
        System.out.println(r.position);
        listPerson.remove(r.name);











    }
}
