// check if an array is sorted or not

class chksorted {
    public static void main(String[]args){
        int arr[] = {10,20,30,40,50};
        boolean sort = true;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i +1]){
                sort = false;
            }
        }
        if(sort == false){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("Array is sorted");
        }
        }
    }
}