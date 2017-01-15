/**
 */
package imaModel2.tests;

import imaModel2.ImaModel2Factory;
import imaModel2.Localisation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Localisation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalisationTest extends FiltreTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalisationTest.class);
	}

	/**
	 * Constructs a new Localisation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalisationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Localisation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Localisation getFixture() {
		return (Localisation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ImaModel2Factory.eINSTANCE.createLocalisation());
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

} //LocalisationTest
