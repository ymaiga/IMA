/**
 */
package imaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel.Filtre#getInitFiltre <em>Init Filtre</em>}</li>
 *   <li>{@link imaModel.Filtre#getFilterName <em>Filter Name</em>}</li>
 *   <li>{@link imaModel.Filtre#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see imaModel.ImaModelPackage#getFiltre()
 * @model abstract="true"
 * @generated
 */
public interface Filtre extends Noeud {
	/**
	 * Returns the value of the '<em><b>Init Filtre</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Init#getFiltreInit <em>Filtre Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Filtre</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Filtre</em>' container reference.
	 * @see #setInitFiltre(Init)
	 * @see imaModel.ImaModelPackage#getFiltre_InitFiltre()
	 * @see imaModel.Init#getFiltreInit
	 * @model opposite="filtreInit" transient="false"
	 * @generated
	 */
	Init getInitFiltre();

	/**
	 * Sets the value of the '{@link imaModel.Filtre#getInitFiltre <em>Init Filtre</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Filtre</em>' container reference.
	 * @see #getInitFiltre()
	 * @generated
	 */
	void setInitFiltre(Init value);

	/**
	 * Returns the value of the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Name</em>' attribute.
	 * @see #setFilterName(String)
	 * @see imaModel.ImaModelPackage#getFiltre_FilterName()
	 * @model required="true"
	 * @generated
	 */
	String getFilterName();

	/**
	 * Sets the value of the '{@link imaModel.Filtre#getFilterName <em>Filter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Name</em>' attribute.
	 * @see #getFilterName()
	 * @generated
	 */
	void setFilterName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Noeud#getPrevFilter <em>Prev Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Noeud)
	 * @see imaModel.ImaModelPackage#getFiltre_Next()
	 * @see imaModel.Noeud#getPrevFilter
	 * @model opposite="prevFilter" containment="true" required="true"
	 * @generated
	 */
	Noeud getNext();

	/**
	 * Sets the value of the '{@link imaModel.Filtre#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Noeud value);

} // Filtre
