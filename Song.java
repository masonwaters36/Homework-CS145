/**
 * Author: Mason Waters
 * Date: September 17, 2018
 * Homework 00
 * Description: This program works on recognizing redundancy
 * It prints out the song "There was an old lady who swallowed a fly".
 *
 */

public class Song {
    public static void main(String[] args){
        firstVerse();
        perhaps();
        secondVerse();
        fly();
        perhaps();
        thirdVerse();
        bird();
        fly();
        perhaps();
        fourthVerse();
        cat();
        bird();
        fly();
        perhaps();
        fifthVerse();
        dog();
        cat();
        bird();
        fly();
        perhaps();
        sixthVerse();
        dog();
        cat();
        bird();
        fly();
        perhaps();
        seventhVerse();

    }

    public static void firstVerse() {
        System.out.println("There was an old woman who swallowed a fly.");
        System.out.println("I don't know why she swallowed that fly,");
    }

    public static void perhaps() {
        System.out.println("Perhaps she'll die.");
        System.out.println();
    }

    public static void fly() {
        System.out.println("She swallowed the spider to catch the fly,");
        System.out.println("I don't know why she swallowed that fly,");
    }

    public static void secondVerse(){
        System.out.println("There was an old woman who swallowed a spider,");
        System.out.println("That wriggled and jiggled and jiggled inside her.");
    }

    public static void thirdVerse(){
        System.out.println("There was an old woman who swallowed a bird,");
        System.out.println("How absurd to swallow a bird.");
    }

    public static void bird(){
        System.out.println("She swallowed the bird to catch the spider,");
    }

    public static void fourthVerse(){
        System.out.println("There was an old woman who swallowed a cat,");
        System.out.println("Imagine that to swallow a cat.");
    }

    public static void cat(){
        System.out.println("She swallowed the cat to catch the bird,");
    }

    public static void fifthVerse(){
        System.out.println("There was an old woman who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
    }

    public static void dog(){
        System.out.println("She swallowed the dog to catch the cat,");
    }

    public static void sixthVerse(){
        System.out.println("There was an old woman who swallowed a cherry,");
        System.out.println("Must be merry to swallow a cherry,");
        System.out.println("She swallowed the cherry to amuse the dog");
    }

    public static void seventhVerse(){
        System.out.println("There was an old woman who swallowed a horse,");
        System.out.println("She died of course.");
    }

}