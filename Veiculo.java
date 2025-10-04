public class Veiculo {
    private String placa;
    private String marca;
    private double preco;

    
    public Veiculo (String placa, String marca, double preco){
    this.placa = placa;
    this.marca = marca;
    this.preco = preco;
    }

    public String getplaca(){
        return placa;
    }

    public void setplaca(String placa){
        this.placa = placa;
    }

    public String getmarca(){
        return marca;
    }

    public void setmarca(String marca){
        this.marca = marca;
    }

    public double getpreco(){
        return preco;
    }

    public void setpreco(double preco){
        this.preco = preco;
    }
    


public void mostrarDados(){
    System.out.println("Placa: " + placa);
    System.out.println("Marca: " + marca);
    System.out.println("Preco: "+ preco +" R$");

}

}
