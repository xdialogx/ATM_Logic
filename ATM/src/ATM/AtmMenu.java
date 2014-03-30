package ATM;


public class AtmMenu {
	
	public static void main(String[] args) {
			Menu menuMain = new Menu("Main Menu");
			Menu menuBalance = new Menu("Balance");
			menuMain.addMenuItem(new MenuItemWithdraw("10",10));
			menuMain.addMenuItem(new MenuItemWithdraw("20",20));
			menuMain.addMenuItem(new MenuItemWithdraw("50",50));
			menuMain.addMenuItem(new MenuItemShowMenu("Menu Balance",menuBalance));
			menuBalance.addMenuItem(new MenuItemBalance("Display Balance"));
			menuBalance.addMenuItem(new MenuItemBalance("Print Balance"));
			menuBalance.addMenuItem(new MenuItemShowMenu("Main Menu",menuMain));
			menuMain.drawMenu();
		}
		
}
