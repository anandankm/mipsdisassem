JCC = javac

server: class1 class2 class3 class4 class5 class6 class7 class8 class9 class10 class11

class1: MIPSsim.java
	$(JCC) MIPSsim.java
	
class2: Repository.java
	$(JCC) Repository.java

class3: AddCalcRS.java
	$(JCC) AddCalcRS.java

class4: ArithLogicRS.java
	$(JCC) ArithLogicRS.java

class5: BranchTargetBuffer.java
	$(JCC) BranchTargetBuffer.java

class6: InstructionFetch.java
	$(JCC) InstructionFetch.java

class7: InstructionInfo.java
	$(JCC) InstructionInfo.java

class8: LoadRS.java
	$(JCC) LoadRS.java

class9: LoadStoreQueue.java
	$(JCC) LoadStoreQueue.java

class10: ReorderBuffer.java
	$(JCC) ReorderBuffer.java

class11: StagesInCycle.java
	$(JCC) StagesInCycle.java

clean:
	$(RM) *.class