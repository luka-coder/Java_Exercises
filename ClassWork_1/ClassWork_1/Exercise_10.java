package ClassWork_1;

public class Exercise_10 {
    public Exercise_10(){
        int[] myNum = new int[]{2, 4, 6, 7, 9, 1, 3, 5};
        int temp = 0;
        for (int i = 0; i < myNum.length; i++) {
            for (int j = i+1; j < myNum.length; j++) {
                if(myNum[i] > myNum[j]) {
                    temp = myNum[i];
                    myNum[i] = myNum[j];
                    myNum[j] = temp;
                }
            }
        }
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < myNum.length; i++) {
            System.out.print(myNum[i] + "; ");
        }
    }
}
