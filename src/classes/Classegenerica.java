package classes;

public class Classegenerica<T> {
    private T item;

    public void setarValor(T item) {
        this.item = item;
    }

    public T mostrarValor() {
        return this.item;
    }

}
