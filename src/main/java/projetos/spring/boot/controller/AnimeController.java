package projetos.spring.boot.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetos.spring.boot.domain.Anime;
import projetos.spring.boot.service.AnimeService;
import projetos.spring.boot.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;
//ENDPOINT

@RestController//ANOTAÇÃO O RETORNO QUE TEREMOS NESTA CLASSE SERÃO APENAS STRINGS(TODOS OS METODOS IRAM CHAMR O @RESPONSEBODY)
@RequestMapping("animes")//FAZ QUE O ENDIPOIT TODOS ACESSEM ATRAVES DO localhost:8080/anime/list //A APLICAÇÃO @RestController IRÁ PROCURAR O ENDPOINT PARA LISTAR OS NOMES CRIADOS, PARA ISSO DEVE USAR O
@Log4j2
@RequiredArgsConstructor//ESTA ANOTAÇÃO CRIA UM CONSTRUTOR COM TODOS OS ATRIBUTOS RELACIONADOA A CLASSE QUE VOCE TEM, DEVE-SE ACRESCENTAR "final" DEPOIS DO private. pode usar também o @AllArgsConstructor sem ter que usar o "final"
public class AnimeController {
    //localhost:8080/anime/list
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public List<Anime> list() {//CRIAR UM MÉTODO QUE IRÁ RETORNAR UMA LISTA DE ANIMES
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return animeService.listAll();//AS INFORMAÇÕES DA LISTA FORAM PARA A CLASSE ANIMESERVICE, ESSA FUNÇÃO TRAZ A LISTA
    }
}