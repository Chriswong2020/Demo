package com.company;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  daysInJanuary  ;
        System.out.println("请输入年份:");
        int year = sc.nextInt();

//      判断当年是否为闰年,公式:year%4为0&&year%100!=0||year%400==0
//      是判断闰年的条件,以此确定二月份的天数
        if(year%4==0&&year%100!=0||year%100==0){
            daysInJanuary=28;
        }else {
            daysInJanuary=29;
        }

//      这里客户的月份和日期输入有可能超出范围,所以可以加一个while循环来保证
//      客户输出的是存在的月份和日期
        System.out.println("请输入月份:");
        int Month;
        while(true){
            Month = sc.nextInt();
            if(Month<1||Month>12){
                System.out.println("请输入正确的月份:");
            }else break;
        } ;
//         判断当月有多少天,这里用switch好一点,1,3,5,7,8,10,12则输出31,2则根据闰年否输出28或者29,
//         其余输出30,这里后面要经常调用switch方法,索性单独写一个daysInMonth()方法.

        System.out.println("请输入日期:");
        int Date;
        while(true){
            Date  = sc.nextInt();
            if(Date<1||Date>daysInMonth(Month,daysInJanuary)){
                System.out.println("请输入正确的日期:");
            }else break;
        }


        int sumOfDays=0;     //定义客户输入日期计算出的总天数
        sumOfDays+=Date; //预先把当月的天数目加上

//      计算总天数
        for(int i=1;i<Month;i++){
            sumOfDays+=daysInMonth(i,daysInJanuary);
        }
        System.out.println("您输入的日期是当月的第"+sumOfDays+"天.");
    }
    //  daysInMonth()方法,主要用来返回当月的天数
    public static int daysInMonth(int Month,int daysInJanuary){
        switch(Month) {
            case 2:
                return daysInJanuary;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return 30;
        }

    }

}