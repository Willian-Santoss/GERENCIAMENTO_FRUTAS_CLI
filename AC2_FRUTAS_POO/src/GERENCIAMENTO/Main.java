package GERENCIAMENTO;

import java.util.ArrayList; // Importa a classe ArrayList para gerenciar uma lista de frutas
import java.util.InputMismatchException; // Importa a exceção para lidar com entradas inválidas
import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class Main { // classe principal
    public static void main(String[] args) { // Método main para apresentar o resultado no console
        Scanner scanner = new Scanner(System.in); // objeto Scanner para o usuário entrar com uma informação
        ArrayList<String> frutas = new ArrayList<>(); // Cria uma lista para armazenar as frutas

        while (true) { // inicia um loop infinito para o menu de opções
            try {
                System.out.println("Escolha uma opcao:"); // exibe as opções do menu
                System.out.println("1. Adicionar uma fruta"); // opção 1
                System.out.println("2. Listar todas as frutas"); // opção 2
                System.out.println("3. Modificar uma fruta"); // opção 3
                System.out.println("4. Remover uma fruta"); // opção 4
                System.out.println("5. Sair"); // opção 5
                System.out.print("Opcao: "); // lê a opção para ficar organizado a próxima entrada de informação
                int opcao = scanner.nextInt(); // lê a opção escolhida pelo usuário
                scanner.nextLine(); // limpa o buffer do scanner após ler um número
                switch (opcao) { // switch para definir as opções que o usuário escolher
                    case 1: // case 1
                        System.out.print("Digite o nome da fruta para adicionar: "); // Solicita o nome da fruta
                        String novaFruta = scanner.nextLine(); // lê o nome da nova fruta
                        frutas.add(novaFruta); // adiciona a fruta à lista
                        System.out.println(novaFruta + " foi adicionada."); // Confirma que a fruta foi adicionada
                        break; // fecha a case
                    case 2: // case 2
                        System.out.println("Frutas: " + frutas); // exibe todas as frutas na lista
                        break; // fecha a case
                    case 3: // case 3
                        System.out.println("Digite o índice da fruta que deseja modificar: "); // Solicita o índice para modificação
                        int indiceModificar = scanner.nextInt(); // le o índice fornecido
                        scanner.nextLine(); // limpa o buffer do scanner
                        if (indiceModificar >= 0 && indiceModificar < frutas.size()) { // verifica se o índice é válido
                            System.out.println("Digite o novo nome da fruta: "); // solicita o novo nome da fruta
                            String frutaModificada = scanner.nextLine(); // le o novo nome da fruta
                            frutas.set(indiceModificar, frutaModificada); // modifica a fruta no índice especificado
                            System.out.println("Fruta do índice " + indiceModificar + " foi modificada para " + frutaModificada); // confirma a modificação
                        } else {
                            System.out.println("Índice inválido."); // mensagem para índice fora do limite
                        }
                        break; // fecha a case
                    case 4: // case 4
                        System.out.println("Digite o nome da fruta que deseja remover: "); // pede o nome da fruta que o usuário quer remover
                        String frutaRemover = scanner.nextLine(); // le o nome da fruta que o usuário quer remover
                        if (frutas.remove(frutaRemover)) { // tenta remover a fruta da lista
                            System.out.println(frutaRemover + " foi removida."); // confirma a remoção
                        } else {
                            System.out.println(frutaRemover + " não foi encontrada."); // informa se a fruta não foi encontrada
                        }
                        break; // fecha a case
                    case 5: // case 5 para sair do looping
                        System.out.println("Saindo..."); // informa que o programa será encerrado
                        scanner.close(); // fecha o objeto Scanner
                        return; // sai do método main, encerrando o programa
                    default: // default
                        System.out.println("Opcao invalida. Tente novamente."); // mensagem que é exibida para quando selecionar uma opção inexistente
                }
            } catch (InputMismatchException e) { // captura exceções de entrada inválidas
                System.out.println("Entrada invalida. Por favor, digite um numero."); // mensagem para entrada não existente
                scanner.nextLine(); // limpa o buffer do scanner
            }
        }
    }
}
