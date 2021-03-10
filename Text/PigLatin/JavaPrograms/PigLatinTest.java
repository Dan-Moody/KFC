package Text.PigLatin.JavaPrograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

public class PigLatinTest {
	
	public static String test1 = "isthay isyay anyay englishyay entencesay ithway ifferentday apitalizationcay andyay ifferentday amountsyay ofyay ordsway . illstay omesay ofyay emthay areyay ordsway";
	public static String test1Input = "This is an English Sentence with different capitalization and different amounts of words. Still some of them are words;";
	
			
	@Test		
    public void testAssert(){
		ByteArrayOutputStream outSpy = new ByteArrayOutputStream();
		
	    InputStream sysInBackup = System.in; // backup System.in to restore it later
	    ByteArrayInputStream in = new ByteArrayInputStream(test1Input.getBytes());
	    System.setIn(in);
	
	    //Assert statements		
        assertEquals(test1, outSpy.toString());
	
	    // optionally, reset System.in to its original
	    System.setIn(sysInBackup);
	}
}
