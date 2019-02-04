import java.util.Scanner;

public class ArrayPrac2ex4 {
    //Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
    public static void main(String[] args){
        int[] arr1 ={1,7,6,5,9} ;
        int[] arr2 ={2,7,6,3,4} ;
        int x;
        int y;
        boolean sum = false;
        System.out.println("All your integers that add to 13: ");
        for (x=0; x<=4 ; x++) {
            for (y = 0; y <= 4; y++) {
                if (arr1[x]+ arr2[y]== 13){
                            System.out.println("(" + arr1[x]+ "," + arr2[y] + ")");
                }
            }
                }
            }
        }
