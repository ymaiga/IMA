/**
 */
package imaModel2.impl;

import imaModel2.Filtre;
import imaModel2.ImaModel2Package;
import imaModel2.Init;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link imaModel2.impl.InitImpl#getFiltre <em>Filtre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitImpl extends MinimalEObjectImpl.Container implements Init {
	/**
	 * The cached value of the '{@link #getFiltre() <em>Filtre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiltre()
	 * @generated
	 * @ordered
	 */
	protected Filtre filtre;

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
		return ImaModel2Package.Literals.INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filtre getFiltre() {
		if (filtre != null && filtre.eIsProxy()) {
			InternalEObject oldFiltre = (InternalEObject)filtre;
			filtre = (Filtre)eResolveProxy(oldFiltre);
			if (filtre != oldFiltre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImaModel2Package.INIT__FILTRE, oldFiltre, filtre));
			}
		}
		return filtre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filtre basicGetFiltre() {
		return filtre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiltre(Filtre newFiltre) {
		Filtre oldFiltre = filtre;
		filtre = newFiltre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModel2Package.INIT__FILTRE, oldFiltre, filtre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImaModel2Package.INIT__FILTRE:
				if (resolve) return getFiltre();
				return basicGetFiltre();
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
			case ImaModel2Package.INIT__FILTRE:
				setFiltre((Filtre)newValue);
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
			case ImaModel2Package.INIT__FILTRE:
				setFiltre((Filtre)null);
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
			case ImaModel2Package.INIT__FILTRE:
				return filtre != null;
		}
		return super.eIsSet(featureID);
	}

} //InitImpl
