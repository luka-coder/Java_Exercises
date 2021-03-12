package ClassWork_1;

import java.util.Scanner;

public class Exercise_5 {
    public Exercise_5(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int num = input.nextInt();
        int s=0;
        while(num!=0){
            s+=num%10;
            num = num/10;
        }
        System.out.println("Sum of integers: "+s);
    }
}
