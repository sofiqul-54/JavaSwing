package com.sofiqul54.evidence_final_practice_02;

public class Student {

    String id;
    String name;
    String password;
    String email;
    int age;
    String gender;
    String hobby;
    String round;
    String message;

    public Student() {
    }

    public Student(String id, String name, String password, String email, int age, String gender, String hobby, String round, String message) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
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

    public String getMessage() {
        return message;
    }
    
    

}
