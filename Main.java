package com.company;

import java.util.Arrays;

public class Main {
public static void Change01(int arr[] ){
    for (int i = 0; i <arr.length ; i++) {
        if (arr[i]==0){
            arr[i]=1;
        } else arr[i]=0;
    }
}
public static void Input(int arr[]){
    for (int i = 0, a = 0; i<arr.length; i++,a+=3) {
        arr[i]=a;
    }
}
public static void Under6(int arr[]){
    for (int i = 0; i <arr.length ; i++) {
        if (arr[i]<6) arr[i]=arr[i]*2;
    }
}
public static void NumberOne(int arr[][]){
    int i,j;
    for (i=0,j=arr.length - 1;i<arr.length;i++,j--){
        arr[i][j] = 1;
        arr[i][i] = 1;
    }
}
public static int Max(int arr[]){
    int Max = -99999;
    for (int i = 0; i <arr.length ; i++) {
        if(arr[i]>Max) Max = arr[i];
    }
    return Max;
}
    public static int Min(int arr[]){
        int Min = 99999;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<Min) Min = arr[i];
        }
        return Min;
    }
    public static int Right(int arr[],int l){
    int right =0;
        for ( int j=l; j <arr.length ; j++) {
            right=arr[j]+right;
        } return right;
    }
    public static boolean CheckBalance(int arr[]) {
        boolean bool =false;
        for (int k = 1,count=1; k < arr.length+1; k++,count++) {
            int left = 0;

            for (int i = 0; i < k; i++) {
                left = arr[i]+left;
            }
            int right = Right(arr,count);
            if (right == left) {
                bool =true;
                break;
            }


        }
    return bool;
    }
    public static boolean GG(double a1){
    while(a1>1){
        a1/=2;
    }
    if(a1==1) return true;
    return false;
    }
    public static void main(String[] args) {
    int a = 2048;
    int c = 333;
    boolean a1 =GG(a);
    boolean c1 =GG(c);
    System.out.println(a1+" "+c1);
     int [] arr ={ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
     Change01(arr);System.out.println(Arrays.toString(arr));
//     int [] arr1 = new int[8];
//     Input(arr1);System.out.println(Arrays.toString(arr1));
//     int [] arr2 ={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//     Under6(arr2);System.out.println(Arrays.toString(arr2));
//     int [][] arr3 = new int[4][4];
//     NumberOne(arr3);
//        for(int i = 0; i < arr3.length; i++) {
//            for(int j = 0; j < arr3.length; j++) {
//                System.out.print(arr3[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int Max =Max(arr2);System.out.println("Мax : "+Max);
//        int Min =Min(arr2);System.out.println("Мin : "+Min);
//    }
//    int [] arr4 = {1,1,1,2,1};
//    int [] arr5 = {1,1,2,1};
//    int [] arr6 = {4,1,0,0,0,2,0,1};
//    int [] arr7 = {5,3,4,2,5,3,4,2};
//    int [] arr8 = {1,1,0,0,0,2,0,4};
//    int [] arr9 = {1,1,0,0,0,2,0,4,12};
//    boolean gg =CheckBalance(arr4);
//    boolean ggg =CheckBalance(arr5);
//    boolean gggg =CheckBalance(arr6);
//    boolean ggggg =CheckBalance(arr7);
//    boolean gggggg =CheckBalance(arr8);
//    boolean ggggggg =CheckBalance(arr9);
//    System.out.println(gg);
//    System.out.println(ggg);
//    System.out.println(gggg);
//    System.out.println(ggggg);
//    System.out.println(gggggg);
//    System.out.println(ggggggg);
}}