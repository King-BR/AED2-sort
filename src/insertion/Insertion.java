package insertion;

class Insertion {
    static void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }

        for (int value : vetor) {
            System.out.print(value + " ");
        }
    }

    static void main(String[] args) {
        int quantidade = 1000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
            System.out.print(vetor[i] + " ");
        }

        long tempoInicial = System.currentTimeMillis();
        System.out.print("\n\n");
        insertionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
        }

}