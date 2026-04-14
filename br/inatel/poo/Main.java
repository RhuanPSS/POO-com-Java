package br.inatel.poo;

import br.inatel.poo.turmas.Turma;
import br.inatel.poo.turmas.Aluno;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        Aluno c = new Aluno();

        a.setNome("nome a");
        a.setMatricula("matricula a");
        double [] notaA = {1.5, 3, 5.5};
        a.setNotas(notaA);

        b.setNome("nome b");
        b.setMatricula("matricula b");
        double [] notaB = {1.66667, 3.5, 7.777};
        b.setNotas(notaB);

        c.setNome("nome c");
        c.setMatricula("matricula c");
        double [] notaC = {8.8, 10, 5};
        c.setNotas(notaC);

        turma.addAluno(a);
        turma.addAluno(b);
        turma.addAluno(c);

        turma.listAlunos();

        Aluno melhor = turma.melhorAluno();
        System.out.println("O melhor aluno é: " + melhor.getNome());
        System.out.println("Sua nota é: " + melhor.calcMedia());
    }
}