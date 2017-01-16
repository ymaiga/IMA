/**
 */
package imaModel2.impl;

import imaModel2.Hashtag;
import imaModel2.ImaModel2Package;
import imaModel2.VisitorJava;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hashtag</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HashtagImpl extends FiltreImpl implements Hashtag {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HashtagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.HASHTAG;
	}

	@Override
	public String acceptVisitor(VisitorJava v) {
		return v.visite(this);
	}

} //HashtagImpl
