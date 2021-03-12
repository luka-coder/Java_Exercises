package ClassWork_1;

import java.util.Scanner;

public class Exercise_3 {
    public Exercise_3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = input.nextInt();
        System.out.print("Number 2: ");
        int num2 = input.nextInt();
        System.out.print("Number 3: ");
        int num3 = input.nextInt();
        int sum = num1+num2+num3;
        int multi = num1*num2*num3;
        System.out.println("Sum of three numbers: "+sum);
        System.out.println("Multiply of three numbers: "+multi);
    }
}
