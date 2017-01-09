/**
 */
package imaModel.tests;

import imaModel.AVG_Follower;
import imaModel.ImaModelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AVG Follower</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AVG_FollowerTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AVG_FollowerTest.class);
	}

	/**
	 * Constructs a new AVG Follower test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVG_FollowerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this AVG Follower test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AVG_Follower getFixture() {
		return (AVG_Follower)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImaModelFactory.eINSTANCE.createAVG_Follower());
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

} //AVG_FollowerTest
