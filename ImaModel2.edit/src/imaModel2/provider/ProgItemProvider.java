/**
 */
package imaModel2.provider;


import imaModel2.ImaModel2Factory;
import imaModel2.ImaModel2Package;
import imaModel2.Prog;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link imaModel2.Prog} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgItemProvider(AdapterFactory adapterFactory) {
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

			addInitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Prog_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Prog_init_feature", "_UI_Prog_type"),
				 ImaModel2Package.Literals.PROG__INIT,
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
			childrenFeatures.add(ImaModel2Package.Literals.PROG__NOEUDS);
			childrenFeatures.add(ImaModel2Package.Literals.PROG__INIT);
			childrenFeatures.add(ImaModel2Package.Literals.PROG__CHEMIN);
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
	 * This returns Prog.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Prog"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Prog_type");
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

		switch (notification.getFeatureID(Prog.class)) {
			case ImaModel2Package.PROG__NOEUDS:
			case ImaModel2Package.PROG__INIT:
			case ImaModel2Package.PROG__CHEMIN:
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
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createCondition()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createLocalisation()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createHashtag()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createPlot()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createAVG_Like()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createPrint()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createFollowers()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createPositif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__NOEUDS,
				 ImaModel2Factory.eINSTANCE.createNegatif()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__INIT,
				 ImaModel2Factory.eINSTANCE.createInit()));

		newChildDescriptors.add
			(createChildParameter
				(ImaModel2Package.Literals.PROG__CHEMIN,
				 ImaModel2Factory.eINSTANCE.createArc()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ImaModel2EditPlugin.INSTANCE;
	}

}
