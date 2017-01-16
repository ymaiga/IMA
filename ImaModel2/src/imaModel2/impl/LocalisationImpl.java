/**
 */
package imaModel2.impl;

import imaModel2.ImaModel2Package;
import imaModel2.Localisation;
import imaModel2.VisitorJava;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LocalisationImpl extends FiltreImpl implements Localisation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.LOCALISATION;
	}

	@Override
	public String acceptVisitor(VisitorJava v) {
		return v.visite(this);
	}

} //LocalisationImpl
