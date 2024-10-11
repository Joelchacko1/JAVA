package oopjava;
abstract class Animal{
	protected int leg;
	Animal(int leg){
		this.leg=leg;}
	
		 abstract void eat();
			
		
		void walk(){
		
				System.out.println("This animal has"+" "+leg+" "+"legs");
				
			
			
		}
	}
	
class Spider extends Animal{
	Spider(int leg)
	{
		super(leg);	
	}
	void eat() {
		System.out.println("this animal eat insects");
	}
}
interface pet{
	 void getname();
	 void setname(String name);
	 void play();
	 
	 
}

class cat extends Animal implements pet
 {
	 	String name;
	 	
	 	
		cat(int leg,String name)
		{
			super(leg);	
			this.name=name;
			
		}
		public void getname() {
			System.out.println("The cat name is"+" "+name);
		}
		
		
		void eat() {
			System.out.println("this animal eat fishes ");
		}
		public void setname(String name) {
			System.out.println("This cat name is"+" "+name);
			
		}
		public void play() {
			System.out.println("Cat play with rats");
		}
		
	}
 class fish extends Animal implements pet
{
	 	String name;
	 	
	 	
		fish(int leg,String name)
		{
			super(leg);	
			this.name=name;
			
		}
		public void getname() {
			System.out.println("The fish name is"+" "+name);
		}
		public void play() {
		}
		
		public void eat() {
			System.out.println("this animal eat plants ");
		}
		public void setname(String name) {
			System.out.println("This fish name is"+" "+name);
			
		}
	
			
		
		
		}
		

 
public class Interface {
	
	public static void main(String[] args) {
		
		
		
Spider a = new Spider(8);
	System.out.println("Spider");
    a.eat();	
    a.walk();
    
    cat c=new cat(4,"fluffy");
    System.out.println("Cat");
    c.getname();
    c.walk();
   c.play();
    c.eat();
    c.setname("moose");
    
    fish f=new fish(0,"mimi");
    System.out.println("fish");
    f.getname();
    f.walk();
    f.eat();
    f.setname("momo");
  
	}
	}  
