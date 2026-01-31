import java.util.Scanner;
  class Practical14{
   String accountId;
   String accountHoldName;
double balance;
  
void assignValues(String id, string name, double bal) {
   accountId = id;
   accountHolderName = name;
   balance = bal;
 

}

void displayValues () {
  System.out.println("Account ID: " + accountId);
  System.out.println("Holder Name: " + accountHolderName);
  System.out.println("Balance: " + balance);
System.out.println();


}
    static void searchAccount(BankAccount[] arr, String id){
      for(BankAccount acc : arr){
       if(acc.accountId.equals(id)) {
       acc.displayValues();
return;

}
}
  class main {
    public static void main( String[] args){
     BankAccount[] accounts = new BankAccount[5];

     accounts[0] = new BankAccount();
     accounts[0].assignValues("A101", "khushi", 50000);

     accounts[1] = new BankAccount();
     accounts[1].assignValues("A102", "rekha", 40000);

accounts[2] = new BankAccount();
     accounts[2].assignValues("A103", "ruchi", 53000);

accounts[3] = new BankAccount();
     accounts[3].assignValues("A104", "ayush", 45000);

accounts[4] = new BankAccount();
     accounts[4].assignValues("A105", "ujjawal", 43000);


for(BankAccount acc : accounts){
acc.displayValues();

}
}
    Scanner sc = new Scanner(System.in);
    System.out.println("enter Account ID to search: ");
    String searchId = sc.nextLine();

 BankAccount.searchAccount(accounts, searchId);

}

}