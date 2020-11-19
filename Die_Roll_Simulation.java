//The Java Formatter class in the java.util package helps in formatting display numbers or Strings during output.
import java.util.Formatter;

public class Die_Roll_Simu {
	
	//Program entry point - initiating execution.
	public static void main(String args[])
	
	{

	    int arry1_size = 0, arry2_size = 0, arry3_size = 0, arry4_size = 0, arry5_size = 0, arry6_size = 0;

	    //This for loop initiates the die roll simulation and terminates it at the 1000th simulation event.
	    for (int i=0; i<1000; i++)
	    {
	    	//Random number generator 
	    	double rand = Math.random();
	    	
	    	//Defining the initial parameter
	    	double initial_no = 1.0/6;
	        
	        if ((rand>=0) && (rand<(initial_no)))
	        {
	        	arry1_size = arry1_size + 1;
	        }
	        
	        else if ((rand>=(initial_no)) && (rand<(2*(initial_no))))
	        {
	        	arry2_size = arry2_size + 1;
	        }
	        
	        else if ((rand>=(2*(initial_no))) && (rand<(3*(initial_no))))
	        {
	        	arry3_size = arry3_size + 1;
	        }
	        
	        else if ((rand>=(3*(initial_no))) && (rand<(4*(initial_no))))
	        {
	        	arry4_size = arry4_size + 1;
	        }
	        
	        else if ((rand>=(4*(initial_no))) && (rand<(5*(initial_no))))
	        {
	        	arry5_size = arry5_size + 1;
	        }
	        
	        else if ((rand>=(5*(initial_no))) && (rand<1))
	        {
	        	arry6_size = arry6_size + 1;
	        }
	     }

	    // This constructor is one of the ways with which to create Formatter objects.
	    Formatter fmt = new Formatter();
	    
	    //Formatter format(String fmtString, Object ... args) is the main method used to format various objects, such as Strings and numbers to the desired form before output; 
	    //Creates the table to store the results in and pads the first, second, and third column to 3, 15, 30 characters, respectively.
	    fmt.format("%3s %15s %30s\n", "Die Face", "Frequency", "Percentage Frequency (%)");
	    
	    // Calculates the number of times that each die face occurred during the simulation per 1000 events (percentage frequency);
	    //arryi.size() determines the number of times that each die face occurred during the simulation.
	    //0.1 = 1/1000*100%, implying arryi.size()*.1 calculates the percentage of occurrence 
	    double pf1 = ((double)arry1_size*.1);
	    double pf2 = ((double)arry2_size*.1);
	    double pf3 = ((double)arry3_size*.1);
	    double pf4 = ((double)arry4_size*.1);
	    double pf5 = ((double)arry5_size*.1);
	    double pf6 = ((double)arry6_size*.1);
	    
	    //This sum operation confirms that the die was rolled 1000 times
	    int total_frequency = arry1_size+arry2_size+arry3_size+arry4_size+arry5_size+arry6_size;
	    
	    //This sum operation confirms that the percentage of occurrence is 100%
	    double total_percentage = pf1+pf2+pf3+pf4+pf5+pf6;
	    
	    // Fills the entries in the table;
	    //Pads the first, second, and third column to 3, 12, 20 characters, respectively;
	    //Formats the percentage frequency to 2 decimal places;
	    //Adding %n translates into the program's default line terminator. 
	   fmt.format("%3s %12d %20.2f\n", "1", arry1_size, pf1);
	   fmt.format("%3s %12d %20.2f\n", "2", arry2_size, pf2);
	   fmt.format("%3s %12d %20.2f\n", "3", arry3_size, pf3);
	   fmt.format("%3s %12d %20.2f\n", "4", arry4_size, pf4);
	   fmt.format("%3s %12d %20.2f\n", "5", arry5_size, pf5);
	   fmt.format("%3s %12d %20.2f\n", "6", arry6_size, pf6);
	   
	   //Simulation output
	   System.out.println(fmt);
	   System.out.printf("The die was rolled %d%s\n", total_frequency, " times.");
	   System.out.printf("The cumulative percentage frequency is %.2f%s\n", total_percentage, "%.");
	   
	   

	}

}
