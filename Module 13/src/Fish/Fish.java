package Fish;

public class Fish {
	String typeOfFish;
	int friendliness;
	
	Fish() {
		typeOfFish = "Unknown";
		friendliness = 3;
	}
	
	Fish(String t, int f) {
		typeOfFish = t;
		friendliness = f;
	}
	public void setTypeOfFish(String newTypeOfFish) {
		typeOfFish = newTypeOfFish;
	}
	public void setFriendliness(int newFriendliness) {
		friendliness = newFriendliness;
		
	}
	public String getTypeOfFish() {
		return typeOfFish;
	}
	
	public int getFrienfliness() {
		return friendliness;
	}
	
	public static void main(String [] args) {
		Fish Amber = new Fish("AngleFish", 5);
		Fish James = new Fish("Guppy", 3);
		Fish John = new Fish("Random", 2);

		nicestFish(Amber.getFrienfliness(), James.getFrienfliness());
		
	}

	public static void nicestFish(int fish1, int fish2) {
		if(fish1 > fish2) {
			System.out.println(statusFriendlines(fish1));
		}
		else if(fish1 < fish2) {
			System.out.println(statusFriendlines(fish2));
		}
		else {
			System.out.println("Draw");
		}
	}
	
	public static String statusFriendlines(int newFriendliness) {
		String akhir;
		if (newFriendliness == 1) {
			akhir = "Mean";
		} else if(newFriendliness == 2) {
			akhir = "Not Friendly";
		} else if(newFriendliness == 3) {
			akhir = "Neutral";
		} else if(newFriendliness == 4) {
			akhir = "friendly";
		} else if(newFriendliness == 5) {
			akhir = "Very Friendly";
		} else {
			akhir = "Eror";
		}
		return akhir;
	}
	
	Fish nicestFish(Fish ... a) {
		Fish temp = a[0];
		for (int I =1; I < a.length; I++) {
			if(temp.getFrienfliness() < a[I].getFrienfliness()) {
				temp = a[I];
			}
		}
		return temp;
	}
	
}

