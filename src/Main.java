import br.com.dio.desafiobootcamp.dominio.Bootcamp;
import br.com.dio.desafiobootcamp.dominio.Curso;
import br.com.dio.desafiobootcamp.dominio.Dev;
import br.com.dio.desafiobootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java para iniciantes");
        curso1.setDescricao("Conceitos iniciais sobre programação em Java.");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java intermediário / avançado");
        curso2.setDescricao("Curso complementar para programação em Java");
        curso2.setCargaHoraria(85);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como ser um programador em Java");
        mentoria.setDescricao("Dicas e orientações de quem já atua na área.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Torne-se um desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev1:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dev1:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Dev1:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev2:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dev2:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Dev2:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }
}
