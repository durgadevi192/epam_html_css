package epamweet2;

import java.util.*;

public class GiftAnalysis {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Chocolates> Chocolatess=new ArrayList<Chocolates>();
	static ArrayList<Chocolates> candies=new ArrayList<Chocolates>();
	static ArrayList<Sweets> Sweetss=new ArrayList<Sweets>();
	static HashMap<String,Integer> nameToWeight=new HashMap<String,Integer>();
	static HashMap<String,Integer> nameToPrice=new HashMap<String,Integer>();
	static int SweetsWeight,SweetsPrice;
	public static void main(String[] args)
	{
		inputChocolatess();
		inputSweetss();
		System.out.println("Total weight of the gift is:"+calcTotalWeight());
		System.out.println("Choose the way to sort(enter the number): 1. By Price 2. By Weight");
		int sortType=sc.nextInt();
		if(sortType==1)
		{
			Comparator<Chocolates> compareByPrice=(Chocolates c1,Chocolates c2)->((Integer)c1.getPrice()).compareTo(c2.getPrice());
			Collections.sort(Chocolatess,compareByPrice);
		}
		else
		{
			Comparator<Chocolates> compareByWeight=(Chocolate c1,Chocolate c2)->((Integer)c1.getWeight()).compareTo(c2.getWeight());
			Collections.sort(Chocolatess,compareByWeight);
		}
		System.out.println("The sort result:");
		for(Chocolates Chocolates: Chocolatess)
		{
			System.out.println(Chocolates.getPrice());
		}
		calcRange(sortType);
	}
	
	public static void inputSweetss()
	{
		
		System.out.println("Enter the number of Sweetss in gifts:\n");
		int numberOfSweetss=sc.nextInt();
		for(int SweetsCount=1; SweetsCount<=numberOfSweetss;SweetsCount++)
		{
			//System.out.println("Enter the Sweets type(Enter the number): 1. Kaju Katli 2. Gulabjam");
			System.out.println("Enter the weight of the Sweets");
			int SweetsWeight=sc.nextInt();
			System.out.println("Enter the price of the Sweets");
			int SweetsPrice=sc.nextInt();
			Sweets Sweets=new Sweets(SweetsWeight,SweetsPrice);
			Sweetss.add(Sweets);
		}
	}
	public static int calcTotalWeight()
	{
		int totalWeight=0;
		for(Chocolates choco: Chocolatess)
		{
			totalWeight+=choco.getWeight();
		}
		for(Sweets Sweets:Sweetss)
		{
			totalWeight+=Sweets.getWeight();
		}
		return totalWeight;
	}
	public static void inputChocolatess()
	{
		System.out.println("Enter the nummber of Chocolatess in gifts:\n");
		int numberOfChocolatess=sc.nextInt();
		for(int chocoCount=1; chocoCount<=numberOfChocolatess;chocoCount++)
		{
			System.out.println("Enter the Chocolates type(Enter the number): 1. Candy 2.Wafer");
			int ChocolatesType=sc.nextInt();
			System.out.println("Enter the weight of the choclate");
			int chocoWeight=sc.nextInt();
			System.out.println("Enter the price of the Chocolates");
			int chocoPrice=sc.nextInt();
			if(ChocolatesType==1)
			{
				System.out.println("Enter the name of the candy");
				String candyName=sc.next();
				if(nameToWeight.containsKey(candyName))
				{
					nameToWeight.put(candyName,(int)nameToWeight.get(candyName)+chocoWeight);
				}
				else 
					nameToWeight.put(candyName,chocoWeight);
				if(nameToPrice.containsKey(candyName))
				{
					nameToPrice.put(candyName,(int)nameToPrice.get(candyName)+chocoPrice);
				}
				else
					nameToPrice.put(candyName,chocoPrice);
			}
			Chocolates choco =new Chocolates(chocoWeight,chocoPrice);
			Chocolatess.add(choco);
			if(ChocolatesType==1)
			{
				candies.add(choco);
			}
		}
	}
	public static void calcRange(int sortType)
	{
		Scanner sc=new Scanner(System.in);
	   System.out.println("Let's find the range:");
	   int lowerLimit,higherLimit;
	   if(sortType==1)
	   {
		   System.out.println("Enter the lowerlimit of the price:");
		   lowerLimit=sc.nextInt();
		   
		   System.out.println("Enter the higherlimit of the price");
		   higherLimit=sc.nextInt();
		   
		   Set<Map.Entry<String,Integer>> candySet=nameToPrice.entrySet();
		   Iterator<Map.Entry<String,Integer>> candyIterator=candySet.iterator();
		   while(candyIterator.hasNext())
		   {
			   Map.Entry candyElement=(Map.Entry)candyIterator.next();
			   int currentPrice=(int)candyElement.getValue();
			   if(currentPrice>= lowerLimit && currentPrice<=higherLimit)
				   System.out.println(candyElement.getKey());
		   }
	   }
	   else
	   {
		   System.out.println("Enter the lowerlimit of the weight:");
		   lowerLimit=sc.nextInt();
		   System.out.println("Enter the higherlimit of the weight:");
		   higherLimit=sc.nextInt();
		   Set<Map.Entry<String,Integer>> candySet=nameToWeight.entrySet();
		   Iterator<Map.Entry<String,Integer>> candyIterator=candySet.iterator();
		   while(candyIterator.hasNext())
		   {
			   Map.Entry candyElement=(Map.Entry)candyIterator.next();
			   int currentWeight=(int)candyElement.getValue();
			   if(currentWeight>= lowerLimit && currentWeight<=higherLimit)
				   System.out.println(candyElement.getKey());
		   }
		   
	   }
	}
}
