//Lecture 14 - OPERATORS AND BINARY NUMBER SYSTEM

//OPERATORS - 
//Symbols that tell compiler to perform some operation

//Arithmetic Operators - 
//Binary -  + , - , * , / , %
//Unary - ++ , --
//a=a+1 -> a++ 1.change value 2.use value  or ++a 1.use value 2.change value
//a=a-1 -> a-- or --a


//Relational Operators - == , != , > , < , >= , <=   returns true or false

//Logical Operators - &&(Logical AND - Both TRUE then TRUE) 
                    //||(Logical OR - Either one TRUE then TRUE) 
                    // !(Logical NOT - Makes TRUE FALSE and FALSE TRUE)

//BINARY NUMBER SYSTEM

//Bitwise Operators - 
// & (Binary AND)      11-1  00-0  10-0              
// | (Binary OR)       00-0  11-1  10-1  01-1
// ^ (Binary XOR)      00-0  11-0  10-1  01-1
// ~ (Binary Ones's Compliment)   1-0  0-1
// << (Binary Left Shift)         to shift left    Syntax - number opr position
// >> (Binary Right Shift)        to shift right   Syntax - number opr position


//Assignment Operator - == , += , -= , *= , /=

// import java.util.Scanner;

// public class oprandbinary {

//      public static void main(String[] args) {
          //int a = 10;
         //int b = 0;
    
        // b=a++;
        // System.out.println(a); //11
        // System.out.println(b); //10

        // b=++a;
        // System.out.println(a); //11
        // System.out.println(b); //11

        
        // b=a--;
        // System.out.println(a); //9
        // System.out.println(b); //10

        
        // b=--a;
        // System.out.println(a); //9
        // System.out.println(b); //9



    //***************************************** 
    
    
    //Lecture 15 - Bit Manipulation


    //Get Bit
    //Get the 3rd bit (position = 2) of a number n.(n=0101)
    //Bit Mask : 1<<i
    //Operation : AND

    //Positions are count from right to left

    // int n = 5;  //0101
    // int pos = 2;
    // int bitMask = 1<<pos;
    // if((bitMask & n)==0){
    //   System.out.println("bit was zero");

    // }else{
    //   System.out.println("bit was one");
    // }


    
    //Set Bit
    //Get the 2nd bit (position = 1) of a number n.(n=0101)
    //Bit Mask : 1<<i
    //Operation : OR


    // int n = 5;  //0101
    // int pos = 1;
    // int bitMask = 1<<pos;

    // int newNumber = bitMask | n;
    // System.out.println(newNumber);


    
    //Clear Bit
    //Clear the 3rd bit (position = 2) of a number n.(n=0101)
    //Bit Mask : 1<<i
    //Operation : AND with NOT


    // int n = 5;  //0101
    //  int pos = 2;
    //  int bitMask = 1<<pos;
    //  int newBitMask = ~(bitMask);

    //  int newNumber = newBitMask & n;
    //  System.out.println(newNumber);
    
    
    //Update Bit
    //Update the 2nd bit (position = 1) of a number n to 1. (n=0101)

    //For 0 - Bit Mask : 1<<i   Operation : AND with NOT  (CLEAR)
    //For 1 - Bit Mask : 1<<i   Opeartion : OR             (SET)


    // Scanner sc = new Scanner(System.in);
    // int oper = sc.nextInt();
    //oper=1 : set     oper=0 : clear

    //int n=5;
    // int pos=1;

    // int bitMask = 1<<pos;
    // if(oper == 1){
    //   //set
    //   int newNumber = bitMask | n;
    //   System.out.println(newNumber);
    // }else{
    //   //clear
    //   int newBitMask = ~(bitMask);
    //   int newNumber = newBitMask & n;
    //   System.out.println(newNumber);
    // }

    
  //  }
  //    }
