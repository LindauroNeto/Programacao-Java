package tstenum;
public enum DiasDaSemana {
	DIA_1(1, "Domingo"),
	DIA_2(2, "Segunda-feira"),
	DIA_3(3, "Terça-feira"),
	DIA_4(4, "Quarta-feira"),
	DIA_5(5, "Quinta-feira"),
	DIA_6(6, "Sexta-feira"),
	DIA_7(7, "Sábado");
	
	int numDia;
	String nomeDia;
	
	private DiasDaSemana(int numDia, String nomeDia) {
		this.numDia = numDia;
		this.nomeDia = nomeDia;
	}
}