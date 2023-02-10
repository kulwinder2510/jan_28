import java.util.Scanner;

public class ScanningValues {

    public static void main(String[] args){
//        int a=5;
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//          System.out.println("user input is " + a);

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter value for a");
//        int a = sc.nextInt();
//        System.out.println("please enter value for b");
//        int b = sc.nextInt();
//
//        if(a > b){
//            System.out.println("a is greater than b");
//        }else{System.out.println("b is greater than a");
//        }




             // ==
             // if say a & b are same
             // else say a & b are not same
//    Scanner sc = new Scanner(System.in);
//        System.out.println("please enter value for a");
//    int a = sc.nextInt();
//        System.out.println("please enter value for b");
//    int b = sc.nextInt();
//
//    if(a == b){
//         System.out.println("a and b are same");
//    }else{System.out.println("a and b are not same");
//    }


        // cond 1 & cond 2 
        // and - &&
        //or - ||

//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter value for a");
//        int a = sc.nextInt();
//        if(a >= 50){
//            System.out.println("a is greater than or equal to 50");
//        }else if( (a >= 40) && (a<=49) ){
//            System.out.println("a is between 40 and 49");
//        }else if((a >= 30) && (a<=39)){
//            System.out.println("a is between 30 and 39");
//        }else if(a>20){
//            System.out.println("a is less than 20");
//        }


                                      //order statement

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 1 for English");
        System.out.println("please enter 2 for French");
        System.out.println("please enter 3 for Spanish");

        int input=sc.nextInt();
         switch (input){
             case 1:
                 System.out.println("English is selected");
                 break;
             case 2:
             System.out.println("French is selected");
                 break;
             case 3:
             System.out.println("Spanish is selected");
             break;
             default:
                 System.out.println("wrong input:please try again!");
         }




    }
}
