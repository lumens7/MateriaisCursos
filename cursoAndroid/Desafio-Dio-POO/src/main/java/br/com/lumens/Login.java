package br.com.lumens;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Login {
    public void login() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Seja bem-vindo à plataforma Lumens!");
        while (true) {
            System.out.println("Deseja " +
                    "\n\t1 - Cadastrar um novo usuário " +
                    "\n\t2 - Entrar com um existente " +
                    "\n\t3 - Sair");
            String resposta = scan.next();
            if (resposta.equalsIgnoreCase("cadastrar") || resposta.contains("1")) {
                System.out.println("Deseja realizar cadastro como " +
                        "\n\t1 - Dev" +
                        "\n\t2 - Administrador");
                resposta = scan.next();
                if (resposta.equalsIgnoreCase("dev") || resposta.equals("1")) {
                    System.out.println("Informe os dados para cadastrar o dev: NOME");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    System.out.println("CPF");
                    int cpf = scan.nextInt();

                    Dev dev = new Dev(nome, cpf);
                    dev.cadastrarDev(dev);
                    menuDev(dev);
                } else if (resposta.equalsIgnoreCase("administrador") || resposta.equals("2")) {
                    System.out.println("Informe os dados para cadastrar o administrador: NOME ");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    System.out.println("Número da Carteira");
                    int numCarteira = scan.nextInt();

                    Administrador adm = new Administrador(nome, numCarteira);
                    adm.cadastrarAdm(adm);
                    menuAdm();
                } else {
                    System.out.println("Opção inválida. Favor insira uma opção válida.");
                }
            } else if (resposta.equalsIgnoreCase("entrar") || resposta.equals("2")) {
                System.out.println("Deseja entrar em uma conta de " +
                        "\n\t1 - Dev" +
                        "\n\t2 - Administrador");
                resposta = scan.next();
                if (resposta.equalsIgnoreCase("dev") || resposta.equals("1")) {
                    System.out.println("Informe os dados para login: NOME");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    System.out.println("CPF");
                    int cpf = scan.nextInt();

                    Dev dev = new Dev(nome, cpf);
                    dev.verificaLoginDev(dev);
                    menuDev(dev);
                } else if (resposta.equalsIgnoreCase("administrador") || resposta.equals("2")) {
                    System.out.println("Informe os dados para login: NOME");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    System.out.println("Número da Carteira");
                    int numCarteira = scan.nextInt();
                    Administrador adm = new Administrador(nome, numCarteira);
                    adm.verificaLoginAdm(adm);
                    menuAdm();
                } else {
                    System.out.println("Opção inválida. Favor insira uma opção válida.");
                }
            } else if (resposta.equalsIgnoreCase("sair") || resposta.equals("3")) {
                System.out.println("Obrigado por utilizar nosso sistema.");
                break;
            } else {
                System.out.println("Opção inválida. Favor escolha uma opção válida.");
            }
        }
        scan.close();
    }

    public void menuAdm() {
        Scanner s = new Scanner(System.in);
        Mentoria mentoria = null;
        Curso curso = null;
        while (true) {
            System.out.println("\t\tMenu Administrador" +
                    "\n\t1 - Cadastrar mentoria" +
                    "\n\t2 - Cadastrar Curso" +
                    "\n\t3 - Cadastrar Bootcamp" +
                    "\n\t4 - Sair");
            int resposta = getIntInput(s, "Opção");
            if (resposta == 1) {
                System.out.println("Informe os dados para cadastrar uma mentoria: título, descrição");
                s.nextLine();
                String tituloMentoria = s.nextLine();
                String descricaoMentoria = s.nextLine();
                mentoria = new Mentoria(tituloMentoria, descricaoMentoria);
                mentoria.cadastroConteudo(mentoria);
            } else if (resposta == 2) {
                System.out.println("Informe os dados para cadastrar um curso: título, descrição, carga horária");
                s.nextLine();
                String tituloCurso = s.nextLine();
                String descricaoCurso = s.nextLine();
                int cargaHoraria = getIntInput(s, "Carga Horária");
                curso = new Curso(tituloCurso, descricaoCurso, cargaHoraria);
                curso.cadastroConteudo(curso);
            } else if (resposta == 3) {
                System.out.println("Informe os dados para cadastrar um bootcamp: nome, descrição");
                s.nextLine();
                String nome = s.nextLine();
                String descricao = s.nextLine();
                Bootcamp bootcamp = new Bootcamp(nome, descricao);
                bootcamp.cadastroBootcamp(bootcamp);
                System.out.println("Deseja adicionar um curso ou mentoria?");
                String resp = s.next();
                if (resp.equalsIgnoreCase("curso")) {
                    System.out.println("Cursos disponíveis:");

                    curso.conteudosCadastrados();
                    System.out.println("Escolha o índice do curso que deseja adicionar:");
                    int indice = getIntInput(s, "Índice");
                    List<Conteudo> listaCursos = new ArrayList<>(curso.getConteudos());
                    if (indice > 0 && indice <= listaCursos.size()) {
                        bootcamp.adicionarConteudo(listaCursos.get(indice - 1));
                    } else {
                        System.out.println("Índice inválido.");
                    }
                } else if (resp.equalsIgnoreCase("mentoria")) {
                    System.out.println("Mentorias disponíveis:");


                    int i = 1;
                    for (Conteudo mentoria1 : mentoria.getConteudos()) {
                        System.out.println(i + "-titulo: "+mentoria1.getTitulo()+ " descricao: "+ mentoria1.getDescricao());
                        i++;
                    }

                    System.out.println("Escolha o índice da mentoria que deseja adicionar:");
                    int indice = getIntInput(s, "Índice");
                    List<Conteudo> listaMentorias = new ArrayList<>(mentoria.getConteudos());
                    if (indice > 0 && indice <= listaMentorias.size()) {
                        bootcamp.adicionarConteudo(listaMentorias.get(indice - 1));
                    } else {
                        System.out.println("Índice inválido.");
                    }
                } else {
                    System.out.println("Opção inválida.");
                }
                bootcamp.bootcampsCadastrados();
            } else if (resposta == 4) {
                System.out.println("Voltando para a página de login!");
                break;
            } else {
                System.out.println("Opção inválida. Favor escolha uma opção válida.");
            }
        }
    }


    public void menuDev(Dev dev) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\t\tMenu Dev" +
                    "\n\t1 - Entrar em um bootcamp" +
                    "\n\t2 - Concluir Atividade do bootcamp" +
                    "\n\t3 - Finalizar bootcamp" +
                    "\n\t4 - Sair");
            int resposta = getIntInput(s, "Opção");
            if (resposta == 1) {
                System.out.println("Bootcamps disponíveis");
                Bootcamp bootcamp = new Bootcamp();
                bootcamp.bootcampsCadastrados();
                System.out.println("Qual bootcamp deseja entrar?");
                resposta = getIntInput(s, "Opção");
                bootcamp = bootcamp.escolherBootcamp(resposta);
                dev.inscreverBootcamp(bootcamp);
            } else if (resposta == 2) {
                dev.progredir();
            } else if (resposta == 3) {
                Bootcamp bootcamp = new Bootcamp();
                bootcamp.bootcampsCadastrados();
                System.out.println("Qual bootcamp deseja concluir?");
                resposta = getIntInput(s, "Opção");
                bootcamp = bootcamp.escolherBootcamp(resposta);
                dev.setConteudosConcluidos(bootcamp.getConteudos());
            } else if (resposta == 4) {
                System.out.println("Voltando para a página de login!");
                break;
            } else {
                System.out.println("Opção inválida. Favor escolha uma opção válida.");
            }
        }
    }

    private int getIntInput(Scanner scanner, String campo) {
        int valor = -1;
        while (true) {
            try {
                System.out.println("Informe o valor de " + campo + ":");
                valor = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.nextLine();  // Limpar o buffer
            }
        }
        return valor;
    }
}
