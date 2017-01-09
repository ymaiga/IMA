/**
 */
package imaModel.tests;

import imaModel.AVG_Retweet;
import imaModel.ImaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AVG Retweet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AVG_RetweetTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AVG_RetweetTest.class);
	}

	/**
	 * Constructs a new AVG Retweet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVG_RetweetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this AVG Retweet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AVG_Retweet getFixture() {
		return (AVG_Retweet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImaModelFactory.eINSTANCE.createAVG_Retweet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AVG_RetweetTest
