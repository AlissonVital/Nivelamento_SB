package projetos.spring.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
//NESTA CLASSE É ESTRUTURADO toddo programa java

@EnableAutoConfiguration//RESPONSÁVEL POR INICIAR AS APLICAÇÕES
@ComponentScan//NESTA ETAPA A CLASSE ApplicationStart FOI MOVIDA DO PACOTE LOCAL"START" E FOI MOVIDA PARA O PACOTE PRINCIPAL "projetos.spring.boot", POR ESSE MOTIVO, NÃO PRECISA COLOCAR O END DO PACOTE COMO PARAMETRO. LOGO ESSA APLICAÇÃO IRÁ SCANNEAR O PACOTE EM QUE ELE SE ENCONTRA
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);//foi chamado um método pra identificar que essa classe é frameWork rodando Spring
    }
}