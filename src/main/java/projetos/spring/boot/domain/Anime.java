package projetos.spring.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
//ESTA CLASSE SERA O DOMINIO,
@Data
@AllArgsConstructor
public class Anime {
    private long id;
    private String name;
}