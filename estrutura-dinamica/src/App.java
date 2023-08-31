import java.util.ArrayList;  // Importando classe ArrayList e seus métodos

public class App {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();   // Criando a lista “nomes” 

        nomes.add("Victor");         //  Incluindo valores na lista através do método .add , para cada elemento um novo espaço é alocado na memória
        nomes.add("Barbara");
        nomes.add("Caio");
        nomes.add("Adriano");
        nomes.add("Mauricio");
        nomes.add("Zarate");
        nomes.add("Tadashi");
        nomes.add("Juliane");
        nomes.add("Viviane");
        nomes.add("José");
        nomes.add("João");
        nomes.add("Junior");
        nomes.add("Alessandra");
        nomes.add("Juliana");
        nomes.add("Gabriela");
        nomes.add("Luiza");
        nomes.add("Rodolfo");
        nomes.add("Renato");
        nomes.add("Laura");
        nomes.add("Mariana");
        nomes.add("Sandra");
        nomes.add("Roberta");
        nomes.add("Igor");
        nomes.add("Leandro");
        nomes.add("Miguel");
       

        for (String nome : nomes) {
            System.out.println(nome);  //  Saída de dados
        }
    }
}
