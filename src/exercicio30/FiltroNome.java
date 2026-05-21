package exercicio30;

public interface FiltroNome {
    @FunctionalInterface
    interface Filtro {
        boolean testar(String nome);
    }
}
