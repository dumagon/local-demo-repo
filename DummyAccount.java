class Account {
private String name;
private int balance;

public void setName(String name){
    if(!name.equals("")){        // protects from setting an empty customer name 
        this.name=name;
     } System.out.println("invalid account name");
      

}

public void setBalance(int balance){
    if(name!=null){
    this.balance=balance;}
}

public int getBalance(){
    return this.balance;
}

}

public class DummyAccount {
    public static void main(String[] args){
        Account myAccount;

        myAccount=new Account();
        myAccount.setName("");
        myAccount.setBalance(374);
        System.out.println( myAccount.getBalance());
    }
}