package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//Texto input que será fragmentado e comparado
		List<String> ar = new ArrayList<>();
		ar.add("0110100000");
		ar.add("1001011111");
		ar.add("1110001010");
		ar.add("0111010101");
		ar.add("0011100110");
		ar.add("1010011001");
		ar.add("1101100100");
		ar.add("1011010100");
		ar.add("1001100111");
		ar.add("1000011000");
		
		System.out.println(passReturn(ar));
		
	}
	
	public static int passReturn(List<String> pass) {
		
		//Variaveis de comparação
		ArrayList<String> ar1 = new ArrayList<>();
		char[][] mat = new char [10][10];
		char[][] main = new char [1][10];
		int val1 = 0;
		int p = 0;
		
		//percorre o texto e adiciona a uma arraylist
		for(String values : pass) {
			ar1.add(values);
		}
		
		//Busca no array char por char e adiciona em uma matriz 10x10
		for(int i = 0; i < ar1.size(); i++) {
			for(int j = 0; j < ar1.size(); j++) {
				mat[i][0] = ar1.get(i).charAt(0);
				mat[i][j] = ar1.get(i).charAt(j);
			}
		}
		
		//Contador com loops para identificar a predominancia de numero por coluna
		while(p < 10) {
			int one = 0;
			int zero = 0;
		for(int i = 0; i < mat.length; i++) {
			if(mat[i][p] == '1') {
				one += 1;
			}
			else {
				zero += 1;
			}
		}
		if(one >= zero) {
			main[0][p] = '1';
		}
		else {
			main[0][p] = '0';
		}
		p++;
		}
		
		//Passando para uma var os binario encontrado e convertendo para um iteiro
		for(char[] values : main) {
			String val = String.valueOf(values);
			val1 = Integer.parseInt(val, 2);
		}
		return val1;
	}
}
