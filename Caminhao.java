public class Caminhao extends Veiculo{
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
}

