/**
 * Author: Mason Waters
 * Date: October 4, 2018
 * Homework 01
 * Description: This program works demonstrating loops in an efficient way
 * It prints out ASCII art of the space needle in Seattle
 */
public class SpaceNeedle {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        needle();
        bottomBowl();
        topBowl();
        needle();
        column();
        bottomBowl();
    }

    public static void needle() {  // This method prints the needle portion at the top of the structure
        int i, j;
        for (j = 0; j < SIZE; j++) {
            for (i = 0; i < SIZE * 3; i++)
                System.out.print(" ");
            System.out.println("||");
        }
    }

    public static void topBowl() {  // This method prints top portion of the structure (topBowl) right before the needle part resumes
        int i, j;
        int count = SIZE * 3 - 1;
        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < i * 3 - i; j++)
                System.out.print(" ");
            System.out.print("\\_");
            for (j = 0; j < count; j++)
                System.out.print("/\\");
            System.out.println("_/");
            count -= 2;
        }
    }

    public static void column() {  // This method prints the middle portion of the structure with the percent symbols(column)
        int i, j, lines;
        lines = SIZE * 4;
        for (i = 0; i < lines; i++) {
            for (j = 0; j < SIZE * 3 - SIZE / 2 - 1; j++)
                System.out.print(" ");
            System.out.print("|");
            for (j = 0; j < SIZE / 2; j++)
                System.out.print("%");
            for (j = 0; j < 2; j++)
                System.out.print("|");
            for (j = 0; j < SIZE / 2; j++)
                System.out.print("%");
            System.out.print("|");
            System.out.println();
        }
    }

    public static void bottomBowl() {  // This method prints the bottomBowl portion of the structure that holds everything up
        int i, j;
        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < (SIZE - i - 1) * 3; j++)
                System.out.print(" ");
            System.out.print("__/");

            for (j = 0; j < i * 3; j++)
                System.out.print(":");
            for (j = 0; j < 2; j++)
                System.out.print("|");
            for (j = 0; j < i * 3; j++)
                System.out.print(":");
            System.out.println("\\__");
        }
        for (j = 0; j < (SIZE - i - 1) * 3; j++)
            System.out.print(" ");
        System.out.print("|");

        for (j = 0; j < SIZE * 6; j++)
            System.out.print("\"");
        System.out.print("|");
        System.out.println();
    }
}