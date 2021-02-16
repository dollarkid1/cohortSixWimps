 public class Account2{
   
       private String name;
      private double balance;


  

       public Account2(String name, double balance){
            this.name = name;
            this.balance = balance;
}
       public void deposit(double depositAmount){
		balance = balance + depositAmount;

	}
	public double getBalance(){
		return balance;
	}
        public String getName(){
             return name;

        }
	
        public void setName(){
             
    
        }








}



