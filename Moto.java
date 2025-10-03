public class Moto extends Veiculo{
private int cilindradas;
public  Moto (String placa, String marca, double preco, int cilindradas){
    super(placa, marca, preco);
    this.cilindradas = cilindradas;
}
public int getcilindradas(){
    return cilindradas;
}
public int setcilindradas(){
    return cilindradas;
}


}
