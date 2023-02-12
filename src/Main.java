public class Main {
    public static void main(String[] args) {

//JAN28
       System.out.println("hello world!");
      System.out.println("hello Pragra!");
       System.out.println("how are you!");

        int x=10;
        System.out.println(x);

//sum
      int x=10;
      int y=20;
      int sum=x+y;
      System.out.println(sum);

//subtraction
           int x=40;
           int y=20;
           int z=x-y;
           System.out.println(z);

//multiplication
        int x=4;
        int y=20;
        int m=x*y;
        System.out.println(m);

//division
       double x=4.8;
      double y=2.2;
       double d=x/y;
        System.out.println(d);

//conditionals
//functions
//operators   =,-,>=,<=,!

       int x=10;
       int y=20;
       int z;

        System.out.println("values before swapping");
        System.out.println("X:"+x);
        System.out.println("Y:"+y);

        System.out.println();
        System.out.println("values after swapping");

        z=x;
        x=y;
        y=z;

        System.out.println("X:"+x);
        System.out.println("Y:"+y);


          /*conditional looping
           even number = divisible by 2
          odd number = not divisible by 2
          if-else
          boolean = T or F*/
       /* int X=11;
        if(X%2==0){
            System.out.println("X is even");
        }
        else{
            System.out.println("X is odd");
        } */

//% represents remainder//

        int X=10;
        if(X%2==0){
            System.out.println("X is even");
        }
        else{
            System.out.println("X is odd");
        }

           int X=10;
             if(X/2==0){
                 System.out.println("X is even");
             }
             else {
                 System.out.println("X is odd");
             }



     int X=10;
       if(X>0){
           System.out.println("true");
       }
       else{
           System.out.println("false");
        }


      int X=10;
       if(X<0){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }



//    JAN31_2//
//         assignment operator
//        + , - , / , *


       System.out.println("hello " + "Kulwinder!");


             int a=5;
             int b=6;
             int KulwinderSalary=100000;
             System.out.println("hello kulwinder your annual salary is "+ KulwinderSalary + ".");

             if(a>b) {
             System.out.println("a>b:"+ "a" + " = " + a);
             }else{
             System.out.println("b<a:"+ "b" + " = " + b);
           }

        int a=10;
        int b=30;
        int c=25;

        if(a>=b && a>=c) {
            System.out.println(a + " is the largest number. ");
        }else if(b>=a && b>=c){
            System.out.println(b+ " is the largest number.");
        }else if(c>=a && c>=b){
            System.out.println(c+ " is the largest number. ");
        }

        int a=7;
        int b=6;

        if(a>b){
            System.out.println("a =" +a);
        }else{
            System.out.println("b>a: b = " );
        }
    }



