
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Marca1", "Modelo1", 2015));
        listaCarros.add(new Carro("Marca2", "Modelo2", 2016));
        listaCarros.add(new Carro("Marca3", "Modelo3", 2017));
        listaCarros.add(new Carro("Marca4", "Modelo4", 2018));
        listaCarros.add(new Carro("Marca5", "Modelo5", 2027));

        /* 
        Exercício 5
        Vantagens de utilizar construtores: 
        Permite criar um objeto com todos os atributos em um estado válido
        Também deixa o código mais organizado e limpo, pois
        evita a chamada de vários setters para a criação de um único objeto
        */

        listaCarros.add(new Carro());

        /* 
        Exercício 6
        A diferença entre um construtor com e sem parâmetros
        é que quanto tem parâmetros, é necessário dar valores a eles
        no momento de criação do objeto, porém pode ter valores personalizados, 
        não é fixo, enquanto o construtor sem parâmetros tem valores padrão 
        */
       
        for (Carro car : listaCarros){
            App.exibirCarro(car);
            System.out.println("Idade do carro: " + App.idadeDoCarro(car));
        }
    }
    public static void exibirCarro(Carro car){
        // Esse método não retorna valor algum pois é um método void, apenas executa uma ação
        System.out.println("Carro:");
        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
    }

    public static int idadeDoCarro(Carro car){
        // Esse método retorna o valor da idade do carro
        return 2026 - car.getAno();
    }
}
