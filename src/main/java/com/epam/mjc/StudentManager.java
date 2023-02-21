package com.epam.mjc;


public class StudentManager {

    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        if (Student.getValueOf(studentID) == null)
            throw new MyException(studentID);
        return Student.getValueOf(studentID);
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        System.out.println(manager.find(10000));
        for (int i = 0; i < IDs.length; i++) {
            Student student = manager.find(IDs[i]);
            System.out.println("Student name " + student.getName());
        }

    }
}