package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {
        int i;

//        Variável repetida não deve ocorrer;
//        int i;
        int I;

//        Não se pode começar a variável com números;
//        int 1a;

//        Apesar de não da IDE não reclamar sobre isso, não é uma boa pratica colocar "$" e "_" nas variáveis;
//        (Existem casos onde o "_" é utilizado nas variáveis);
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int J = 10;

//        Não se pode alterar uma variável constante (final);
//        J = 15;
        int asrn2467md;

//        Não se deve utilizar espaços no meio de um nome de variável;
//        int asrn24 67md;
        int asrn2467_md = 10;

//        Existem uma série de caracteres que são proibidos de utilizar nas variáveis;
//        int asrn24%67_md = 10;

        asrn2467md = 100;
        asrn2467_md = 10;

        int quantidadeProduto = 50;

//        Uma boa pratica para as nomear as variáveis é utilizar o conceito de camelo;
//        Onde a primeira letra de cada palavra comece com uppercase;
//        int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;

//        Não é uma boa pratica utilizar o conceito de camelo nas variáveis constantes;
//        Para esse caso, utilizar todas as letras uppercase;
//        final int numeroTentativas = 5;

//        Não é uma boa pratica utilizar todas as letras em uppercase quando a variável não é do tipo final;
//        int QUANTIDADE_OPCOES = 25;

//        Uma boa pratica é colocar uma boa expressividade das variáveis, dando um sentido bem claro em cada uma;
//        int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(J);
        System.out.println(asrn2467md);
        System.out.println(asrn2467_md);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);


    }
}
