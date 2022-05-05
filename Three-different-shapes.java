package com.company;
// Program makes three different shapes using methods
public class Main {

    //The three different methods are printed
    public static void main(String[] args) {
        System.out.println("SHAPE ONE");
        top();
        mid1();
        bottom();
        System.out.println("");
        System.out.println("SHAPE TWO");
        top();
        mid2();
        bottom();
        System.out.println("");
        System.out.println("SHAPE THREE");
        top();
        mid3();
        bottom();
    }
    // Top half of the shape
    public static void top() {
        System.out.println("  --------------------");
        System.out.println(" /                     \\");
        System.out.println("/                       \\");
    }
    // First option for the mid of the shape
    public static void mid1() {
        System.out.println("+________________________+");
    }
    // Second option for the mid of the shape
    public static void mid2() {
        System.out.println("|                        |");
        System.out.println("|                        |");
    }
    // Third option for the mid of the shape
    public static void mid3() {
        System.out.println("|          STOP          |");
        System.out.println("|                        |");
    }
    // Bottom half the shape
    public static void bottom() {
        System.out.println("\\                       /");
        System.out.println(" \\                     /");
        System.out.println("  ---------------------");
    }
}
