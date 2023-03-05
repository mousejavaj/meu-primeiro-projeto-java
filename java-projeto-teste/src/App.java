import modelo.Carro;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();

        carro.setCor("Amarelo");
        carro.setMarca("FIAT");
        carro.setModelo("TORO");
        carro.setPlaca("HMK-0987");
        carro.setValor(130000.0);

        Carro carro1 = new Carro("Ferrari", "GT", "Vermelho", "ASD-1234", 500000.0);


        //System.out.println("CARRO 1 -------------------");
        //System.out.println(carro.getMarca());
        //System.out.println(carro.getModelo());
        //System.out.println(carro.getPlaca());
        //System.out.println(carro.getValor());
        //System.out.println("CARRO 2 ----------------------");

        //System.out.println(carro1.toString());
    

        Pessoa pessoa = new Pessoa("Denis", 27);
        pessoa.setCarro(carro1);

        System.out.println(pessoa);

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        carro1.freiar();

        System.out.println(carro1.getVelocidade());





    }
}
