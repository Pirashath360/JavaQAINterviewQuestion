package com.company;

public class Bubblesort {
    public static void main(String[]args){
        int[]a={23,45,38,24,89,40};
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){

                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
for (int i=0;i<4;i++){
    System.out.println(a[i]);
}
    }
}
