

public class Main {

	public static void main(String[] args) {
		System.out.println("---Testing gumball Machine1----");
		GumballMachine gumballMachine1 = new GumballMachine(5);
		System.out.println(gumballMachine1);
		System.out.println("---Inserting 1 Quarter----");
		gumballMachine1.insertQuarter();
		System.out.println("---Inserting Another Quarter----");
		gumballMachine1.insertQuarter();
		gumballMachine1.turnCrank();
        System.out.println(gumballMachine1);

        System.out.println("---Testing gumball Machine2----");
        TwoCoinGumballMachine  gumballMachine2 = new TwoCoinGumballMachine(5);
		System.out.println(gumballMachine2);
		System.out.println("---Inserting 1 Quarter----");
		gumballMachine2.insertQuarter();
		System.out.println("---Inserting Another Quarter----");
		gumballMachine2.insertQuarter();
		System.out.println("---Inserting Third Quarter----");
		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();
       
        System.out.println("---Testing gumball Machine3----");
        ThreeCoinGumballMachine gumballMachine3 = new ThreeCoinGumballMachine(5);
        System.out.println(gumballMachine3);
        System.out.println("---Inserting 1 Quarter----");
		gumballMachine3.insertQuarter();
		System.out.println("---Inserting Another Quarter----");
		gumballMachine3.insertQuarter();
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3);

		System.out.println("---Testing Machine 3 with Dime----");
        gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3);

        System.out.println("---Testing Machine 3 with Nickel----");
        for(int i=0; i< 10; i++){
           gumballMachine3.insertNickel();
        }
        gumballMachine3.turnCrank();
        System.out.println(gumballMachine3);
        
	}
}
