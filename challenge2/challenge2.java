package challenge2;

import java.util.Arrays;
import java.util.Scanner;

public class challenge2 {
	public static int[] jinwei(int index, int[] result, int much){
		 if(index == result.length-1) {
		        result = Arrays.copyOf(result, 2*result.length);
		            for( int j = index;j < result.length; j++ ) 
		            	result[j] = 10;
		        }
		 		
		     
		        if(result[index] == 10 && much == 0) {
		        	return result;
		        }
		        if(result[index] == 10) result[index] = 0;
		        int temp = result[index] *2 + much;
		        if(temp >= 10){
		            result[index] = temp%10;
		            return jinwei(++index, result, temp/10);
		        }
		        else{
		            result[index] =temp;
		            return jinwei(++index,result,0);
		        }
		       
		    }
		    public static void main(String[] args) {
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner scanner = new Scanner(System.in);
		        int num = scanner.nextInt();
		        for ( int a = 0; a < num; a++){
		            int pow = scanner.nextInt();
		            int[] result = new int[10];
		            for(int i = 0; i < result.length; i++) result[i] = 10;
		            result[0] = 1;
		            for(int i = 1; i < pow+1; i++){
		                result = jinwei(0, result, 0);
		            }
		        int sum = 0;
		        for(int i = 0; result[i] < 10; i++) sum += result[i];
		        System.out.println(sum);
		        }
		    }
}


	
	


	
