import java.util.*;
public class BranchTargetBuffer {
	// 8 entries
	public ArrayList<Long> Address = new ArrayList<Long>();
	public ArrayList<Long> TargetPC = new ArrayList<Long>();
	public ArrayList<Long> PredictedPC = new ArrayList<Long>();
	public ArrayList<String> PredictorOutCome = new ArrayList<String>();
	public ArrayList<String> Predictor2Bit = new ArrayList<String>();

	// one BTBFlushSeq for each buffer 
	//public ArrayList<BTBFlushSeq> AfterPred = new ArrayList<BTBFlushSeq>();
}
