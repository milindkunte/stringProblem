package com.qa.StringTest;

import static org.junit.Assert.*;

import org.junit.Test;


public class RemoveReplaceTest {
	
	public String removeIteration(String str, char c) {
		int length = str.length();
		StringBuffer buffer = new StringBuffer(length);
		buffer.setLength(length);
		int count =0;
		for (int i = 0; i < length; i++){
			 char current = str.charAt(i);
			 if(current != c){
				 buffer.setCharAt(count++, current);
			 }
		}
		return buffer.toString();
	}
	
	public String replaceString(String str, char c) {
		
		String output = str.replace(Character.toString(c), "");
		return output;
	}
		
	@Test
	public void tests() {
		String actual = "";
		String expected= "";
		
		//Positive test cases
		//1
		String input = "Milind";
		char c = 'i';
		actual = removeIteration(input, c).trim();
		expected = input.replace("i", "");
		assertEquals(actual,expected);
		actual = replaceString(input, c);
		assertEquals(actual,expected);
		
		//2
		input = "Berkeley, Emeryville, San Francisco";
		c = 'i';
		actual = removeIteration(input, c).trim();
		expected = input.replace("i", "");
		assertEquals(actual,expected);
		actual = replaceString(input, c);
		assertEquals(actual,expected);
		
						
		//Negative test cases
		input = "Milind";
		c = 'a';
		actual = removeIteration(input, c).trim();
		expected = input.replace("a", "");
		assertEquals(actual,expected);
		actual = replaceString(input, c);
		assertEquals(actual,expected);
		
		input = "Milind";
		c = '_';
		actual = removeIteration(input, c).trim();
		expected = input.replace("_", "");
		assertEquals(actual,expected);
		actual = replaceString(input, c);
		assertEquals(actual,expected);
	}
	
}
