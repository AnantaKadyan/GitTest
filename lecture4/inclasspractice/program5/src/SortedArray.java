/* Author : Ananta
Version : 1.0.0
Purpose : to get an input of two sorted arrays from the user of varrying lenghts and merge their 
          elements in a single array and display the sorted final array*/

          import java.util.*;

          class SortedArray{
          	public static void main(String[] args) {
          		int[] arr1 = new int[4]; 
          		int[] arr2 = new int[6];  
          		int[] arr3 = new int[arr1.length+arr2.length];

          		Scanner input =new Scanner(System.in);
                int x=0;

                // getting input from the user about array 1
                System.out.println("Enter a sorted array of 4 elements  :");
                for( x= 0 ; x<4 ; x ++)
		         {
			       arr1[x] = input.nextInt();

		          }
		          // displaying the entered array
		          System.out.println(" the following elements were entered in the array :");
		          for( x = 0 ; x<4 ; x++)
		          {
			      System.out.println(arr1[x]);
		          }
                
                // getting input from the user about array 2
                System.out.println("Enter a sorted array of 6 elements  :");
                for( x= 0 ; x<6 ; x++)
		         {
			       arr2[x] = input.nextInt();

		          }
		          // displaying the entered array
		          System.out.println(" the following elements were entered in the array :");
		          for( x= 0 ; x<6 ; x++)
		          {
			      System.out.println(arr2[x]);
		          }
                
                 int i=0 , j=0 , k=0;
                while( i<arr1.length && j<arr2.length){
                	if( arr1[i]<arr2[j])
                	{
                		arr3[k] = arr1[i];
                	    i++;
                	}
                	else
                	{
                		arr3[k] = arr2[j];
                		j++;
                	}
                     k++;
                }
                 // copy the elements of array1 to array 3
                if ( i< arr1.length){
                	System.arraycopy(arr1,i,arr3,k ,(arr1.length - i));
                }
                // copy the elements of array 2 to array 3
                if ( j< arr2.length){
                	System.arraycopy(arr2,j,arr3,k, (arr2.length-j));
                }
                 // printing out the merged array
                System.out.println("merged Sorted array : " + Arrays.toString(arr3));

          	}
          }