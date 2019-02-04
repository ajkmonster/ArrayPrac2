import java.util.Scanner;

public class ArrayPrac2ex3 {
    public static void main(String[] args){
        String[] arr = {"","","","","","","","","",""};
        int x;
        int y;
        boolean duplicate;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter 10 values: ");

        for (x=0; x<=9 ; x++) {
            duplicate = false;
            String j = key.next();
            for (y = 0; y <= 9; y++) {
                if (j.equalsIgnoreCase(arr[y])){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                arr[x] = j;
            }
        }
        System.out.println("All your integers that aren't duplicates: ");
        for(String s: arr){ //for-each (for) string s in(:) [array or collection]
            System.out.print(s + " ");
        }


    }
}
