package com.dqq;

import java.awt.print.PrinterGraphics;

public class ShellSortTest {
    public static void main(String[] args) {
        int[]a={9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};

        int h=1;
        while (h<=a.length/3){
            h=3*h+1;
            System.out.println(h);
        }
        for (int gap=h;gap>0;gap=(gap-1)/3 ) {
            for (int i = gap; i < a.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    swap(a,j-gap,j);
                }
                System.out.print("排序结果：");
                print(a);
                System.out.println();
            }
            System.out.print("间隔为"+gap+"希尔排序的结果：");
            print(a);
            System.out.println();
        }


        print(a);


    }
    static void swap(int[]a,int i,int j){
        if (a[j] < a[i]) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    static void print(int[]a){
        for (int k: a){
            System.out.print(k+" ");
        }
    }
}
