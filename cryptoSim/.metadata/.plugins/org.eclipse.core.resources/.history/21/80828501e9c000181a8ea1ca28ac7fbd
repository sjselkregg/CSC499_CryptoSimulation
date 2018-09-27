package cryptoSimulation;

public class Population 
{
	public int SIZE = 100000;
	//plan to update to arrayLists
	public Miner[] participating = new Miner[100000];
	public Miner[] nonParticipating = new Miner[100000];
	
	/**
	 * Creates a population of miners
	 * @param iD the identification number of the new miner
	 * @param howMany how many miners there are to create
	 */
	public void create(int iD, int howMany)
	{
		
		//increment the minerID
		int minerID = iD;
		minerID++;
		//decrement miners pending
		int minersPending = howMany;
		minersPending--;
		//recursively calls function if necessary
		if(minersPending>0)
		{
			create(minerID, minersPending);
		}
		
	}
	
}
