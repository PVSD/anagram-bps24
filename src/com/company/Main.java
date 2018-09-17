package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String word1;
        String word2;

        System.out.println("Type word one:");
        Scanner kb = new Scanner(System.in);
        word1 = kb.next();

        System.out.println("Type word two");
        word2 = kb.next();

        if(word1.length() != word2.length()){
            System.out.println(word1 + " and " +  word2 + " are not anagrams!");
        }
        else{

            char[] wordone = word1.toCharArray();
            char[] wordtwo = word2.toCharArray();

            Arrays.sort(wordone);
            Arrays.sort(wordtwo);

            if(Arrays.equals(wordone, wordtwo)) {
                System.out.println(word1 + " and " + word2 + " are anagrams!");
            }
            else{
                System.out.println(word1 + " and " + word2 + " are not anagrams!");
            }
        }
    }
}
