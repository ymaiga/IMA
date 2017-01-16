/**
 */
package imaModel2.impl;

import imaModel2.AVG_Like;
import imaModel2.ImaModel2Package;
import imaModel2.VisitorJava;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AVG Like</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AVG_LikeImpl extends ActionImpl implements AVG_Like {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AVG_LikeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.AVG_LIKE;
	}

	@Override
	public String acceptVisitor(VisitorJava v) {
		// TODO Auto-generated method stub
		return v.visite(this);
	}

} //AVG_LikeImpl
