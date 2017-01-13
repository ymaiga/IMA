/**
 */
package imaModel2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel2.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link imaModel2.Condition#getIf <em>If</em>}</li>
 *   <li>{@link imaModel2.Condition#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see imaModel2.ImaModel2Package#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Noeud {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see imaModel2.ImaModel2Package#getCondition_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link imaModel2.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' reference.
	 * @see #setIf(Noeud)
	 * @see imaModel2.ImaModel2Package#getCondition_If()
	 * @model required="true"
	 * @generated
	 */
	Noeud getIf();

	/**
	 * Sets the value of the '{@link imaModel2.Condition#getIf <em>If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Noeud value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' reference.
	 * @see #setElse(Noeud)
	 * @see imaModel2.ImaModel2Package#getCondition_Else()
	 * @model required="true"
	 * @generated
	 */
	Noeud getElse();

	/**
	 * Sets the value of the '{@link imaModel2.Condition#getElse <em>Else</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Noeud value);

} // Condition
