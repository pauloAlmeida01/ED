public class Teste {
    public static void main(String[] args) {
        Ministerio ministerio = new Ministerio();
        Agencia agencia = new Agencia();
        Medico medico = new Medico(10000, "123456", "Cardiologista");
        Professor professor = new Professor(5000, "Matematica", 2);
        Programador programador = new Programador(5000, "Java");
        ministerio.addClt(medico);
        ministerio.addClt(professor);
        agencia.addProfissao(programador);
        agencia.addProfissao(medico);
        agencia.addProfissao(professor);

        medico.trabalhar();
        medico.trabalhar();
        professor.trabalhar();
        professor.trabalhar();
        programador.trabalhar();
        programador.trabalhar();
        System.out.println(programador);
        System.out.println("------------------------------------");
        System.out.println("Ministerio");
        System.out.println("------------------------------------");
        ministerio.exibeTodos();
        System.out.println("Imposto total: " + ministerio.calcularImposto());

        System.out.println("-----------------------------------");
        System.out.println("Agencia");
        System.out.println("-----------------------------------");
        agencia.exibeTodos();
        System.out.println("Total de salarios: " + agencia.calcularTotalSalario());
    }
}
