package calcio;

public class Calciatore {

    // attributi
    private String name;
    private int goal;
    private boolean capitano;

    public boolean equals(Calciatore c){
        if(this.name.equals(c.name) && this.goal == c.goal && this.capitano == c.capitano){
            return true;
        }else{
            return false;
        }
    }

    // metodi get
    public String getName(){
        return name;
    }
    public int getGoal(){
        return goal;
    }
    public boolean isCapitano(){
        return capitano;
    }

    // metodi set
    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }
    public void setGoal(int goal) {
        if (goal<0){
            goal=0;
        }
        this.goal = goal;
    }
    public void setName(String name) {
        this.name = name;
    }

    // tutti i possibili costrutti
    public Calciatore(){
    }
    public Calciatore(String name, int goal, boolean capitano){
        this.name = name;
        setGoal(goal);
        this.capitano = capitano;
    }
    public Calciatore(String name, int goal){
        this.name = name;
        setGoal(goal);
    }
    public Calciatore(String name, boolean capitano){
        this.name = name;
        this.capitano = capitano;
    }
    public Calciatore(int goal, boolean capitano){
        setGoal(goal);
        this.capitano = capitano;
    }
    public String toString(){
        if (capitano==true){
            return "nome: "+name+" goal: "+goal+" - è capitano";
        }else{
            return "nome: "+name+" goal: "+goal;
        }

    }

    public Calciatore(boolean capitano){
        this.capitano = capitano;
    }
    public Calciatore(String name){
        this.name = name;
    }
    public Calciatore(int goal){
        setGoal(goal);
    }
}
