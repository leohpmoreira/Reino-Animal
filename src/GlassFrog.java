public class GlassFrog extends Amphibian implements Animal {
    public GlassFrog() {
        this.setOrder("Anura");
        this.setFamily("Centrolenidae");
        this.setGenus("Centrolene");
        this.setSpecies("C. geckoidea");
        this.setName("Centrolene geckoidea");
    }

    @Override
    public void animalSound() {
        System.out.println("Ribbit-ribbit");
    }

    @Override
    public void print() {
        System.out.println("Kingdom: " + this.getKingdom() + "\nPhylum: " + this.getPhylum() + "\nClass: " +
                this.getClassis() + "\nOrder: " + this.getOrder() + "\nFamily: " + this.getFamily() + "\nGenus: "
                + this.getGenus() + "\nSpecies: " + this.getSpecies() + "\nName: " + this.getName());
    }
}
