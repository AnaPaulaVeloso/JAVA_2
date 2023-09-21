public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner[System.in];
    int[] numeros = new int[10]; 

        System.out.println("Digite 10 números:");
    
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close(); 
        int valorMaisFrequente = 0;
        int frequenciaMaisFrequente = 0;
    
        for (int i = 0; i < numeros.length; i++) {
            int valorAtual = numeros[i];
            int frequenciaAtual = 1;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] == valorAtual) {
                    frequenciaAtual++;
                }
            }
            if (frequenciaAtual > frequenciaMaisFrequente) {
                valorMaisFrequente = valorAtual;
                frequenciaMaisFrequente = frequenciaAtual;
            }
        }
        System.out.println("O valor mais frequente é: " + valorMaisFrequente);
        System.out.println("Frequência: " + frequenciaMaisFrequente);
    }
    }