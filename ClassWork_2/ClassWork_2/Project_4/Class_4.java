package ClassWork_2.Project_4;

import java.lang.Math;

public class Class_4 {
    public double a=19,b=27,z = 30;
    public double met_1(){
        return (double) (a+Math.pow(b,3)-7)/(z+8);
    }
    public double met_2(){
        return (double) (a+z-Math.pow(b,3))/(z*a*b);
    }
    public double met_3(){
        return (double) (a*z-b)/(z*b);
    }
}
