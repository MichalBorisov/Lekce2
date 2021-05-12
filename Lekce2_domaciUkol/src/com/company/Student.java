package com.company;
import java.time.LocalDate;
import java.util.ArrayList;
public class Student {
    private String name;
    private String surname;
    private LocalDate birthday;
    private ArrayList<Integer> grade = new ArrayList<>();
    public  Student(String name, String surname, LocalDate birthday)
    {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String surname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getFullName()
    {
        return name +" "+surname;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public void setGrade(int grade) {
        if(this.grade.size()>=4) {
            System.out.println("Too many Grades for student " + getFullName());
            return;
        }
        this.grade.add(grade);
    }
    public void updateGrade(int subject, int grade) {
        System.out.println("Updating grade for student "+ getFullName() +" for subject #"+ subject);
        System.out.println("New grade for subject #"+ subject +" is "+ grade );
        this.grade.set(subject, grade);
    }
    public void printGradePerOneSubject(int subject)
    {
        System.out.println("Grade for subject #"+ subject +" is "+ grade.get(subject));
    }
    public ArrayList<Integer> getAllGrades()
    {
        return grade;
    }
    public void printAllGrades()
    {
        String grades="";
        for(int index = 0; index<grade.size(); index++)
        {
            grades = grades + " "+grade.get(index);
        }
        System.out.println("Grade for all subjects are " + grades);
    }
    public void checkIfPassedAll(boolean showGrades) {
        System.out.println("Student name: " + name);
        System.out.println("Student surname: " + surname);
        if (grade.contains(4) || grade.contains(5)) {
            System.out.println("Not all exams were passed");
        } else if (!grade.contains(4) && !grade.contains(5)) {
            if (grade.contains(3) || grade.contains(2)) {
                System.out.println("Exams were passed");
            } else if (grade.contains(1) && !grade.contains(3) && !grade.contains(2)) {
                System.out.println("Exams were passed with excellence");
            }
        }
        if(showGrades)
            printAllGrades();
        System.out.println();
    }
}