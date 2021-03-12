package ClassWork_1;

import java.util.Scanner;

public class Exercise_2 {
    public Exercise_2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Number 2: ");
        int number2 = input.nextInt();
        int r,l;
        r = number1/number2;
        l = number2%number1;
        System.out.println("Rounded: "+r);
        System.out.println("Left: "+l);
    }
}
