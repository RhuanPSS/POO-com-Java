package br.inatel.poo.turmas;

public class Turma {
    private int quantAlunos;
    public Aluno [] alunos  = new Aluno[30];

    public void addAluno(Aluno aluno) {
        this.alunos[quantAlunos] = aluno;
        quantAlunos++;
    }

    public void listAlunos() {
        for (int i = 0; i < quantAlunos; i++) {
            System.out.println("Aluno " + i + ":");
            this.alunos[i].mostraInf();
            System.out.println('\n');
        }
    }

    public Aluno melhorAluno() {
        Aluno ret = null;
        double maxn = 0.0;
        for (int i = 0; i < quantAlunos; i++) {
            double cur = this.alunos[i].calcMedia();
            if (maxn < cur) {
                maxn = cur;
                ret = this.alunos[i];
            }
        }
        return ret;
    }

    public int getQuantAlunos() {
        return this.quantAlunos;
    }
    public void setQuantAlunos(int qntAlunos) {
        this.quantAlunos = qntAlunos;
    }
}