package com.ds_algo;

import com.ds_algo.java_practice.equals_hashcode.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        testPerson();
    }

    private static void testPerson() {
        Map<Person, String> map = new HashMap<>();
        Person p1 = new Person("Claude", 2);
        map.put(p1, "Anthropic");

        Person p2 = new Person("Claude", 2);

        System.out.println(map.get(p2)); // Must print "Anthropic"
        System.out.println(p1.equals(p2));
    }
}
