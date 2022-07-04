package pacote;

import java.util.Scanner;

public class Menu{
	public void home(){
		int opcao;
		do{
			System.out.println("###############################################");
			System.out.println("#                                             #");
			System.out.println("#                 [0]Cadastro                 #");
			System.out.println("#                 [1]Compras                  #");
			System.out.println("#                 [2]Sair                     #");
			System.out.println("#                                             #");
			System.out.println("###############################################");
			Scanner scan = new Scanner(System.in);
			opcao = scan.nextInt();
			decidirHome(opcao);
		}while(opcao!=2);
	}
	
	private void decidirHome(int opcao){
		switch (opcao) {

		case 0:
			cadastrar();
			break;

		case 1:	
			System.out.println("Compras");
			break;
		}
	}

	private void cadastrar(){
		int opcao;
		do{
			System.out.println("###############################################");
			System.out.println("#                                             #");
			System.out.println("#        [0]Cadastrar novo produto            #");
			System.out.println("#        [1]Cadastrar novo cliente            #");
			System.out.println("#        [2]Voltar                            #");
			System.out.println("#                                             #");
			System.out.println("###############################################");
			Scanner scan = new Scanner(System.in);
			opcao = scan.nextInt();
			decidirCadastro(opcao);
		}while(opcao!=2)
	}

	private void decidirCadastro(int opcao){
		Scanner scan = new Scanner(System.in);
		switch(opcao){
		case 0:
			System.out.println("Insira o ID do produto: ");
			int id = scan.nextInt();
			System.out.println("Insira o Nome do produto: ");
			String nome = scan.nextLn();
			System.out.println("Insira o Estoque do produto: ");
			int estoque = scan.nextInt();
			System.out.println("Insira o preco do produto: ");
			float preco = scan.nextFloat();
			Produto produto =  new Produto(id,nome,estoque,preco);
			break;
		}
	}


}