package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/****
 * 
 * @author Keshav
 * 
 * input
 *No of inputs 
 *Class Name age  (alterEgo)
 *
 *2
 * Human Keshav 52
 * Superhero Ram 87 MaryadaPurshotam
 * 
 * 
 * Output
 * 
 * Hey! I'm Keshav and I'm 52 years old.
 * Hey! I'm Ram and I'm 87 years old. I'm also known asMaryadaPurshotam
 * 52
 * 87
 */

public class AndroidReadiness
{
	public static void main(String[] args) throws IOException
	{
		// Test your code here:

		//Write code to receive input

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String numberOfLines=br.readLine();

		int lines=Integer.parseInt(numberOfLines);

		ArrayList<Human> humanList=new ArrayList<Human>();
		List<String> inputList=new ArrayList<String>();
		for(int i=0;i<lines;i++){
			//   System.out.println("in for loop i : "+i);
			String tempLine=br.readLine();  
			//   System.out.println("templine : "+tempLine);
			inputList.add(tempLine);
		}

		for(String tempLine:inputList){
			String []lineContent=tempLine.split(" ");
			//   System.out.println("lineContent   : "+lineContent);
			//   System.out.println("linecontent[0]  :: "+lineContent[0]);
			for(String str:lineContent){
				//   System.out.println("str  :: "+str);
			}
			if(lineContent[0].equals("Superhero"))
			{
				//   System.out.println("inside if superhero"); 
				Superhero superHero=new Superhero(lineContent[1], Integer.parseInt(lineContent[2]),lineContent[3]);
				humanList.add(superHero);
				 System.out.println(superHero.introduce());
			}else if(lineContent[0].equals("Human"))
			{
				//   System.out.println("inside else if human");
				Human tempHuman=new Human(lineContent[1], Integer.parseInt(lineContent[2]));
				humanList.add(tempHuman);
				System.out.println(tempHuman.introduce()); 
			}
		}
		Collections.sort(humanList);
		//   System.out.println("age in sorted order");
		for(Human human:humanList){
			  System.out.println(human.getAge());
		}
	}
}
class Human implements Comparable<Human> {
	private int age;
	private String name;

	public Human(String givenName, int age) {
		this.name = givenName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String introduce() {
		return "Hey! I'm " + name + " and I'm " + age + " years old.";
	}

	// Hint: Implement the method required by the Comparable Interface 
	// using age as the differentiator
	@Override
	public int compareTo(Human h){
		if(age>h.age)
		{
			return 1; 
		}else if(age<h.age){
			return -1;
		}else
			return 0;
	}
}

/*
 * - TASK: Extend the class Superhero as a subclass of Human.
 * - TASK: Add a String field that stores the hero's alter ego!
 * - TASK: Modify the given constructor by adding the alter ego as an additional parameter
 *   and setting it.
 * - TASK: Override the introduce() method to ALSO include the alter ego! (In other words,
 *   you should call the superclass introduce method when you override the method.)
 */

class Superhero extends Human{
	private String alterEgo;
	public Superhero(String givenName, int age,String alterEgo) {
		super(givenName, age);
		this.alterEgo=alterEgo;
	}

	public String getAlterEgo() {
		return alterEgo;
	}
	public String introduce() {
		String output=super.introduce();
		return output+" I'm also known as "+alterEgo;
	}
}