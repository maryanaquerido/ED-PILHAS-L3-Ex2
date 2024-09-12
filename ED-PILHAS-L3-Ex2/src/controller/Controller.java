package controller;
import maryanalib.pilhastring.*;

public class Controller {
	public Controller() {
		super();
	}
	
	PilhaString pS = new PilhaString();
	
	public void Sequencia () {
		FormaPilha();
		
		pS.pop();
		pS.pop();
		System.out.println(pS.pop());
		pS.pop();
		pS.pop();
		pS.pop();
		System.out.println(pS.pop());
		pS.push("L");
		pS.push("B");
		pS.push("M");
		pS.push("G");
		pS.push("K");
		
		
		
		System.out.println("\nPilha Final: " + pS);
		
	}
	
	private void FormaPilha() {
		pS.push("W");
		pS.push("L");
		pS.push("H");
		pS.push("B");
		pS.push("R");
		pS.push("G");
		pS.push("J");
		
		System.out.println("\nPilha Inicial: " + pS);
	}
		
		
		
}


