/**
 */
package imaModel.provider;


import imaModel.Condition;
import imaModel.ImaModelFactory;
import imaModel.ImaModelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link imaModel.Condition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionItemProvider extends NoeudItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionItemProvider(AdapterFactory adapterFactory) {
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

			addIfPropertyDescriptor(object);
			addElsePropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the If feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Condition_if_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Condition_if_feature", "_UI_Condition_type"),
				 ImaModelPackage.Literals.CONDITION__IF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Else feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Condition_else_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Condition_else_feature", "_UI_Condition_type"),
				 ImaModelPackage.Literals.CONDITION__ELSE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Condition_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Condition_operator_feature", "_UI_Condition_type"),
				 ImaModelPackage.Literals.CONDITION__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ImaModelPackage.Literals.CONDITION__IF);
			childrenFeatures.add(ImaModelPackage.Literals.CONDITION__ELSE);
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
	 * This returns Condition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Condition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Condition)object).getOperator();
		return label == null || label.length() == 0 ?
			getString("_UI_Condition_type") :
			getString("_UI_Condition_type") + " " + label;
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

		switch (notification.getFeatureID(Condition.class)) {
			case ImaModelPackage.CONDITION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ImaModelPackage.CONDITION__IF:
			case ImaModelPackage.CONDITION__ELSE:
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
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createPlot()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createHashtag()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createLocalisation()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createPositif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createNegatif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createAVG_Retweet()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createAVG_Like()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__IF,
				 ImaModelFactory.eINSTANCE.createAVG_Follower()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createPlot()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createHashtag()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createLocalisation()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createPositif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createNegatif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createAVG_Retweet()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createAVG_Like()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModelPackage.Literals.CONDITION__ELSE,
				 ImaModelFactory.eINSTANCE.createAVG_Follower()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ImaModelPackage.Literals.CONDITION__IF ||
			childFeature == ImaModelPackage.Literals.CONDITION__ELSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
