package com.company;

public class Main {

    public static void main(String[] args) {

        String word1 = "cat";
        String word2 = "act";

        System.out.println(isAnagram(word1,word2));

    }

    public static boolean isAnagram(String w1, String w2){

        if (w1.length() != w2.length()){
            return false;
        }

        if (w1.length() == 0){
            return true;
        }

        int var = w2.indexOf(w1.charAt(0));

        if (var == -1){
            return false;
        }


        return isAnagram(w1.substring(1), w2.substring(0,var) + w2.substring(var + 1));
    }
}
