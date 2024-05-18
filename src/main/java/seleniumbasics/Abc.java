package seleniumbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Abc {
	
	
	public static void main(String[] args) {
		int num []= {10,20};
		int count = 0;
		for(int e:num) {
			System.out.println(num[count]);
			count++;
		}
		
		System.out.println("------------");
		String li[] = {"a","b","c"};
		ArrayList<String> as = new ArrayList<String>();
		as.add("a");
		as.add("b");
		as.add("c");
		System.out.println(as);
		
		for(int i = 0; i<li.length;i++) {
			System.out.println("------------");
			if(li[i].equals(as.get(i)))
				System.out.println("present : "+li[i]);
		}
		
		System.out.println("------------");
		ArrayList<String> links = new ArrayList<String>(Arrays.asList("a","b","c"));
	   System.out.println(as.containsAll(links));
	   
	   System.out.println("-----------------------------------------------------------------");
	   
	   System.out.println("soni_"+System.currentTimeMillis()+"@opencart.com");
	   
	   String value = "macbook";
		
		char[] ch = value.toCharArray();
		System.out.println(ch[2]);
	
	}
	
	//List<String> accPa = {"",};
	//
	
	
	
	
	

}
