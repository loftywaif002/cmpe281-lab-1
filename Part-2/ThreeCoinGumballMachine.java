public class ThreeCoinGumballMachine extends GumballMachine{

    State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
	State state = soldOutState;
    public static int num_quarter = 0;
    public static int num_dime = 0;
    public static int num_nickel = 0;
 
public ThreeCoinGumballMachine(int numberGumballs){
        super(numberGumballs);
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);
 		if (numberGumballs > 0) {
			this.state = noCoinState;
		} 
	}


//Overriding methods
public State getNoCoinState() {
    return noCoinState;
}
public State getNoQuarterState(){  //this method is called in SoldState
    return noCoinState;
}
public State getHasCoinState() {
    return hasCoinState;
}

void setState(State state){
		this.state = state;
	}

public void insertQuarter(){
        num_quarter += 25;
		state.insertQuarter();
} 
//New Methods
public void insertDime(){
        num_dime+=10;
		state.insertDime();
} 

public void insertNickel(){
        num_nickel+=5;
		state.insertNickel();
} 

public static int getNumeberOfQuarter(){
		return num_quarter;
} 
public static int getNumeberOfDime(){
		return num_dime;
}
public static int getNumeberOfNickel(){
		return num_nickel;
}

public void turnCrank(){
		state.turnCrank();
		state.dispense();
} 

//TODO
void releaseBall(){
		if((num_quarter+num_dime+num_nickel)==50){
            System.out.println("A gumball comes rolling out the slot...");
            if (super.count != 0){
			    super.count = super.count - 1;
		    }
            num_quarter = 0;
			num_dime = 0;
			num_nickel = 0;
        }else{
          this.setState(this.getNoCoinState());
        }
	}
}