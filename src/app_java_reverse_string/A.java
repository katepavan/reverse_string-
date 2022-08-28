package app_java_reverse_string;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter opening and closing paranthesis-()");
	String str=scan.next();
	int count1=0;
	int count2=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='(') {
			count1++;
		}
		else if (str.charAt(i)==')') {
			count2++;
			
		}
	}
	if (count1==count2) {
		System.out.println("no error");
	}else {
		System.out.println("error");
		
	}
	
}
}
