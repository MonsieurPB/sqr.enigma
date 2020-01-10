package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

    int position;
    int[] cipher = new int[26];
    int[] bcipher = new int[26];
    int notch1 = -1;
    int notch2 = -1;
    
    String config ="* B III IV I AXLE";
    String msg1 = "FROM his shoulder Hiawatha";
    String code1 = "HYIHBSBOEBTWJZSXMWQKYGWSFR";
    String msg2 = "HYIHLBKOMLIUYDCMPPSFSZW";
    String code2 = "FROMHISSHOULDERHIAWATHA";
    
	@Test
	public void test() {
		//FAIRE UN TEST SUR LA FONCTION ADVANCE()
	}

}
