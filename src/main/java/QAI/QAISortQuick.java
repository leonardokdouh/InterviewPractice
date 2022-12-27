package QAI;


/**
 *  QuickSort is a Divide and Conquer algorithm. It picks an element as a pivot and
 *  partitions the given array around the picked pivot.
 *  There are many different versions of quickSort that pick pivot in different ways.
 *
 */
public class QAISortQuick {

    public static void main(String[] args) {

        int[] numbers = {10, 1, 5, 69, 101, 45, 2, 5};

        for(int numbs: quicksort(numbers ,0, numbers.length-1)){
            System.out.println(numbs);
        }
    }


    public static int[] quicksort(int A[], int left, int right) {
        int pivote=A[left]; // tomamos primer elemento como pivote
        int i=left;         // i realiza la búsqueda de izquierda a derecha
        int j=right;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }
        A[left]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(left < j-1)
            quicksort(A,left,j-1);          // ordenamos subarray izquierdo
        if(j+1 < right)
            quicksort(A,j+1,right);          // ordenamos subarray derecho
        return A;
    }


}
