/*� poss�vel definir outros crit�rios de ordena��o usando a interface do java.util chamada
Comparator . Existe um m�todo sort em Collections que recebe, al�m da List , um
Comparator definindo um crit�rio de ordena��o espec�fico. � poss�vel ter v�rios Comparator s com
crit�rios diferentes para usar quando for necess�rio.*/
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
