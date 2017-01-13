/**
 */
package imaModel2.impl;

import imaModel2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImaModel2FactoryImpl extends EFactoryImpl implements ImaModel2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImaModel2Factory init() {
		try {
			ImaModel2Factory theImaModel2Factory = (ImaModel2Factory)EPackage.Registry.INSTANCE.getEFactory(ImaModel2Package.eNS_URI);
			if (theImaModel2Factory != null) {
				return theImaModel2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImaModel2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImaModel2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ImaModel2Package.PROG: return createProg();
			case ImaModel2Package.INIT: return createInit();
			case ImaModel2Package.CONDITION: return createCondition();
			case ImaModel2Package.LOCALISATION: return createLocalisation();
			case ImaModel2Package.USER: return createUser();
			case ImaModel2Package.HASHTAG: return createHashtag();
			case ImaModel2Package.PLOT: return createPlot();
			case ImaModel2Package.AVG_LIKE: return createAVG_Like();
			case ImaModel2Package.PRINT: return createPrint();
			case ImaModel2Package.FOLLOWERS: return createFollowers();
			case ImaModel2Package.POSITIF: return createPositif();
			case ImaModel2Package.NEGATIF: return createNegatif();
			case ImaModel2Package.ARC: return createArc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prog createProg() {
		ProgImpl prog = new ProgImpl();
		return prog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init createInit() {
		InitImpl init = new InitImpl();
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Localisation createLocalisation() {
		LocalisationImpl localisation = new LocalisationImpl();
		return localisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hashtag createHashtag() {
		HashtagImpl hashtag = new HashtagImpl();
		return hashtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plot createPlot() {
		PlotImpl plot = new PlotImpl();
		return plot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AVG_Like createAVG_Like() {
		AVG_LikeImpl avG_Like = new AVG_LikeImpl();
		return avG_Like;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Followers createFollowers() {
		FollowersImpl followers = new FollowersImpl();
		return followers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positif createPositif() {
		PositifImpl positif = new PositifImpl();
		return positif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negatif createNegatif() {
		NegatifImpl negatif = new NegatifImpl();
		return negatif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arc createArc() {
		ArcImpl arc = new ArcImpl();
		return arc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImaModel2Package getImaModel2Package() {
		return (ImaModel2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImaModel2Package getPackage() {
		return ImaModel2Package.eINSTANCE;
	}

} //ImaModel2FactoryImpl
