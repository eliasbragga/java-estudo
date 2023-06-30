import classes.ClasseEstatica;
import classes.Cliente;
import classes.Endereco;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco enderecoCliente1 = new Endereco("David Luiz", "Fortaleza", "60165110", 333);
        Endereco enderecoCliente2 = new Endereco("Juazeiro do norte", "Fortaleza", "60165112", 72);

        Cliente cliente1 = new Cliente("Elias Braga", enderecoCliente1);
        Cliente cliente2 = new Cliente("Juarez Silva", enderecoCliente2);

        System.out.println(cliente1.getEndereco().getRua());
        System.out.println(cliente2.getEndereco().getRua());


    }
}