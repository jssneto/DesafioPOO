import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(5);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devCamila.getConteudosConcluidos());

        System.out.println("XP: " + devCamila.calcularTotalXp());



        System.out.println("----------");



        Dev devNeto = new Dev();
        devNeto.setNome("Neto");
        devNeto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devNeto.getConteudosInscritos());

        devNeto.progredir();
        devNeto.progredir();
        devNeto.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devNeto.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devNeto.getConteudosConcluidos());

        System.out.println("XP: " + devNeto.calcularTotalXp());



    }
}
