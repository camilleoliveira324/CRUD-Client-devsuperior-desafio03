package com.devsuperior.clientesCrud.dto;

import com.devsuperior.clientesCrud.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @Size(min = 1, max = 80, message = "Nome precisa ter de 1 a 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;

    @Size(min = 11, max = 11, message = "CPF's precisam ter 11 caracteres")
    @NotBlank(message = "Campo requerido")
    private String cpf;

    @NotNull(message = "Se não tiver renda digite 0")
    private Double income;

    @PastOrPresent(message = "Deve ser uma data no passado ou no dia de hoje")
    @NotNull(message = "Campo requerido")
    private LocalDate birthDate;

    @NotNull(message = "Se não tiver filhos digite 0")
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.income = client.getIncome();
        this.birthDate = client.getBirthDate();
        this.children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
