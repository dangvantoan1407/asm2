package demo6;

import demo4.Student;

public class MaleStudent extends Student implements IStudent,IMale{
    public MaleStudent(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void PlayFootball() {

    }
    @Override
    public void learn() {

    }

    @Override
    public void drink() {

    }
}