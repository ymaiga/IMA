/**
 */
package imaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel.Init#getFiltreInit <em>Filtre Init</em>}</li>
 * </ul>
 *
 * @see imaModel.ImaModelPackage#getInit()
 * @model
 * @generated
 */
public interface Init extends EObject {
	/**
	 * Returns the value of the '<em><b>Filtre Init</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Filtre#getInitFiltre <em>Init Filtre</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtre Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtre Init</em>' containment reference.
	 * @see #setFiltreInit(Filtre)
	 * @see imaModel.ImaModelPackage#getInit_FiltreInit()
	 * @see imaModel.Filtre#getInitFiltre
	 * @model opposite="initFiltre" containment="true" required="true"
	 * @generated
	 */
	Filtre getFiltreInit();

	/**
	 * Sets the value of the '{@link imaModel.Init#getFiltreInit <em>Filtre Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtre Init</em>' containment reference.
	 * @see #getFiltreInit()
	 * @generated
	 */
	void setFiltreInit(Filtre value);

} // Init
