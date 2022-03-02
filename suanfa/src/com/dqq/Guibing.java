package com.dqq;
public class Guibing {
    public static void main(String[] args) {
        /*long a=f(10);
        System.out.println(a);*/

        int[]a={1,4,7,8,3,6,9};
        sort(a,0,a.length-1);
        print(a);

    }
    //排序
    static void sort(int[] a,int left,int right){
        if (left==right)return;
        //分成两半
        int mid=left+(right-left)/2;
        //左边排序
        sort(a,left,mid);
        //右边排序
        sort(a,mid+1,right);
        merge(a,left,mid+1,right);
    }
    //归并
    static void merge(int[] a,int leftPtr,int rightPtr,int rightBound){
        int mid=rightPtr-1;
        int[] temp=new int[rightBound-leftPtr+1];
        int i=leftPtr;
        int j=rightPtr;
        int k=0;

        while (i<=mid && j<rightBound){
            temp[k++]=a[i]<=a[j]?a[i++]:a[j++];
            /*if (a[i]<=a[j]){
                temp[k++]=a[i++];
               // i++;
               // k++;
            }else {
                temp[k++]=a[j++];
                //j++;
                //k++;
            }*/
        }
        while (i<=mid) temp[k++]=a[i++];
        while (j<=rightBound) temp[k++]=a[j++];

        for (int m=0;m<temp.length;m++){
            a[leftPtr+m]=temp[m];
        }

    }
    //交换
    static void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    //输出打印
    static void print(int[] a){
        for (int k : a){
            System.out.print(k+" ");
        }
    }


    //递归
    /*static long f(int n){
        if(n<1)
            return -1;
        if (n==1)
            return 1;
        return n+f(n-1);
    }*/
}
