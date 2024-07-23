import java.util.*;

class ATM{
  float Balance;
  int PIN = 5257;


  public void checkpin(){
    System.out.println("Enter your Pin");
    Scanner s = new Scanner(System.in);
    int epin=s.nextInt();
    if(epin==PIN){
      menu();
    }else{
      System.out.println("ENTER A VALID PIN");
    }
  }

  public void menu(){
    System.out.println("Enter your choice");
    System.out.println("1. Check Balance ");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("Exit");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    if(opt==1){
      checkBalance();
    }
    else if (opt==2){
      withdrawMoney();
    }
    else if (opt==3){
      depositMoney();
    }
    else if(opt==4){
      return;
    }
    else{
      System.out.println("ENTER A VALID NUMBER");
    }
  }

  public void checkBalance(){
    System.out.println("Balance " + Balance);
    menu();
  }

  public void withdrawMoney(){
    System.out.println("Enter the amount you want to withdraw");
    Scanner s = new Scanner(System.in);
    float amount = s.nextInt();
    if(amount>Balance){
      System.out.println("Insufficient Balance");
    }
    else{
      Balance -= amount;
      System.out.println("Amount Withdrawn " + amount);
    }
    menu();
  }

  public void depositMoney(){
    System.out.println("Enter the amount you want to deposit");
    Scanner s = new Scanner(System.in);
    float amount = s.nextInt();
    Balance += amount;
    System.out.println("Money Deposited Successfully");
  }
}

public class ATMMachine{
  public static void main(String[] args) {
    ATM obj = new ATM();
    obj.checkpin();
  }
}