/**
 */
package imaModel2.impl;

import imaModel2.Followers;
import imaModel2.ImaModel2Package;
import imaModel2.VisitorJava;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Followers</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FollowersImpl extends ActionImpl implements Followers {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FollowersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.FOLLOWERS;
	}

	@Override
	public String acceptVisitor(VisitorJava v) {
		return v.visite(this);
	}

} //FollowersImpl
