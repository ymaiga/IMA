/**
 */
package imaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel.Action#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see imaModel.ImaModelPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends Noeud {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Noeud#getPrevAction <em>Prev Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Noeud)
	 * @see imaModel.ImaModelPackage#getAction_Next()
	 * @see imaModel.Noeud#getPrevAction
	 * @model opposite="prevAction" containment="true"
	 * @generated
	 */
	Noeud getNext();

	/**
	 * Sets the value of the '{@link imaModel.Action#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Noeud value);

} // Action
