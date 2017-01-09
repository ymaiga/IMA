/**
 */
package imaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noeud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel.Noeud#getConditionIf <em>Condition If</em>}</li>
 *   <li>{@link imaModel.Noeud#getConditionElse <em>Condition Else</em>}</li>
 *   <li>{@link imaModel.Noeud#getPrevFilter <em>Prev Filter</em>}</li>
 *   <li>{@link imaModel.Noeud#getPrevAction <em>Prev Action</em>}</li>
 * </ul>
 *
 * @see imaModel.ImaModelPackage#getNoeud()
 * @model abstract="true"
 * @generated
 */
public interface Noeud extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition If</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Condition#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition If</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition If</em>' container reference.
	 * @see #setConditionIf(Condition)
	 * @see imaModel.ImaModelPackage#getNoeud_ConditionIf()
	 * @see imaModel.Condition#getIf
	 * @model opposite="if" transient="false"
	 * @generated
	 */
	Condition getConditionIf();

	/**
	 * Sets the value of the '{@link imaModel.Noeud#getConditionIf <em>Condition If</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition If</em>' container reference.
	 * @see #getConditionIf()
	 * @generated
	 */
	void setConditionIf(Condition value);

	/**
	 * Returns the value of the '<em><b>Condition Else</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Condition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Else</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Else</em>' container reference.
	 * @see #setConditionElse(Condition)
	 * @see imaModel.ImaModelPackage#getNoeud_ConditionElse()
	 * @see imaModel.Condition#getElse
	 * @model opposite="else" transient="false"
	 * @generated
	 */
	Condition getConditionElse();

	/**
	 * Sets the value of the '{@link imaModel.Noeud#getConditionElse <em>Condition Else</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Else</em>' container reference.
	 * @see #getConditionElse()
	 * @generated
	 */
	void setConditionElse(Condition value);

	/**
	 * Returns the value of the '<em><b>Prev Filter</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Filtre#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Filter</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Filter</em>' container reference.
	 * @see #setPrevFilter(Filtre)
	 * @see imaModel.ImaModelPackage#getNoeud_PrevFilter()
	 * @see imaModel.Filtre#getNext
	 * @model opposite="next" transient="false"
	 * @generated
	 */
	Filtre getPrevFilter();

	/**
	 * Sets the value of the '{@link imaModel.Noeud#getPrevFilter <em>Prev Filter</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Filter</em>' container reference.
	 * @see #getPrevFilter()
	 * @generated
	 */
	void setPrevFilter(Filtre value);

	/**
	 * Returns the value of the '<em><b>Prev Action</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link imaModel.Action#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Action</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Action</em>' container reference.
	 * @see #setPrevAction(Action)
	 * @see imaModel.ImaModelPackage#getNoeud_PrevAction()
	 * @see imaModel.Action#getNext
	 * @model opposite="next" transient="false"
	 * @generated
	 */
	Action getPrevAction();

	/**
	 * Sets the value of the '{@link imaModel.Noeud#getPrevAction <em>Prev Action</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Action</em>' container reference.
	 * @see #getPrevAction()
	 * @generated
	 */
	void setPrevAction(Action value);

} // Noeud
