import java.util.*;
public class ArithLogicRS {
	// 3 entries
	// ROB id = DestID
	public ArrayList<Integer> DestID = new ArrayList<Integer>();
	// Value of the destination operand.
	public ArrayList<Long> DestValue = new ArrayList<Long>();
	// value of the operands; if they're null, then they're Qj and Qk
	public ArrayList<Long> ValueVj = new ArrayList<Long>();
	public ArrayList<Long> ValueVk = new ArrayList<Long>();
	// Immediate value, if any.
	public ArrayList<Long> ValueImm = new ArrayList<Long>();
	// instruction
	public ArrayList<String> Instruction = new ArrayList<String>();
	// operand to which value is loaded
	public ArrayList<String> Vj = new ArrayList<String>(); 
	public ArrayList<String> Vk = new ArrayList<String>();
	//public ArrayList<Boolean> IssuedAfterPrediction = new ArrayList<Boolean>();
	//public ArrayList<Boolean> ChangedValueAfterPrediction = new ArrayList<Boolean>();
}
