public class main {
    public static void main(String[] args) {
    Random rand = new Random(); 
    int[] numeros = new int[50]; 
    
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(10) + 1;
        }
        int[] contagem = new int[10];
    
        for (int i = 0; i < numeros.length; i++) {
            int numeroAtual = numeros[i];
            contagem[numeroAtual - 1]++; 
        }
        for (int i = 0; i < contagem.length; i++) {
            int numero = i + 1;
            System.out.println("Número " + numero + " aparece " + contagem[i] + " vezes.");
        }
    }
    }