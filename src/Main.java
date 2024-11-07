//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();

        //Agregar nodos al Arbol

        arbol.agregar(5);
        arbol.agregar(3);
        arbol.agregar(7);
        arbol.agregar(2);
        arbol.agregar(4);
        arbol.agregar(6);
        arbol.agregar(8);

        System.out.println("Recorrido Preorden");
        arbol.recorrerPreorden(arbol.raiz);

        System.out.println("\nRecorrido Inorden");
        arbol.recorrerInorden(arbol.raiz);

        System.out.println("\nRecorrido Poseorden");
        arbol.recorrerPosorden(arbol.raiz);




    }
}