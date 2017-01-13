/**
 */
package imaModel2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imaModel2.Prog#getNoeuds <em>Noeuds</em>}</li>
 *   <li>{@link imaModel2.Prog#getInit <em>Init</em>}</li>
 *   <li>{@link imaModel2.Prog#getChemin <em>Chemin</em>}</li>
 * </ul>
 *
 * @see imaModel2.ImaModel2Package#getProg()
 * @model
 * @generated
 */
public interface Prog extends EObject {
	/**
	 * Returns the value of the '<em><b>Noeuds</b></em>' containment reference list.
	 * The list contents are of type {@link imaModel2.Noeud}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noeuds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noeuds</em>' containment reference list.
	 * @see imaModel2.ImaModel2Package#getProg_Noeuds()
	 * @model containment="true"
	 * @generated
	 */
	EList<Noeud> getNoeuds();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference list.
	 * The list contents are of type {@link imaModel2.Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference list.
	 * @see imaModel2.ImaModel2Package#getProg_Init()
	 * @model containment="true"
	 * @generated
	 */
	EList<Init> getInit();

	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' containment reference list.
	 * The list contents are of type {@link imaModel2.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chemin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' containment reference list.
	 * @see imaModel2.ImaModel2Package#getProg_Chemin()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getChemin();

} // Prog
