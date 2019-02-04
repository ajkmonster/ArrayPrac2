import java.util.Scanner;

public class ArrayPrac2ex5 {
    public static void main(String[] args){
        int[] num = new int[10];
        int x;
        int even=0;
        int odd =0;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter in 10 numbers: ");
        for (x=0;x <=9; x++) {
            num[x] = key.nextInt();
            if (num[x]%2==0){
                even=even+1;
            } else if (num[x]%2!=0){
                odd=odd+1;
            }
        }
        System.out.println("Our even amount: "+even);
        System.out.println("Our odd amount: "+odd);
    }
}
