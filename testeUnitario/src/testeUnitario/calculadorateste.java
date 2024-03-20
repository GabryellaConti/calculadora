package testeUnitario;

public class calculadorateste {

	public static void main(String[] args) {
		calculadora calcs = new calculadora();
		int resultadoEsperado = 7;
		int resultado = calcs.somar(5,2);
		if (resultadoEsperado == resultado) {
			System.out.println("teste ok");
		}else {
			System.out.println("o teste falhou");
		}
		calculadora calcs2 = new calculadora();
		int resultadoEsperado2 = 3;
		int resultado2 = calcs.subtrair(5,2);
		if (resultadoEsperado == resultado) {
			System.out.println("teste ok");
		}else {
			System.out.println("o teste falhou");
		}
		calculadora calcs3 = new calculadora();
		int resultadoEsperado3 = 6;
		int resultado3 = calcs.dividir(3,3);
		if (resultadoEsperado == resultado) {
			System.out.println("teste ok");
		}else {
			System.out.println("o teste falhou");
		}
		calculadora calcs4 = new calculadora();
		int resultadoEsperado4 = 4;
		int resultado4 = calcs.multiplicar(2,8);
		if (resultadoEsperado == resultado) {
			System.out.println("teste ok");
		}else {
			System.out.println("o teste falhou");
		}
		calculadora calcs5 = new calculadora();
		int resultadoEsperado5 = 20;
		int resultado5 = calcs.perimetro(7,3);
		if (resultadoEsperado == resultado) {
			System.out.println("teste ok");
		}else {
			System.out.println("o teste falhou");
		}
		
		
	}

}
