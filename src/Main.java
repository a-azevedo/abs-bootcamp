import br.com.dominio.Bootcamp;
import br.com.dominio.Curso;
import br.com.dominio.Dev;
import br.com.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso Java");
        curso.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(70);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Aelmajan");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos Inscritos " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularXP());

        System.out.println("---------------------------------------------------------------------------------");
        Dev dev2 = new Dev();
        dev.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Inscritos " + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXP());



        //System.out.println(curso);
        //System.out.println(mentoria);
    }
}
