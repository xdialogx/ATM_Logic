package ATM;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private final Scanner scanner = new Scanner(System.in);
	private final ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
	private String menuName;
	public void drawMenu() {
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(i+": "+menuItems.get(i).getTextoo());
		}
		int choice = (this.getUserChoice(scanner));
		menuItems.get(choice).action();
	}
	
	private int getUserChoice(Scanner scanner) {
		System.out.println("Please Enter Your Choice:");
		int choice = scanner.nextInt();
		return choice;
	}
	
	public void addMenuItem(MenuItem item) {
		this.menuItems.add(item);
	}
	public Menu(String name) {
		this.menuName = name;
	}
}
