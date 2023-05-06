package asm2;

import java.util.Scanner;

public class Room {
    String name, position, listPerson;


    public Room(){
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getListPerson() {
        return listPerson;
    }

    public void setListPerson(String listPerson) {
        this.listPerson = listPerson;
    }


    public void Adder(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tên ");
        name = sc.nextLine();
        System.out.println("Chức vụ");
        position = sc.nextLine();

    }
    public void Remove(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tên cần xóa ");
        name = sc.nextLine();
        System.out.println("Chức vụ");
        position = sc.nextLine();


    }

}
