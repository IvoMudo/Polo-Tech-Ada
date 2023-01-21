package Desenvolvimento;

public class Backend extends Desenvolvedor{
    private String database;
    public Backend() {
    }

    public Backend(String nome, String database) {
        super(nome);
        this.database = database;
    }
    
}
