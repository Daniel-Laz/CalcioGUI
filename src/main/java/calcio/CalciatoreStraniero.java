package calcio;

public class CalciatoreStraniero extends Calciatore{
    private String nazionalita;

    public CalciatoreStraniero(){
        super();
    }
    public CalciatoreStraniero(String name, int goal, boolean capitano, String nazionalita){
        super(name, goal, capitano);
        this.nazionalita=nazionalita;
    }

    public void setNazionalita(String nazionalita){
        this.nazionalita=nazionalita;
    }
    public String getNazionalita(){
        return nazionalita;
    }
    
    public String toString(){
        if (super.isCapitano()==true){
            return "nome: "+super.getName()+" nazionalità: "+nazionalita+" goal: "+super.getGoal()+" - è capitano";
        }else{
            return "nome: "+super.getName()+" nazionalità: "+nazionalita+" goal: "+super.getGoal();
        }
    }


}
