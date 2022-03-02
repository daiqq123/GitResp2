package com.dqq;

public class CountSort {

    public static void main(String[] args) {
        int[]a={4,1,2,1,3,12,6,5,4,3,13};

        int[] count=new int[14];

        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }

        print(count);
        System.out.println();

        sort(count,a);

    }

    static void sort(int[]count,int[]a){
        int[]result=new int[a.length];
        for (int i=0,j=0;i<count.length;i++){
            while (count[i]-->0)
                result[j++]=i;
        }

        print(result);
    }

    static void print(int[]a){
        for (int k:a){
            System.out.print(k+" ");
        }
    }

}
