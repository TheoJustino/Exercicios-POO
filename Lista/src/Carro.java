public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    static int totalCarros = 0;

    Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        totalCarros ++;
    }

    Carro(){
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros ++;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Erro: o ano deve estar entre 1886 e 2026");
            return;
        }
        this.ano = ano;
    }
}
