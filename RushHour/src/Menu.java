import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Menu {
	private String menu;
	private String addition;
	private int price;
	private String topping;
	private String[] menuBeforeMeat;
	private String[] menuAfterMeat;

	public Menu() {
		menu = "";
		addition = "";
		price = 0;
		topping = "";
	}

	public String getMenu() {
		return menu;
	}
	
	public String getTopping(){
		return topping;
	}

	public void setAddtion(String addition) {
		this.addition = addition;
	}

	public String getAddition() {
		return addition;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void randomMenu() {
		menuBeforeMeat = new String[]  { "Pad Kraprao ", "Kaopad ", "Pad Kana " };
		menuAfterMeat = new String[]  { " Tod Gratiem", " Pad Prigkleur", " Pad Nammunhoi", " Pad priggaeng" };
		String[][] allMenu = { menuBeforeMeat, menuAfterMeat };
		Random rand = new Random();
		int _menu = rand.nextInt(allMenu.length);
		int menuMeat;
		int meatMenu;
		if (_menu == 0) {
			menuMeat = rand.nextInt(menuBeforeMeat.length);
			this.menu = menuBeforeMeat[menuMeat] + this.menu;
		} else {
			meatMenu = rand.nextInt(menuAfterMeat.length);
			this.menu += menuAfterMeat[meatMenu];
		}
	}

	public void selectMeat(int meat) {
		if (meat == 1) {
			this.menu += "Pork";
			price += 45;
		} else if (meat == 2) {
			this.menu += "Crispy Pork";
			price += 50;
		} else if (meat == 3) {
			this.menu += "Beef";
			price += 50;
		} else if (meat == 4) {
			this.menu += "Chicken";
			price += 45;
		} else if (meat == 5) {
			this.menu += "Shrimp";
			price += 50;
		} else if (meat == 6) {
			this.menu += "Squid";
			price += 50;
		} else if (meat == 7) {
			this.menu += "Fish";
			price += 45;
		} else if (meat == 8) {
			this.menu += "Seafood";
			price += 50;
		}
	}

	public void plusSpicy(int spicy) {
		if (spicy == 1)
			topping += " No Spicy";

		else if (spicy == 2)
			topping += " Little Spicy";

		else if (spicy == 3)
			topping += " Medium Spicy";

		else if (spicy == 4)
			topping += " Spicy";

		else if (spicy == 5)
			topping += " Extra Spicy";

	}

	public void plusVeg(int veg) {
		if (veg == 1) {
			topping += " No Vegetable";
		}
	}

	public void plusTopping(int _topping) {
		if (_topping == 1) {
			topping += " With Normal Fried Egg";
			price += 10;
		} else if (_topping == 2) {
			topping += " With Sunny Side Up Egg";
			price += 10;
		}
	}

	public void addMenu(String menu) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Menu.txt", true));
			PrintWriter write = new PrintWriter(bw);
			write.println(getMenu());
			bw.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}

}
