
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class first{
    public static void main(String[] args) {

        //  Lecture 2 

        //Output

        // System.out.println("Hello world");
        // System.out.print("Hello world\n");
        // System.out.print("Hello world");
        // System.out.println("Hello\nworld");
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        //Variables

        // String name = "Vaishnavi";
        // int age = 20;
        // double price = 25.54;
        // int a = 25;
        // int b= 10;

        // b = 20; //can change variables values afterwards


        //Data Types

        //Primitive : byte,short,char,boolean,int,long,flaot,double
        //Non primtive : String,array,class,object,interfaces

        // int a = 20;
        // int b = 10;
        // int sum = a+b;
        // int diff = a-b;
        // System.out.println(sum);
        // System.out.println(diff);


        //Input 

        //Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //next() - for single token(word)
        //nextInt()
        ///nextFloat()
        //System.out.println(name);


        //Practice ques

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of a");
        // int a = sc.nextInt();
        // System.out.println("Enter value of b");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);


        //Lecture 3

        //If else

        //Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }

        // int a = sc.nextInt();

        // if(a%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }


        //else if

        // int x = sc.nextInt();
        // int y = sc.nextInt();

        // if(x==y){
        //     System.out.println("equal");
        // }
        // else if (x>y) {
        //     System.out.println("x is greater");
        // } else {
        //     System.out.println("y is greater");
        // }


        //Switch


        //int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Namaste");
        // }else if(button == 3){
        //     System.out.println("Bonjour");
        // }else{
        //     System.out.println("invalid button");
        // }

        // switch(button){
        //      case 1 : System.out.println("Hello");
        //     break;
        //      case 2 : System.out.println("Namaste");
        //      break;
        //      case 3 : System.out.println("Bonjour");
        //      break;
        //      default : System.out.println("invalid button");
        //  }



        //Lecture 4

        //for loop

        //for(initialization,condition,updation){
        //   do something
        //}

        // for(int i=0;i<5;i=i+1){
        //    System.out.println("Hello World"); 
        // }

        // for(int i=0;i<11;i++){
        //     System.out.println(i);
        // }

       
        //while loop

        //while(condition){do something}

    //     int i=0;

    //     while(i<11){
    //         System.out.println(i);
    //         i=i+1;//i++

    //     }

    //do while

    //do{do something}while(condition)

    // int i = 0;
     
    // do{
    //     System.out.println(i);
    //     i = i+1;
    // }while(i<11);

    //int i = 12;
    // while(i<11){
    //     System.out.println("Vina");
    // }

    // do{
    //     System.out.println("Vina");
    // }while(i<11);

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum = 0;

    // for(int i = 1;i<=n;i++){
    //       sum=sum+i;
        
    // }

    // System.out.println(sum);

    
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    
    // for(int i = 1;i<=10;i++){
    //     System.out.println(i*n);
    // }



    //Lecture 5 - Patterns
 
    //1st  
    //*****
    //***** 
    //***** 
    //***** 

    // int n = 4;
    // int m = 5;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=m;j++){
    //      System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //2nd
    //*****
    //*   *
    //*   *
    //*****

    // int n = 4;
    // int m = 5;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=m;j++){

    //         if(i==1 || j==1 || i==n || j==m){
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }

    //     System.out.println();
    // }



    //3rd
    //* 
    //** 
    //*** 
    //**** 

    // int n = 4;
    
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    

    //4th
    //**** 
    //*** 
    //** 
    //* 

    // int n = 4;
    // for(int i = n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //5th
    //   *
    //  **
    // ***
    //****

    // int n = 4;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //     System.out.print("*");
    //     }

    //     System.out.println();
    // }


    //6th
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5

    // int n = 5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }


    //7th
    //1 2 3 4 5
    //1 2 3 4
    //1 2 3
    //1 2 
    //1
 
    // int n = 5;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }


    //8th - Floyd's Triangle
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15

    // int n=5;
    // int number=1;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(number+" ");
    //         number++;
    //     }
    //     System.out.println();
    // }


    //9th - 0-1 Triangle
    //1
    //0 1
    //1 0 1
    //0 1 0 1
    //1 0 1 0 1

    // int n = 5;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         int sum=i+j;
    //         if(sum%2==0){
    //         System.out.print("1"+" ");  //even
    //     } else {
    //         System.out.print("0"+" ");  //odd
    //     }
    //     }
    //     System.out.println();
    
    // }


    //Lecture 6 - Advanced Patterns

    //10th - Butterfly Pattern
    //*      *
    //**    ** 
    //***  ***
    //********
    //********
    //***  *** 
    //**    ** 
    //*      * 
    
    // int n=5;
    
    // //upper half

    // for(int i=1;i<=n;i++){
    //     //1st part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }

    //     //spaces
    //     int spaces =2 * (n-i);
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }

        //2nd part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // //Lower half

    // for(int i=n;i>=1;i--){
    //     //1st part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }

    //     //spaces
    //     int spaces =2*(n-i);
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }

        //2nd part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    //11th - solid rhombus
    //    *****
    //   *****
    //  *****
    // *****
    //*****


    // int n = 5;

    // for(int i=1;i<=n;i++){
    //     //spaces
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     //stars
    //     for(int j=1;j<=5;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    //12th - number pyramid
    //    1
    //   2 2
    //  3 3 3
    // 4 4 4 4
    //5 5 5 5 5

    // int n=5;

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+" ");
    //     }

    //     System.out.println();
    // }


    //13th - Palindromic Pattern
    //        1
    //      2 1 2
    //    3 2 1 2 3 
    //  4 3 2 1 2 3 4 
    //5 4 3 2 1 2 3 4 5

    //int n = 5;

    //1st half

    // for(int i=1;i<=n;i++){

    //     //spaces
    //     for(int j=1;j<=n-i;j++){
    //     System.out.print(" ");
    // }
    // for(int j=i;j>=1;j--){
    //     System.out.print(j);
    // }

    // //2nd half

    // for(int j=2;j<=i;j++){
    //     System.out.print(j);
    // }
    // System.out.println();
    // }


    //14th - Diamond Pattern
    //         *
    //        ***
    //       *****
    //      *******
    //      *******
    //       *****
    //        ***
    //         *


    //int n=4;

    //upper half

    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=(2*i)-1;j++){
    //        System.out.print("*");
    //     }

    //     System.out.println();
    // }


    //lower half

    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     for(int j=1;j<=(2*i)-1;j++){
    //        System.out.print("*");
    //     }

    //     System.out.println();
    // }
   
    
}
}

