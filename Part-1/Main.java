public class Main {

	public static void main(String[] args) {

    //Testing Machine 1 
        System.out.println("-----------Testing Machine 1----------");     
		GumballMachine machine1 = new GumballMachine(5, 1);
        machine1.insertCoin(25);
        machine1.turnCrank();
        System.out.println(machine1);

    //Testing Machine 2  
        System.out.println("-----------Testing Machine 2----------");  
        GumballMachine machine2 = new GumballMachine(5, 2);
        machine2.insertCoin(25);
        machine2.insertCoin(25);
        machine2.turnCrank();
        System.out.println(machine1);
    
    //Testing Machine 3
       System.out.println("-----------Testing Machine 3----------");
       GumballMachine machine3 = new GumballMachine(5, 3);

		System.out.println(machine3);
        
        //Quarter test 
        System.out.println("-----------Quarter test----------");
		machine3.insertCoin( 25 );
        machine3.insertCoin( 25 );
		machine3.turnCrank();

		System.out.println(machine3);

        //Dime Test
       System.out.println("----------Dime test----------");
       for(int i = 0; i< 5; i++){
           machine3.insertCoin(10);
        }
        machine3.turnCrank();
        System.out.println(machine3);

       //Nickel Test
       System.out.println("-----------Nickel test----------");
		for(int i = 0; i< 10; i++){
           machine3.insertCoin(5);
        }
		machine3.turnCrank();
        System.out.println(machine3);

       //Mixed coins test
       System.out.println("-----------Mixed Coins test----------");
       machine3.insertCoin(25);
       machine3.insertCoin(5);
       machine3.insertCoin(10);
       machine3.insertCoin(10);
	   machine3.turnCrank();
       System.out.println(machine3);

       //Error test
	   System.out.println("-----------Error test----------"); 
       machine3.insertCoin(25);
       machine3.insertCoin(5);
	   machine3.turnCrank();
       System.out.println(machine3);

	}
}