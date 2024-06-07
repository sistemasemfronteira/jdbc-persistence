/**
 * CRUD simples e prático feito em JDBC (Para ser usado como exemplo)
 * Diferente de certos lugares que ficam inventando "firulinha" para mudar 
 * o que realmente funciona.
 * 
 * Criado por Iago H. L. de Souza
 * 
 * Obs.: As versões das dependencias utilizadas neste simples exemplo estão no
 * leia-me.txt dentro do diretorio principal do código.
 */

package com.example;

import java.util.List;

import com.example.dao.UserDao;
import com.example.model.User;

public class App {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // Create
        User newUser = new User();
        newUser.setName("Iago");
        newUser.setEmail("iago@example.com");
        userDao.addUser(newUser);
        System.out.println("Usuário adicionado.");

        // Read
        List<User> users = userDao.getAllUsers();
        System.out.println("Todos os usuários:");
        for (User user : users) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }

        // Update
        User existingUser = users.get(0);
        existingUser.setName("Iago Updated");
        existingUser.setEmail("iago.updated@example.com");
        userDao.updateUser(existingUser);
        System.out.println("Usuário atualizado.");

        // Read by ID
        User userById = userDao.getUserById(existingUser.getId());
        System.out.println("ID de usuário:");
        System.out.println(userById.getName() + " - " + userById.getEmail());

        // Delete
        userDao.deleteUser(existingUser.getId());
        System.out.println("Usuário deletado.");

        // Verify Deletion
        users = userDao.getAllUsers();
        System.out.println("Todos os usuários após deletar:");
        for (User user : users) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }
}
