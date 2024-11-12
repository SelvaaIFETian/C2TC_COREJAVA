//Program to demonstrate User Defined Exception class
package tns.ifet.dayfourteen.sync;

public class DepositLimitExceedsException extends Exception {

	public DepositLimitExceedsException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitExceedsException(String message)
	{
		super(message);
	}
}
