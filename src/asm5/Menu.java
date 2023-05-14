package asm5;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        StudentManagement st = new StudentManagement();
        int luaChon = 0;
        do {
            System.out.println("--------------");
            System.out.println("Menu ");
            System.out.println("1. Add student\n" +
                    "2. Edit student by id\n" +
                    "3. Delete student by id\n" +
                    "4. Sort student by gpa\n" +
                    "5. Sort student by name\n" +
                    "6. Show student\n" +
                    "0. Exit."
                    + "");
            Scanner sc = new Scanner(System.in);
            luaChon = sc.nextInt(); sc.nextLine();
            switch (luaChon) {
                case 1:st.add();
                    System.out.println(st.toString());
                break;
                case 2:
                    System.out.println("Nhập id cần sửa ");
                    int id = sc.nextInt(); sc.nextLine();
                    st.edit(id);
                    System.out.println(st.toString());
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên cần xóa");
                    int idDelete = sc.nextInt(); sc.nextLine();
                    st.delete(idDelete);
                    break;
                case 4:
                    st.sortgpa();
                    System.out.println(st.toString());
                    break;
                case 5:
                    st.sortname();
                    System.out.println(st.toString());
                    break;
                case 6:
                    st.show();
                    break;
                case 0:
                    break;
            }


        } while (luaChon != 0);
    }
}
