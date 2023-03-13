import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Menu {
	private String menu;
	private String addition;
	private int price;

	public Menu() {
		menu = "";
		addition = "";
		price = 0;
	}

	public String getMenu() {
		return menu;
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
		String[] menuBeforeMeat = { "Pad Krapao ", "Kaopad ", "Pad Kana " };
		String[] menuAfterMeat = { " Tod Gratiem", " Pad Prigkleur", " Pad Nammunhoi", " Pad priggaeng" };
		String[][] allMenu = { menuBeforeMeat, menuAfterMeat };
		Random rand = new Random();
		int _menu = rand.nextInt(allMenu.length);
		int menuMeat;
		int meatMenu;
		if (_menu == 0) {
			menuMeat = rand.nextInt(menuBeforeMeat.length);
			menu = menuBeforeMeat[menuMeat] + menu;
		} else {
			meatMenu = rand.nextInt(menuAfterMeat.length);
			menu += menuAfterMeat[meatMenu];
		}
	}

	public void selectMeat(int meat) {
		if (meat == 1) {
			menu += "Pork";
			price += 45;
		} else if (meat == 2) {
			menu += "Crispy Pork";
			price += 50;
		} else if (meat == 3) {
			menu += "Beef";
			price += 50;
		} else if (meat == 4) {
			menu += "Chicken";
			price += 45;
		} else if (meat == 5) {
			menu += "Shrimp";
			price += 50;
		} else if (meat == 6) {
			menu += "Squid";
			price += 50;
		} else if (meat == 7) {
			menu += "Fish";
			price += 45;
		} else if (meat == 8) {
			menu += "Seafood";
			price += 50;
		}
	}

	public void plusSpicy(int spicy) {
		if (spicy == 1)
			menu += " No Spicy";

		else if (spicy == 2)
			menu += " Little Spicy";

		else if (spicy == 3)
			menu += " Medium Spicy";

		else if (spicy == 4)
			menu += " Spicy";

		else if (spicy == 5)
			menu += " Extra Spicy";

	}

	public void plusVeg(int veg) {
		if (veg == 1) {
			menu += " No Vegetable";
		}
	}

	public void plusTopping(int topping) {
		if (topping == 1) {
			menu += " With Normal Fried Egg";
			price += 10;
		} else if (topping == 2) {
			menu += " With Sunny Side Up Egg";
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
