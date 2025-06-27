//Lecture 12 - STRINGS

import java.util.*;

public class strings {

    public static void main(String[] args) {
        //String Declaration

        // String name = "Vina";
        // String fullName = "Vaishnavi Patekar";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your Name is : "+name);
 

        // String firstName = "Vaishnavi";
        // String lastName = "Patekar";
        // String fullName = firstName +" " +lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        
        // //charAt
        // for(int i=0;i<fullName.length();i++){
        //     System.out.println(fullName.charAt(i));
        // }

     
        // String name1 = "Vina";
        // String name2 = "Vina";

        //s1 > s2 : +ve value
        //s1 == s2 : 0
        //s1 < s2 : -ve value

        // if(name1.compareTo(name2) == 0){
        // System.out.println("strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        
    
        // String sentence = "My name is Vina";
        // String name = sentence.substring(11,sentence.length());
        // System.out.println(name);
        // String name2 = sentence.substring(5 );
        // String name3 = sentence.substring(0,4);
        // System.out.println(name2);
        // System.out.println(name3);

        //Strings are immutable


        //*******************************
        
        
        //Lecture 13 - String Builder


        // StringBuilder sb = new StringBuilder("vina");
        // System.out.println(sb);

        // //char ar index 0
        // System.out.println(sb.charAt(0));

        // //set char at 0
        // sb.setCharAt(0, 'N');
        // System.out.println(sb);

        // sb.insert(2,'n');
        // System.out.println(sb);

        // sb.delete(2,4 );
        // System.out.println(sb);

        
        // sb.append("y");
        // sb.append("a");
        // System.out.println(sb);

        //System.out.println(sb.length());

        //new

//         StringBuilder sb = new StringBuilder("hello");

//         for(int i=0;i<sb.length()/2;i++){
//             int front = i;
//             int back = sb.length()-i-1; //5-1-0 = 4

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }

//         System.out.println(sb);
        
 }
}
