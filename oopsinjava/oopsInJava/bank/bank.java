package bank;
class Account{
  public String name;
  protected String email;
  private String password;

  // getter and setter 

public String getPassword(){
  return this.password;
}

public void setPassword(String pass){
  this.password = pass;
}

}


public class bank{
    public static void main(String[] args) {

      Account acc1 = new Account();
      acc1.name = "apna College";
      acc1.email = "apnacollege@gmail.com";
      acc1.setPassword("abcd");
      System.out.println(acc1.getPassword());
    }
}
