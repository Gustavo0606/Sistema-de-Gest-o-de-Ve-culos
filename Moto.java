public class Moto extends Veiculo{
private int cilindradas;
public  Moto (String placa, String marca, double preco, int cilindradas){
    super(placa, marca, preco);
    this.cilindradas = cilindradas;
}
public int getcilindradas(){
    return cilindradas;
}
public void setcilindradas(int cilindradas){
    this.cilindradas = cilindradas;
}
public void mostrarDados(boolean verEmCavalos) {
    if (verEmCavalos == true) {
        super.mostrarDados();
        System.out.println("Potência (cv): " + (cilindradas / 15));
        System.out.println("-------------------------");
    } else {
    super.mostrarDados();
    System.out.println("Cilindradas: " + cilindradas);
    System.out.println("-------------------------");
}

    }


}
