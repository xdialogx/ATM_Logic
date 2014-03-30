package ATM;

public class CreditCard {
	private int pinCode;
	private String cardType;
	private int limit;
	private String bankType;
	
	public CreditCard(int pinCode, int limit, String cardType, String bankType){
		this.pinCode = pinCode;
		this.limit = limit;
		this.cardType = cardType;
		this.bankType = bankType;
	}

	public int getPinCode(){
		return pinCode;
	}
	
	public String getCardType(){
		return cardType;
	}
	
	public int getLimit(){
		return limit;
	}
	
	public String getBankType(){
		return bankType;
	}
}
