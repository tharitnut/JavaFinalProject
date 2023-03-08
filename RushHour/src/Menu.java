import java.util.*;

public class Menu {
	private String menu;
	private String addition;

	public Menu() {
		menu = "";
		addition = "";
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

	public void randomMenu() {
		String[] menuBeforeMeat = { "ผัดกระเพรา", "ข้าวผัด" ,"ผัดคะน้า"};
		String[] menuAfterMeat = {"ทอดกระเทียม","ผัดพริกเกลือ","ผัดน้ำมันหอย","ผัดพริกแกง"};
		String[][] allMenu = {menuBeforeMeat,menuAfterMeat};
		Random rand = new Random();
		int _menu = rand.nextInt(allMenu.length);
		int menuMeat;
		int meatMenu;
		if(_menu==0) {
			menuMeat = rand.nextInt(menuBeforeMeat.length);
			menu = menuBeforeMeat[menuMeat]+menu;
		}
		else {
			meatMenu = rand.nextInt(menuAfterMeat.length);
			menu += menuAfterMeat[meatMenu];
		}
	}

	public void selectMeat(int meat) {
		switch (meat) {
		case 1:
			menu += "หมู";
		case 2:
			menu += "หมูกรอบ";
		case 3:
			menu += "เนื้อ";
		case 4:
			menu += "ไก่";
		case 5:
			menu += "กุ้ง";
		case 6:
			menu += "หมึก";
		case 7:
			menu += "ปลา";
		case 8:
			menu += "ทะเล";

		}
	}
	
	public void plusSpicy(int spicy) {
		switch (spicy) {
		case 1:
			menu+=" ไม่เผ็ด";
		case 2:
			menu+=" เผ็ดน้อย";
		case 3:
			menu+=" เผ็ดกลาง";
		case 4:
			menu+=" เผ็ด";
		case 5:
			menu+=" เผ็ดมาก";
		}
	}

	public void plusVeg(int veg) {
		if (veg == 1) {
			menu+=" ไม่ใส่ผัก";
		}
	}

	public void plusTopping(int topping) {
		switch (topping) {
		case 1:
			menu += " เพิ่มไข่ดาวสุก";
		case 2:
			menu+=" เพิ่มไข่ดาวยางมะตูม";
		}
	}

}
