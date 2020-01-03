/**
 * Author: Mason Waters
 * Date: October 4, 2018
 * Homework 01
 * Description: This program works demonstrating loops in an efficient way
 * It prints out ASCII art that I created of a pencil
 */
public class AsciiArt {
    public static void main(String[] args) {
        tipOfPencil();
        shaving();
        shaftPart();
        metalBracing();
        eraser();
    }

    public static void tipOfPencil() {  // This method prints out the tip of the pencil using loops
        for (int row = 0; row < 7; row++) {
            for (int space = 0; space < 7 - row; space++) {
                System.out.print(' ');
            }
            for (int slash = 0; slash <= 0; slash++) {
                System.out.print("/");
            }
            for (int space = 0; space < row * 2; space++) {
                System.out.print(' ');
            }
            for (int space = 0; space < 1; space++) {
                System.out.print('\\');
            }
            System.out.println();

        }
    }

    public static void shaftPart() {  // This method uses a loop with a print statement to print the shaft ortion of the pencil
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("|00000000000000|");
            }
            System.out.println();
        }
    }

    public static void metalBracing() {  // This method prints the metal bracing that holds the eraser on a pencil using one loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("|==============|");
            }
            System.out.println();
        }
    }

    public static void shaving() { // This method prints the shaved part of the pencil near the tip
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("|");
            }
            for (int j = 0; j < 7; j++) {
                System.out.print("\\/");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
    public static void eraser () {  // This method prints the eraser tip of the pencil
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("|");
            }
            for (int j = 0; j < 14; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("|--------------|");
    }
}
