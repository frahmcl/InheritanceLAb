package com.ChrisFrahm;

public class Startup {
        public static void main(String[] args) {
        Course course = new AdvancedJavaCourse("Advanced Java", "152-135-001", 3);
        Course course2 = new IntroJavaCourse("Intro to Java", "152-134-001", 3);
        Course course3 = new IntroToProgrammingCourse("Intro to Programming", "152-107-001", 2);

        course.toString();
        course2.toString();
        course3.toString();
       }


 }