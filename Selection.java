public class Selection {
    public static void SelectSort( int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    } 
   
    public static void main(String[] args){
int arr[] = {64,22,34,56,32};
SelectSort(arr);



    }
}
