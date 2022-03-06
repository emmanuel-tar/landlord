package com.company;

import javax.swing.*;
import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) {
        int comp_num = (int) (Math.random() * 100 + 1);
        int user_ans = 0;
        System.out.println("The Correct guess would be " + comp_num);
        int count = 1;
        while (user_ans != comp_num) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            user_ans = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, " " + determineGuess(user_ans, comp_num, count));
            count++;
        }

    }

    private static String determineGuess(int user_ans, int comp_num, int count) {
        if (user_ans <= 0 || user_ans > 100) {
            return "Guess is Invalid";
        } else if (user_ans == comp_num) {
            return "Correct!\nTotal Guesses: " + count;
        }
else if(user_ans > comp_num){
    return " Yor guess is too high, try again. \nTry Number: "+count;
        }
else {
    return "Your guess number is too low, try again. \nTry Number: "+count;
        }
    }
}
