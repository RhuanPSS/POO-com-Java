package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double [] notas = new double[3];

    public double calcMedia() {
        double ret = 0.0;
        for (int i = 0; i < this.notas.length; i++) ret += this.notas[i];
        return ret / this.notas.length;
    }

    public void mostraInf() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.print("Notas: ");

        for (int i = 0, flag = 0; i < this.notas.length; i++) {
            if (flag == 0) flag = 1;
            else System.out.print(", ");
            System.out.print(this.notas[i]);
        }
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double [] getNotas() {
        return this.notas;
    }
    public void setNotas(double [] notas) {
        this.notas = notas;
    }
}