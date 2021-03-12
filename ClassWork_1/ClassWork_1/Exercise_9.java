package ClassWork_1;

public class Exercise_9 {
    public Exercise_9(){
        int[] myNum = new int[]{2, 4, 6, 7, 9, 1, 3, 5};
        System.out.print("Elements of given array: ");
        for (int i = 0; i < myNum.length; i++) {
            System.out.print(myNum[i] + "; ");
        }
        System.out.print("\nMax element of array: ");
        int max = myNum[0];
        for (int i = 1; i < myNum.length; i++) {
            if (myNum[i] > max) {
                max = myNum[i];
            }
        }
        System.out.println(max);
        System.out.print("Min element of array: ");
        int min = myNum[0];
        for (int i = 1; i < myNum.length; i++) {
            if (myNum[i] < min) {
                min = myNum[i];
            }
        }
        System.out.println(min);
    }
}
