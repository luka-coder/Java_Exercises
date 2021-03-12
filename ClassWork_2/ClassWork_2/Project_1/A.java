package ClassWork_2.Project_1;

import java.util.Scanner;

public class A {
    public int a,b;
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        a = input.nextInt();
        System.out.print("B: ");
        b = input.nextInt();
    }
    public void sum(){
        int sum = a+b;
        System.out.println("Sum of A and B: "+sum);
    }
    public void multi(){
        int multi = a*b;
        System.out.println("Multiply of A and B: "+multi);
    }
}
