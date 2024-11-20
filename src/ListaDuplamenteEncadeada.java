public class ListaDuplamenteEncadeada {

    private Nodo cabeca;

    private static class Nodo {
        Integer valor;
        Nodo proximo;
        Nodo anterior;

        public Nodo(Integer valor) {
            this.valor = valor;
            this.proximo = null;
            this.anterior = null;
        }
    }

    public ListaDuplamenteEncadeada() {
        this.cabeca = null;
    }

    public boolean insereOrdenado(Integer valor) {
        if (cabeca == null) {
            Nodo novoNodo = new Nodo(valor);
            cabeca = novoNodo;
            return true;
        }
        if (existeValor(valor)) {
            return false;
        }

        Nodo nodoAtual = cabeca;

        while (nodoAtual != null) {
            if (valor < nodoAtual.valor) {
                Nodo novoNodo = new Nodo(valor);

                if (nodoAtual == cabeca) {
                    cabeca = novoNodo;
                } else {
                    nodoAtual.anterior.proximo = novoNodo;
                    novoNodo.anterior = nodoAtual.anterior;
                }

                novoNodo.proximo = nodoAtual;
                nodoAtual.anterior = novoNodo;
                return true;
            }

            if (nodoAtual.proximo == null) {
                Nodo novoNodo = new Nodo(valor);
                nodoAtual.proximo = novoNodo;
                novoNodo.anterior = nodoAtual;
                return true;
            }

            nodoAtual = nodoAtual.proximo;
        }

        return false;
    }

    private boolean existeValor(Integer valor) {
        Nodo nodoAtual = cabeca;
        while (nodoAtual != null) {
            if (nodoAtual.valor.equals(valor)) {
                return true;
            }
            nodoAtual = nodoAtual.proximo;
        }
        return false;
    }

    public ListaDuplamenteEncadeada retornaListaPares() {
        ListaDuplamenteEncadeada subListaPares = new ListaDuplamenteEncadeada();
        Nodo nodoAtual = cabeca;

        while (nodoAtual != null) {
            if (nodoAtual.valor % 2 == 0) {
                subListaPares.insereOrdenado(nodoAtual.valor);
            }
            nodoAtual = nodoAtual.proximo;
        }

        return subListaPares;
    }

    public void imprimirLista() {
        Nodo nodoAtual = cabeca;
        while (nodoAtual != null) {
            System.out.print(nodoAtual.valor);
            if (nodoAtual.proximo != null) {
                System.out.print(" -> ");
            }
            nodoAtual = nodoAtual.proximo;
        }
        System.out.println();
    }
}
