package Application;

import java.util.Arrays;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String input= sc.nextLine();
	    sc.close();
		input = input.toLowerCase();
		int x=input.length();
		char[] Palavra = new char[x];
		
		for (int i = 0; i < x; i++) {
	        Palavra[i] = input.charAt(i);
		}

	    int left = 0;
        int right = x - 1;
        int flag=0;
        
        while (right>left) {

            if (input.charAt(left) == input.charAt(right)) {
            	flag+=1;
            }
            else {
            	flag=0;
             	break;
            }
            left +=1;
            right-=1;
        }
        
        if (flag!=0) {
        	System.out.println("É um palíndromo");
        }
        else {
        	System.out.println("Não é um palíndromo");
        }
	}	
}
