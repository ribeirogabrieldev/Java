package Trabalho1;

public class Navio extends Transporte{

    private String tamanho;
    private Boolean bote_sv;
    private int durabilidade;

    public Navio(String tipo, String trafego, int velocidade_max, String combustivel, int qtd_combustivel, String tamanho, Boolean bote_sv, int durabilidade){
        super(tipo, trafego, velocidade_max, combustivel, qtd_combustivel);
        this.tamanho = tamanho;
        this.bote_sv = bote_sv;
        this.durabilidade = durabilidade;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public Boolean getBote_sv(){
        return bote_sv;
    }

    public void setBote_sv(Boolean bote_sv){
        this.bote_sv = bote_sv;
    }

    public int getDurabilidade(){
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade){
        this.durabilidade = durabilidade;
    }
    
    public void info(){
        super.info();
        System.out.println("Tamanho: "+this.tamanho);
        System.out.println("Bote Salva Vida: "+this.tamanho);
        System.out.println("Durabilidade: "+this.durabilidade);
    }
}
