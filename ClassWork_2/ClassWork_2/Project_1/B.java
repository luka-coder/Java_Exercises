package ClassWork_2.Project_1;

import java.util.Scanner;

public class B {
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
    public void max(){
        if(a>b && a>c){
            System.out.println("A is max number");
        }
        else if(a>b && a<c){
            System.out.println("C is max number");
        }
        else if(a<b && a>c){
            System.out.println("B is max number");
        }
        else if(b>a && b>c){
            System.out.println("B is max number");
        }
        else if(b>a && b<c){
            System.out.println("C is max number");
        }
        else if(b<a && b>c){
            System.out.println("A is max number");
        }
        else if(c>a && c>b){
            System.out.println("C is max number");
        }
        else if(c>a && c<b){
            System.out.println("B is max number");
        }
        else if(c<a && c>b){
            System.out.println("A is max number");
        }
    }
    public void min(){
        if(a<b && a<c){
            System.out.println("A is min number");
        }
        else if(a<b && a>c){
            System.out.println("C is min number");
        }
        else if(a>b && a<c){
            System.out.println("B is min number");
        }
        else if(b<a && b<c){
            System.out.println("B is min number");
        }
        else if(b<a && b>c){
            System.out.println("C is min number");
        }
        else if(b>a && b<c){
            System.out.println("A is min number");
        }
        else if(c<a && c<b){
            System.out.println("C is min number");
        }
        else if(c<a && c>b){
            System.out.println("B is min number");
        }
        else if(c>a && c<b){
            System.out.println("A is min number");
        }
    }
}
