package com.dqq;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={7,3,2,8,1,9,5,4,6,0};
        sort(a,0,a.length-1);

        print(a);
    }

    public static void sort(int[]a,int leftBound,int rightBound){
        if (leftBound>=rightBound)return;
        int temp=partition(a,leftBound,rightBound);
        sort(a,leftBound,temp-1);
        sort(a,temp+1,rightBound);
    }

    static int partition(int[]a,int leftBound,int rightBound){
        int pivot=a[rightBound];
        int left=leftBound;
        int right=rightBound;

        while (left<right){
            while (left<right&&a[left]<pivot) left++;
            swap(a,left,right);
            while (left<right&&a[right]>=pivot) right--;
            swap(a,left,right);
        }
        print(a);
        System.out.println();
        return left;
    }

    static void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void print(int[]a){
        for (int k:a){
            System.out.print(k+" ");
        }
    }
}
