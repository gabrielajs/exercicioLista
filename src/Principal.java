import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes);

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        nomes.remove(4);
        nomes.remove("João");
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean searchJuliano = nomes.contains("Juliano");
        if(searchJuliano){
            System.out.println("Na lista com o nome pesquisado");
        } else{
            System.out.println("Não foi encontrado");
        }

        nomes.add("Ismael");
        nomes.add("Rodrigo");

        Collections.sort(nomes);
        System.out.println(nomes);

        Boolean estaVazio = nomes.isEmpty();
        System.out.println(estaVazio);


    }
}
