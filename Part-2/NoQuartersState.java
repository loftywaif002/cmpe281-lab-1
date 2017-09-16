public class NoQuartersState implements State {
    GumballMachine gumballMachine;
 
    public NoQuartersState(TwoCoinGumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
        System.out.println("Please insert one more quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank(){    
		System.out.println("You turned, but there's no quarter");
	 }

 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}

		public void insertDime(){}
	public void insertNickel(){}
	public void ejectCoins(){}
}
