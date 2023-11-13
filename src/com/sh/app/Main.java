package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Lion;
import com.sh.app.animal.Pig;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello git");
		
		new Dog().bark();
		new Cat().jump();
		new Lion().attack();
		new Bird().fly();
		new Pig().pig();
	}
	
	public void test() { 
		 System.out.println("Main#test");
	}

}
