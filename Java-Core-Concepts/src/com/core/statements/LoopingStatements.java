package com.core.statements;

public class LoopingStatements {

	public static void main(String[] args) {
		
		LoopingStatement obj = new LoopingStatement();
		obj.printTables(7);
		obj.printTableWithWhile(9);
		obj.doWhile();
	}

}


class LoopingStatement{
	
	
	public void printTables(int number) {
		
		for(int i = 1; i++<=10;) {
			
			System.out.println(number+"*"+i + " = "+ number * i);
		}
	}
	
	public void printTableWithWhile(int number) {
		int i =1;
		while(i<=10) {
			System.out.println( "with while loop "+number+"*"+i + " = "+ number * i);
			i++;
		}
	}
	
	
	public void doWhile() {
		
		int i = 0;
		
		do {
			
			System.out.println("I'm executed from do while ");
			i++;
		}
		while(i>10);
		
	}
	
}