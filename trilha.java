import java.util.ArrayList;
import java.util.Scanner;

public class trilha {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);

        int cidades = scan.nextInt();
        int nconexoes = scan.nextInt();
        String cidadeInicial = scan.next();
        String cidadeFinal = scan.next();
        Conexao[] conexoes = new Conexao[nconexoes];

        for (int i = 0; i < nconexoes; i++) {
            conexoes[i] = new Conexao(scan.next(), scan.next(), scan.nextInt());
        }

        /*System.out.printf("cidades: %d, nconexoes: %d, cidadeInicial: %s, cidadeFinal: %s\n", cidades, nconexoes, cidadeInicial, cidadeFinal);
        for (Conexao conexao : conexoes) {
            System.out.println(conexao);
        }*/

        ArrayList<Conexao> iniciais = new ArrayList<>();
        for (Conexao conexao : conexoes) {
            if (conexao.a.equals(cidadeInicial)) iniciais.add(conexao);
        }

        

        scan.close();
    }

    static class Conexao {
        public String a;
        public String b;
        public int distance;

        public Conexao(String a, String b, int distance) {
            this.a = a;
            this.b = b;
            this.distance = distance;
        }

        @Override
        public String toString() {
            return "A: " + a + "; B: " + b + "; dist: " + distance;
        }
    }
}