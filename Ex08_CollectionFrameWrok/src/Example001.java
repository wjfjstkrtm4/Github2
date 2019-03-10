import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import kr.or.bit.Coin;
import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;




public class Example001 {

	public static void main(String[] args) {

		int[] numbers = new int[6];
		
		for(int i = 0; i < 6; i++) {
		numbers[i] =(int)(Math.random()*45) +1; 
		
		for(int j = 0; j < i; j++) {
			if(numbers[i] == numbers[j]) {
				i--;
				break;
			}
		}
		}
		for(int i = 0; i< 6; i++)  {
			System.out.print(numbers[i] + " " );
			
		}
			
	

	}

}