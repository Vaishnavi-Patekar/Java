//recursion class 2

import java.util.ArrayList;
import java.util.HashSet;

public class recursion2 {
    
    //1.Tower of Hanoi

    //Time Complexity : O(2^n-1) = O(2^n)

    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //   if(n==1){
    //     System.out.println("transfer disk "+ n + " from " + src +" to "+dest );
    //     return;

    //   }
    //   towerOfHanoi(n-1, src, dest, helper);
    //   System.out.println("transfer disk "+ n +" from "+src+" to "+ dest);
    //   towerOfHanoi(n-1, helper, src, dest);
        
    // }

    // public static void main(String[] args) {
    //     int n = 3;
    //     towerOfHanoi(n, "S","H","D");

    //}
    
    //2.Print sting in reverse 'abcd'

    //time complexity = O(n)

    // public static void printRev(String str,int idx) {
    //   if(idx ==0){
    //     System.out.println(str.charAt(idx));
    //     return;
    //   }

    //   System.out.print(str.charAt(idx));
    //   printRev(str, idx-1);
    // }
    // public static void main(String[] args) {
      
 
    //   String str = "abcd";
    //   printRev(str,str.length()-1);
    // }



    // 3.Find the 1st & last occurence of an element in string "abaacdaefaah"

    //TC = O(n)


    //  public static int first = -1;
    //  public static int last = -1;
    // public static void findOccurance(String str,int idx,char element) {
  

    //   if(idx == str.length()){
    //     System.out.println(first);
    //     System.out.println(last);
    //     return;
    //   }
    //   char currChar = str.charAt(idx);
    //   if(currChar == element){
    //     if(first == -1){
    //       first = idx;
    //     }else{
    //       last = idx;

    //     }
    //     }
    //     findOccurance(str, idx+1, element);
    //   }


    // public static void main(String[] args) {
    //   String str = "abaacdaefaah";
    //   findOccurance(str, 0, 'a');
      
    //}


    //4.Check if an array is sorted(stictly increasing)  {1,2,3,4,5}

    //TC = O(n)

    // public static boolean isSorted(int arr[],int idx){
    //   if(idx ==arr.length-1){
    //     return true;
    //   }

    //   if(arr[idx]<arr[idx+1]){
    //     return isSorted(arr, idx+1);
    //   }else{
    //     return false;
    //   }
    // }

    // public static void main(String[] args) {
    //   int arr[]={1,3,5};
    //   System.out.println(isSorted(arr, 0));
    //}


    //5.Move all 'x' to the end of the string "axbcxxd"

    //TC = O(2n)=O(n)

    // public static void moveAllX(String str, int idx,int count,String newString){
    //     if(idx == str.length()){
    //       for(int i=0;i<count;i++){
    //         newString+='x';
    //       }
    //       System.out.println(newString);
    //       return;
    //     }
    //   char currChar = str.charAt(idx);
    //   if(currChar=='x'){
    //     count++;

    //     moveAllX(str, idx+1, count, newString);
         
    //   }else{
    //     newString+=currChar;
    //     moveAllX(str,idx+1,count,newString);
    //   }
    // }



    // public static void main(String[] args) {
    //   String str = "axbcxxd";
    //   moveAllX(str, 0, 0, "");
    // }




    //6.Remove Duplicates in a string "abbccda"

    //TC = O(n)

  //   public static boolean[] map=new boolean[26] ;
  //   public static void removeDuplicates(String str, int idx,String newString){
  //     if(idx == str.length()){
  //       System.out.println(newString);
  //       return;
  //     }
  //   char currChar = str.charAt(idx);
  //   if(map[currChar-'a']){

  //     removeDuplicates(str, idx+1, newString);
  
  //   }else{
  //     newString+=currChar;
  //      map[currChar-'a']=true;
  //      removeDuplicates(str, idx+1, newString);
  //   }
  // }

  // public static void main(String[] args) {
  //   String str = "abbccda";
  //   removeDuplicates(str, 0, "");
  // }


  //**IMP ** 7.Print all the subsequences of a string  "abc"

  
  // public static void subsequences(String str,int idx,String newString){
  //   if(idx==str.length()){
  //     System.out.println(newString);
  //     return;
  // }
  // char currChar = str.charAt(idx);

  // //to be
  // subsequences(str, idx+1, newString+currChar);

  // //or not to be
  // subsequences(str, idx+1, newString);

  //   }

  //   public static void main(String[] args) {
  //     String str = "abc";
  //     subsequences(str, 0, "");
  //   }

  

  //8.Print all the unique subsequences of a string  "aaa"

  // public static void subsequences(String str,int idx,String newString, HashSet<String){
  //   if(idx==str.length()){
  //     if(set.contains(newString)){
  //       return;
  //     }else{
  //       System.out.println(newString);
  //       set.add(newString);
  //       return;
  //     }
      
  // }
  // char currChar = str.charAt(idx);

  // //to be
  // subsequences(str, idx+1, newString+currChar , set);

  // //or not to be
  // subsequences(str, idx+1, newString,set);

  //   }

  //   public static void main(String[] args) {
  //     String str = "aaa";
  //     subsequences(str, 0, "");
  //   }



  //9. Print keypad combination

  //0 -> .\
  //1 -> abc
  //2 -> def
  //3 -> ghi
  //4 -> jkl
  //5 -> mno
  //6 -> pqrs
  //7 -> tu
  //8 -> vwx
  //9 -> yz


  // public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

  // public static void printComb(String str,int idx,String combination){

  //   if(idx ==str.length()){
  //     System.out.println(combination);
  //     return;
  //   }
  //   char currChar = str.charAt(idx);
  //   String  mapping = keypad[currChar - '0'];

  //   for(int i=0;i<mapping.length();i++){
  //     printComb(str, idx+1, combination+mapping.charAt(i));

  //   }
  // }
  // public static void main(String[] args) {
    
  //   String str = "42";
  //   printComb(str, 0, "");
  // }



  //RECURSION CLASS 3


  //1. Print all permutaions of a string "abc"
  //TC = O(n!)

  // public static void printPerm(String str,String permutation){

  //   if(str.length()==0){
  //     System.out.println(permutation);
  //     return;
  //   }

  //   for (int i=0;i<str.length();i++){
  //     char currChar=str.charAt(i);
  //     //"abc"->"ab"
  //     String newStr = str.substring(0,i)+str.substring(i+1);
  //   printPerm(newStr, permutation+currChar);
  //   }
  // }

  // public static void main(String[] args) {

  //  String str = "abc";
  //  printPerm(str,"");
    
  // }



  //2.Count total paths in a maze to move from (0,0) to (n,m)  n=3  m=3


//   public static int countPaths(int i,int j,int n, int m){
//     if(i==n|| j==m){
//       return 0;
//     }
//     if(i==n-1&&j==m-1){
//       return 1;

//     } 
  
//   //move downwards
//   int downPaths = countPaths(i+1, j, n, m);

//   //move right
//   int rightPaths = countPaths(i, j+1, n, m);

//   return downPaths + rightPaths;
// }

// public static void main(String[] args) {
//   int n=3,m=3;
//   int totalPaths=countPaths(0, 0, n, m);
//   System.out.println(totalPaths);
// }



//3.Place Tiles of size 1xm in a floor of size nxm   n=4,m=2

// public static int placeTiles(int n,int m){
//   if(n==m){
//     return 2;
//   }

//   if(n<m){
//     return 1;
//   }

//   //vertically
//   int vertPlacements = placeTiles(n-m, m);

//   //horizontally
//   int horPlacements = placeTiles(n-1,m);

//   return vertPlacements+horPlacements;
// } 

// public static void main(String[] args) {
//   int n=4 , m=2;
//   System.out.println(placeTiles(n, m));
// }



//4.Find the number of ways in which you can invite n people to your party,single or in pairs  n=4


// public static int callGuests(int n){
//   if(n<=1){
//     return 1;

//   }

//   //single
//   int ways1 = callGuests(n-1);

//   //pair
//   int ways2 = (n-1) + callGuests(n-2);
//   return ways1+ways2;
// }

// public static void main(String[] args) {
//   int n =4;
//   System.out.println(callGuests(n));
// }



//5.print all the subsets of a set of first n natural numbers n=3

//TC = O(2^n)


// public static void printSubset(ArrayList<Integer> subset){
//   for(int i=0;i<subset.size();i++){
//     System.out.print(subset.get(i)+" ");
//   }
//   System.out.println();
// }
// public static void findSubsets(int n, ArrayList<Integer> subset){

//   if(n==0){
//     printSubset(subset);
//     return;

//   }

//   //add hoga
//   subset.add(n);
//   findSubsets(n-1,subset);

//   //add nahi hoga
//   subset.remove(subset.size()-1);
//   findSubsets(n-1,subset);
// }

// public static void main(String[] args) {
//   int n=3;
//   ArrayList<Integer> subset = new ArrayList<>();
//   findSubsets(n, subset);
// }



  }

