import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        System.out.println("***** pessoaFisica *****");
        pessoaFisica.setName("Dowglas");
        pessoaFisica.setAge("23");
        pessoaFisica.setCpf("04882985047");
        System.out.println("nome: " + pessoaFisica.getName());
        System.out.println("idade: " + pessoaFisica.getAge());
        System.out.println("cpf: " + pessoaFisica.getCpf());

        System.out.println(" ");

        System.out.println("***** pessoaJuridica *****");
        pessoaJuridica.setName("Paulinho Loko");
        pessoaJuridica.setAge("146");
        pessoaJuridica.setCnpj("38.472.653/0001-46");
        System.out.println("nome: " + pessoaJuridica.getName());
        System.out.println("idade: " + pessoaJuridica.getAge());
        System.out.println("cnpj: " + pessoaJuridica.getCnpj());


    }
}