public class TwoCoinGumballMachine extends GumballMachine{

    State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State state = soldOutState;
    public static int num_quarter = 0;
 
public TwoCoinGumballMachine(int numberGumballs) {
        super(numberGumballs);
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuartersState(this);
		hasQuarterState = new HasQuartersState(this);
		soldState = new SoldState(this);
 		if (numberGumballs > 0) {
			this.state = noQuarterState;
		} 
	}


//Overriding methods
public State getNoQuarterState() {
    return noQuarterState;
}

public State getHasQuarterState() {
    return hasQuarterState;
}

void setState(State state){
		this.state = state;
	}

public void insertQuarter(){
        this.num_quarter++;
		state.insertQuarter();
} 
//New Method
public static int getNumeberOfQuarter(){
		return num_quarter;
} 

public void turnCrank(){
		state.turnCrank();
		state.dispense();
} 

void releaseBall() {
		if(num_quarter==2){
            System.out.println("A gumball comes rolling out the slot...");
            if (super.count != 0){
			    super.count = super.count - 1;
		    }
            num_quarter = 0;
        }else{
          this.setState(this.getNoQuarterState());
        }
		
	}
}