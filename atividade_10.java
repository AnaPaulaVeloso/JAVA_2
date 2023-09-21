public class main {
    public static void main(String[] args) {
    Random rand = new Random(); 
    int contagemSete = 0; 
    
        for (int i = 0; i < totalLancamentos; i++) {
            int dado1 = rand.nextInt(6) + 1;
            int dado2 = rand.nextInt(6) + 1;
    
            int somaDados = dado1 + dado2;
            if (somaDados == 7) {
                contagemSete++;
            }
        }
        System.out.println("Resultados dos lançamentos:");
        System.out.println("Total de lançamentos: " + totalLancamentos);
        System.out.println("Quantidade de vezes que a soma foi igual a 7: " + contagemSete);
    }
    }