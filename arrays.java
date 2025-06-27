                  //Lecture 10 - Arrays

//List of items of the same type

//Syntax - 
//type[]arrayName = new type[size]


//Second way of defining Array-  when we know before only the size or variables
//type[] arrayName = {1,2,3,4,5};

import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        // int[] marks = new int[3];
        // int marks[] = new int[3];  this is also a valid syntax
        
        
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        //OR

        // for(int i=0;i<3;i++){
        //     System.out.println(marks[i]);
        // }

//new

        // int marks[]={97,98,95};
        
        //  for(int i=0;i<3;i++){
        //      System.out.println(marks[i]);
        // }

//new

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[]  = new int[size];

        // for(int i=0;i<size;i++){
        //     numbers[i] = sc.nextInt();
        // }

        // for(int i=0;i<size;i++){
        //     System.out.println(numbers[i]);
        // }

//new


//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[]  = new int[size];

//         //input

//         for(int i=0;i<size;i++){
//             numbers[i] = sc.nextInt();
//         }

//         int x = sc.nextInt();

//         //output
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==x){
//                 System.out.println("x found at index : "+i);
//             }
            
//         }




//Lecture 11 - 2DArrays


//type[][] arrayName = new type[rows][columns];
//int[][] numbers = new int[3][5];

// Scanner sc = new Scanner(System.in);
// int rows = sc.nextInt();
// int columns = sc.nextInt();

// int[][] numbers = new int[rows][columns];

// //input
// //rows
// for(int i=0;i<rows;i++){
//     //columns
//    for(int j=0;j<columns;j++){
//       numbers[i][j] = sc.nextInt();
//    }
// }

// //output
// for(int i=0;i<rows;i++){
//     //columns
//    for(int j=0;j<columns;j++){
//       System.out.print(numbers[i][j]+" ");
//    }
//    System.out.println();
// }


//practice ques

// Scanner sc = new Scanner(System.in);
// int rows = sc.nextInt();
// int columns = sc.nextInt();

// int[][] numbers = new int[rows][columns];
 
// for(int i=0;i<rows;i++){
//     for(int j=0;j<columns;j++){
//          numbers[i][j] = sc.nextInt();
        
//         }
// }

// int x = sc.nextInt();


// for(int i=0;i<rows;i++){
//     for(int j=0;j<columns;j++){
//         //compare with x
//         if(numbers[i][j] == x){
//           System.out.println("x found at locations ("+ i +"," + j + ")");
//         }
//     }
// }



    }
    
 }
