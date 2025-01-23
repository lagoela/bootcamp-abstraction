package com.lagoela;

import com.lagoela.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso poo = new Curso();

        poo.setTitulo("Curso de Programacao Orientada a Objetos");
        poo.setDescricao("Curso para aprendizado de programacao orientada a objetos em Java");
        poo.setCargaHoraria(1);

        Curso collections = new Curso();

        collections.setTitulo("Curso de Collections");
        collections.setDescricao("Curso para utilizacao de collections em Java");
        collections.setCargaHoraria(1);

        Mentoria mentoriaJs = new Mentoria();
        mentoriaJs.setTitulo("Usando promises em javascript");
        mentoriaJs.setDescricao("Aprenda a usar promises e trabalhar assincronamente com Js");
        mentoriaJs.setDataDeInicio(LocalDate.now());

        System.out.println(poo);
        System.out.println(collections);

        System.out.println(mentoriaJs);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescription("Descricao teste Bootcamp Java Developer");
        bootcamp1.getConteudos().add(poo);
        bootcamp1.getConteudos().add(collections);
        bootcamp1.getConteudos().add(mentoriaJs);

        Dev devEnzo = new Dev();
        devEnzo.setNome("Enzo");
        devEnzo.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos do Dev Enzo " + devEnzo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos do Dev Enzo " + devEnzo.getConteudosConcluidos());

        System.out.println("Dev " + devEnzo.getNome() + " progrediu.");
        devEnzo.progredir();

        System.out.println("Conteúdos Inscritos do Dev Enzo " + devEnzo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos do Dev Enzo " + devEnzo.getConteudosConcluidos());
        System.out.println("O Xp do dev " + devEnzo.getNome() + " é: " + devEnzo.calcularTotalXp());

    }
}