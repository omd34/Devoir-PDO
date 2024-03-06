public class Robot {
    protected String nom;
    protected int vie;

    public Robot(String nom){
        this.nom=nom;
        this.vie=10;
    }

    public String toString(){
        return "Robot "+getNom();
    }
public void affiche(){
        System.out.println("Robot bob");
}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie1) {
        this.vie = vie1;
    }



    public void fire(Robot robotcible){
        if(robotcible.isDead()){
            return;
        }else{
            robotcible.setVie(robotcible.getVie()-2);

            System.out.println("Le robot "+robotcible.getNom()+"a ete touche par le robot "+this.getNom());

        }
           }


    public boolean isDead(){


        if(this.getVie()<=0){
            this.setVie(0);
            return true;
        }else{
            return false;
        }

    }
}
