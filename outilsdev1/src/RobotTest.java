import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    Robot r1=new Robot("bob");
    Robot r2=new Robot("data");
    Fighter f1=new Fighter("rugal",7);

    Fighter f2=new Fighter("bruce",7);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {

        assertEquals("Robot bob",r1.toString());
        assertEquals("Fighter rugal",f1.toString());
    }

    @org.junit.jupiter.api.Test
    void getNom() {
    }

    @org.junit.jupiter.api.Test
    void setNom() {
    }

    @org.junit.jupiter.api.Test
    void getVie() {
    }

    @org.junit.jupiter.api.Test
    void setVie() {
    }

    @org.junit.jupiter.api.Test
    void fire() {
        //test de tir sur le robot
        r1.fire(r2);
        assertEquals(8,r2.getVie());

        //test de combat
        Arena.fight(r1,r2);
        if(r1.isDead()){
            assertEquals(0,r1.getVie());

        }else{
            assertEquals(0,r2.getVie());
            r1.fire(r2);
            //impossible de tirer sur un robot mort
         //   assertEquals(-2,r2.getVie());



        }

        //test du tire d'un humain
        f1.fire(f2);
         assertFalse(f2.isDead());


    }

    @org.junit.jupiter.api.Test
    void isDead() {
    }
}