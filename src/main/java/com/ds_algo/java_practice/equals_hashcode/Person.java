package com.ds_algo.java_practice.equals_hashcode;

import java.util.Objects;
import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private int age;

    public Person(String name, int age){
        id = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Person other = (Person) o;

        return age == other.age && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

}
