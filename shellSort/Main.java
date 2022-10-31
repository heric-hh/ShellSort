package shellSort;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ShellSort obj = new ShellSort();
        
        // Setear longitud del array
        obj.setNumElementos();
        
        // Llenar elementos
        obj.setElementos();
        
        // Ordenar por shell
        obj.shellSort();
        
        // Imprime arreglo
        obj.imprimeArreglo();
    }
}
