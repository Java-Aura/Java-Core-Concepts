package com.core.statements;

public class BranchingStatements {

	public static void main(String[] args) {
		
		BranchingStatement obj = new BranchingStatement();
		obj.BranchingBreak(7);
		obj.BranchingContinue(5);

	}

}

class BranchingStatement{
	
	
	public void BranchingBreak(int number) {
		
		for (int i = 1; i<=10;i++) {

			System.out.println(number + "*" + i + " = " + number * i);
			
			if(i==5) // if i=5 break the entire iteration 
				break;
		}

	}
	
public void BranchingContinue(int number) {
		
		for (int i = 1; i<=10;i++) {

			if(i==5) // if i=5 skip this statement execution
				continue;
			System.out.println(number + "*" + i + " = " + number * i);
			
			
		}

	}
}