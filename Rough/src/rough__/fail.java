package rough__;
class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}
	public String toString() {
		return name + " " + "is my dog name";
	}
}
class Dog extends Animal {
	String Breed;
	Dog(String name, String Breed) {
		super(name);
		this.Breed = Breed;
	}
	public String toString() {
		return name + " " + "is my dog name and his breed is" + Breed;
	}
}
class fail {
	public static void main(String args[]) {
		Dog d = new Dog("Rahul", "PINKY");
		System.out.println(d.toString());
	}
}