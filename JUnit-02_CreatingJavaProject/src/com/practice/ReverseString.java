package com.practice;

public class ReverseString {
	public String reverseString(String str) {
		char[] reverse = str.toCharArray();		//converted to char Array
		int length = reverse.length - 1;		//total index of str
		char[] reversedForm = new char[reverse.length];		//create reversed str
		
		
		int a = 0;
		for (int i = length; i >= 0; i--) {
			reversedForm[a] = reverse[i];
			a++;
		}
		
		return new String(reversedForm);
	}
}
