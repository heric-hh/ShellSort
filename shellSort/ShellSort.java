package shellSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellSort {
    private int[]arr;
    private int numElementos;
    
    public BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public void setNumElementos() throws IOException {
        System.out.println("Ingresa el número de elementos del arreglo");
        numElementos = Integer.parseInt(bf.readLine());
        this.arr = new int[numElementos];
    }
    
    public void setElementos() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ".- Teclea un número: ");
            arr[i] = Integer.parseInt(bf.readLine());
        }
    }
    
    // Ordenar array usando ShellSort
    public int shellSort() {
        int n = arr.length;
        
        // Comenzar con un gran gap, luego reduce la diferencia
        for (int gap = n/2; gap > 0; gap /= 2) {
            // Realizar una ordenacion con insercion con saltos
            for (int i = gap; i < n; i+= 1) {
                int temp = arr[i];
                
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[ j - gap];
                }
                
                arr[j] = temp;
            }
        }
        return 0;
    }
    
    // Imprimir arreglo
    public void imprimeArreglo() {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] +  " - ");
        }
        System.out.println("");
    }
}
