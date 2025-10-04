import java.util.Scanner;
public class Caminhao extends Veiculo{
    Scanner sc = new Scanner(System.in);
    private double capacidadeCarga;
    public Caminhao (String placa, String marca, double preco, double capacidadeCarga){
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
        
    }
    public double getcapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setcapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
    public void mostrarDados(boolean verEmKg){
        
        
if (verEmKg == true) {
            super.mostrarDados();
            System.out.println("Capacidade de Carga (kg): " + (capacidadeCarga* 1000));
            System.out.println("-------------------------");
        } else {
        super.mostrarDados();
        System.out.println("Capacidade de Carga (toneladas): " + capacidadeCarga);
        System.out.println("-------------------------");
    }
}
}
