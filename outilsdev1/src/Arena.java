public class Arena {

      public static void fight(Robot r1,Robot r2) {
            r1.fire(r2);

            while(!r1.isDead() || !r2.isDead()){
                  if (!r2.isDead()) {
                        r2.fire(r1);
                  }

                  if(!r1.isDead()) {
                        r1.fire(r2);
                  }

            if (r1.isDead() || r2.isDead()) {
                        break;
                  }
            }





            if (r1.isDead()) {
                  System.out.println( "Le "+ r1.getClass().getName()+" " + r2.getNom() + " est le vainqueur");
            } else {

                  System.out.println("Le "+r2.getClass().getName()+" " + r1.getNom() + " est le vainqueur");
            }


      }



}
