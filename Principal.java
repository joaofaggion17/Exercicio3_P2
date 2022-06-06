public class Principal {

    public static void main(String [] args){
        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoa.setNome("João");
        pessoa.setEndereco("Rua Eduardo Peixoto Sampaio");
        pessoaFisica.setCPF("450.423.188-36");
        pessoaJuridica.setCNPJ("19.909.197/0013-01");

        System.out.println("Nome: " + pessoa.Nome);
        System.out.println("Endereço: " + pessoa.Endereco);
        System.out.println("CPF: " + pessoaFisica.CPF);
        System.out.println("CNPJ: " + pessoaJuridica.CNPJ);





    }
    
}