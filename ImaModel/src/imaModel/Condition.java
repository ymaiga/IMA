/**
 */
package imaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel.Condition#getIf <em>If</em>}</li>
 *   <li>{@link imaModel.Condition#getElse <em>Else</em>}</li>
 *   <li>{@link imaModel.Condition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see imaModel.ImaModelPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends Noeud {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Noeud#getConditionIf <em>Condition If</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Noeud)
	 * @see imaModel.ImaModelPackage#getCondition_If()
	 * @see imaModel.Noeud#getConditionIf
	 * @model opposite="conditionIf" containment="true" required="true"
	 * @generated
	 */
	Noeud getIf();

	/**
	 * Sets the value of the '{@link imaModel.Condition#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Noeud value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Noeud#getConditionElse <em>Condition Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Noeud)
	 * @see imaModel.ImaModelPackage#getCondition_Else()
	 * @see imaModel.Noeud#getConditionElse
	 * @model opposite="conditionElse" containment="true" required="true"
	 * @generated
	 */
	Noeud getElse();

	/**
	 * Sets the value of the '{@link imaModel.Condition#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Noeud value);

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
	 * @see imaModel.ImaModelPackage#getCondition_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link imaModel.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

} // Condition
