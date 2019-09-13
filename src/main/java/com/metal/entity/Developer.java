package com.metal.entity;

import java.math.BigDecimal;

public class Developer {
    private String full_name;
    private int age;
    private String level;
    private BigDecimal salary;

    public Developer(String full_name, int age, String level, BigDecimal salary) {
        this.full_name = full_name;
        this.age = age;
        this.level = level;
        this.salary = salary;
    }

    public Developer() {
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "full_name='" + full_name + '\'' +
                ", age=" + age +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }
}
