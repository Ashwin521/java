// class sorting{
//     public static void main(String[] args){
//         int arr[]={43,5,76,87,87,34};
//         int n=arr.length;
//         System.out.println(n);
//         //bubble sort
//         for(int i=0;i<n-1;i++){
//           if(arr[i]>arr[i+1]){
//             int temp=arr[i];
//             arr[i]=arr[i+1];
//             arr[i+1]=temp;
//           }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

//selection sort

// int printArray(int arr[],int n){
//     for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
//     return 0;
// }

// class sorting{
//     public static void main(String[] args){
//         int arr[]={242,43,55,76,87};
//         int n =arr.length;
//         for(int i=0;i<n-1;i++){
//             int smallest=i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[smallest]){
//                     smallest=j;

//                 }
//             }
//             int temp=arr[smallest];
//             arr[smallest]=arr[i];
//             arr[i]=temp;
//         }
//         printArray(arr,n);
//     }
// }

import java.util.Arrays;

class sorting {
    public static void main(String[] args) {
        int arr[] = { 21, 32, 1, 32, 2, 3, 4 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        
        System.out.println(Arrays.toString(arr));
    }
}
