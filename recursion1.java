   
        //class 1

public class recursion1 {
    //print 5 to 1
//     public static void printNumb(int n) {
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String[] args) {
     
//         int n = 5;

//     printNumb(n); //n=5

//     }

//**********new

//print 1 to 5
// public static void printNumb(int n) {
//     if(n == 6){
//         return;
//     }
//     System.out.println(n);
//     printNumb(n+1);
// }
// public static void main(String[] args) {
 
//     int n = 1;

// printNumb(n); //n=5

// }

//************new

//Print sum of first n natural numbers
// public static void printSum(int i ,int n, int sum) {
//     if(i==n){
//         sum +=i;
//         System.out.println(sum);
//         return; 
//     }
//     sum +=i;
//     printSum(i+1,n,sum);
    
// }

// public static void main(String[] args) {
//     printSum(1,5,0);
// }

//*********** new

//print factorial of a number n
// public static int calcfactorial(int n) {
//     if(n==1|| n==0){
//         return 1;
//     }

//    int fact_num1=calcfactorial(n-1); 
//    int fact_n=n*fact_num1;
//    return fact_n;
    
// }

// public static void main(String[] args) {
//     int n = 5;
//     int ans = calcfactorial(n);
//     System.out.println(ans);
// }


//************new 

//print fibonacci sequence till nth term
//0 1 1 2 3 5 8 13 .....

// public static void printFib(int a,int b,int n) {
     
//     if(n==0){
//         return;
//     }
//     int c = a+b;
//     System.out.println(c);
//     printFib(b, c, n-1);
    
// }

// public static void main(String[] args) {
//     int a = 0,b = 1;
//     System.out.println(a);
//     System.out.println(b);
//     int n = 8;
//     printFib(a, b, n-2);
// }


//***********new 

//Print x^n(stack height = n)

// public static int calcPower(int x,int n) {
//     if(n==0){
//         return 1;
//     }
//     if(x==0){
//         return 0;
//     }
//     int xPownm1 = calcPower(x,n-1);//x power n-1 : x^n-1
//     int xPown = x*xPownm1;
//     return xPown;

//     }

//     public static void main(String[] args) {
//         int x=2,n=5;
//         int ans = calcPower(x,n);
//         System.out.println(ans);
//     }



//**********new  4-jan-2025  ss

//Print x^n(stack height = logn)

public static int calcPower(int x,int n) {
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }

    //if n is even
    if(n%2==0){
        return calcPower(x,n/2)*calcPower(x,n/2);
    }else{
        //n is odd
        return calcPower(x,n/2)*calcPower(x,n/2) * x;
    }
  
    }

    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calcPower(x,n);
        System.out.println(ans);
    }

}





