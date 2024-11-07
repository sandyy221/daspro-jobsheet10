import java.util.Arrays;
import java.util.Scanner;
public class Numbers27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] myNumber = new int[3][];
        myNumber[0] = new int[5];
        myNumber[1] = new int[3];
        myNumber[2] = new int[1];

        for (int i=0; i<myNumber.length; i++){
            System.out.println(Arrays.toString(myNumber[i]));
        }
    }
}
