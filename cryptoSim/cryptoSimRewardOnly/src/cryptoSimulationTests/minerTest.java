/**
 * Class to check the functionality of some individual miners. No assert calls, output is displayed to the console.
 * Necessary to run 5 or more times to make sure values continue to behave correctly.
 * @author Sam Selkregg
 */
package cryptoSimulationTests;

import static org.junit.Assert.*;

import org.junit.Test;

import cryptoSimulation.Miner;
import cryptoSimulation.Population;

public class minerTest {
	
	/**
	 * Makes sure the miner is initialized with the correct attributes.
	 */
	@Test
	public void testInitialization()
	{
		Miner x = new Miner(1);
		Miner y = new Miner(2);
		Miner z = new Miner(3);
		Miner xx = new Miner(59000);
		Miner yy = new Miner(999999);
		
		//checks the pools
		System.out.print("Miner Pools: ");
		System.out.print(x.getPool());
		System.out.print(" ");
		System.out.print(y.getPool());
		System.out.print(" ");
		System.out.print(z.getPool());
		System.out.print(" ");
		System.out.print(xx.getPool());
		System.out.print(" ");
		System.out.print(yy.getPool());
		
		//check the wealth
		System.out.println();
		System.out.println(x.wealth);
		System.out.println(y.wealth);
		System.out.println(z.wealth);
		System.out.println(xx.wealth);
		System.out.println(yy.wealth);
		
		
		//check the costs
		System.out.println();
		System.out.println();
		System.out.println(x.cost);
		System.out.println(y.cost);
		System.out.println(z.cost);
		System.out.println(xx.cost);
		System.out.println(yy.cost);
	}

}