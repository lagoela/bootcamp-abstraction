package com.lagoela;

import com.lagoela.domain.Curso;
import com.lagoela.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJs = new Curso();

        cursoJs.setTitulo("Curso de javascript");
        cursoJs.setDescricao("Curso para paginas dinamicas usando JS");
        cursoJs.setCargaHoraria(24);

        Curso cursoJava = new Curso();

        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Curso para criacao de back-end usando java");
        cursoJava.setCargaHoraria(36);

        Mentoria mentoriaJs = new Mentoria();
        mentoriaJs.setTitulo("Usando promises em javascript");
        mentoriaJs.setDescricao("Aprenda a usar promises e trabalhar assincronamente com Js");
        mentoriaJs.setDataDeInicio(LocalDate.now());

        System.out.println(cursoJs);
        System.out.println(cursoJava);

        System.out.println(mentoriaJs);

    }
}