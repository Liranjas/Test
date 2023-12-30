package entities;

public class Perguntas{
		public String enunciado_1() {
			return "Questão 1:\n" +
					"Quais as cores da bandeira do Brasil?\n"+
					"a)Verde, azul e amarelo\n"+
					"b)Verde, vermelho e amarelo\n"+
					"c)Azul, laranja e amarelo";	
		}
		public int resposta_1(String input) {
			if (input.equals("a")){
				return 1;
			}
			else {
				return 0;
			}
		}
		public String enunciado_2() {
			return "Questão 2:" +
					"Quem pintou Mona Lisa?"+
					"a)Vincent van Gogh"+
					"b)Leonardo da Vinci"+
					"c)Pablo Picasso";	
		}
		public int resposta_2(String input) {
			if (input.equals("b")){
				return 1;
			}
			else {
				return 0;
			}
		}
		public String enunciado_3() {
			return "Questão 3:" +
					"Quantos segundos há em um minuto?"+
					"a)100"+
					"b)120"+
					"c)60";	
		}
		public int resposta_3(String input) {
			if (input.equals("c")){
				return 1;
			}
			else {
				return 0;
			}
		}
		public String enunciado_4() {
			return "Questão 4:" +
					"Quantos lados tem um triângulo?"+
					"a)3"+
					"b)4"+
					"c)5";	
		}
		public int resposta_4(String input) {
			if (input.equals("a")){
				return 1;
			}
			else {
				return 0;
			}
		}
		public String enunciado_5() {
			return "Questão 5:" +
					"Qual é o maior planeta do nosso sistema solar?"+
					"a)Terra"+
					"b)Júpiter"+
					"c)Vênus";	
		}
		public int resposta_5(String input) {
			if (input.equals("b")){
				return 1;
			}
			else {
				return 0;
			}
		}
}
