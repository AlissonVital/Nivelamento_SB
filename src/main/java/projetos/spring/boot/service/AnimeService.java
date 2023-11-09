package projetos.spring.boot.service;

import org.springframework.stereotype.Service;
import projetos.spring.boot.domain.Anime;

import java.util.List;

//CLASSE RESPONSAVEL PELA REGRA DE NEGÓCIO E A LÓGICA
@Service
public class AnimeService {

    public List<Anime> listAll() {
        return List.of(new Anime(1L, "Nóis Stóra!!!"), new Anime(2L,"CVZ"), new Anime(3L, "Liga da Bagaça"), new Anime(4L, "The Walking Dead"));
    }
}
