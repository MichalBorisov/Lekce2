package com.company;
import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("James", "Brown", LocalDate.of(1995,12,12));
        setStudentGrades(student, 2, 3, 4, 3);
        showResult( student);
        Student student4 = new Student("Dean", "Shepard", LocalDate.of(1992,4,22));
        setStudentGrades(student4, 2, 5, 4, 5);
        showResult( student4);
        Student student2 = new Student("Rodger", "Dilan", LocalDate.of(1995,3,12));
        setStudentGrades(student2, 1, 1, 1, 1);
        showResult( student2);
        Student student3 = new Student("Alex", "Green", LocalDate.of(1996,1,24));
        setStudentGrades(student3, 1, 2, 1, 1);
        showResult( student3);
        student4.updateGrade(1,2);
        student4.checkIfPassedAll(true);
    }
    private static void setStudentGrades(Student student, int subject1, int subject2, int subject3, int subject4)
    {
        student.setGrade(subject1);
        student.setGrade(subject2);
        student.setGrade(subject3);
        student.setGrade(subject4);
    }
    private static void showResult(Student student)
    {
        boolean showGrades = true;
        ArrayList<Integer> studentGrades = student.getAllGrades();
        if(!studentGrades.contains(2)&&!studentGrades.contains(3)&&!studentGrades.contains(4)&&!studentGrades.contains(5))
            showGrades = false;
        student.checkIfPassedAll(showGrades);
    }
}