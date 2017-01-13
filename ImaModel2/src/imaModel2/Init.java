/**
 */
package imaModel2;

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
 *   <li>{@link imaModel2.Init#getFiltre <em>Filtre</em>}</li>
 * </ul>
 *
 * @see imaModel2.ImaModel2Package#getInit()
 * @model
 * @generated
 */
public interface Init extends EObject {
	/**
	 * Returns the value of the '<em><b>Filtre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtre</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtre</em>' reference.
	 * @see #setFiltre(Filtre)
	 * @see imaModel2.ImaModel2Package#getInit_Filtre()
	 * @model required="true"
	 * @generated
	 */
	Filtre getFiltre();

	/**
	 * Sets the value of the '{@link imaModel2.Init#getFiltre <em>Filtre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtre</em>' reference.
	 * @see #getFiltre()
	 * @generated
	 */
	void setFiltre(Filtre value);

} // Init
