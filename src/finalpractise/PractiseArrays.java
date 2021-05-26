package finalpractise;

import java.util.Arrays;

public class PractiseArrays {
	
//	public static void removeduplicateelements(int arr[], int n) {
		
//		 if (n==0 || n==1){  
//	            return n;  
//	        }    
//	        int j = 0;//for next element  
//	        for (int i=0; i < n-1; i++){  
//	            if (arr[i] != arr[i+1]){  
//	                arr[j++] = arr[i];  
//	            }  
//	        }  
//	        arr[j++] = arr[n-1];  
//	        return j;  
//	    }  
		
		

	

	public static void main(String[] args) {

		int x[] = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 50;
		x[4] = 60;
		System.out.println(x[2]);

		int length = x.length;
		System.out.println(length);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);

		}

		for (int i : x) {
			System.out.println(i);

		}

		// how to compare two arrays

		String x1[] = { "suji, babyma, saanika" };
		String x2[] = { "suji, babyma, saanika" };

		Arrays.sort(x1);
		System.out.println(Arrays.toString(x1));

		if (Arrays.equals(x1, x2)) {
			System.out.println("same");

		} else {
			System.out.println("not same");
		}

		Arrays.sort(x1);
		System.out.println(Arrays.toString(x2));

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println(sum);
		
		
				
		
	
		
		
	
		}
		
	}


