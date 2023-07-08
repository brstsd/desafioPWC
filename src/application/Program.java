package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercicio 1
		String str = "Hello, World! OpenAI is amazing.";
		
		String[] pilha = str.split(" ");
		
		for(int i = pilha.length - 1; i >= 0; i--) {
			System.out.print(pilha[i] + " ");
		}
		System.out.println();
		
		//Exercicio 2
		String str2 = "Hello, World!";
		char[] ch = str2.toCharArray();
		
		Set<Character> set = new LinkedHashSet<>();
		int len = 0;
		for(char c : ch) {
			if(set.add(c))
				ch[len++] = c;
		}
		System.out.println(new String(ch, 0, len));

	}
}