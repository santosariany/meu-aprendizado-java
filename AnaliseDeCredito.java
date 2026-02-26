public class AnaliseDeCredito {
    public static void main(String[] args) {
        // DADOS DO CLIENTE
        int idadeCliente = 21;
        double salarioMensal = 3500.00;
        double valorEmprestimoSolicitado = 12000.00;
        int mesesNoEmpregoAtual = 6;

        System.out.println("--- RELATÓRIO DE CRÉDITO ---");
        // O cliente é maior de idade?
        boolean eMaiorIdade = idadeCliente >= 18;
         System.out.println("Maior de idade: " + eMaiorIdade);
       
        // O salário é exatamente igual a 3500.00?
        boolean salarioExato = salarioMensal == 3500.00;
        System.out.println("Salário é exatamente 3500: " + salarioExato);

        // O valor do empréstimo é maior do que 5 vezes o salário?
        boolean riscoAlto = valorEmprestimoSolicitado > 3500;
        System.out.println("Risco de inadimplência alto: " + riscoAlto);

        // O cliente tem estabilidade? (Mais de 6 meses no emprego atual)
        boolean temEstabilidade = mesesNoEmpregoAtual > 6;
        System.out.println("Possui estabilidade: " + temEstabilidade);

        // O cliente NÃO possui salário de 1000.00?
        boolean salarioDiferenteMil = salarioMensal != 1000;
        System.out.println("Salário é diferente de 1000: " + salarioDiferenteMil);
    }
}