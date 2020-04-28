package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        int numOfRedBall;
        int numOfBlueBall;
        int[] strNumsOfRedBall= new int[6];
        System.out.println("红色球中奖号码为:");
        numOfRedBall=(int)(Math.random()*33)+1;
        for(int i =0;i<6;i++){

            strNumsOfRedBall[0]=numOfRedBall;
            System.out.print(numOfRedBall+"  ");
            Arrays.sort(strNumsOfRedBall);
            while(true){
                numOfRedBall=(int)(Math.random()*33)+1;
                if (Arrays.binarySearch(strNumsOfRedBall,numOfRedBall)<0){
                    break;
                }
            }
        }
        System.out.println();
        numOfBlueBall=(int)(Math.random()*16+1);
        System.out.println("蓝色球中奖号码为:"+'\n'+numOfBlueBall);

    }

}

