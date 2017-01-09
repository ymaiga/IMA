/**
 */
package imaModel.util;

import imaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see imaModel.ImaModelPackage
 * @generated
 */
public class ImaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ImaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ImaModelPackage.NOEUD: {
				Noeud noeud = (Noeud)theEObject;
				T result = caseNoeud(noeud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.FILTRE: {
				Filtre filtre = (Filtre)theEObject;
				T result = caseFiltre(filtre);
				if (result == null) result = caseNoeud(filtre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNoeud(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.PLOT: {
				Plot plot = (Plot)theEObject;
				T result = casePlot(plot);
				if (result == null) result = caseAction(plot);
				if (result == null) result = caseNoeud(plot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.PRINT: {
				Print print = (Print)theEObject;
				T result = casePrint(print);
				if (result == null) result = caseAction(print);
				if (result == null) result = caseNoeud(print);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.PROG: {
				Prog prog = (Prog)theEObject;
				T result = caseProg(prog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.INIT: {
				Init init = (Init)theEObject;
				T result = caseInit(init);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.HASHTAG: {
				Hashtag hashtag = (Hashtag)theEObject;
				T result = caseHashtag(hashtag);
				if (result == null) result = caseFiltre(hashtag);
				if (result == null) result = caseNoeud(hashtag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseFiltre(user);
				if (result == null) result = caseNoeud(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.LOCALISATION: {
				Localisation localisation = (Localisation)theEObject;
				T result = caseLocalisation(localisation);
				if (result == null) result = caseFiltre(localisation);
				if (result == null) result = caseNoeud(localisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseNoeud(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.POSITIF: {
				Positif positif = (Positif)theEObject;
				T result = casePositif(positif);
				if (result == null) result = caseAction(positif);
				if (result == null) result = caseNoeud(positif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.NEGATIF: {
				Negatif negatif = (Negatif)theEObject;
				T result = caseNegatif(negatif);
				if (result == null) result = caseAction(negatif);
				if (result == null) result = caseNoeud(negatif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.AVG_RETWEET: {
				AVG_Retweet avG_Retweet = (AVG_Retweet)theEObject;
				T result = caseAVG_Retweet(avG_Retweet);
				if (result == null) result = caseAction(avG_Retweet);
				if (result == null) result = caseNoeud(avG_Retweet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.AVG_LIKE: {
				AVG_Like avG_Like = (AVG_Like)theEObject;
				T result = caseAVG_Like(avG_Like);
				if (result == null) result = caseAction(avG_Like);
				if (result == null) result = caseNoeud(avG_Like);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImaModelPackage.AVG_FOLLOWER: {
				AVG_Follower avG_Follower = (AVG_Follower)theEObject;
				T result = caseAVG_Follower(avG_Follower);
				if (result == null) result = caseAction(avG_Follower);
				if (result == null) result = caseNoeud(avG_Follower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noeud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noeud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoeud(Noeud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiltre(Filtre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlot(Plot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrint(Print object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProg(Prog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInit(Init object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hashtag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hashtag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashtag(Hashtag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalisation(Localisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositif(Positif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negatif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negatif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegatif(Negatif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVG Retweet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVG Retweet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVG_Retweet(AVG_Retweet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVG Like</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVG Like</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVG_Like(AVG_Like object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AVG Follower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AVG Follower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAVG_Follower(AVG_Follower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ImaModelSwitch
