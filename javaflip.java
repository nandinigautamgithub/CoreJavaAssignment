package com.CoreJava;

public class javaflip {
	public static void main(String[] args) {
			int headcount = 0 , tailscount =0 , flips=10;
			int headpercent, tailpercent;
			for (int i=0; i<10; i++)
			{
		if (Math.random() < 0.5) {
			System.out.println("heads");
			headcount++ ;
		}else {
			System.out.println("tails");
			tailscount++ ;
		}
		
		System.out.println("times heads:" +headcount);
		headpercent = headcount*100/flips;
		System.out.println("headpercent:" +headpercent);

		System.out.println("times tails:" +tailscount);
		tailpercent = 100 - headpercent ;
		System.out.println("tailpercent:" +tailpercent);
	    }
		
	}
}
