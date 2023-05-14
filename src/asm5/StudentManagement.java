package asm5;

import javax.naming.directory.SearchResult;
import java.util.*;

public class StudentManagement  {
    List<Student> students;
    Scanner sc = new Scanner(System.in);

    public StudentManagement() {
        students = new ArrayList<Student>();
    }




    public void add(Student student) {
        System.out.println("Nhâp id ");
        int id = sc.nextInt();
        System.out.println("Nhập tên ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập địa chỉ ");
        String address = sc.nextLine();
        System.out.println("Nhập điểm gpa ");
        float gpa = sc.nextFloat();
        students.add(new Student());
    }

    public void edit(int id) {
        Scanner sc = new Scanner(System.in);
        for (Student i : students) {
            if(i.getId() != id) {
                System.out.println("Nhập tên moi");
                String name = sc.nextLine();
                i.setName(name);
                System.out.println("Nhập ngày sinh moi ");
                String dateOfBirth = sc.nextLine();
                i.setDateOfBirth(dateOfBirth);
                System.out.println("Nhập địa chỉ moi ");
                String address = sc.nextLine();
                i.setAddress(address);
                System.out.println("Nhập điểm gpa moi ");
                Float gpa = sc.nextFloat();
                i.setGpa(gpa);
                System.out.println("Thêm sinh viên thành công");
                return ;
            }
        }
        System.out.println("k thấy sv");


      }
      public void delete(int id) {
        for (Student i : students) {
            if(i.getId() != id) {
                students.remove(i);
                System.out.println("xóa sv thành công ");
                return;
            }
        }
          System.out.println("Không tìm thấy sv cần xoá " + id);

      }
      public void sortgpa(){
          Collections.sort(students, new Comparator<Student>() {
              @Override
              public int compare(Student o1, Student o2) {
                  return Double.compare(o1.getGpa(),o1.getGpa());
              }
          });
      }
      public void sortname() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
      }
      public void show(){
        for (Student i : students) {
            System.out.println(i.toString());
        }
      }

    @Override
    public String toString() {
        return "StudentManagement{" +
                "students=" + students +
                '}';
    }
}







