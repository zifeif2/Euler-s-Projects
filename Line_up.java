package try_Now;


import java.util.Arrays;
import java.util.Scanner;

public class Line_up {
	
    public static String threeDigits(int stance){
    	int hun = stance/100;
    	String finalResult = "";
    	if(hun > 0){
    		String hunS = transfer(hun) + "Hundred";
    		finalResult += hunS;
    	}
    	int dix = stance/10;
    	if(dix == 1){
    		String dixS = transfer(stance%100);
    		return finalResult += dixS;
    	}
    	else if(dix == 0){
    		String sinS = transfer(stance%10);
    		return finalResult + sinS;
    	}
    	else{
    		String dixS = transfer(stance%100/10*10);
    		String sinS = transfer(stance%10);
    		finalResult += dixS + sinS;
    		return finalResult;
    	}
    	
    }
    public static String transfer(int num){
    	String result;
    	switch(num){
    	case 1: result = "One"; return result;
    	case 2: result = "Two"; return result;
    	case 3: result = "Three"; return result;
    	case 4: result = "Four"; return result;
    	case 5: result = "Five"; return result;
    	case 6: result = "Six"; return result;
    	case 7:result = "Seven"; return result;
    	case 8:result = "Eight"; return result;
    	case 9:result = "Nine"; return result;
    	case 10:result = "Ten"; return result;
    	case 11:result = "ELeven"; return result;
    	case 12:result = "Twelve"; return result;
    	case 13:result = "Thirteen"; return result;
    	case 14:result = "Fourteen"; return result;
    	case 15:result = "Fifteen"; return result;
    	case 16:result = "Sixteen"; return result;
    	case 17:result = "Seventeen"; return result;
    	case 18:result = "Eighteen"; return result;
    	case 19:result = "Nineteen"; return result;
    	case 20:result = "Twenty"; return result;
    	case 30:result = "Thirty"; return result;
    	case 40:result = "Forty"; return result;
    	case 50:result = "Fifty"; return result;
    	case 60:result = "Sixty"; return result;
    	case 70:result = "Seventy"; return result;
    	case 80:result = "Eighty"; return result;
    	default:result = "Ninty"; return result;
    	}
    }
    
    public static String unit(int u){
       String result;
       switch(u){
       case 0: return "";
       case 1: return "Thousand";
       case 2:return "Million";
       default :return "Billion";
       }
    }
    
    public static void main(String[] args){
    	//Scanner scanner = new Scanner(System.in);
    	int cases = TextIO.getlnInt();
    	for (int j = 0; j < cases; j++){
    		int num = TextIO.getInt();
    		int u = 0;
    		String result = "";
    		while (num > 0){
    			int stance = num %1000;
    			result += threeDigits(stance) + unit(u);
    			u++;
    			num = num/1000;
    		}
    		System.out.println(result);
    	}
    }
  }

