package coreJava;

class Animal1
{  
	Animal1()
	{
		System.out.println("animal1 is created");
	}  
}  


class Animal
{  
	Animal()
	{
		System.out.println("animal is created");
	}  
}  

class Dog extends   Animal1{  
		Dog()
		{  
			System.out.println("dog is created");  
		}  
	}  
public class SuperConstructor {

	public static void main(String[] args) {
		Dog d=new Dog();  
		// TODO Auto-generated method stub
		
		

	}

}
