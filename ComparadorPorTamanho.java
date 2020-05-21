/* Vamos criar um Comparator que serve para ordernar Strings de acordo com seu tamanho.
 * 
 * Repare que, diferente de Comparable , o m�todo aqui se chama compare e recebe dois
  argumentos, j� que quem o implementa n�o � o pr�prio objeto.*/


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
	 Podemos deixar o m�todo acima mais curto, tomando proveito do m�todo est�tico auxiliar Integer.compare que
  compara dois inteiros: A classe Integer implementa a Interface Comparator<> bastando passar para o 
   seu m�todo comparador dois inteiros pra serem comparados ex: */
	
	public int compare(String str1, String str2) {
	
		return Integer.compare(str1.length() , str2.length());
	}
		

}
