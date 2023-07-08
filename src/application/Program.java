package application;

import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello, World! OpenAI is amazing.";
		
		String[] pilha = str.split(" ");
		
		for(int i = pilha.length - 1; i >= 0; i--) {
			System.out.print(pilha[i] + " ");
		}
		
	}

}
