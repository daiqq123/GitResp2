package com.dqq;

public class BubbleSort {
    public static void main(String[] args) {
        int[]a={9,3,1,4,6,8,7,5,2};
        sort(a);
        print(a);
    }

    static void sort(int[] a){
        for (int j=a.length-1;j>=0;j--){
            findMax(a,j);
            System.out.print("循环第"+(a.length-j)+"次结果：");
            print(a);
            System.out.println();
        }
    }

    //找最大的数
    static void findMax(int[]a,int n){
        for (int i=0;i<n;i++){
            if(a[i]>a[i+1]){
                swap(a,i,i+1);
            }
        }
    }
    //交换
    static void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    //打印
    static void print(int[]a){
        for(int k :a){
            System.out.print(k+" ");
        }
    }


}
