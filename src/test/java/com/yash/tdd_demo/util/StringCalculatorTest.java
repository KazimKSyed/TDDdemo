package com.yash.tdd_demo.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
	
 @Test
	public void TestCalculate_GivenEmptyString_ShouldReturn0() {
	 StringCalculator s=new StringCalculator();
	 int result=s.calculate("");
	 assertEquals(0,result);
 }
 
 @Test
	public void TestCalculate_Given10AsString_ShouldReturn10AsInteger() {
	 StringCalculator s=new StringCalculator();
	 int result=s.calculate("20");
	 assertEquals(20,result);
}
 @Test
 public void TestCalculate_Given10and20_ShouldReturn30AsInteger()  {
	 StringCalculator s=new StringCalculator();
	 int result=s.calculate("10,20");
	 assertEquals(30,result);
}
}
