
import java.util.Arrays;
import java.util.Scanner;

public class Solutions {

    // Complete the compareTriplets function below.

    public static final int SIZE= 3;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] aList = new int[SIZE];
        int[] bList = new int[SIZE];

        for (int i=0; i<SIZE; i++){
            System.out.println("Enter digit " + i + " for AliceList :");
            aList[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(aList));

        for (int i=0; i<SIZE; i++){
            System.out.println("Enter digit " + i + " for BobList :");
            bList[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(bList));

        int aScore = 0;
        int bScore = 0;
        for (int i=0; i<SIZE; i++){
            if (aList[i]>bList[i]){
                aScore++;
            }
            else if (bList[i] > aList[i]){
                bScore++;
            }
        }
        System.out.println(aScore + " " + bScore);
    }
}
