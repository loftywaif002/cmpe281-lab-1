public class GumballMachine
{
    private int num_gumballs;
    private boolean has_quarter;
    private boolean has_dime;
    private boolean has_nickel;
    private int num_quarter;
    private int num_dime;
    private int num_nickel;
    private int machine_type;
    private int total;

    public GumballMachine(int size, int machine_type)
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.has_dime = false;
        this.has_nickel = false;
        this.num_quarter=0;
        this.num_dime=0;
        this.num_nickel=0;
        this.machine_type = machine_type;
    }

    public void insertCoin(int coin)
    {  
       this.total = this.num_quarter+this.num_dime+this.num_nickel;  
       if(this.machine_type==1){  //For Machine 1
           this.has_quarter = true;
       }
       if(this.machine_type==2){  //For Machine 2
             if(coin==25){
                 if(this.num_quarter!=50){
                    this.num_quarter+=25;
                 }               
             }else{
                 System.out.println( "Please insert Quarters Only!" ) ;
             }
       }
       if(this.machine_type == 3){
           switch(coin){
           case 25:
            if(this.total==50){ System.out.println("Coin box is full please turn crank");}
            else{this.num_quarter+=25;
            this.has_quarter = true;
            } 
            break;
        case 10:
            if(this.total==50){ System.out.println("Coin box is full please turn crank");}
            else{
            this.num_dime+=10;
            this.has_dime = true;
             } 
            break;
        case 5:
            if(this.total==50){ System.out.println("Coin box is full please turn crank");}
            else{
            this.num_nickel+=5;
            this.has_nickel = true;
            } 
            break;
        default:
            System.out.println("Please Insert Nickels, Dimes Or Quarters only"); 
            break;    
        }
       }
    }

 
    public void turnCrank()
    { 
      this.total = this.num_quarter+this.num_dime+this.num_nickel;  //Calculating Total

      if(this.machine_type == 1){   //For Machine 1
          if (this.has_quarter)
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}       
      }
      else if(this.machine_type == 2){   //For Machine 2
         if(this.num_quarter==50){
             if(this.num_gumballs > 0)
             {
                this.num_gumballs-- ;
    			this.num_quarter = 0 ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
              }
             else
             {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
             }
         }
         else
         {
           System.out.println( "Please insert a quarter" ) ;   
         }
      }
      else if(this.machine_type == 3){
          if (this.has_quarter || this.has_dime || this.has_nickel)
    	{
    		if(this.total==50)
            {
             if ( this.num_gumballs > 0)
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
                this.has_dime = false;
                this.has_nickel = false;
                this.num_quarter = 0;
                this.num_dime = 0;
                this.num_nickel = 0;
    			System.out.println( "Thanks for the coins.  Gumball Ejected!" ) ;
    		}
    		 else
    		 {
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		 }
            }
            else 
            {
               System.out.println( "Please insert more coins." ) ;
            }
            
    	}
    	else 
    	{
    		System.out.println( "Please insert Quarter, Dime or Nickel" ) ;
    	}
      }
        	 
    }

//Overriding toString to print objects
public String toString() { 
    return "Number of Gumballs: " + this.num_gumballs + "\n"
           +"Macine type: "+this.machine_type;
}     

}