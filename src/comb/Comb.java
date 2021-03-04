package comb;

class Comb {
    static int getNextGap(int gap) {
        gap = (gap*10)/13;
        return Math.max(gap, 1);
    }

    static void sort(int[] arr) {
        int n = arr.length;

        int gap = n;

        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = getNextGap(gap);

            swapped = false;

            for (int i=0; i<n-gap; i++) {
                if (arr[i] > arr[i+gap]) {
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    swapped = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int quantidade = 1000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\n\n");

        long tempoInicial = System.currentTimeMillis();

        sort(vetor);

        long tempoFinal = System.currentTimeMillis();

        for (int j : vetor) System.out.print(j + " ");

        System.out.println("\n\nExecutado em = " + (tempoFinal - tempoInicial) + " ms");
    }
}

