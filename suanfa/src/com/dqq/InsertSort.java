package com.dqq;

public class InsertSort {

    public static void main(String[] args) {
        int[] a={9,6,1,3,5};
        sort(a);
        print(a);

    }
    static void sort(int[] a){
        for (int i=1;i<a.length;i++){
           findMin(a,i);
            System.out.print("经过第"+i+"次循环的结果集");
            print(a);
            System.out.println();
        }
    }
    static void findMin(int[] a,int n){
        for (int j=n;j>0;j--){
            swap(a,j-1,j);
        }
    }
    static void swap(int[]a,int i,int j){
        if(a[j]<a[i]){
            int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
        }
    }

    static void print(int a[]){
        for (int k:a){
            System.out.print(k+" ");
        }
    }
}
