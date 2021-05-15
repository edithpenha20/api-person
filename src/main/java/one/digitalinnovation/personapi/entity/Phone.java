package one.digitalinnovation.personapi.entity;

import lombok.*;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data  //Cria getters e setters automaticamente
@Builder  //Cria um padrão de projetos para a construcao de objetos
@AllArgsConstructor  //Insere os construtors
@NoArgsConstructor   ///Insere os construtores
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
