package com.springcore.ci;

public class Person {
   private String name;
   private int personid;
   
   public Person(String name,int personid) {
	   this.name=name;
	   this.personid=personid;
   }

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.name+ " : "+this.personid;
}
}
