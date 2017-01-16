/**
 */
package imaModel2.impl;

import imaModel2.ImaModel2Package;
import imaModel2.Negatif;
import imaModel2.VisitorJava;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Negatif</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NegatifImpl extends ActionImpl implements Negatif {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegatifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.NEGATIF;
	}

	@Override
	public String acceptVisitor(VisitorJava v) {
		return v.visite(this);
	}

} //NegatifImpl
