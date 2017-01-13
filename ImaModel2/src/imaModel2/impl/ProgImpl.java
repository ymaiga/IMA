/**
 */
package imaModel2.impl;

import imaModel2.Arc;
import imaModel2.ImaModel2Package;
import imaModel2.Init;
import imaModel2.Noeud;
import imaModel2.Prog;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imaModel2.impl.ProgImpl#getNoeuds <em>Noeuds</em>}</li>
 *   <li>{@link imaModel2.impl.ProgImpl#getInit <em>Init</em>}</li>
 *   <li>{@link imaModel2.impl.ProgImpl#getChemin <em>Chemin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgImpl extends MinimalEObjectImpl.Container implements Prog {
	/**
	 * The cached value of the '{@link #getNoeuds() <em>Noeuds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoeuds()
	 * @generated
	 * @ordered
	 */
	protected EList<Noeud> noeuds;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected EList<Init> init;

	/**
	 * The cached value of the '{@link #getChemin() <em>Chemin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> chemin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModel2Package.Literals.PROG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Noeud> getNoeuds() {
		if (noeuds == null) {
			noeuds = new EObjectContainmentEList<Noeud>(Noeud.class, this, ImaModel2Package.PROG__NOEUDS);
		}
		return noeuds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Init> getInit() {
		if (init == null) {
			init = new EObjectContainmentEList<Init>(Init.class, this, ImaModel2Package.PROG__INIT);
		}
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getChemin() {
		if (chemin == null) {
			chemin = new EObjectContainmentEList<Arc>(Arc.class, this, ImaModel2Package.PROG__CHEMIN);
		}
		return chemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImaModel2Package.PROG__NOEUDS:
				return ((InternalEList<?>)getNoeuds()).basicRemove(otherEnd, msgs);
			case ImaModel2Package.PROG__INIT:
				return ((InternalEList<?>)getInit()).basicRemove(otherEnd, msgs);
			case ImaModel2Package.PROG__CHEMIN:
				return ((InternalEList<?>)getChemin()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImaModel2Package.PROG__NOEUDS:
				return getNoeuds();
			case ImaModel2Package.PROG__INIT:
				return getInit();
			case ImaModel2Package.PROG__CHEMIN:
				return getChemin();
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
			case ImaModel2Package.PROG__NOEUDS:
				getNoeuds().clear();
				getNoeuds().addAll((Collection<? extends Noeud>)newValue);
				return;
			case ImaModel2Package.PROG__INIT:
				getInit().clear();
				getInit().addAll((Collection<? extends Init>)newValue);
				return;
			case ImaModel2Package.PROG__CHEMIN:
				getChemin().clear();
				getChemin().addAll((Collection<? extends Arc>)newValue);
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
			case ImaModel2Package.PROG__NOEUDS:
				getNoeuds().clear();
				return;
			case ImaModel2Package.PROG__INIT:
				getInit().clear();
				return;
			case ImaModel2Package.PROG__CHEMIN:
				getChemin().clear();
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
			case ImaModel2Package.PROG__NOEUDS:
				return noeuds != null && !noeuds.isEmpty();
			case ImaModel2Package.PROG__INIT:
				return init != null && !init.isEmpty();
			case ImaModel2Package.PROG__CHEMIN:
				return chemin != null && !chemin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgImpl
