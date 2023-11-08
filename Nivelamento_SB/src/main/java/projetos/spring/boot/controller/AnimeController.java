package projetos.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetos.spring.boot.domain.Anime;

import java.util.List;
//ENDPOINT

@RestController//ANOTAÇÃO O RETORNO QUE TEREMOS NESTA CLASSE SERÃO APENAS STRINGS(TODOS OS METODOS IRAM CHAMR O @RESPONSEBODY)
@RequestMapping("anime")//FAZ QUE O ENDIPOIT TODOS ACESSEM ATRAVES DO localhost:8080/anime/list //A APLICAÇÃO @RestController IRÁ PROCURAR O ENDPOINT PARA LISTAR OS NOMES CRIADOS, PARA ISSO DEVE USAR O
public class AnimeController {
    //localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> list() {//CRIAR UM MÉTODO QUE IRÁ RETORNAR UMA LISTA DE ANIMES
        return List.of(new Anime("007"), new Anime("CVZ"), new Anime("Liga da Bagaça"));//INSTANCIOU A CLASSE ANIME PARA CRIAR A LISTA, E INSERE OS NOMES
    }
}
