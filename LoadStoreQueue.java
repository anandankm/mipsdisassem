import java.util.*;
public class LoadStoreQueue {
	// 4 Entries
	public ArrayList<Integer> DestID = new ArrayList<Integer>();
	public ArrayList<Long> Address = new ArrayList<Long>();
	// value at the memory location specified by Address.
	public ArrayList<Long> value = new ArrayList<Long>();
	// state information.
	public ArrayList<String> Instruction = new ArrayList<String>();
	public ArrayList<String> ExecState = new ArrayList<String>();
	//public ArrayList<Boolean> IssuedAfterPrediction = new ArrayList<Boolean>();
	//public ArrayList<Boolean> ChangedValueAfterPrediction = new ArrayList<Boolean>();
	//public ArrayList<Boolean> ChangedAddressAfterPrediction = new ArrayList<Boolean>();
}
