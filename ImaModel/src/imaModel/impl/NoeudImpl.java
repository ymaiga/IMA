/**
 */
package imaModel.impl;

import imaModel.Action;
import imaModel.Condition;
import imaModel.Filtre;
import imaModel.ImaModelPackage;
import imaModel.Noeud;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imaModel.impl.NoeudImpl#getConditionIf <em>Condition If</em>}</li>
 *   <li>{@link imaModel.impl.NoeudImpl#getConditionElse <em>Condition Else</em>}</li>
 *   <li>{@link imaModel.impl.NoeudImpl#getPrevFilter <em>Prev Filter</em>}</li>
 *   <li>{@link imaModel.impl.NoeudImpl#getPrevAction <em>Prev Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NoeudImpl extends MinimalEObjectImpl.Container implements Noeud {
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
		return ImaModelPackage.Literals.NOEUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getConditionIf() {
		if (eContainerFeatureID() != ImaModelPackage.NOEUD__CONDITION_IF) return null;
		return (Condition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionIf(Condition newConditionIf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConditionIf, ImaModelPackage.NOEUD__CONDITION_IF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionIf(Condition newConditionIf) {
		if (newConditionIf != eInternalContainer() || (eContainerFeatureID() != ImaModelPackage.NOEUD__CONDITION_IF && newConditionIf != null)) {
			if (EcoreUtil.isAncestor(this, newConditionIf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConditionIf != null)
				msgs = ((InternalEObject)newConditionIf).eInverseAdd(this, ImaModelPackage.CONDITION__IF, Condition.class, msgs);
			msgs = basicSetConditionIf(newConditionIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.NOEUD__CONDITION_IF, newConditionIf, newConditionIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getConditionElse() {
		if (eContainerFeatureID() != ImaModelPackage.NOEUD__CONDITION_ELSE) return null;
		return (Condition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionElse(Condition newConditionElse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConditionElse, ImaModelPackage.NOEUD__CONDITION_ELSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionElse(Condition newConditionElse) {
		if (newConditionElse != eInternalContainer() || (eContainerFeatureID() != ImaModelPackage.NOEUD__CONDITION_ELSE && newConditionElse != null)) {
			if (EcoreUtil.isAncestor(this, newConditionElse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConditionElse != null)
				msgs = ((InternalEObject)newConditionElse).eInverseAdd(this, ImaModelPackage.CONDITION__ELSE, Condition.class, msgs);
			msgs = basicSetConditionElse(newConditionElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.NOEUD__CONDITION_ELSE, newConditionElse, newConditionElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filtre getPrevFilter() {
		if (eContainerFeatureID() != ImaModelPackage.NOEUD__PREV_FILTER) return null;
		return (Filtre)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevFilter(Filtre newPrevFilter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrevFilter, ImaModelPackage.NOEUD__PREV_FILTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevFilter(Filtre newPrevFilter) {
		if (newPrevFilter != eInternalContainer() || (eContainerFeatureID() != ImaModelPackage.NOEUD__PREV_FILTER && newPrevFilter != null)) {
			if (EcoreUtil.isAncestor(this, newPrevFilter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrevFilter != null)
				msgs = ((InternalEObject)newPrevFilter).eInverseAdd(this, ImaModelPackage.FILTRE__NEXT, Filtre.class, msgs);
			msgs = basicSetPrevFilter(newPrevFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.NOEUD__PREV_FILTER, newPrevFilter, newPrevFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getPrevAction() {
		if (eContainerFeatureID() != ImaModelPackage.NOEUD__PREV_ACTION) return null;
		return (Action)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevAction(Action newPrevAction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPrevAction, ImaModelPackage.NOEUD__PREV_ACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevAction(Action newPrevAction) {
		if (newPrevAction != eInternalContainer() || (eContainerFeatureID() != ImaModelPackage.NOEUD__PREV_ACTION && newPrevAction != null)) {
			if (EcoreUtil.isAncestor(this, newPrevAction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPrevAction != null)
				msgs = ((InternalEObject)newPrevAction).eInverseAdd(this, ImaModelPackage.ACTION__NEXT, Action.class, msgs);
			msgs = basicSetPrevAction(newPrevAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImaModelPackage.NOEUD__PREV_ACTION, newPrevAction, newPrevAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImaModelPackage.NOEUD__CONDITION_IF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConditionIf((Condition)otherEnd, msgs);
			case ImaModelPackage.NOEUD__CONDITION_ELSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConditionElse((Condition)otherEnd, msgs);
			case ImaModelPackage.NOEUD__PREV_FILTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrevFilter((Filtre)otherEnd, msgs);
			case ImaModelPackage.NOEUD__PREV_ACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPrevAction((Action)otherEnd, msgs);
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
			case ImaModelPackage.NOEUD__CONDITION_IF:
				return basicSetConditionIf(null, msgs);
			case ImaModelPackage.NOEUD__CONDITION_ELSE:
				return basicSetConditionElse(null, msgs);
			case ImaModelPackage.NOEUD__PREV_FILTER:
				return basicSetPrevFilter(null, msgs);
			case ImaModelPackage.NOEUD__PREV_ACTION:
				return basicSetPrevAction(null, msgs);
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
			case ImaModelPackage.NOEUD__CONDITION_IF:
				return eInternalContainer().eInverseRemove(this, ImaModelPackage.CONDITION__IF, Condition.class, msgs);
			case ImaModelPackage.NOEUD__CONDITION_ELSE:
				return eInternalContainer().eInverseRemove(this, ImaModelPackage.CONDITION__ELSE, Condition.class, msgs);
			case ImaModelPackage.NOEUD__PREV_FILTER:
				return eInternalContainer().eInverseRemove(this, ImaModelPackage.FILTRE__NEXT, Filtre.class, msgs);
			case ImaModelPackage.NOEUD__PREV_ACTION:
				return eInternalContainer().eInverseRemove(this, ImaModelPackage.ACTION__NEXT, Action.class, msgs);
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
			case ImaModelPackage.NOEUD__CONDITION_IF:
				return getConditionIf();
			case ImaModelPackage.NOEUD__CONDITION_ELSE:
				return getConditionElse();
			case ImaModelPackage.NOEUD__PREV_FILTER:
				return getPrevFilter();
			case ImaModelPackage.NOEUD__PREV_ACTION:
				return getPrevAction();
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
			case ImaModelPackage.NOEUD__CONDITION_IF:
				setConditionIf((Condition)newValue);
				return;
			case ImaModelPackage.NOEUD__CONDITION_ELSE:
				setConditionElse((Condition)newValue);
				return;
			case ImaModelPackage.NOEUD__PREV_FILTER:
				setPrevFilter((Filtre)newValue);
				return;
			case ImaModelPackage.NOEUD__PREV_ACTION:
				setPrevAction((Action)newValue);
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
			case ImaModelPackage.NOEUD__CONDITION_IF:
				setConditionIf((Condition)null);
				return;
			case ImaModelPackage.NOEUD__CONDITION_ELSE:
				setConditionElse((Condition)null);
				return;
			case ImaModelPackage.NOEUD__PREV_FILTER:
				setPrevFilter((Filtre)null);
				return;
			case ImaModelPackage.NOEUD__PREV_ACTION:
				setPrevAction((Action)null);
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
			case ImaModelPackage.NOEUD__CONDITION_IF:
				return getConditionIf() != null;
			case ImaModelPackage.NOEUD__CONDITION_ELSE:
				return getConditionElse() != null;
			case ImaModelPackage.NOEUD__PREV_FILTER:
				return getPrevFilter() != null;
			case ImaModelPackage.NOEUD__PREV_ACTION:
				return getPrevAction() != null;
		}
		return super.eIsSet(featureID);
	}

} //NoeudImpl
