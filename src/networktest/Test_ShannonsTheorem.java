/*
 *  @(#)Test_ShannonsTheorem.java	Feb 17, 2005
 *
 *
 *  This software contains confidential and proprietary information
 *  of Dyer Consulting ("Confidential Information").  You shall not disclose
 *  such Confidential Information and shall use it only in accordance with the
 *  terms of the license agreement you entered into with Dyer Consulting.
 *
 *  This software is provided "AS IS,".  No warrantee of any kind, express
 *  or implied, is included with this software; use at your own risk, responsibility
 *  for damages (if any) to anyone resulting from the use of this software rests
 *  entirely with the user even if Dyer Consulting has been advised of the
 *  possibility of such damages.
 *
 *  This software is not designed or intended for use in on-line control of
 *  aircraft, air traffic, aircraft navigation or aircraft communications; or in
 *  the design, construction, operation or maintenance of any nuclear
 *  facility. Licensee represents and warrants that it will not use or
 *  redistribute the Software for such purposes.
 *
 *  Distribute freely, except: don't remove my name from the source or
 *  documentation, mark your changes (don't blame me for your possible bugs),
 *  don't alter or remove any of this notice.
 *
 */

package networktest;

import junit.framework.*;

import network.ShannonsTheorem;


/**
 *	JUnit tests for the ShannonsTheorem class from the "network" project.
 * @author Andy Groenenberg
 * @version 1.1.0
 */
public class Test_ShannonsTheorem extends TestCase {


	public Test_ShannonsTheorem(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_ShannonsTheorem.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ShannonsTheorem Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ShannonsTheorem End");	}

	
 	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_ShannonsTheorem.testConstructors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testConstructors: ShannonsTheorem is null", shannonsTheorem);

		//shannonsTheorem = new ShannonsTheorem("Some attribute value");
		//assertNotNull("\t\tTest_ShannonsTheorem.testConstructors: ShannonsTheorem is null", shannonsTheorem);
		
		/*  don't have one ! 
		 *	TODO:	Add tests for your parameterized constructors here
		 */	
		 
	}


	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testAccessors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testAccessors: ShannonsTheorem is null", shannonsTheorem);
		
		double test_bandwidth = shannonsTheorem.getBandwidth();
		assertNotNull("Test_ShannonsTheorem.testAccessors: setBandwidth has failed",test_bandwidth); 
		
		double test_snr = shannonsTheorem.getSignalToNoise();
		assertNotNull("Test_ShannonsTheorem.testAccessors: setSignalToNoise has failed",test_snr); 
		
	}


	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
      System.out.println("\tExecuting Test_ShannonsTheorem.testMutators");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testMutators: ShannonsTheorem is null", shannonsTheorem);
		
		shannonsTheorem.setBandwidth(3000);
		double test_bandwidth = shannonsTheorem.getBandwidth();
		assertTrue("Test_ShannonsTheorem.testMutators: setBandwidth has failed",test_bandwidth ==3000);
		
		shannonsTheorem.setSignalToNoise(30);
		double test_snr = shannonsTheorem.getSignalToNoise();
		assertTrue("Test_ShannonsTheorem.testMutators: setSignalToNoise has failed",test_snr == 30);
		
		
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
	
		System.out.println("\tExecuting Test_ShannonsTheorem.testBehaviors");
		shannonsTheorem = new ShannonsTheorem();
		assertNotNull("\t\tTest_ShannonsTheorem.testBehaviors: ShannonsTheorem is null", shannonsTheorem);
		
		shannonsTheorem.setBandwidth(3000);
		shannonsTheorem.setSignalToNoise(30);
		double test = shannonsTheorem.getMaximumDataRate();
		assertEquals("Test_ShannonsTheorem.testBehaviours: getMaximumDataRate has failed to produce correct output",test,29901.67877650798);
		
		String test_string = shannonsTheorem.toString();
		assertNotNull("Test_ShannonsTheorem.testBehaviours: ToString has failed to produce output",test_string);
		
	}



	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
      System.out.println("Executing Test_ShannonsTheorem suite");
      junit.textui.TestRunner.run(suite());
  }



   /* ATTRIBUTES	-----------------------------------------------	*/
   private ShannonsTheorem shannonsTheorem = null;
	

}	/*	End of CLASS:	Test_ShannonsTheorem.java				*/
