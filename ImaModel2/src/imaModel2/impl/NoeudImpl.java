/**
 */
package imaModel2.impl;

import imaModel2.Arc;
import imaModel2.ImaModel2Package;
import imaModel2.Noeud;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imaModel2.impl.NoeudImpl#getArcSortants <em>Arc Sortants</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NoeudImpl extends MinimalEObjectImpl.Container implements Noeud {
	/**
	 * The cached value of the '{@link #getArcSortants() <em>Arc Sortants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcSortants()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> arcSortants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoeudImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.NOEUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getArcSortants() {
		if (arcSortants == null) {
			arcSortants = new EObjectResolvingEList<Arc>(Arc.class, this, ImaModel2Package.NOEUD__ARC_SORTANTS);
		}
		return arcSortants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImaModel2Package.NOEUD__ARC_SORTANTS:
				return getArcSortants();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImaModel2Package.NOEUD__ARC_SORTANTS:
				getArcSortants().clear();
				getArcSortants().addAll((Collection<? extends Arc>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImaModel2Package.NOEUD__ARC_SORTANTS:
				getArcSortants().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImaModel2Package.NOEUD__ARC_SORTANTS:
				return arcSortants != null && !arcSortants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NoeudImpl
