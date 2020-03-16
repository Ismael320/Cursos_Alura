package br.com.caelum.leilao.dominio;

class TesteDoAvaliador {

    public static void main(String[] args) {
        Usuario joao = new Usuario("Jo�o");
        Usuario jose = new Usuario("Jos�");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 3 Novo");

        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        System.out.println(leiloeiro.getMaiorLance()); // imprime 400.0
        System.out.println(leiloeiro.getMenorLance()); // INFINITY
    }
}