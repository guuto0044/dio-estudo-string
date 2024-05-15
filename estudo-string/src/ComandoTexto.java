public class ComandoTexto {
    public static void main(String[] args) throws Exception {
        String nome = "Augusto ";
        
        String sobreNome= "Souza";

        String nomeCompleto = nome + sobreNome;

        if (nome.equals(sobreNome)) {

            System.out.print("Nome e apelido são iguais!");
        }
        else if (nome!=sobreNome) {
            System.out.print("Não são iguais");
        }
        

        System.out.println((" :"));

        System.out.print(nomeCompleto);

    }
}
