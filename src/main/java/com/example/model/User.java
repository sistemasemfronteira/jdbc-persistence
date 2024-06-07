/**
 * Vale lembrar que por via de regra todos os atributos de uma classe devem
 * estar escrito na língua inglêsa independente da língua utilizada nos dados
 * inseridos pelo usuário.
 */

package com.example.model;

public class User {
    private int id;
    private String name;
    private String email;

    // Getter para id
    public int getId() {
        return id;
    }

    // Setter para id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para name
    public String getName() {
        return name;
    }

    // Setter para name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }
}
