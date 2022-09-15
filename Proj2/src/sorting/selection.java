package sorting;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,43,13,65,11,62,76,83,9,71,84,34,96,80};
		for (int i = 0; i < arr.length - 1; i++){
	         int index = i;  
	         for (int j = i + 1; j < arr.length; j++){  
	            if (arr[j] < arr[index]){  
	               index = j;
	            }  
	         }  
	         int smallerNumber = arr[index];  
	         arr[index] = arr[i];  
	         arr[i] = smallerNumber;  
	      } 
	        for (int j = 0; j<arr.length - 1; j++) {
	     
	        System.out.println(arr[j]);
	    }


	   }
	}

	


