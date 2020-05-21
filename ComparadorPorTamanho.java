/* Vamos criar um Comparator que serve para ordernar Strings de acordo com seu tamanho.
 * 
 * Repare que, diferente de Comparable , o método aqui se chama compare e recebe dois
  argumentos, já que quem o implementa não é o próprio objeto.*/


import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String>{
	/*
	public int compare(String str1, String str2) {
		if(str1.length()< str2.length()) {
			return -1;
		}else {
			if(str1.length()>str2.length()) {
				return 1;
			}else {
				return 0;
			}
		}
			
	}*/ //ou
	
	/* 
	 Podemos deixar o método acima mais curto, tomando proveito do método estático auxiliar Integer.compare que
  compara dois inteiros: A classe Integer implementa a Interface Comparator<> bastando passar para o 
   seu método comparador dois inteiros pra serem comparados ex: */
	
	public int compare(String str1, String str2) {
	
		return Integer.compare(str1.length() , str2.length());
	}
		

}
