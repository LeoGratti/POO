package aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    public String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p){ //Este é o método construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        //this.setPonta(p); Se usar this.setPonta ou ponta, as duas vai funcionar da mesma maneira
        this.tampar();
        //this.cor = "Azul"; quando estiver string dentro do paramentro, retira o codigo
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
       public String getCor(){
        return cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
     public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a caneta:");
        //System.out.println("Modelo: " + this.modelo);
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
