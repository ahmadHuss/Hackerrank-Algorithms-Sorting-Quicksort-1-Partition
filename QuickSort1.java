import java.util.*;
public class QuickSort1 {

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int elements = s.nextInt();
		
		int [] data =new int[elements];
		
		
		for(int i=0;i<elements;i++){
		data[i]=s.nextInt();	
		}
		
		
		
		
		int n = data.length;
		
		partition(data);
		
		for(int i=0;i<n;i++){
			System.out.printf("%d ",data[i]);
		}
	}
	
	
	private static void partition(int[] arr) {
	    int temp=0;
	    int pivot=arr[0];
	    
	    int lastIndex=arr.length-1;
	   
	    
	    
	    for(int i=lastIndex;i>=1;i--){
	       
	    	
	    	if(arr[i]>=pivot){
	          
	    		temp=arr[i];
	           
	            arr[i]=arr[lastIndex];
	            
	            arr[lastIndex]=temp;
	            
	            lastIndex--;
	        }
	    }
	    temp=arr[lastIndex];
	   
	    arr[lastIndex]=arr[0];
	   
	    arr[0]=temp;
	   
	}
	
}
