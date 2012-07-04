*********************************************************************************************
Project User Documentation:  Part II, Spring 2010
Course: CDA 5155 Computer Architecture Principles
UFID: 6152-1063
Last Name: Rangasamy; First Name: Anandan
Project Implementation: Java
*********************************************************************************************
 “On my honor, I have neither given nor received unauthorized aid on this assignment.”
*********************************************************************************************


**************************************MIPS-32 Simulation*************************************
Project file: project.jar
Files in the above jar file: README.txt, MIPSsim.java, Repository.java, Makefile, 
MIPSsim.java, Repository.java, AddCalcRS.java, ArithLogicRS.java, BranchTargetBuffer.java, 
InstructionFetch.java, InstructionInfo.java, LoadRS.java, LoadStoreQueue.java, 
ReorderBuffer.java, StagesInCycle.java, fibonacci.bin, and fibonacci_out.txt.

Note: The provided fibonacci_bin.bin and fibonacci_out.txt are sample input and output files. 

***************************************EXECUTION**********************************************

To run the program, first extract the project.jar file to your directory using,

	jar xvf project.jar

in a console pointed to your directory. Then use command,

	make

to compile the java files. Once the files are compiled, then use,

	java MIPSsim <InputFileName> <OutputFileName> [-Tm:n]

to execute the program. 

<InputFileName> is the input binary file that contains binary code for
disassembly. <OutputFileName> is the output text file where output is to be written. For 
example,

	java MIPSsim fibonacci_bin fibonacci_out.txt -T32:40

***************************************Notes & Observations***********************************

Reference: MIPS 32 Instruction Set Architecture 
[http://www.cise.ufl.edu/class/cda5155sp10/projects/project1/mips.pdf]

1. For instruction SRL, bit 21 must be zero. This condition is checked in the program. Please
have your bin file have bit 21 to be zero for instruction SRL. 

2. For instructions BNE, BEQ, BLEZ, BGTZ, BGEZ and BLTZ, the offset field is 18 bit signed. So
it can represent values from -131072 to +131071.

3. For instructions SRL, SLL, and SRA, the shift amount - sa field is 5 bit long. So the sa field can represent
values from 0 to 31.