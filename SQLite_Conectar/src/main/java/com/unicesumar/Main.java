package com.unicesumar;

import com.unicesumar.entities.Product;
import com.unicesumar.entities.User;
import com.unicesumar.repository.ProductRepository;
import com.unicesumar.repository.UserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ProductRepository listaDeProdutos = null;
        UserRepository listaDeUsuarios = null;
        Connection conn = null;
        
        // Parâmetros de conexão
        String url = "jdbc:sqlite:database.sqlite";

        // Tentativa de conexão
        try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
                listaDeProdutos = new ProductRepository(conn);
                listaDeUsuarios = new UserRepository(conn);
            } else {
                System.out.println("Falha na conexão.");
                System.exit(1);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n---MENU---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Cadastrar Usuário");
            System.out.println("4 - Listar Usuários");
            System.out.println("5 - Buscar Usuário pelo UUID");
            System.out.println("6 - Deletar Usuário");
            System.out.println("7 - Sair");
            System.out.println("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cadastrar Produto");
                    listaDeProdutos.save(new Product("Teste", 10));
                    listaDeProdutos.save(new Product("Computador", 3000));
                    break;
                case 2:
                    System.out.println("Listar Produtos");
                    List<Product> products = listaDeProdutos.findAll();
                    products.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Cadastrar Usuário");
                    listaDeUsuarios.save(new User("Helo", "123", "helo@gmail.com"));
                    listaDeUsuarios.save(new User("Carlos Eduardo", "1234", "carlos@gmail.com"));
                    listaDeUsuarios.save(new User("admin", "admin", "admin@gmail.com"));
                    System.out.println("Cadastrado com sucesso!");
                    break;
                case 4:
                    System.out.println("Listar Usuários");
                    List<User> users = listaDeUsuarios.findAll();
                    users.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Buscar Usuário pelo UUID");
                    System.out.println("Digite o UUID: ");
                    scanner.nextLine();
                    String buscarUser = scanner.nextLine();

                    try {
                        UUID uuid = UUID.fromString(buscarUser);
                        Optional<User> userOptional = listaDeUsuarios.findById(uuid);

                        if (userOptional.isPresent()){
                            System.out.println("Usuário encontrado: " + userOptional.get());
                        } else {
                            System.out.println("Usuário não encontrado.");
                        }
                    } catch (IllegalArgumentException e){
                        System.out.println("UUID inválido.");
                    }
                    break;
                case 6:
                    System.out.println("Deletar Usuário\n");
                    System.out.println("Digite o UUID do usuário a ser deletado: ");
                    scanner.nextLine();
                    String deletarUser = scanner.nextLine();

                    try{
                        UUID uuid = UUID.fromString(deletarUser);
                        listaDeUsuarios.deleteById(uuid);
                        System.out.println("Usuário deletado com sucesso!");
                    } catch (IllegalArgumentException e){
                        System.out.println("UUID inválido.");
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }

        } while (option != 7);

        scanner.close();
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
