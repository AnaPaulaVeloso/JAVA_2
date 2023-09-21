public class main {
    public static void main(String[] args) {
    Random rand = new Random(); 
    int[] numeros = new int[15];
    
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }
    
        int maior = numeros[0];
        int menor = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; 
            } else if (numeros[i] < menor) {
                menor = numeros[i]; 
            }
        }
    
        System.out.println("Números da sequencia:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
    }