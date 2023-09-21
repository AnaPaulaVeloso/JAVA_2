public class main {
    public static void main(String[] args) {
    Random rand = new Random(); 
    int[] num = new int[20]; 
    
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(100) + 1;
        }
    
        int soma = 0; 
        for (int i = 0; i < num.length; i++) {
            soma += num[i];
        }
    
        double media = (double) soma / num.length; 
    
        System.out.println("Números no array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    
        // Imprime a média
        System.out.println("Média dos números: " + media);
    }
    }