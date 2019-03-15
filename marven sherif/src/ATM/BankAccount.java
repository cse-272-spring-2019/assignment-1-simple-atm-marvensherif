package ATM;

public class BankAccount {

	private String cardnumber;
	private double balance;
	 String[] trans=new String[5];
	private int c=0;
	private int p=0;
	
	
	
public BankAccount(String cardnumber) {
	this.cardnumber=cardnumber;
	balance=0;
}

public void deposit(double ammount) {
	
	balance=balance+ammount;
	if(c==5)
	{
		for (int i=0;i<4;i++)
			trans[i]=trans[i+1];
		c=4;	
	}
	
	if(p==5)
		p=4;
	
	trans[c++]="Deposit: "+ammount;
	p++;
}
public boolean withdraw(double ammount) {
	
	if (ammount>balance)
		return false;
	else 
	balance=balance-ammount;
	
	if(c==5)
	{
		for (int i=0;i<4;i++)
			trans[i]=trans[i+1];
		c=4;
	
		
	}
	
	if(p==5)
		p=4;
	
	trans[c++]="Withdraw: "+ammount;
	p++;
	
	
	
	
	
	return true;
	
	
	
}
public double getbalance() {
	return balance;
}

public String getCardNumber()
{
	return cardnumber;
}

public int getC()
{
	return this.c;
}

public String next()
{
	
	String s=new String();
	if(p<4) {
		p++;
		s=trans[p];
		return s;
	}
	
	else 
		return "error";
}

public String prev()
{
	
	String s=new String();
	if(p>0) {
		p--;
		s=trans[p];
		return s;
	}
	
	else 
		return "error";
}





public  boolean validation(String cardnumber) {
	if(cardnumber.equals(this.cardnumber))
			 return true;
			 else return false;
	
}}





