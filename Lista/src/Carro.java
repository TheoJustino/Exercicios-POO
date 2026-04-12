public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    static int totalCarros = 0;
    static final int ANO_PRIMEIRO_CARRO = 1886;

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

    static void imprimirTotal(){
        System.out.println("Total de carros: " + Carro.totalCarros);
        System.out.println(modelo); 
        /* 
        Exercício 8
        b) O System.out.println(modelo); dá erro de
        compilação pois um método static não consegue 
        acessar um atributo de instância diretamente.
        c) Isso acontece pois o método static não
        está associado a nenhum objeto específico,
        então ele não sabe onde ele deve acessar
        o atributo modelo.
        */ 
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
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Erro: o ano deve estar entre 1886 e 2026");
            return;
        }
        this.ano = ano;
    }
}
