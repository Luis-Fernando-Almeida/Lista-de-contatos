        package Program;

        import Entities.Contato;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Locale;
        import java.util.Scanner;

        public class Application {
            public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);

                List<Contato> listaDeContatos = new ArrayList<>();

                boolean continuar = true;

                while (continuar) {
                    System.out.println("Digite o nome do novo contato: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o número do novo contato: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    listaDeContatos.add(new Contato(nome, numero));

                    System.out.println("Contato adicionado com sucesso!");
                    System.out.println("Contatos:");
                    for (Contato contato : listaDeContatos) {
                        System.out.println(contato);
                    }
                    System.out.println("----------------------------");

                    System.out.println("Digite 'adicionar', 'remover' ou 'sair': ");
                    String opcao = sc.nextLine();

                    if (opcao.equals("remover")) {
                        System.out.println("Digite o nome do contato que deseja remover");
                        String contatoARemover = sc.nextLine();
                        listaDeContatos.removeIf(contato -> contato.existeContato(contatoARemover));
                        System.out.println("Contato removido com sucesso!");
                        System.out.println("Contatos:");
                        for (Contato contato : listaDeContatos) {
                            System.out.println(contato);
                        }
                        System.out.println("----------------------------");
                        System.out.println("Digite 'adicionar', 'remover' ou 'sair': ");
                        opcao = sc.nextLine();

                    } else if (opcao.equals("sair")) {
                        continuar = false;
                    }
                    else {
                    System.out.println("Opção inválida. Digite 'adicionar', 'remover' ou 'sair'.");
                    opcao = sc.nextLine();
                }
                }
                sc.close();

            }
        }