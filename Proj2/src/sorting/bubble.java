package sorting;
class bubble{
   
    public static void main(String args[]) {
        
        int arr[] = {23,43,13,65,11,62,76,83,9,71,84,34,96,80};
       
        int n = arr.length;
      
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n-1; j++) {
                
                if (arr[j] >arr[j+1])  {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    
       
        for (int j = 0; j<n-1; j++) {
     
        System.out.println(arr[j]);
    }


   }
}