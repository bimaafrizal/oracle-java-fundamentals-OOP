package Animal;

public class Animal {
	int weight, height;
	double speed;
	
	Animal(int w, int h, int s) {
		weight = w;
		h = height;
		speed = s;
	}
	public double getTime(double miles) {
		return miles/speed;
	}
	public int getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public double getSpeed() {
		return speed;
	}
	public static void main(String [] args) {
		Animal animal1 = new Animal(10, 50, 4); 
		Animal animal2 = new Animal(5, 20, 5); 
		
		System.out.println(animal1.getSpeed());
		System.out.println(animal2.getSpeed());
	}
	
}
