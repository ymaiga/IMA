/**
 */
package imaModel.impl;

import imaModel.*;

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
public class ImaModelFactoryImpl extends EFactoryImpl implements ImaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImaModelFactory init() {
		try {
			ImaModelFactory theImaModelFactory = (ImaModelFactory)EPackage.Registry.INSTANCE.getEFactory(ImaModelPackage.eNS_URI);
			if (theImaModelFactory != null) {
				return theImaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImaModelFactoryImpl() {
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
			case ImaModelPackage.PLOT: return createPlot();
			case ImaModelPackage.PRINT: return createPrint();
			case ImaModelPackage.PROG: return createProg();
			case ImaModelPackage.INIT: return createInit();
			case ImaModelPackage.HASHTAG: return createHashtag();
			case ImaModelPackage.USER: return createUser();
			case ImaModelPackage.LOCALISATION: return createLocalisation();
			case ImaModelPackage.CONDITION: return createCondition();
			case ImaModelPackage.POSITIF: return createPositif();
			case ImaModelPackage.NEGATIF: return createNegatif();
			case ImaModelPackage.AVG_RETWEET: return createAVG_Retweet();
			case ImaModelPackage.AVG_LIKE: return createAVG_Like();
			case ImaModelPackage.AVG_FOLLOWER: return createAVG_Follower();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Print createPrint() {
		PrintImpl print = new PrintImpl();
		return print;
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
	public Hashtag createHashtag() {
		HashtagImpl hashtag = new HashtagImpl();
		return hashtag;
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
	public Localisation createLocalisation() {
		LocalisationImpl localisation = new LocalisationImpl();
		return localisation;
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
	public AVG_Retweet createAVG_Retweet() {
		AVG_RetweetImpl avG_Retweet = new AVG_RetweetImpl();
		return avG_Retweet;
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
	public AVG_Follower createAVG_Follower() {
		AVG_FollowerImpl avG_Follower = new AVG_FollowerImpl();
		return avG_Follower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImaModelPackage getImaModelPackage() {
		return (ImaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImaModelPackage getPackage() {
		return ImaModelPackage.eINSTANCE;
	}

} //ImaModelFactoryImpl
