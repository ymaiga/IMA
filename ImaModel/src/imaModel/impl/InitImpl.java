/**
 */
package imaModel.impl;

import imaModel.Filtre;
import imaModel.ImaModelPackage;
import imaModel.Init;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imaModel.impl.InitImpl#getFiltreInit <em>Filtre Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitImpl extends MinimalEObjectImpl.Container implements Init {
	/**
	 * The cached value of the '{@link #getFiltreInit() <em>Filtre Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltreInit()
	 * @generated
	 * @ordered
	 */
	protected Filtre filtreInit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModelPackage.Literals.INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filtre getFiltreInit() {
		return filtreInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFiltreInit(Filtre newFiltreInit, NotificationChain msgs) {
		Filtre oldFiltreInit = filtreInit;
		filtreInit = newFiltreInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImaModelPackage.INIT__FILTRE_INIT, oldFiltreInit, newFiltreInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltreInit(Filtre newFiltreInit) {
		if (newFiltreInit != filtreInit) {
			NotificationChain msgs = null;
			if (filtreInit != null)
				msgs = ((InternalEObject)filtreInit).eInverseRemove(this, ImaModelPackage.FILTRE__INIT_FILTRE, Filtre.class, msgs);
			if (newFiltreInit != null)
				msgs = ((InternalEObject)newFiltreInit).eInverseAdd(this, ImaModelPackage.FILTRE__INIT_FILTRE, Filtre.class, msgs);
			msgs = basicSetFiltreInit(newFiltreInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.INIT__FILTRE_INIT, newFiltreInit, newFiltreInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImaModelPackage.INIT__FILTRE_INIT:
				if (filtreInit != null)
					msgs = ((InternalEObject)filtreInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImaModelPackage.INIT__FILTRE_INIT, null, msgs);
				return basicSetFiltreInit((Filtre)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImaModelPackage.INIT__FILTRE_INIT:
				return basicSetFiltreInit(null, msgs);
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
			case ImaModelPackage.INIT__FILTRE_INIT:
				return getFiltreInit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImaModelPackage.INIT__FILTRE_INIT:
				setFiltreInit((Filtre)newValue);
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
			case ImaModelPackage.INIT__FILTRE_INIT:
				setFiltreInit((Filtre)null);
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
			case ImaModelPackage.INIT__FILTRE_INIT:
				return filtreInit != null;
		}
		return super.eIsSet(featureID);
	}

} //InitImpl
