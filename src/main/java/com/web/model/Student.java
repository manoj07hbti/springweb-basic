package com.web.model;

public class Student {


    String name;
    int roll_no;
    String branch;


    public Student(){};// default construtor

    public Student(String name, int roll_no, String branch) {

        this.name = name;
        this.roll_no = roll_no;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
