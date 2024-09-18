package tuan2_nganHangAccount;


public class TestAcc {
	static DSAccount accountList;
	 //nhap cung 
	//nhap me
		public static void createDefaultAccountList() throws Exception {
		    Account[] accounts = {
		        new Account(1017020607, "Lê Hoàng Bảo"),
		        new Account(1017046087, "Tạ Văn Ơn", 5000000),
		        new Account(1017061096, "Cù Văn Cần", 1000000),
		        new Account(1017030708, "Bao Bao", 300000)
		    };
		    for (Account acc: accounts)
		        accountList.them(acc);
		    
		}
		public static void displayTitle() {
			String title = String.format("\t%-7s %15s %30s %15s", "STT", "Số tài khoản", "Họ và tên", "Số Dư");
			System.out.println(title);
		}
		
		public static void displayAccountList() {
			Account[] allAccount = accountList.getAllAccounts();
			for(int i = 0; i < accountList.soluongHT; i++) {
				System.out.printf("\t%-7d ", i+1);
				System.out.println(allAccount[i]);
			}
		}
		public static void main(String[] args) throws Exception
		{
			accountList = new DSAccount(3);
			createDefaultAccountList();
			displayTitle();
			displayAccountList();
			
		}

}