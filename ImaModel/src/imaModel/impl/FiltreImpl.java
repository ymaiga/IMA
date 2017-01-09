/**
 */
package imaModel.impl;

import imaModel.Filtre;
import imaModel.ImaModelPackage;
import imaModel.Init;
import imaModel.Noeud;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imaModel.impl.FiltreImpl#getInitFiltre <em>Init Filtre</em>}</li>
 *   <li>{@link imaModel.impl.FiltreImpl#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link imaModel.impl.FiltreImpl#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FiltreImpl extends NoeudImpl implements Filtre {
	/**
	 * The default value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilterName() <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterName()
	 * @generated
	 * @ordered
	 */
	protected String filterName = FILTER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Noeud next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiltreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImaModelPackage.Literals.FILTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init getInitFiltre() {
		if (eContainerFeatureID() != ImaModelPackage.FILTRE__INIT_FILTRE) return null;
		return (Init)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitFiltre(Init newInitFiltre, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInitFiltre, ImaModelPackage.FILTRE__INIT_FILTRE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitFiltre(Init newInitFiltre) {
		if (newInitFiltre != eInternalContainer() || (eContainerFeatureID() != ImaModelPackage.FILTRE__INIT_FILTRE && newInitFiltre != null)) {
			if (EcoreUtil.isAncestor(this, newInitFiltre))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInitFiltre != null)
				msgs = ((InternalEObject)newInitFiltre).eInverseAdd(this, ImaModelPackage.INIT__FILTRE_INIT, Init.class, msgs);
			msgs = basicSetInitFiltre(newInitFiltre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.FILTRE__INIT_FILTRE, newInitFiltre, newInitFiltre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterName() {
		return filterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterName(String newFilterName) {
		String oldFilterName = filterName;
		filterName = newFilterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.FILTRE__FILTER_NAME, oldFilterName, filterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Noeud getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Noeud newNext, NotificationChain msgs) {
		Noeud oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImaModelPackage.FILTRE__NEXT, oldNext, newNext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Noeud newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, ImaModelPackage.NOEUD__PREV_FILTER, Noeud.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, ImaModelPackage.NOEUD__PREV_FILTER, Noeud.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.FILTRE__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImaModelPackage.FILTRE__INIT_FILTRE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInitFiltre((Init)otherEnd, msgs);
			case ImaModelPackage.FILTRE__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImaModelPackage.FILTRE__NEXT, null, msgs);
				return basicSetNext((Noeud)otherEnd, msgs);
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
			case ImaModelPackage.FILTRE__INIT_FILTRE:
				return basicSetInitFiltre(null, msgs);
			case ImaModelPackage.FILTRE__NEXT:
				return basicSetNext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ImaModelPackage.FILTRE__INIT_FILTRE:
				return eInternalContainer().eInverseRemove(this, ImaModelPackage.INIT__FILTRE_INIT, Init.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImaModelPackage.FILTRE__INIT_FILTRE:
				return getInitFiltre();
			case ImaModelPackage.FILTRE__FILTER_NAME:
				return getFilterName();
			case ImaModelPackage.FILTRE__NEXT:
				return getNext();
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
			case ImaModelPackage.FILTRE__INIT_FILTRE:
				setInitFiltre((Init)newValue);
				return;
			case ImaModelPackage.FILTRE__FILTER_NAME:
				setFilterName((String)newValue);
				return;
			case ImaModelPackage.FILTRE__NEXT:
				setNext((Noeud)newValue);
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
			case ImaModelPackage.FILTRE__INIT_FILTRE:
				setInitFiltre((Init)null);
				return;
			case ImaModelPackage.FILTRE__FILTER_NAME:
				setFilterName(FILTER_NAME_EDEFAULT);
				return;
			case ImaModelPackage.FILTRE__NEXT:
				setNext((Noeud)null);
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
			case ImaModelPackage.FILTRE__INIT_FILTRE:
				return getInitFiltre() != null;
			case ImaModelPackage.FILTRE__FILTER_NAME:
				return FILTER_NAME_EDEFAULT == null ? filterName != null : !FILTER_NAME_EDEFAULT.equals(filterName);
			case ImaModelPackage.FILTRE__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (filterName: ");
		result.append(filterName);
		result.append(')');
		return result.toString();
	}

} //FiltreImpl
