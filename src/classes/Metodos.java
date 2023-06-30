package classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Metodos {
    private int valorProcurado;
    private String[] nomes = {"Pedrinho"};
    List<String> lista = Arrays.asList(nomes);
    private ArrayList<String> users = new ArrayList<>(lista);
    public Metodos() {
        this.valorProcurado = 0;
        this.montarLista();
    }
    public Metodos(int valorProcurado) {
        this.valorProcurado = valorProcurado;
        this.montarLista();
    }

    public void procurarIndex() {
        int[] numeros = { 10, 20, 30, 40, 50 };
        int valorProcurado = this.getValorProcurado();
        List<Integer> lista = Arrays.asList(Arrays.stream(numeros).boxed().toArray(Integer[]::new));
        int index = lista.indexOf(valorProcurado);
        System.out.println("valor procurado: " + valorProcurado);
        if (index != -1) {
            System.out.println("O valor foi encontrato e seu index eh: " + index);
            return;
        }
        System.out.println("O valor nao foi encontrado");
    }

    public void excluirItemDoArray() {
        int[] numeros = { 1, 2, 3, 4 };
        int numeroParaExcluir = 2;
        int[] novoArray = new int[numeros.length - 1];

        int j = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != numeroParaExcluir) {
                novoArray[j] = numeros[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(novoArray));
    }

    public void montarLista() {
        String[] nomes = {"Elias", "Marina", "kaue", "Matheus", "Breno"};

        for(int i = 0; i < nomes.length; i++) {
            users.add(nomes[i]);
        }
    }

    public void Mostrarlista() {
        for(int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    public void deletarItemPorNome(String nome) {
        int IndexNomeProcurado = users.indexOf(nome);
        if(IndexNomeProcurado != -1) {
            users.remove(IndexNomeProcurado);
            return;
        }
        System.out.println("Nome nao encontrado");
    }

    public int getValorProcurado() {
        return valorProcurado;
    }

    public void setValorProcurado(int valorProcurado) {
        this.valorProcurado = valorProcurado;
    }

    
}
