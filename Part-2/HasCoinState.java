import java.util.Random;
public class HasCoinState implements State {
	GumballMachine gumballMachine;
    private int num_quarter=0;
    private int num_dime=0;
    private int num_nickel=0;
    private int total=0;
 
	public HasCoinState(ThreeCoinGumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;

	}
  
	public void insertQuarter(){
        this.num_quarter = ThreeCoinGumballMachine.getNumeberOfQuarter();
        this.num_dime = ThreeCoinGumballMachine.getNumeberOfDime();
        this.num_nickel  = ThreeCoinGumballMachine.getNumeberOfNickel();
        this.total = this.num_quarter+ this.num_dime+this.num_nickel;
        if(this.total==50){
         System.out.println("Turn crank to get a Gumball");
        }else{
            System.out.println("Please insert more coins");
        }		
	}
    public void insertDime(){
        this.num_quarter = ThreeCoinGumballMachine.getNumeberOfQuarter();
        this.num_dime = ThreeCoinGumballMachine.getNumeberOfDime();
        this.num_nickel  = ThreeCoinGumballMachine.getNumeberOfNickel();
        this.total = this.num_quarter+ this.num_dime+this.num_nickel;
        if(this.total==50){
         System.out.println("Turn crank to get a Gumball");
        }else{
            System.out.println("Please insert more coins");
        }		
	}
    public void insertNickel(){
        this.num_quarter = ThreeCoinGumballMachine.getNumeberOfQuarter();
        this.num_dime = ThreeCoinGumballMachine.getNumeberOfDime();
        this.num_nickel  = ThreeCoinGumballMachine.getNumeberOfNickel();
        this.total = this.num_quarter+ this.num_dime+this.num_nickel;
        if(this.total==50){
         System.out.println("Turn crank to get a Gumball");
        }
        else
        {
            System.out.println("Please insert more coins");
        }		
	}

	public void ejectCoins(){
        System.out.println("All Coins returned");
          this.num_quarter=0;
          this.num_dime=0;
          this.num_nickel=0;
          this.total=0;
		gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
	public void ejectQuarter() {
		System.out.println("All Quarters returned");
          this.num_quarter=0;
          this.num_dime=0;
          this.num_nickel=0;
          this.total=0;
		gumballMachine.setState(gumballMachine.getNoCoinState());
	}
 
	public void turnCrank(){
        this.total = this.num_quarter+ this.num_dime+this.num_nickel;
        if(this.total<50){
            System.out.println("Please insert more coins");
        }
		else{
            System.out.println("You turned...");
		    gumballMachine.setState(gumballMachine.getSoldState());
            this.num_quarter=0;
            this.num_dime=0;
            this.num_nickel=0;
            this.total=0;
        }
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
