// Second LArgest element in an array
class SecondLargest {
    public static void main(String[] args){
                // second largest elemnet in an array
        int arr[] = {10,20,30,40,50};
        int max = arr[0];
        int secondMax = arr[0]; 
        for (int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}