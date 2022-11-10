package myjenktest;

import org.junit.jupiter.api.*;


import myjenktest.tutorial.FizzBuzz;

public class FizzBuzzTest {
       public FizzBuzz fb;
       
       @BeforeEach
       public void setup() {
    	   fb=new FizzBuzz();
       }
       
       @DisplayName("Play FizzBuzz with number=1")
       @Test
       public void testNumber () {
    	   String risultato=fb.play(1);
    	   //Verifica risultato ottenuto, risultato pianificato - True o False
    	   Assertions.assertEquals(risultato, "ciao");
       }
}
