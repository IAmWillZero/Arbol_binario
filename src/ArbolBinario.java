public class ArbolBinario {
    Nodo raiz;
    public ArbolBinario(){
        raiz = null;
    }

    // Método paa agregar un nodo al árbol
    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }
    private Nodo agregarRecursivo(Nodo nodo, int valor){
        if (nodo == null){
            return new Nodo(valor);
        }
        if (valor < nodo.valor){
            nodo.izquierdo = agregarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = agregarRecursivo(nodo.derecho, valor);
        }
        return nodo;

    }

    public void recorrerPreorden(Nodo nodo) {
        if (nodo != null){
            System.out.print(nodo.valor + " ");
            recorrerPreorden(nodo.izquierdo);
            recorrerPreorden(nodo.derecho);

        }
    }

    public void recorrerInorden(Nodo nodo) {
        if (nodo != null){
            recorrerInorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorrerInorden(nodo.derecho);

        }
    }
    public void recorrerPosorden(Nodo nodo) {
        if (nodo != null){
            recorrerPosorden(nodo.izquierdo);
            recorrerPosorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}
