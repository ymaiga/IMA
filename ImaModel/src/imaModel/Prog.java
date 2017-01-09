/**
 */
package imaModel;

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
 *   <li>{@link imaModel.Prog#getInit <em>Init</em>}</li>
 * </ul>
 *
 * @see imaModel.ImaModelPackage#getProg()
 * @model
 * @generated
 */
public interface Prog extends EObject {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference list.
	 * The list contents are of type {@link imaModel.Init}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference list.
	 * @see imaModel.ImaModelPackage#getProg_Init()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Init> getInit();

} // Prog
