/**
 */
package imaModel.provider;


import imaModel.Action;
import imaModel.ImaModelFactory;
import imaModel.ImaModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link imaModel.Action} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionItemProvider extends NoeudItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNextPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Next feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Action_next_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Action_next_feature", "_UI_Action_type"),
				 ImaModelPackage.Literals.ACTION__NEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ImaModelPackage.Literals.ACTION__NEXT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Action.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Action"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Action_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Action.class)) {
			case ImaModelPackage.ACTION__NEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createPlot()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createHashtag()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createLocalisation()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createPositif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createNegatif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createAVG_Retweet()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createAVG_Like()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.ACTION__NEXT,
				 ImaModelFactory.eINSTANCE.createAVG_Follower()));
	}

}
