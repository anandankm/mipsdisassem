
public class InstructionInfo {
	 private long Address;
	 private String Instruction;
	 private String Stage;
	 private String type;
	 
	 public void setAddress(long Address){
		 this.Address = Address;
	 }
	 public void setInstruction(String Instruction){
		 this.Instruction = Instruction;
		 
	 }
	 public String getInstruction(){
		 return this.Instruction;
	 }
	 public void setStage(String Stage){
		this.Stage = Stage; 
	 }
	 
	 public String getStage(){
		 return this.Stage;
	 }

}
