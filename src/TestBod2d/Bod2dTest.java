package TestBod2d;

import bod.Bod2d;
import static org.junit.jupiter.api.Assertions.*;

class Bod2dTest
{
    Bod2d Prvy;
    Bod2d Druhy;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        Prvy= new Bod2d(1,2);
        Druhy = new Bod2d(0,0);
    }

    @org.junit.jupiter.api.Test
    void getDistance()
    {
        assertEquals(Math.sqrt(5),Prvy.getDistance(Druhy));
    }

    @org.junit.jupiter.api.Test
    void plus()
    {
        assertEquals(new Bod2d(1,2),Prvy.plus(Druhy));
    }

    @org.junit.jupiter.api.Test
    void minus()
    {
        assertEquals(new Bod2d(1,2),Prvy.minus(Druhy));
    }
}