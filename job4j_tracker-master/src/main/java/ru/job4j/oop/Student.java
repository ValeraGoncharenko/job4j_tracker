package ru.job4j.oop;

public class Student {

    public void song() {
        System.out.println("I believe I can fly");
    }


    public void music() {
        System.out.println("trali-vali");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.song();
    }
}
