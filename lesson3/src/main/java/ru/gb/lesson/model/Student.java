package ru.gb.lesson.model;

import lombok.Getter;

@Getter
public class Student {
    long id;
    String name;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
