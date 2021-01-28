package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m1,m2,m3,m4,m5;
        float percentage;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks of subjects");
        System.out.print("Enter the marks of subject 1: ");
        m1 = s.nextInt();
        System.out.print("Enter the marks of subject 2: ");
        m2 = s.nextInt();
        System.out.print("Enter the marks of subject 3: ");
        m3 = s.nextInt();
        System.out.print("Enter the marks of subject 4: ");
        m4 = s.nextInt();
        System.out.print("Enter the marks of subject 5: ");
        m5 = s.nextInt();
        percentage = (float)((m1+m2+m3+m4+m5)/500)*100;
        System.out.print("The percetage scored is: ");
        System.out.print(percentage);
    }
}
