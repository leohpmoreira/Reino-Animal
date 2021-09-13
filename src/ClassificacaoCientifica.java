public class ClassificacaoCientifica {
    private String reino;
    private String filo;
    private String classe;
    private String ordem;
    private String familia;
    private String genero;
    private String especie;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void print() {
        System.out.println("\nReino: " + getReino() +
                "\nFilo: " + getFilo() +
                "\nClasse: " + getClasse() +
                "\nOrdem: " + getOrdem() +
                "\nFamília: " + getFamilia() +
                "\nGênero: " + getGenero() +
                "\nEspécie: " + getEspecie() +
                "\nNome: " + getNome());
    }
}

