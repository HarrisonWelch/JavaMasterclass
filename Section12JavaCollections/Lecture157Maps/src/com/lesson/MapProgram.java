package com.lesson;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "A compiled, high level, object-oriented, platform indepenedent language...");
            System.out.println("Java added successfully");
        }
        languages.put("Java", "A compiled, high level, object-oriented, platform indepenedent language...");
        languages.put("Python", "An interpreted, object-oriented, high-level programming language");
        languages.put("Algol", "An algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies the madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }

        System.out.println(languages.put("Java", "this course is about Java"));
        System.out.println(languages.get("Java"));

        System.out.println("============================================================");

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
