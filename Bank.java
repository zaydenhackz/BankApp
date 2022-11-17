import java.util.*;

class Bank implements atm{

  String name;
  int age;
  String address;
  int houseNumber;
  int zipCode;
  double balance;
  


        public Bank(String name, int age, String address, int houseNumber, int zipCode, double balance){

          this.name = name;
          this.age = age;
          this.address = address;
          this.houseNumber =  houseNumber;
          this.zipCode = zipCode;
          this.balance = balance;
          
        }
            public void sendMoney(float amount){
              
              balance -= amount;
              if (balance > 0.0){
                 System.out.println("Sending: $" + String.format("%2.2f", amount) + ". " + "New balance is " 
              + "$"+String.format("%2.2f", this.balance) );
                
              }
             else{
               System.out.println("You do not have enough funds, for this transaction! " + '\n' + "Amount of difference : $" + String.format("%2.2f", this.balance));
             }
              
            }

           public void getInfo(){
                System.out.println('\n' + " Name: " + this.name + '\n' +" Age:" + this.age + '\n');
                Date nowTime = new Date();
                System.out.println('\n' + "Current Time: " + nowTime);

             
           }

          public  void add(int amount){
            balance += amount;
          }

         public   void deduct(int amount){
            balance -= amount;
          }
         public void getBalance(){
            System.out.println("Balance: $" + String.format("%2.2f", this.balance));
           
         }

            



  
}
