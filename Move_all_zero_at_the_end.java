/*package whatever //do not write package name here */


/* Move all the zeros of array at the end and follow sequence*/
import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		int arr[]={10,20,0,15,25,0,56,0,78};
		
		//O(n) Solution
	    int count=0;
		for(int i=0; i<arr.length; i++){
		    if(arr[i]!=0)
		    {
		        swap(arr,i,count);
		        count++;
		    }
		}
		
		//O(n^2) Solution
		for(int i=0; i<arr.length; i++){
		    if(arr[i]==0){
		        for(int j=i+1; j<arr.length; j++){
		            if(arr[j]!=0)
		               {
		                   swap(arr,i,j);
		                   break;
		               }
		        }
		    }
		}
		   
		for(int k=0; k<arr.length; k++){
		    System.out.print(arr[k]+"  ");
		}
	}
	static void swap(int arr[],int i,int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
}
