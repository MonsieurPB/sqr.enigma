package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {
    
    String[] rotorList = { "I", "II", "III", "IV", "V","VI", "VII", "VIII" };
    Rotor rotor1 = Rotor.rotorFactory("E K M F L G D Q V Z N T O W Y H X U S P A I B R C J", "Q");
    Rotor rotor8 = Rotor.rotorFactory("F K Q H T L X O C B J S P D Z R A M E W N I U Y G V","Z and M");
    int[] cipher = new int[26];
    int position;
    
    @Test
    public void testAdvanceRotor(){
        Rotor r = rotor1;
        int pos = r.getPosition();
        r.advance();
        int expected = pos+1;
        int actual = r.getPosition();
        assertEquals(expected, actual);
    }
}
