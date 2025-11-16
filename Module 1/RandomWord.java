/*

Assignment Instructions: https://coursera.cs.princeton.edu/algs4/assignments/hello/specification.php

Write a program RandomWord.java that reads a sequence of words from standard input and prints one of those words uniformly at random. Do not store the words in an array or list.
Instead, use Knuth’s method: when reading the ith word, select it with probability 1/i to be the champion, replacing the previous champion. 
After reading all of the words, print the surviving champion.

~/Desktop/hello> javac-algs4 RandomWord.java

~/Desktop/hello> java-algs4 RandomWord
heads tails
tails

~/Desktop/hello> java-algs4 RandomWord
heads tails
heads

~/Desktop/hello> more animals8.txt
ant bear cat dog
emu fox goat horse

~/Desktop/hello> java-algs4 RandomWord < animals8.txt
emu

~/Desktop/hello> java-algs4 RandomWord < animals8.txt
bear



*/

// Using algs4.jar
// Tutorial Resource: https://youtu.be/zJPFwGs4q9o
// Tutorial Resource: https://www.geeksforgeeks.org/java/jar-files-java/
// Tutorial Resource: https://www.programiz.com/java-programming/packages-import

// algs4.StdRandom
// https://algs4.cs.princeton.edu/code/javadoc/edu/princeton/cs/algs4/StdRandom.html#bernoulli-double-

// Knuth's method
// Tutorial Resource: https://medium.com/@dhavalmavani88/reservoir-sampling-aka-knuths-method-c2abb4a7169f


// Compilation & Running
// javac -cp algs4.jar:. RandomWord.java
// java  -cp algs4.jar:. RandomWord


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord{
    public static void main (String[] args){

        String champion_word = null;
        int word_count = 0;


        while (StdIn.isEmpty() != true){
            String next_word = StdIn.readString();
            word_count = word_count + 1;

            if (word_count == 1){
                champion_word = next_word;
            }else{
                // Generate a random number between 1 and word_count (i)
                float p = 1 / word_count;
                boolean random_choice = StdRandom.bernoulli(p); // Returns a random boolean from a Bernoulli distribution with success probability p.

                if (random_choice == true){
                    champion_word = next_word;
                }
            }

        }
        
        
        System.out.println("Champion Word: " + champion_word);
    }
}
