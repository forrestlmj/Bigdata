package com.atguigu.flink.stream;

public class PrintStars {
    public static void main(String[] args) {
        int touHigh = 6;
        int jianHigh = 25;
        int kuang = 50;
        for (int i = 1; i <= touHigh + jianHigh; i++) {
            for (int j = 1; j <= kuang; j++) {
                //上三角
                if (i <= touHigh) {
                    if (j >= (kuang / 2 + 1) + 1 - i && j <= (kuang / 2 + 1) - 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }

                //上三角以下部分
                if(i>touHigh && i<= jianHigh){
                    if(j >= (kuang/2+1)+1-i && j<= kuang -3*(i-touHigh)){
                        System.out.print("*");
                    }else if(j<=(kuang/2+1)-1+i && j>=0+3*(i-touHigh)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }

            System.out.println("");

        }
    }
}
