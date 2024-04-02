package com.inter.lam;

public class CourseLambda {
    public static void main(String[] args) {
        ICourse courses = ()-> new String[] {"HTML","CSS","Bootstrap"};
        String[] webCourses = courses.showCourses();
        System.out.print("Web Courses are :");
        for (String course : webCourses){
            System.out.print(course+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");

        courses = ()->new String[]{"AWS","GoogleCloud","Azure"};
        String[] cloudCourse = courses.showCourses();
        System.out.print("Web Courses are :");
        for(String course:cloudCourse){
            System.out.print(course+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");

        courses = ()->new String[]{"Java","Javascript","React"};
        System.out.print("Fullstack Courses are :");
        for(String course:courses.showCourses()){
            System.out.print(course+" ");
        }

    }
}
