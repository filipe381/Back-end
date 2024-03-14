package br.com.ibmec.backend.cadastrocliente.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity(name="tbl_cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    @NotBlank(message = "campo nome é obrigatório")
    private String nome;

    @Column
    @NotBlank(message = "campo email é obrigatório")
    @Email
    private String email;

    @Column
    @NotBlank(message = "campo cpf é obrigatório")
    private String cpf;

    @Column
    @NotBlank(message = "campo Data de nascimento é obrigatório")
    private String dataNascimento;
}
