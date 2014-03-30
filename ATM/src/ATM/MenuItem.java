package ATM;

public class MenuItem {
	private String itemText;
	public void itemAction() {
		System.out.print(itemText);
	}
	public String getTextoo() {
		return itemText;
	}
	public void action() {
		System.out.print("No Action");
	}
	public void setItemText(String itemText){
		this.itemText = itemText;
	}
	public String getItemText(){
		return this.itemText;
	}
}

final class MenuItemWithdraw extends MenuItem {
	public int itemAmmount;
	public MenuItemWithdraw(String text,int ammount){
		itemAmmount = ammount;
		setItemText(text);
	}
	public void action() {
		System.out.print("WithDraw"+getItemText());
	}
}

final class MenuItemPut extends MenuItem {
	public int itemAmmount;
	public MenuItemPut(String text,int ammount){
		setItemText(text);
		itemAmmount = ammount;
	}
	public void action() {
		System.out.print("Put"+getItemText());
	}
}

final class MenuItemBalance extends MenuItem {
	public MenuItemBalance(String text){
		setItemText(text);
	}
	public void action() {
		System.out.print("Balance");
	}
}

final class MenuItemShowMenu extends MenuItem {
	public Menu subMenu;
	public MenuItemShowMenu(String text,Menu menu) {
		setItemText(text);
		subMenu = menu;
	}
	public void action() {
		subMenu.drawMenu();
	}
}

