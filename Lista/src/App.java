public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro();
        car.marca = "Marca1";
        car.modelo = "Modelo1";
        car.ano = 2015;

        System.out.println("Carro 1:");
        System.out.println(car.marca);
        System.out.println(car.modelo);
        System.out.println(car.ano);

        Carro car2 = new Carro();
        car2.marca = "Marca2";
        car2.modelo = "Modelo2";
        car2.ano = 2016;

        System.out.println("Carro 2:");
        System.out.println(car2.marca);
        System.out.println(car2.modelo);
        System.out.println(car2.ano);
    }
}
