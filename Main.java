import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
            Locale.setDefault(Locale.US);
            ArrayList<Carro> carros = new ArrayList<>();
            ArrayList<Moto> motos = new ArrayList<>();
            ArrayList<Caminhao> caminhoes = new ArrayList<>();

          while (true){
            System.out.println("Escolha o tipo de ação que deseja realizar: \n 1- Cadastrar Veículo \n 2- Mostrar Veículos cadastrados \n 3- Sair");
            int escolha = sc.nextInt();
            if (escolha == 1){
              System.out.println("Escolha o tipo de veículo que deseja cadastrar: \n 1- Carro \n 2- Moto \n 3- Caminhão");
              int tipoVeiculo = sc.nextInt();
              sc.nextLine();
              if (tipoVeiculo == 1){
                System.out.println("Digite a placa do carro:");
                String placa = sc.nextLine();
                System.out.println("Digite a marca do carro:");
                String marca = sc.nextLine();
                System.out.println("Digite o preço do carro: ex: 2500.00");
                double precoOri = sc.nextDouble();
                System.out.println("Digite o número de portas do carro:");
                int numPortas = sc.nextInt();
                   System.out.println("Digite um valor em porcentagem caso queira um desconto, caso não queira, digite 0");
              double valorDesconto = sc.nextDouble();
              sc.nextLine();
              double preco = precoOri - (precoOri * (valorDesconto / 100));
                Carro carro = new Carro(placa, marca, preco, numPortas);
                carros.add(carro);
                System.out.println("Carro cadastrado com sucesso! , gostaria de ver os dados do carro? 1-sim 2-não");
                int verDados = sc.nextInt();
                if (verDados == 1){
                  sc.nextLine();
                  System.out.println("Gostaria que a quantidade de portas fosse exibida? 1-sim 2-não");
                  int verPortas = sc.nextInt();
                  boolean verNumPortas = (verPortas == 1);
                  carro.mostrarDados(verNumPortas);
                }
        

              }else if (tipoVeiculo == 2){
              System.out.println("Digite a placa da moto:");
              String placa = sc.nextLine();
              System.out.println("Digite a marca da moto:");
              String marca = sc.nextLine();
              System.out.println("Digite o preço da moto: ex: 2500.00");
              double precoOri = sc.nextDouble();
              sc.nextLine();
              System.out.println("Digite as cilindradas da moto:");
              int cilindradas = sc.nextInt();
                 System.out.println("Digite um valor em porcentagem caso queira um desconto, caso não queira, digite 0");
              double valorDesconto = sc.nextDouble();
              sc.nextLine();
              double preco = precoOri - (precoOri * (valorDesconto / 100));
              Moto moto = new Moto(placa, marca, preco, cilindradas);
              motos.add(moto);
              System.out.println("Moto cadastrada com sucesso! , gostaria de ver os dados da moto? 1-sim 2-não");
              int verDados = sc.nextInt();
              if (verDados == 1){
                sc.nextLine();
                System.out.println("gostaria de visualizar a potência da moto em cilindradas ou em cavalos? 1-cilindradas 2-cavalos");
                boolean verEmCavalos = (sc.nextInt() == 2);

                moto.mostrarDados(verEmCavalos);
              }
            }else if (tipoVeiculo == 3){
              
              System.out.println("Digite a placa do caminhão:");
              String placa = sc.nextLine();
              System.out.println("Digite a marca do caminhão:");
              String marca = sc.nextLine();
              System.out.println("Digite o preço do caminhão: ex: 2500.00");
              double precoOri = sc.nextDouble();
              System.out.println("Digite a capacidade de carga do caminhão: (em toneladas)");
              double capacidadeCarga = sc.nextDouble();
              System.out.println("Digite um valor em porcentagem caso queira um desconto, caso não queira, digite 0");
              double valorDesconto = sc.nextDouble();
              sc.nextLine();
              double preco = precoOri - (precoOri * (valorDesconto / 100));
              Caminhao caminhao = new Caminhao(placa, marca, preco, capacidadeCarga);
              caminhoes.add(caminhao);
              System.out.println("Caminhão cadastrado com sucesso! , gostaria de ver os dados do caminhão? 1-sim 2-não");
              int verDados = sc.nextInt();
              sc.nextLine();
              
              if (verDados == 1){
                System.out.println("Gostaria de ver a capacidade de carga em quilos? 1-sim 2-não");
                int verEmQuilos = sc.nextInt();
                boolean verEmKg = (verEmQuilos == 1);
                caminhao.mostrarDados(verEmKg);
              }
            }else{
              System.out.println("Opção inválida. Tente novamente.");
            }

          }else if (escolha == 2){
            sc.nextLine();
            System.out.println("Gostaria que a quantidade de portas dos carros fosse exibida? 1-sim 2-não");
            int verPortas = sc.nextInt();
            sc.nextLine();
            boolean verNumPortas = (verPortas == 1);
            System.out.println("Gostaria que a potência das motos fosse exibida em cavalos ou em cilindradas? 1-cilindradas 2-cavalos");
            int cilindradasOuCavalos = sc.nextInt();
            boolean verEmCavalos = (cilindradasOuCavalos == 2);
            sc.nextLine();
            System.out.println("Gostaria que a capacidade de carga dos caminhões fosse exibida em quilos ou em toneladas? 1-quilos 2-toneladas");
            int verEmQuilos = sc.nextInt();
            boolean verEmKg = (verEmQuilos == 1);

            System.out.println("Carros cadastrados:");
            for (Carro carro : carros) {
                carro.mostrarDados(verNumPortas);
            }
            System.out.println("Motos cadastradas:");
            for (Moto moto : motos) {
                moto.mostrarDados(verEmCavalos);
            }
            System.out.println("Caminhões cadastrados:");
            for (Caminhao caminhao : caminhoes) {
                caminhao.mostrarDados(verEmKg);
          }
            
      
    }else if (escolha == 3){
        System.out.println("Saindo do sistema, vamos exibir os veículos cadastrados antes de sair:");

           sc.nextLine();
            System.out.println("Gostaria que a quantidade de portas dos carros fosse exibida? 1-sim 2-não");
            int verPortas = sc.nextInt();
            sc.nextLine();
            boolean verNumPortas = (verPortas == 1);
            System.out.println("Gostaria que a potência das motos fosse exibida em cavalos ou em cilindradas? 1-cilindradas 2-cavalos");
            int cilindradasOuCavalos = sc.nextInt();
            boolean verEmCavalos = (cilindradasOuCavalos == 2);
            sc.nextLine();
            System.out.println("Gostaria que a capacidade de carga dos caminhões fosse exibida em quilos ou em toneladas? 1-quilos 2-toneladas");
            int verEmQuilos = sc.nextInt();
            boolean verEmKg = (verEmQuilos == 1);

            System.out.println("Carros cadastrados:");
            for (Carro carro : carros) {
                carro.mostrarDados(verNumPortas);
            }
            System.out.println("Motos cadastradas:");
            for (Moto moto : motos) {
                moto.mostrarDados(verEmCavalos);
            }
            System.out.println("Caminhões cadastrados:");
            for (Caminhao caminhao : caminhoes) {
                caminhao.mostrarDados(verEmKg);
          }
            
        break;
  }
} 

}
}      
    