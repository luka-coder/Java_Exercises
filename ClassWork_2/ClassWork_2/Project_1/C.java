package ClassWork_2.Project_1;

import java.util.Scanner;

public class C {
    public int a,b,c;
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("A: ");
        a = input.nextInt();
        System.out.print("B: ");
        b = input.nextInt();
        System.out.print("C: ");
        c = input.nextInt();
    }
    public void last(){
        int l = a%10;
        System.out.println("Last integer of A number: "+l);
    }
    public void first(){
        while(b>=10){
            b /= 10;
        }
        System.out.println("First integer of B number: "+b);
    }
    public void sum(){
        int s = 0;
        while(c!=0){
            s += c%10;
            c = c/10;
        }
        System.out.println("Sum of integers of C number: "+s);
    }
    public void meth1_meth2(){
        int l = a%10;
        while(b>=10){
            b /= 10;
        }
        int multi = l*b;
        System.out.println("Multiply of method 1 and method 2: "+multi);
    }
    public void sum_meth3_meth5(){
        while(b>=10){
            b /= 10;
        }
        int l = a%10;
        while(b>=10){
            b /= 10;
        }
        int s = b+b;
        System.out.println("Sum of method 3 and method 5: "+s);
    }
}
