package projetos.spring.boot.repository;

import projetos.spring.boot.domain.Anime;

import java.util.List;
//ESTA CLASSE SERA A CONEXÃO COM O BANCO DE DADOS

public interface AnimeRepository {
    List<Anime> listAll();
}
