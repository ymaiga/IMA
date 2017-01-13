/**
 */
package imaModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel2.Filtre#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see imaModel2.ImaModel2Package#getFiltre()
 * @model abstract="true"
 * @generated
 */
public interface Filtre extends Noeud {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see imaModel2.ImaModel2Package#getFiltre_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link imaModel2.Filtre#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Filtre
