//sorting

public class sorting {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
    

    int arr[] = {7,8,3,1,2};

    

    //BUBBLE SORT - accending order puting the largest number at the last 

    //time complexity = O(n^2)

    //for(int i=0;i<arr.length-1;i++){
        // for(int j=0;j<arr.length-i-1;j++){
        //     if(arr[j]>arr[j+1]){
        //         //swap
        //         int temp =arr[j];
        //         arr[j]=arr[j+1];
        //         arr[j+1]=temp;

        //     }
        // }

    // }

   
    

    //SELECTION SORT - selecting the shortest element and puting it in front
    //no unnecessary swapping like bubble sort

    //time complexity = O(n^2)

    // for(int i=0;i<arr.length-1;i++){
    //     int smallest = i;
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[smallest]>arr[j]){
    //             smallest = j;
    //         }

    //     }   
    //     int temp = arr[smallest];
    //     arr[smallest]=arr[i];
    //     arr[i] = temp;
    
    // }


    //INSERTION SORT - DIVIDED IN TWO PARTS SORTED AND UNSORTED the picking element from unsorted part and compare with sorted part sort it and place it in a sorted part

   //time complexity = O(n^2)

    // for(int i=1;i<arr.length;i++){
    //     int  current = arr[i];
    //     int j=i-1;

    //     while(j>=0 && current < arr[j]){
    //         arr[j+1] = arr[j];
    //         j--;

    //     }

    //     //placement
    //     arr[j+1] = current;
    // }

        printArray(arr);
}


}
