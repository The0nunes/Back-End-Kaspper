package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {

	public static void main(String[] args) 
	{// importando List do java.util, Lista não aceita tipos primitivos, apenas o wrapper classes.
		List<String> list = new ArrayList<>(); // classe ArrayList serve para iniciar o List.
		
		list.add("Maria"); // list.add serve para adicionar 
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
	
		list.add(2, "Arthur"); // adicionando elemento em uma list, inserindo na posição 2.
		
		System.out.println(list.size()); // ele vai trazer quantos elementos há na lista.		
		
		list.remove(1); // reconhece e remove o valor que está sendo comparado.
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("-----------------------");
		list.removeIf(x -> x.charAt(0) == 'A'); // removendo pela função do predicado.
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // procurando e encontrando um elemneto
		System.out.println("Index of Osvaldo: " + list.indexOf("Osvaldo")); // prquando NÃO se encontra fica -1.
		
		System.out.println("------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}	
	}

}