/*package anotacoes.atualizacoes;
public class Anotacoes {
package projetos.spring.boot.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetos.spring.boot.domain.Anime;
import projetos.spring.boot.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;


@RestController//ANOTAÇÃO O RETORNO QUE TEREMOS NESTA CLASSE SERÃO APENAS STRINGS(TODOS OS METODOS IRAM CHAMR O @RESPONSEBODY)
@RequestMapping("anime")//FAZ QUE O ENDIPOIT TODOS ACESSEM ATRAVES DO localhost:8080/anime/list //A APLICAÇÃO @RestController IRÁ PROCURAR O ENDPOINT PARA LISTAR OS NOMES CRIADOS, PARA ISSO DEVE USAR O
@Log4j2
public class AnimeController {
    @Autowired//NÃO É O RECOMENDADO, É INJEÇÃO DE DEPENDENCIA VIA CAMPO DA CLASSE PARA SUBSITUIR O CONSTRUTOR - PARA FUNCIONAR, DEVE IR NA CLASSE QUE RELACIONADA E FAZER A APLICAÇÃO @Componnet, @Service ou @Repository
    private DateUtil dateUtil;
    @GetMapping(path = "list")
    public List<Anime> list() {//CRIAR UM MÉTODO QUE IRÁ RETORNAR UMA LISTA DE ANIMES
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("007"), new Anime("CVZ"), new Anime("Liga da Bagaça"));//INSTANCIOU A CLASSE ANIME PARA CRIAR A LISTA, E INSERE OS NOMES
    }
}
}*/