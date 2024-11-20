public class App {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("Colocando 5: " + lista.insereOrdenado(5));
        System.out.println("Colocando 3: " + lista.insereOrdenado(3));
        System.out.println("Colocando 7: " + lista.insereOrdenado(7));
        System.out.println("Colocando 10: " + lista.insereOrdenado(10));
        System.out.println("Colocando 6: " + lista.insereOrdenado(6));
        System.out.println("Colocando 2: " + lista.insereOrdenado(2));
        System.out.println("Lista ordenada após botar tudo:");
        lista.imprimirLista();
        ListaDuplamenteEncadeada listaPares = lista.retornaListaPares();
        System.out.println("Sublista de elementos pares:");
        listaPares.imprimirLista();
    }
}
