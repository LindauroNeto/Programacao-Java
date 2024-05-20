package tstenum;
public class TestandoEnum {
	enum MesesDoAno {
		MES_1,
		MES_2,
		MES_3,
		MES_4,
		MES_5,
		MES_6,
		MES_7,
		MES_8,
		MES_9,
		MES_10,
		MES_11,
		MES_12
	}
	
	public static void main(String[] args) {
		System.out.println(MesesDoAno.MES_3);
		
		DiasDaSemana dia = DiasDaSemana.DIA_6;
		System.out.println(dia);
		
		DiasDaSemana.DIA_1.infoDia();
		
		MesesDoAno mes = MesesDoAno.MES_5;
		
		switch (mes) {
			case MES_1:
				System.out.println("Estamos no mês de JANEIRO.");
				break;
				
			case MES_2:
				System.out.println("Estamos no mês de FEVEREIRO.");
				break;
				
			case MES_4:
				break;
				
			case MES_5:
				System.out.println("Estamos no mês de ABRIL.");
				break;
				
			case MES_6:
				break;
				
			case MES_7:
				break;
				
			case MES_8:
				break;
				
			case MES_9:
				break;
				
			case MES_10:
				break;
				
			case MES_11:
				break;
				
			case MES_12:
				break;
	
			default:
				System.out.println("Este valor não existe.");
				break;
		}
	}
}