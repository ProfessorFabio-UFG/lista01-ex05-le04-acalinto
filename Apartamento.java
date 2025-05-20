import Morador;

public class Apartamento {
    private int numero, andar;
    private double metragem;
    private String situacao;
    private ArrayList<MoradorEncapsulado> moradores;

    public Apartamento() {
        moradores = new ArrayList<>();
    }

    public void adicionarMorador(MoradorEncapsulado m) {
        moradores.add(m);
    }

    public void listarMoradores() {
        for (MoradorEncapsulado m : moradores) {
            System.out.println("Morador: " + m.getNome() + ", Código: " + m.getCodigoSequencial());
        }
    }
}
