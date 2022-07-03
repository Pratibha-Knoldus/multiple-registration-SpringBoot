package com.example.multiple.registration.entity;

import javax.persistence.*;

/**
 * The type Student.
 */
@Entity
@Table(name = "student")
public class Student {
    /**
     * The Id.
     */
    @Id
    public int id;
    /**
     * The Student no.
     */
    public String studentNo;
    /**
     * The First name.
     */
    public String firstName;
    /**
     * The Last name.
     */
    public String lastName;
    /**
     * The Age.
     */
    public int age;
    /**
     * The Address.
     */
    public String address;

    public Object getStudentByName(String pratibha) {
        return null;
    }

    public void setName(String pratibha) {
    }
}

