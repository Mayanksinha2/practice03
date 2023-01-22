package com.internshala;
import java.util.Scanner;

public class praactice_03 {
    public static void main(String[] args) {
        String name;
        int age;

        System.out.println("Enter user name");

        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();

        System.out.print("Your name is " + name + " and your age is " + age);

    }
}
