public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(ThreeCoinGumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a Quarter");
        System.out.println("Please insert more coins");
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}

	public void insertDime() {
		System.out.println("You inserted a Dime");
        System.out.println("Please insert more coins");
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}

	public void insertNickel() {
		System.out.println("You inserted a Nickel");
        System.out.println("Please insert more coins");
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}

	public void ejectCoins(){
		System.out.println("You haven't inserted a coin");
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
        
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
