package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Lion;
import com.sh.app.animal.Pig;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello git");
		

		System.out.println("동물기능 시작~");
		System.out.println("Animal Go~");		
		new Dog().bark();
		new Lion().attack();
		new Bird().fly();
		new Pig().pig();
	}
	
	public void test() { 
		 System.out.println("Main#test");
	}

}
