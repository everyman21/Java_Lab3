/*
 *  @(#)Test_ShannonsModel.java	Feb 17, 2005
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

import network.ShannonsModel;



/**
 *	JUnit tests for the ShannonsModel class from the "network" project.
 * @author Andy Groenenberg
 * @version 1.1.0
 */
public class Test_ShannonsModel extends TestCase {


	public Test_ShannonsModel(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_ShannonsModel.class);		}

	protected void setUp() throws Exception { System.out.println("Test_ShannonsModel Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_ShannonsModel End");	}

	
 	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_ShannonsModel.testConstructors");
		shannonsModel = new ShannonsModel();
		assertNotNull("\t\tTest_ShannonsModel.testConstructors: ShannonsModel is null", shannonsModel);

		//shannonsModel = new ShannonsModel("Some attribute value");
		//assertNotNull("\t\tTest_ShannonsModel.testConstructors: ShannonsModel is null", shannonsModel);
		
		/*  don't have one ! 
		 *	TODO:	Add tests for your parameterized constructors here
		 */	
		 
	}


	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
      System.out.println("\tExecuting Test_ShannonsModel.testAccessors");
		shannonsModel = new ShannonsModel();
		assertNotNull("\t\tTest_ShannonsModel.testAccessors: ShannonsModel is null", shannonsModel);
		
		double test_bandwidth = shannonsModel.getBandwidth();
		assertNotNull("Test_ShannonsModel.testAccessors: setBandwidth has failed",test_bandwidth); 
		
		double test_snr = shannonsModel.getSignalToNoise();
		assertNotNull("Test_ShannonsModel.testAccessors: setSignalToNoise has failed",test_snr); 
		
	}


	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
      System.out.println("\tExecuting Test_ShannonsModel.testMutators");
		shannonsModel = new ShannonsModel();
		assertNotNull("\t\tTest_ShannonsModel.testMutators: ShannonsModel is null", shannonsModel);
		
		shannonsModel.setBandwidth(3000);
		double test_bandwidth = shannonsModel.getBandwidth();
		assertTrue("Test_ShannonsModel.testMutators: setBandwidth has failed",test_bandwidth ==3000);
		
		shannonsModel.setSignalToNoise(30);
		double test_snr = shannonsModel.getSignalToNoise();
		assertTrue("Test_ShannonsModel.testMutators: setSignalToNoise has failed",test_snr == 30);
		
		
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
	
		System.out.println("\tExecuting Test_ShannonsModel.testBehaviors");
		shannonsModel = new ShannonsModel();
		assertNotNull("\t\tTest_ShannonsModel.testBehaviors: ShannonsModel is null", shannonsModel);
		
		shannonsModel.setBandwidth(3000);
		shannonsModel.setSignalToNoise(30);
		double test = shannonsModel.getMaximumDataRate();
		assertEquals("Test_ShannonsModel.testBehaviours: getMaximumDataRate has failed to produce correct output",test,29901.67877650798);
		
		String test_string = shannonsModel.toString();
		assertNotNull("Test_ShannonsModel.testBehaviours: ToString has failed to produce output",test_string);
		
	}



	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	public static void main(String[] args) {
      System.out.println("Executing Test_ShannonsModel suite");
      junit.textui.TestRunner.run(suite());
  }



   /* ATTRIBUTES	-----------------------------------------------	*/
   private ShannonsModel shannonsModel = null;
	

}	/*	End of CLASS:	Test_ShannonsModel.java				*/
