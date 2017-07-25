package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Person {

	String name;
	String occupation;
	int age;

	
	public Person(String name, String occupation, int age) {

		this.name = name;
		this.occupation = occupation;
		this.age = age;

	}
	
	
	
	
	 public String toString(){
	 return "Name: " + name + "Occupation: " + occupation + "Age: " + age;
	 }

	 
	 
	 
}
	 
	 
