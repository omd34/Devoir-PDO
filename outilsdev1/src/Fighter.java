import java.util.Random;

public class Fighter extends Robot{

    private int seed;
    public Fighter(String nom,int seed) {
        super(nom);
        super.vie=10;


    }

   @Override
    public String toString(){
        return "Fighter "+super.getNom();
    }
  @Override
    public void fire(Robot robotcible){
      Random rand=new Random(seed);
      if(rand.nextBoolean()){
          robotcible.setVie(robotcible.getVie()-2);

          System.out.println("Le "+robotcible.getClass().getName()+" "+robotcible.getNom()+" a ete touche par le Fighter "+this.getNom());

      }

    }

}
