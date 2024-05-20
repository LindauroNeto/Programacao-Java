package petshop;

import java.util.Scanner;

public class EscolhaAnimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pets pet;
		System.out.format("%-13sPET SHOP%13s\n", sinal, sinal);
		System.out.println("Qual bixinho você gostaria de adotar?\n- [1] CACHORRO\n- [2] GATO\n- [3] PEIXE\n- [4] PÁSSARO");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		String escolha = scan.nextLine();

		switch (escolha) {
		case "1":
			pet = new Cachorro();
			exibicao(pet, scan);
			break;

		case "2":
			pet = new Gato();
			exibicao(pet, scan);
			break;

		case "3":
			pet = new Peixe();
			exibicao(pet, scan);
			break;

		case "4":
			pet = new Passaro();
			exibicao(pet, scan);
			break;

		default:
			System.out.println("Escolha inválida.");
			break;
		}
		scan.close();
	}

	private static void exibicao(Pets pet, Scanner scan) {
		System.out.format("%s Adotando um %s.... %s\n", sinal, pet.tipoAnimal, sinal);
		System.out.format("\"%s\"\n", pet.somPet());
		System.out.format("É um(a) %s!\n", pet.genero);
		System.out.println("Esolha um nome!");
		pet.nome = scan.nextLine();

		System.out.format("%s Parabéns! Você adotou um bixinho! %s\n", sinal, sinal);
		System.out.println("Animal: " + pet.tipoAnimal);
		System.out.println("Genêro: " + pet.genero);
		System.out.println("Nome: " + pet.nome);
		System.out.println("Preferência: " + pet.preferencia());
		System.out.println("=-=-=-=-=-=-=-=-=-=---=-=-=-=-=-=-=-=-=-=");
		pet.comer();
		pet.brincar();
		pet.dormir();
	}

	private final static String sinal = "-=*=-";
}
