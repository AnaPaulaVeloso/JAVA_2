public class main {
    public static void main(String[] args) {
    Random rand = new Random(); 
    int[] numeros = new int[10]; 
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }
    
        System.out.println("Números no array (ordem original):");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\\nNúmeros no array (ordem reversa):");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
    }