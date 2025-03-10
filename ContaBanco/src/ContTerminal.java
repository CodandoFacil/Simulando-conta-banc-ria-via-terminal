import java.util.Scanner;

public class ContTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        ContTerminal c1 = new ContTerminal();

        System.out.print("Digite o número da sua conta: ");
        c1.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.print("Digite o número da agência: ");
        c1.setAgencia(sc.nextLine());
        System.out.print("Digite o nome do cliente: ");
        c1.setNomeCliente(sc.nextLine());
        System.out.print("Digite o saldo inicial da conta: R$ ");
        c1.setSaldo(sc.nextDouble());
        System.out.println("Olá, " + c1.getNomeCliente() + "! Obrigado por criar uma conta em nosso banco, sua agência é " + c1.getAgencia() + ", conta " + c1.getNumero() + " e seu saldo R$ " + c1.getSaldo() +" já está disponível para saque!");
    }

}
