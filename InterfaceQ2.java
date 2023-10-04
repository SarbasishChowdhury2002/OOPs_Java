abstract class Animal {
	protected int legs;
	
	protected Animal(int n) {
		this.legs = n;
	}
	
	public void display() {
		System.out.println("I am an Animal");
	}
	
	abstract void eat();
	
	public void walk() {
		System.out.println("I walk with " + this.legs + " legs");
	}
}


interface Pet {
	void setName(String name);
	String getName();
	void play();	
}


class Spider extends Animal {
	Spider() {
		super(8);
	}
	
	@Override
	public void display() {
		System.out.println("I am a Spider");
	}
	
	void eat() {
		System.out.println("I love to eat insects");
	}
}


class Cat extends Animal implements Pet {
	String name;
	
	Cat() {
		super(4);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void display() {
		System.out.println("I am a Cat. My name is " + this.getName());
	}
	
	public void play() {
		System.out.println("Meow! Meow! I am playing");
	}
	
	public void eat() {
		System.out.println("I love to eat fish");
	}
}


class Fish extends Animal {
	Fish() {
		super(0);
		System.out.println("I am a Fish\nI do not have legs");
	}
	
	@Override
	public void walk() {
		System.out.println("I cant walk");
	}
	
	public void swim() {
		System.out.println("I swim");
	}
	
	public void eat() {
		System.out.println("I love to eat worms, insects etc.");
	}
}

class TestAnimals {
	public static void main(String args[]) {
		//Animal ani = new Animal();	--- error as it is an abstract class
		Spider spi = new Spider();
		Cat cat = new Cat();
		
		spi.display();
		spi.walk();
		System.out.println();
		
		cat.setName("Kitty");
		cat.display();
		cat.walk();
		cat.play();
		cat.eat();
		System.out.println();
		
		Fish fish = new Fish();
		fish.walk();
		fish.eat();
		System.out.println();
		
		Animal a = new Fish();
		a.walk();
		
		Animal e = new Spider();
		System.out.println(e.legs);
		
		Pet p = new Cat();
		p.play();
		
	}
}








