package projetos.spring.boot.start;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/*NESTA CLASSE É ESTRUTURADO toddo programa java*/

@EnableAutoConfiguration//RESPONSÁVEL POR INICIAR AS APLICAÇÕES
@ComponentScan(basePackages = "projetos.spring.boot")//É COLOCADO NO PARAMETRO O NOME DO PACOTE QUE DESEJA ACESSAR E CONTROLAR
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);//foi chamado um método pra identificar que essa classe é frameWork rodando Spring
    }
}