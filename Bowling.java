package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bowling {

    public static void main(String[] args) {
        int num = 20;
        Scanner attempt = new Scanner(System.in);
        System.out.println("attempt: ");
        int[] score = new int[num];
        for(int i=0; i<num; i++) {
            score[i] = attempt.nextInt();

        }

        int frame1 = score[0] + score[1];
        int frame2 = score[2] + score[3];
        int frame3 = score[4] + score[5];
        int frame4 = score[6] + score[7];
        int frame5 = score[8] + score[9];
        int frame6 = score[10] + score[11];
        int frame7 = score[12] + score[13];
        int frame8 = score[14] + score[15];
        int frame9 = score[16] + score[17];
        int frame10 = score[18] + score[19];
        int gameScore = Arrays.stream(score).sum();


        System.out.println(gameScore);
        System.out.println(Arrays.toString(score));



//        int attempt1 = 10;
//        int attempt2 = 9;
//        int attempt3 = 7;
//        int attempt4 = 2;
//        int strikeMath = score[2] + score[3];
//        int spareMath = 10 + score[2];
//        int strike = 0;
//        int game = Arrays.stream(score).sum() + strike + spare;
//        if (score[0] == 10) {
//            strike = score[0] + strikeMath;
//            System.out.println("X");
//        }
//        else if (frame1 == 10)
//            spare = score[0] + spareMath;
//            System.out.println("/");
//        else
//            System.out.println(frame1);
//
//        System.out.println(game);

    }
}
