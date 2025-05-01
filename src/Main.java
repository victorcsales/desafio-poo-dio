import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScrit");
        curso2.setDescricao("descrição curso javaScrit");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria curso java");
        mentoria1.setDescricao("descrição mentoria curso java");
        mentoria1.setData(LocalDate.now());

        /*Conceito de polimorfismo.
        Conteudo conteudo1 = new Mentoria();
        Conteudo conteudo2 = new Curso();*/

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDesricao("Descriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Victor: " + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Victor: " + devVictor.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Victor: " + devVictor.getConteudosConcluidos());
        System.out.println("XP: "+devVictor.calcularTotalXp());

        System.out.println("---------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());


    }
}
