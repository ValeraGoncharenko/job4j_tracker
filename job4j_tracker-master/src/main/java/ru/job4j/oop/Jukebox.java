package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("pust begut");
        }

          else if (position == 2) {
                System.out.println("spok night");
            } else {
                System.out.println("not found");
            }

    }

    public static void main(String[] args) {
        Jukebox mbox = new Jukebox();
        int p = 2;
        mbox.music(p);
    }
}
