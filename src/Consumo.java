import java.util.Scanner;
public class Consumo {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		Consumo.menu();
		opcao = teclado.nextInt();
		int carro,distancia,consumo,kml;
		String nome;
		kml = 1;
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine();
		if(opcao == 1){
			Consumo.carros();
			
		}else if(opcao == 2){
			System.out.println("Selecione o carro e a distancia que irá percorrer: ");
			System.out.println("Carro:");
			carro = teclado.nextInt();
			if(carro == 10){
				System.out.println("O carro escolhido foi: Vectra ");
				kml = 10;
				
			}else if(carro == 20){
				System.out.println("O carro escolhido foi: Uno ");
				kml = 15;
				
			}else if(carro == 30){
				System.out.println("O carro escolhido foi: 8-150 ");
				kml = 4;
			}
			System.out.println("Digite o distância percorrida: ");
			distancia = teclado.nextInt();
			consumo = (distancia / kml);
			System.out.println("A quantidade de litros será: " + consumo);
		}
	}

	public static void menu(){
		System.out.println("Selecione uma das opções: ");
		System.out.println("1 - Ver carros. ");
		System.out.println("2 - Ver consumo por distancia.");
		System.out.println("3 - Sair");
		    
	}
	public static void carros(){
		System.out.println("10 - Vectra - 10 km/l");
		System.out.println("20 - Uno    - 15 km/l");
		System.out.println("30 - 8-150  - 4  km/l ");
		System.out.println("0  - Sair");
	}
}
