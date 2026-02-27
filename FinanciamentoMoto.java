public class FinanciamentoMoto {
    public static void main(String[] args) {
        // DADOS DO USUÁRIO
        double salarioMensal = 3500.00;
        double valorEntrada = 17500.00;
        boolean hasRestricaoCPF = true;
        boolean isPrimeiraCompra = true;
        boolean condicaoFinanceira = (salarioMensal > 3500 || valorEntrada > 15000);
            if(condicaoFinanceira && !hasRestricaoCPF) {
            System.out.println("Financiamento Aprovado!");
            
            if(isPrimeiraCompra) {
             System.out.println("IPVA Grátis Aprovado!");
           }
        } else {

            System.out.println("Financiamento Negado!");
            if(hasRestricaoCPF) {
                System.out.println("Motivo: Restrição no CPF.");
            } else{
                System.out.println("Motivo: Falta de garantia financeira.");
            }
        }

    }
}
