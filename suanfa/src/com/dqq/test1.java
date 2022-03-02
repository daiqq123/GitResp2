package com.dqq;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //控制台输入一组整数，并将它们用选择排序的算法从小到大进行排序
        //定义一个数组
        int[] arr= new int[9];
        //scanner的system in流
        Scanner scanner = new Scanner(System.in);
        //通过循环将控制台数字存放到数组中
        for (int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        //确定数组中最小的数字的下标为minpos
        for (int i=0;i<arr.length-1;i++){
            int minpos=i;
            for (int j=i+1;j<arr.length;j++) {
                minpos=arr[j]<arr[minpos]?j:minpos;
            }
            swap(arr,i,minpos);
            System.out.print("第"+i+"次循环的排序结果：");
            print(arr);
            System.out.println();
        }

        //输出排序后的结果
        System.out.println("排序后的结果");
        print(arr);
    }
    //交换
    static void swap(int[] arr,int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //打印
    static void print(int[]arr){
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}