package application;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String string[] = new String[999];
		int i = 0;

		// Passar os valores do texto
		System.out.println("Write the words: ");
		String values = sc.nextLine();

		// Separar as palavras e introduzir no vetor
		string = values.split("[,.!?'@:_-] *| +");

		// Usar a função de remoção de duplicadas
		String string1[] = removeDuplicate(string);

		// Passar os valores para utilizar a função de ordem alfabetica
		String string2[] = stringArraySort(string1);

		// Ler os valores e passar por linha no console
		for (i = 0; i < string2.length; i++) {

			string2[i] = string2[i].trim();
			System.out.println(string2[i].toLowerCase());

		}
		System.out.println("Total words in the dictionary: " + i);

		sc.close();
	}

	// Função para ordenar em alfabetica
	public static String[] stringArraySort(String[] words) {
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {

				if (words[i].compareTo(words[j]) > 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;

				}
			}
		}
		return words;

	}

	// Função para deletar as palavras repetidas
	public static String[] removeDuplicate(String[] words) {
		Set<String> wordSet = new LinkedHashSet<String>();
		for (String word : words) {
			wordSet.add(word);
		}
		return wordSet.toArray(new String[wordSet.size()]);
	}

}
