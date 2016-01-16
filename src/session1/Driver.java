package session1;

public class Driver {

	public static void main(String[] args) {

		new Driver().runDriver();

	}

	private void runDriver() {

		Storage<BankAccount> aStorage = new Storage<>();
		Storage<String> sStorage = new Storage<>();

		// Replaced under step 6
		// Class baCls = BankAccount.class;
		Class<BankAccount> baCls = BankAccount.class;

		try {
			// Replaced under step 4
			// Object myAccount = baCls.newInstance();
			BankAccount myAccount = baCls.newInstance();
			aStorage.setValue(myAccount);
			// Deposit
			myAccount.deposit(15);
		} catch (InstantiationException e) {
			// ...
		} catch (IllegalAccessException e) {
			// ...
		}

		System.out.println(aStorage.getValue().showBalance());
		if (aStorage.getClass() == sStorage.getClass()) {
			System.out.println("EQUAL");
		} else {
			System.out.println("NOT EQUAL");
		}
	}
}
