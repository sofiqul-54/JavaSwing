package com.sofiqul54.evidence05;

public class Student {
private String id;
private String name;
private String Email;
private String gender;
private String hobby;
private String round;
private int age;
private String message;

    public Student() {
    }

    public Student(String id, String name, String Email, String gender, String hobby, String round, int age, String message) {
        this.id = id;
        this.name = name;
        this.Email = Email;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.age = age;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public int getAge() {
        return age;
    }

    public String getMessage() {
        return message;
    }




}
