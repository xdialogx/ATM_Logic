package ATM;

public class CardReader {
	
	CreditCard demoCard = new CreditCard(1234, 500, "Visa", "SEB");
	
	public boolean checkPin(int pinCode){
		if (pinCode == demoCard.getPinCode()){
			return true;
		}
		return false;
	}

}
