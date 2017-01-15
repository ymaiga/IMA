/**
 */
package imaModel2.tests;

import imaModel2.ImaModel2Factory;
import imaModel2.Negatif;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negatif</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegatifTest extends ActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegatifTest.class);
	}

	/**
	 * Constructs a new Negatif test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatifTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Negatif test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Negatif getFixture() {
		return (Negatif)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImaModel2Factory.eINSTANCE.createNegatif());
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

} //NegatifTest
