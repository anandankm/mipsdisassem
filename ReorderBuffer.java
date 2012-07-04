import java.util.*;
public class ReorderBuffer {
	// 6 entries
	public ArrayList<Integer> Id = new ArrayList<Integer>();
	// Destination can be Register or null for branch or store
	public ArrayList<String> Destination = new ArrayList<String>();
	/*
	 * Value -->Long value of the Destination.
	 */
	public ArrayList<Long>  Value = new ArrayList<Long>();
	public ArrayList<String>  Instruction = new ArrayList<String>();
	public ArrayList<Boolean>  Ready = new ArrayList<Boolean>();
	//public ArrayList<Boolean> IssuedAfterPrediction = new ArrayList<Boolean>();
	//public ArrayList<Boolean> ChangedValueAfterPrediction = new ArrayList<Boolean>();
}
