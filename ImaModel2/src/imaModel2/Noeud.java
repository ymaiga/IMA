/**
 */
package imaModel2;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link imaModel2.Noeud#getArcSortants <em>Arc Sortants</em>}</li>
 * </ul>
 *
 * @see imaModel2.ImaModel2Package#getNoeud()
 * @model abstract="true"
 * @generated
 */
public interface Noeud extends EObject {
	/**
	 * Returns the value of the '<em><b>Arc Sortants</b></em>' reference list.
	 * The list contents are of type {@link imaModel2.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arc Sortants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc Sortants</em>' reference list.
	 * @see imaModel2.ImaModel2Package#getNoeud_ArcSortants()
	 * @model
	 * @generated
	 */
	EList<Arc> getArcSortants();

} // Noeud
