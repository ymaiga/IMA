/**
 */
package imaModel2.impl;

import imaModel2.ImaModel2Package;
import imaModel2.Positif;
import imaModel2.VisitorJava;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positif</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PositifImpl extends ActionImpl implements Positif {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.POSITIF;
	}

	@Override
	public String acceptVisitor(VisitorJava v) {
		return v.visite(this);
	}

} //PositifImpl
