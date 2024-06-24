package oops;

public class EncapsulationRealTimeBank {
		private String name;
		private String panNumber;
		private long aadharNumber;
		private long phoneNumber;
		private long accountNumber;
		public EncapsulationRealTimeBank(String name, String panNumber, long aadharNumber, long phoneNumber, long accountNumber)
		{
			this.name=name;
			this.panNumber=panNumber;
			this.aadharNumber=aadharNumber;
			this.phoneNumber=phoneNumber;
			this.accountNumber=accountNumber;
		}
			
		public String getName() {
			return name;
		}
		public String getPanNumber() {
			return panNumber;
		}
		public long getAadharNumber() {
			return aadharNumber;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public long getAccountNumber() {
			return accountNumber;
		
		}

	}


