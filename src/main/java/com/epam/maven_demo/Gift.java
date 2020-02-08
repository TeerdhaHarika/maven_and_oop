package com.epam.maven_demo;
import java.util.*;
public class Gift extends chocolates implements Sweets {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> chocolates=new ArrayList<Integer>();
		System.out.println("Enter no.of gifts:");
		int gifts=sc.nextInt();
		for(int i=1;i<=gifts;i++)
		{
			chocolates c=new chocolates();
			System.out.println("Enter number of chocolates :");
			int nc=sc.nextInt();
			System.out.println("Enter Weight of a chocolate :");
			int wc=sc.nextInt();
			int chocolates_weight=c.total_chocolates_weight(nc,wc);
			Sweets s1=new Gift();
			System.out.println("Enter number of sweets :");
			int ns1=sc.nextInt();
			System.out.println("Enter Weight of a sweet :");
			int ws1=sc.nextInt();
			int sweets_weight1=s1.total_sweets_weight(ns1,ws1);
			Sweets s2=new Gift();
			System.out.println("Enter number of sweets :");
			int ns2=sc.nextInt();
			System.out.println("Enter Weight of a sweet :");
			int ws2=sc.nextInt();
			int sweets_weight2=s2.total_sweets_weight(ns2,ws2);
			int total_weight=chocolates_weight+sweets_weight1+sweets_weight2;
			System.out.println("Total weight of gift is :"+total_weight);
			chocolates.add(chocolates_weight);
		}
		Collections.sort(chocolates);
		System.out.println("chocolates weights are"+chocolates);
	}
	public int total_sweets_weight(int no_of_sweets,int weight)
	{
		return no_of_sweets*weight;
	}

}
