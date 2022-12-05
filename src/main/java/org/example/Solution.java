package org.example;

public class Solution {
    public Solution(){

    }

    public char findTheDifference(String s, String t) {

        int result = 0;

        for(int i = 0; i < t.length(); i++){

            if(i != t.length() - 1){

                result += t.charAt(i) - s.charAt(i);
            }else{

                result += t.charAt(i);
            }
        }

        return (char)result;
    }
}