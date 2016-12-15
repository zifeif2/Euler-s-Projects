package try_Now;

import java.util.Arrays;
import java.util.Scanner;

public class Line_up {
	public static int[] jinwei(int index, int[] result, int much){
	if(index == result.length-1) {
        result = Arrays.copyOf(result, 2*result.length);
        }
 		
     
        if(result[index] == 0 && much == 0) {
        	return result;
        }
        int temp = result[index]%10 *2 + much;
        if(temp > 10){
            result[index] = temp%10;
            return jinwei(++index, result, 1);
        }
        else if (temp == 10){
        	result[index] = 10;
            return jinwei(++index, result, 1);
            
        }
        else if(temp == 0){
        	result[index] = 10;
        	return jinwei(++index, result,0);
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
            result[0] = 1;
            for(int i = 1; i < pow+1; i++){
                result = jinwei(0, result, 0);
            }
        int sum = 0;
        for(int i = 0; result[i] != 0; i++) sum += result[i]%10;
        System.out.println(sum);
        }
    }
  }

