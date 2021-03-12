package ClassWork_1;

import java.util.Random;
import java.util.Arrays;

public class Exercise_11 {
    public Exercise_11(){
        int[] myNum = new int[]{2, 4, 6, 7, 9, 1, 3, 5};
        Random rand = new Random();
        int value = rand.nextInt(100);
        int n = myNum.length;
        int new_myNum[] = new int[n+1];
        System.out.println("Old Array: "+Arrays.toString(myNum));
        for(int i = 0; i<n; i++) {
            new_myNum[i] = myNum[i];
        }
        new_myNum[n] = value;
        System.out.println("New Array: "+Arrays.toString(new_myNum));
    }
}
