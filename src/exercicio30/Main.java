package exercicio30;

import java.util.ArrayList;
import java.util.List;

public class Main implements FiltroNome{
    static void main() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Amanda");
        nomes.add("Beatriz");
        Filtro comecaComA = nome -> nome.startsWith("A");
        nomes.stream().filter(n -> comecaComA.testar(n)).forEach(nome -> System.out.println(nome));
    }
}
