import java.util.Scanner;

public class Trabalho1 {
	
	public static void main(String[] args) {
		String[] nome = new String[1000];
		String[] endereco = new String[1000];
		String[] telefone = new String[1000];
		int numT = 10, numTP = 10;
		int numC, numCP;
		String[] nomeProd = new String[1000];
		String[] descricaoProd = new String[1000];
		int qtdProd[] = new int[1000];
		float valor[] = new float[1000];
		float porcent[] = new float[1000];
	
		nome[0] = "Leticia";
		nome[1] = "Rayssa";
		nome[2] = "Pamela";
		nome[3] = "Kelvin";
		nome[4] = "Macris";
		nome[5] = "Douglas";
		nome[6] = "Lucareli";
		nome[7] = "Rebeca";
		nome[8] = "Camila";
		nome[9] = "Natalia";
	for(int n =0; n<10;n++) {
		endereco[n] = "Vila Olimpica, Toquio - Japao.";
		telefone[n] = "(00) 91234-5678";
	}
		nomeProd[0] = "Arroz";
		nomeProd[1] = "Feijao";
		nomeProd[2] = "Grao de bico";
		nomeProd[3] = "Aveia em flocos";
		nomeProd[4] = "Leite Integral";
		nomeProd[5] = "Leite de soja";
		nomeProd[6] = "Oleo de girasol";
		nomeProd[7] = "Milho de pipoca";
		nomeProd[8] = "Farinha de mandioca";
		nomeProd[9] = "Tofu";

		descricaoProd[0] = "Arroz - Arroz branco tipo 1, 1kg.";
		descricaoProd[1] = "Feijao - Feijao carioca, 1kg.";
		descricaoProd[2] = "Grao de bico - Grão de bico, nao contem gluten, 500g.";
		descricaoProd[3] = "Aveia em flocos - Aveia em flocos, 165g.";
		descricaoProd[4] = "Leite Integral - Leite Uht Integral, 1L.";
		descricaoProd[5] = "Leite de soja - Leite de soja, alimento a base de soja 1L.";
		descricaoProd[6] = "Oleo de girasol - Oleo de soja, 900ml.";
		descricaoProd[7] = "Milho de pipoca - Milho de pipoca premium, 500g.";
		descricaoProd[8] = "Farinha de mandioca - Farinha de mandioca 1kg.";
		descricaoProd[9] = "Tofu - Tofu Firme Orgânico 250g.";
		
		qtdProd[0] = 10;
		qtdProd[1] = 10;
		qtdProd[2] = 10;
		qtdProd[3] = 10;
		qtdProd[4] = 10;
		qtdProd[5] = 10;
		qtdProd[6] = 10;
		qtdProd[7] = 10;
		qtdProd[8] = 10;
		qtdProd[9] = 10;
		
		valor[0] = (float) 1.00;
		valor[1] = (float) 2.00;
		valor[2] = (float) 3.00;
		valor[3] = (float) 4.00;
		valor[4] = (float) 5.00;
		valor[5] = (float) 6.00;
		valor[6] = (float) 7.00;
		valor[7] = (float) 8.00;
		valor[8] = (float) 9.00;
		valor[9] = (float) 10.00;
		
		porcent[0] = (float) 100;
		porcent[1] = (float) 100;
		porcent[2] = (float) 100;
		porcent[3] = (float) 100;
		porcent[4] = (float) 100;
		porcent[5] = (float) 100;
		porcent[6] = (float) 100;
		porcent[7] = (float) 100;
		porcent[8] = (float) 100;
		porcent[9] = (float) 100;
		
		Scanner leitura = new Scanner(System.in);
		
		int op;
		do {
			
			menu();
			op = leitura.nextInt();
					
			switch(op) {
			case 1:
				System.out.println("Quantos clientes deseja cadastrar?");
				numC = leitura.nextInt();
				numT = numT + numC;
				cadastro(nome, endereco, telefone, leitura, numC, numT);
				break;
				
			case 2:
				buscar(nome, endereco, telefone, leitura, numT);			
				break;
				
			case 3:
				System.out.println("Quantos produtos deseja cadastrar?");
				numCP = leitura.nextInt();
				numTP = numTP + numCP;
				cadastroProd(nomeProd, descricaoProd, qtdProd, valor, porcent, leitura, numCP, numTP);			
				break;
				
			case 4:
				buscarProd(nomeProd, descricaoProd, qtdProd, valor, porcent, leitura, numTP);
				break;
				
			case 5:
				cadastroVenda(nome, numT, nomeProd, numTP, leitura, qtdProd);
				break;
			case 6:
				buscarProd(nomeProd, qtdProd, numTP);
				break;
			case 7:
				System.out.println("Tchau!");
				break;
				
			default:
				System.out.println("Opcao invalida!");
				break;
			}
		}while(op != 7);	
	}


	public static void menu() {		
		System.out.println("\n\t\t    MENU");
		System.out.println("\t1. Cadastro de novo cliente.");
		System.out.println("\t2. Busca por cliente.");
		System.out.println("\t3. Cadastro de novo produto.");
		System.out.println("\t4. Busca por produto.");
		System.out.println("\t5. Cadastro de venda.");
		System.out.println("\t6. Mostrar produtos em estoque.");
		System.out.println("\t7. Sair.\n");
		System.out.println("Escolha uma opcao do menu:");
	}
	public static void cadastro(String nome[], String endereco[], String telefone[], Scanner leitura, int numC, int numT) {
		
		leitura.nextLine();
		for(int ind = numT - numC ; ind < numT; ind++) {
			System.out.println("Digite o nome do cliente: ");
			nome[ind] = leitura.nextLine();
			System.out.println("Digite o endereco do cliente: ");
			endereco[ind] = leitura.nextLine();
			System.out.println("Digite o numero de telefone do cliente:");
			telefone[ind] = leitura.nextLine();
					}
	}
	public static void buscar(String nome[], String endereco[], String telefone[], Scanner leitura, int numT) {
		int busc, numAlt;
		char alterar;
		System.out.println("Escolha o numero do cliente que esta procurando:");
		for(int n = 0; n < numT; n++) {
			System.out.println((n+1) + "- " + nome[n]);
				}
		System.out.println("\n");
		busc = leitura.nextInt();
		if(busc<1 || busc>numT) {
			System.out.println("Cliente nao encontrado!");
		}else {
			System.out.println("\t\tInformacoes do cliente:");
			System.out.println("\tNome: " + nome[busc-1] + "\n" + "\tEndereco: " + endereco[busc-1] + "\n" + "\tTelefone: " + telefone[busc-1] + "\n\n");
			System.out.println("Deseja alterar os dados?(s/n)");
			alterar = leitura.next().charAt(0);
			if(alterar == 's' || alterar == 'S') {
				System.out.println("O que voce deseja alterar?\n   1.Nome\n   2.Endereco\n   3.Telefone\n   4.Cancelar");
				numAlt = leitura.nextInt();
				switch(numAlt) {
				case 1:
					System.out.println("Digite o nome do cliente: ");
					leitura.nextLine();
					nome[busc-1] = leitura.nextLine();
					System.out.println("Alteracao realizada com sucesso!");
					break;
				case 2:
					System.out.println("Digite o endereco do cliente: ");
					leitura.nextLine();
					endereco[busc-1] = leitura.nextLine();
					System.out.println("Alteracao realizada com sucesso!");
					break;
				case 3:
					System.out.println("Digite o numero de telefone do cliente:");
					leitura.nextLine();
					telefone[busc-1] = leitura.nextLine();
					System.out.println("Alteracao realizada com sucesso!");
					break;
				case 4:
					System.out.println("Alteracao cancelada!\n");
					break;
				default:
					System.out.println("Opcao invalida!\n");
						break;
				}
			}
			else if(alterar == 'n' || alterar == 'N'){
				System.out.println("Alteracao cancelada!\n");
			}
			else {
				System.out.println("Opcao invalida!\n");
			}
		}				
	}
	public static void cadastroProd(String nomeProd[], String descricaoProd[], int qtdProd[], float valor[], float porcent[], Scanner leitura, int numCP, int numTP) {
		for(int ind = numTP - numCP ; ind < numTP; ind++) {
			leitura.nextLine();
			System.out.println("Digite o nome do produto: ");
			nomeProd[ind] = leitura.nextLine();
			System.out.println("Digite a descricao do produto: ");
			descricaoProd[ind] = leitura.nextLine();
			System.out.println("Digite o valor de compra do produto: ");
			valor[ind] = leitura.nextFloat();
			System.out.println("Digite a porcentagem do produto: ");
			porcent[ind] = leitura.nextFloat();
			System.out.println("Digite o estoque do produto: ");
			qtdProd[ind] = leitura.nextInt();
		}
	}
		public static void buscarProd(String nomeProd[], String descricaoProd[], int qtdProd[], float valor[], float porcent[], Scanner leitura, int numTP) {
		int buscP, altPN;
		char altP;
			System.out.println("Escolha o numero do produto que esta procurando:");
			for(int n = 0; n < numTP; n++) {
				System.out.println((n+1) + "- " + nomeProd[n]);
					}
			System.out.println("\n");
			buscP = leitura.nextInt();
			if(buscP < 1 || buscP > numTP) {
				System.out.println("Produto nao encontrado!");
			}else {
				System.out.println("\t\tInformacoes do produto:");
				System.out.println("\tNome: " + nomeProd[buscP-1] + "\n" + "\tDescricao: " + descricaoProd[buscP-1] + "\n" + "\tValor de compra: " + valor[buscP-1] + "\tPorcentagem de lucro: " + porcent[buscP-1] + "\tQuantidade em estoque: " + qtdProd[buscP-1] +"\n\n");
				System.out.println("Deseja alterar os dados?(s/n)");
				altP = leitura.next().charAt(0);
				if(altP == 's' || altP == 'S') {
					System.out.println("O que voce deseja alterar?\n   1.Nome\n   2.Decricao\n   3.Valor de compra\n   4.Porcentagem de lucro\n   5.Quantidade em estoque\n   6.Cancelar");
					altPN = leitura.nextInt();
					leitura.nextLine();
					switch(altPN) {
					case 1:
						System.out.println("Digite o nome do produto: ");
						nomeProd[buscP-1] = leitura.nextLine();		
						System.out.println("Alteracao realizada com sucesso!");
						break;
					case 2:
						System.out.println("Digite a descricao do produto: ");
						descricaoProd[buscP-1] = leitura.nextLine();
						System.out.println("Alteracao realizada com sucesso!");
						break;
					case 3:
						System.out.println("Digite o valor de compra do produto: ");
						valor[buscP-1] = leitura.nextFloat();
						System.out.println("Alteracao realizada com sucesso!");
						break;
					case 4:
						System.out.println("Digite a porcentagem do produto: ");
						porcent[buscP-1] = leitura.nextFloat();
						System.out.println("Alteracao realizada com sucesso!");
						break;
					case 5:
						System.out.println("Digite o estoque do produto: "); 
						qtdProd[buscP-1] = leitura.nextInt();
						System.out.println("Alteracao realizada com sucesso!");
						break;
					case 6:						
						System.out.println("Alteracao caoncelada!\n");
						break;
					default:
						System.out.println("Opcao invalida!\n");
						break;
					
					}
				}
				else if(altP == 'n' || altP == 'N') {
					System.out.println("Alteracao caoncelada!\n");
				}
				else {
					System.out.println("Opcao invalida!\n");
				}
				
			}
		 
	}
		public static void cadastroVenda(String nome[], int numT, String nomeProd[], int numTP, Scanner leitura, int qtdProd[]) {
			int nCliente, produtos, qtd;
			char verif;
			
			System.out.println("Escolha o numero do cliente que comprou:");
			for(int n = 0; n < numT; n++) {
				System.out.println((n+1) + "- " + nome[n]);
					}
			System.out.println("\n");
			nCliente = leitura.nextInt();
			do {
				System.out.println("Escolha o numero do produto que o cliente comprou:");
				for(int n = 0; n < numTP; n++) {
					System.out.println((n+1) + "- " + nomeProd[n]);
						}
				System.out.println("\n");
				produtos = leitura.nextInt();
				
				System.out.println("Quantas unidades desse produto o cliente comprou?");
				qtd = leitura.nextInt();
				qtdProd[produtos-1] = qtdProd[produtos-1] - qtd;
				
				System.out.println("Este cliente comprou algo mais?");
				verif = leitura.next().charAt(0);
			}while(verif == 's' || verif == 'S');
			
			
		}
		public static void buscarProd(String nomeProd[], int qtdProd[], int numTP) {
			System.out.println("\t\tProdutos em estroque\n");
			for(int n = 0; n < numTP; n++) {
				System.out.println("\tNome do produto: " + nomeProd[n] + "  -  Quantidade em Estoque: " + qtdProd[n]);
			}
		}
}