package aula04;

public class Aula04 {

    public static void main(String[] args) {
        //new caneta que está relacionado na classe
        
        /*Caneta c1 = new Caneta();
        c1.status();*/
        //Quando tem o metodo construtor, pode fazer esse codigos acima apenas
        
        Caneta c1 = new Caneta("Nic", "Amarelo", 0.4f);//Caso usar o parametro no metodo construtor
        c1.status();                                   //utilizar os atributos no parametro.
        
        Caneta c2 = new Caneta ("Bugrao", "verde", 1.0f);
        c2.status();
        
        //chamar o metodo
        /*c1.setModelo("Bic");
        //c1.modelo = "Bic";
       
        c1.setPonta(0.8f);
        //c1.ponta = 0.5f; Se a caneta for privada, esse codigo não vai aceitar. Apenas publico
        
        //se não colocar o status ou system, a saída estará em branco 
        //c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + 
         c1.getPonta());//Se for privado, usa o getModelo para executar*/
    }  
}
