package com.sofiqul54.evidence_final_practice;

/**
 *
 * @author Abu Rayhan
 */
public class Student {

    String id;
    String name;
    String password;
    String email;
    String gender;
    String round;

    public Student() {
    }

    public Student(String id, String name, String password, String email, String gender, String round) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.round = round;
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

    public String getGender() {
        return gender;
    }

    public String getRound() {
        return round;
    }
    
    
    

}
