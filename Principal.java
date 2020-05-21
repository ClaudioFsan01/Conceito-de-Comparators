/*É possível definir outros critérios de ordenação usando a interface do java.util chamada
Comparator . Existe um método sort em Collections que recebe, além da List , um
Comparator definindo um critério de ordenação específico. É possível ter vários Comparator s com
critérios diferentes para usar quando for necessário.*/
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	
 public static void main(String [] args) {
	 
	 //ComparadorPorTamanho comparador = new  ComparadorPorTamanho();
	List<String> listaString = new ArrayList<>();
	
	listaString.add("Zuila");
	listaString.add("Adalberto");
	listaString.add("Beatriz");
	listaString.add("Gildarenes");
	
	Collections.sort(listaString, new  ComparadorPorTamanho());  // passando uma lista e um comparador de tamanho das Strings
	
	//for(String nome : listaString) {
		
		System.out.println(" Nome : "+ listaString);
	//}
	 
	
	 
	 
 }	

}
