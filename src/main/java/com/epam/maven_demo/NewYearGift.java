package com.epam.maven_demo;
import java.util.*;
public class NewYearGift extends chocolates implements Sweets {
	public static void main(String[] args)
	{
		NewYearGift gift=new NewYearGift();
		gift.Gifts();
	}
	public void Gifts()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of gifts:");
		int no_gifts=sc.nextInt();
		for(int g=1;g<=no_gifts;g++)
		{
			chocolates chocolate_obj=new chocolates();
			List<Integer> chocolates_list=new ArrayList<Integer>();
			List<Integer> candies_list=new ArrayList<Integer>();
			List<Integer> final_candyList=new ArrayList<Integer>();
			System.out.println("Enter number of chocolates :");
			int num_chocolates=sc.nextInt();
			int chocolates_weight=0;
			for(int choco=1;choco<=num_chocolates;choco++)
			{
				System.out.println("Enter the name of chocolate :");
				String name=sc.next();
				System.out.println("Enter Weight of a chocolate :");
				int weight_choco=sc.nextInt();
				System.out.println("Enter price of chocolate");
				int price_choco=sc.nextInt();
				chocolates_weight+=chocolate_obj.total_chocolates_weight(weight_choco,price_choco);
				chocolates_list.add(price_choco);
			}
			System.out.println("Enter number of candies :");
			int num_candies=sc.nextInt();
			int total_candie_wt=0;
			for(int choco=1;choco<=num_candies;choco++)
			{
				System.out.println("Enter the name of candie :");
				String name=sc.next();
				System.out.println("Enter Weight of a candie :");
				int weight_candie=sc.nextInt();
				System.out.println("Enter price of candie");
				int price_candie=sc.nextInt();
				int candies_weight=chocolate_obj.total_candies_weight(weight_candie,price_candie);
				candies_list.add(candies_weight);
				total_candie_wt+=candies_weight;
			}
			Sweets sweet_obj=new NewYearGift();
			System.out.println("Enter number of sweets :");
			int num_sweets=sc.nextInt();
			int sweets_weight=0;
			for(int sweet=1;sweet<=num_sweets;sweet++)
			{
				System.out.println("Enter name of sweet :");
				String name=sc.next();
				System.out.println("Enter Weight of a sweet :");
				int weight_sweet=sc.nextInt();
				System.out.println("Enter price of sweet :");
				int price_sweet=sc.nextInt();
				sweets_weight+=sweet_obj.total_sweets_weight(weight_sweet,price_sweet);
			}
			int total_weight=chocolates_weight+sweets_weight+total_candie_wt;
			System.out.println("Total weight of gift is :"+total_weight);
		
			System.out.println("Enter minimum weight for candy :");
			int min_range=sc.nextInt();
			System.out.println("Enter maximum weight for candy :");
			int max_range=sc.nextInt();
			for (int candy=0;candy<candies_list.size();candy++)
			{
				int c_weight=candies_list.get(candy);
				if(c_weight>=min_range && c_weight<=max_range)
				{
					final_candyList.add(c_weight);
				}
			}
			System.out.println("Weight of candies that are in the given range are :"+final_candyList);
			Collections.sort(chocolates_list);
			System.out.println("sorted chocolates based on price are :"+chocolates_list);
		}
		
	}
	public int total_sweets_weight(int weight,int price)
	{
		return weight;
	}

}
