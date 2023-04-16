package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	  
	
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(1);
		l.add(1);
		System.out.println(is_palindrome(l));
	}
	private static int is_palindrome(LinkedList<Integer> l ) {
		//
		
		int i = 0;
		int j = l.size()-1;
		
		while(i <= j) {
			if(l.get(i) != l.get(j)) {
				return 0;
			}
			i++;
			j--;
		}
		
		return 1;
	}

    	
    	
    }
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

