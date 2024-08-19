import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Angular.js");
        curso.setDescricao("Descrição curso Angular.js");
        curso.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria curso Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("JAVA stream");
        bootcamp.setDescricao("Descrição Bootcamp Java Stream");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("serginho");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos Concluídos: " + dev.getConteudosConcluidos());

    }
}