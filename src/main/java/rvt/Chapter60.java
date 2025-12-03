package rvt;
import java.util.ArrayList;

public class Chapter60 {
    
    public static void main (String[] args) {
        Reverse_Order();
    }

    public static void Array_Sum() {

    int[] val = {0, 1, 2, 3}; 

    int sum = val[0] + val[1] + val[2] + val[3];
 
    System.out.println( "Sum of all numbers = " +  sum );
 
    }


    public static void Two_Arrays() {

    int[] val = {13, -4, 82, 17}; 
    int[] twice = {26, -8, 164, 34};
    
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // Construct an array object for twice.

    
    // Put values in twice that are twice the
    // corresponding values in val.

    System.out.println( "New Array: " 
        + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
   }



   public static void Three_Arrays() {

    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {-12,  24, -79, -13};
    int[] sum    = {  0,   0,   0,   0};
    
    // Add values from corresponding cells of valA and valB
    // and put the result in the corresponding cell of sum.

    sum[0] = valA[0] + valB[0];
    sum[1] = valA[1] + valB[1];
    sum[2] = valA[2] + valB[2];
    sum[3] = valA[3] + valB[3];
 
    System.out.println( "sum: " 
        + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
   }




   public static void Same_Sum() {

    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {  12,   47,   -57,   8};
    
    // Put values into valB so that the sum of the values
    // in corresponding cells of valA and valB is 25.
 
    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
   }

   public static void Reverse_Order() {

    int[] val = {0, 1, 2, 3}; 
    int i;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
    System.out.println("Reversed array: ");
    for(i = 3; i > -1; i--) {
        System.out.println(val[i]);
    }

   }
}




   
    

