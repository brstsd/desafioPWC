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

		//Exercicio 3
		String str3 = "babad";
		System.out.println(maiorPalindromo(str3));
		
		//Exercicio 4
		String str4 = "hello. how are you? i'm fine, thank you.";
		System.out.println(capitalizePhrase(str4));
	}

	 public static String meioPalindromo(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	public static String maiorPalindromo(String s) {
		if (s == null) return null;
		String maior = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {

			String pali = meioPalindromo(s, i, i);
			if (pali.length() > maior.length()) {
				maior = pali;
			}

			pali = meioPalindromo(s, i, i + 1);
			if (pali.length() > maior.length()) {
				maior = pali;
			}
		}
		return maior;
	}
	
	public static String capitalizePhrase(String input) {
        StringBuilder output = new StringBuilder();
        boolean proximo = true;

        for (char c : input.toCharArray()) {
            if (proximo && Character.isLetter(c)) {
                output.append(Character.toUpperCase(c));
                proximo = false;
            } else {
                output.append(c);
            }

            if (c == '.' || c == '?' || c == '!') {
                proximo = true;
            }
        }

        return output.toString();
    }
}