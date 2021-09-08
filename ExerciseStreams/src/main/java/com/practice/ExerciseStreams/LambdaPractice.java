package com.practice.ExerciseStreams;

import java.util.function.Function;

public class LambdaPractice {

	public static void main(String[] args) {

		/*Runnable thread = () -> {
			String strSample = "Lets split this string into string";
			String[] parts = strSample.split(" ");
			for (String string : parts) {
				System.out.println(string+" ");
			}
		};
		
		thread.run();
		*/
		
		Function <String, String> lambdaFunc = s -> {
			for (int i=0; i< s.length(); i++) {
				if(i % 2 == 0){
				System.out.println(s.charAt(i));
			}
			}
			return s;
		};
		
		lambdaFunc.apply("123456789");
		
		
	}
}
