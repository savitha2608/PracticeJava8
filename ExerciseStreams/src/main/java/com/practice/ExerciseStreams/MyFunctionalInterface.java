package com.practice.ExerciseStreams;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	public void test();

}

 class MyFunctionalImplement {

	public static void main(String args[]){
		MyFunctionalInterface funcInterface =  () -> System.out.println("Lambda here");
	}
}
