

import java.util.Random;

public class HasQuartersState implements State {
	GumballMachine gumballMachine;
    private int num_quarter;
 
	public HasQuartersState(TwoCoinGumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter(){
        this.num_quarter = TwoCoinGumballMachine.getNumeberOfQuarter();
        if(this.num_quarter==2){
         System.out.println("Turn crank to get a Gumball");
        }		
	}

	public void insertDime(){}
	public void insertNickel(){}
	public void ejectCoins(){}
 
	public void ejectQuarter() {
		System.out.println("All Quarters returned");
        this.num_quarter = 0;
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank(){
        if(this.num_quarter<2){
            System.out.println("One more Quarter before turning the Crank");
        }
		else{
            System.out.println("You turned...");
		    gumballMachine.setState(gumballMachine.getSoldState());
            this.num_quarter = 0;
        }
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
