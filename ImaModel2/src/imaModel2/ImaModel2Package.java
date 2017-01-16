/**
 */
package imaModel2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see imaModel2.ImaModel2Factory
 * @model kind="package"
 * @generated
 */
public interface ImaModel2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imaModel2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/imaModel2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imaModel2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImaModel2Package eINSTANCE = imaModel2.impl.ImaModel2PackageImpl.init();

	/**
	 * The meta object id for the '{@link imaModel2.impl.NoeudImpl <em>Noeud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.NoeudImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getNoeud()
	 * @generated
	 */
	int NOEUD = 0;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__ARC_SORTANTS = 0;

	/**
	 * The number of structural features of the '<em>Noeud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Noeud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.ProgImpl <em>Prog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.ProgImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getProg()
	 * @generated
	 */
	int PROG = 1;

	/**
	 * The feature id for the '<em><b>Noeuds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG__NOEUDS = 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG__INIT = 1;

	/**
	 * The number of structural features of the '<em>Prog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.InitImpl <em>Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.InitImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getInit()
	 * @generated
	 */
	int INIT = 2;

	/**
	 * The feature id for the '<em><b>Filtre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__FILTRE = 0;

	/**
	 * The number of structural features of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.FiltreImpl <em>Filtre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.FiltreImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getFiltre()
	 * @generated
	 */
	int FILTRE = 3;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__ARC_SORTANTS = NOEUD__ARC_SORTANTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__NAME = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filtre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filtre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE_OPERATION_COUNT = NOEUD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.ActionImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ARC_SORTANTS = NOEUD__ARC_SORTANTS;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NOEUD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.ConditionImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ARC_SORTANTS = NOEUD__ARC_SORTANTS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPERATOR = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IF = NOEUD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE = NOEUD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = NOEUD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.LocalisationImpl <em>Localisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.LocalisationImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 6;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__ARC_SORTANTS = FILTRE__ARC_SORTANTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__NAME = FILTRE__NAME;

	/**
	 * The number of structural features of the '<em>Localisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION_FEATURE_COUNT = FILTRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Localisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION_OPERATION_COUNT = FILTRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.UserImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getUser()
	 * @generated
	 */
	int USER = 7;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ARC_SORTANTS = FILTRE__ARC_SORTANTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = FILTRE__NAME;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = FILTRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = FILTRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.HashtagImpl <em>Hashtag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.HashtagImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getHashtag()
	 * @generated
	 */
	int HASHTAG = 8;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__ARC_SORTANTS = FILTRE__ARC_SORTANTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__NAME = FILTRE__NAME;

	/**
	 * The number of structural features of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_FEATURE_COUNT = FILTRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hashtag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG_OPERATION_COUNT = FILTRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.PlotImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 9;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__ARC_SORTANTS = ACTION__ARC_SORTANTS;

	/**
	 * The number of structural features of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.AVG_LikeImpl <em>AVG Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.AVG_LikeImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getAVG_Like()
	 * @generated
	 */
	int AVG_LIKE = 10;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE__ARC_SORTANTS = ACTION__ARC_SORTANTS;

	/**
	 * The number of structural features of the '<em>AVG Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AVG Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.PrintImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 11;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__ARC_SORTANTS = ACTION__ARC_SORTANTS;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.FollowersImpl <em>Followers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.FollowersImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getFollowers()
	 * @generated
	 */
	int FOLLOWERS = 12;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOWERS__ARC_SORTANTS = ACTION__ARC_SORTANTS;

	/**
	 * The number of structural features of the '<em>Followers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOWERS_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Followers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLLOWERS_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.PositifImpl <em>Positif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.PositifImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getPositif()
	 * @generated
	 */
	int POSITIF = 13;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF__ARC_SORTANTS = ACTION__ARC_SORTANTS;

	/**
	 * The number of structural features of the '<em>Positif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.NegatifImpl <em>Negatif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.NegatifImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getNegatif()
	 * @generated
	 */
	int NEGATIF = 14;

	/**
	 * The feature id for the '<em><b>Arc Sortants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF__ARC_SORTANTS = ACTION__ARC_SORTANTS;

	/**
	 * The number of structural features of the '<em>Negatif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negatif</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel2.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel2.impl.ArcImpl
	 * @see imaModel2.impl.ImaModel2PackageImpl#getArc()
	 * @generated
	 */
	int ARC = 15;

	/**
	 * The feature id for the '<em><b>Couleur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__COULEUR = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = 2;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link imaModel2.Noeud <em>Noeud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noeud</em>'.
	 * @see imaModel2.Noeud
	 * @generated
	 */
	EClass getNoeud();

	/**
	 * Returns the meta object for the containment reference list '{@link imaModel2.Noeud#getArcSortants <em>Arc Sortants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arc Sortants</em>'.
	 * @see imaModel2.Noeud#getArcSortants()
	 * @see #getNoeud()
	 * @generated
	 */
	EReference getNoeud_ArcSortants();

	/**
	 * Returns the meta object for class '{@link imaModel2.Prog <em>Prog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prog</em>'.
	 * @see imaModel2.Prog
	 * @generated
	 */
	EClass getProg();

	/**
	 * Returns the meta object for the containment reference list '{@link imaModel2.Prog#getNoeuds <em>Noeuds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Noeuds</em>'.
	 * @see imaModel2.Prog#getNoeuds()
	 * @see #getProg()
	 * @generated
	 */
	EReference getProg_Noeuds();

	/**
	 * Returns the meta object for the containment reference list '{@link imaModel2.Prog#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init</em>'.
	 * @see imaModel2.Prog#getInit()
	 * @see #getProg()
	 * @generated
	 */
	EReference getProg_Init();

	/**
	 * Returns the meta object for class '{@link imaModel2.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init</em>'.
	 * @see imaModel2.Init
	 * @generated
	 */
	EClass getInit();

	/**
	 * Returns the meta object for the reference '{@link imaModel2.Init#getFiltre <em>Filtre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filtre</em>'.
	 * @see imaModel2.Init#getFiltre()
	 * @see #getInit()
	 * @generated
	 */
	EReference getInit_Filtre();

	/**
	 * Returns the meta object for class '{@link imaModel2.Filtre <em>Filtre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtre</em>'.
	 * @see imaModel2.Filtre
	 * @generated
	 */
	EClass getFiltre();

	/**
	 * Returns the meta object for the attribute '{@link imaModel2.Filtre#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see imaModel2.Filtre#getName()
	 * @see #getFiltre()
	 * @generated
	 */
	EAttribute getFiltre_Name();

	/**
	 * Returns the meta object for class '{@link imaModel2.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see imaModel2.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link imaModel2.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see imaModel2.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link imaModel2.Condition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see imaModel2.Condition#getOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operator();

	/**
	 * Returns the meta object for the reference '{@link imaModel2.Condition#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If</em>'.
	 * @see imaModel2.Condition#getIf()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_If();

	/**
	 * Returns the meta object for the reference '{@link imaModel2.Condition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else</em>'.
	 * @see imaModel2.Condition#getElse()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Else();

	/**
	 * Returns the meta object for class '{@link imaModel2.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localisation</em>'.
	 * @see imaModel2.Localisation
	 * @generated
	 */
	EClass getLocalisation();

	/**
	 * Returns the meta object for class '{@link imaModel2.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see imaModel2.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link imaModel2.Hashtag <em>Hashtag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashtag</em>'.
	 * @see imaModel2.Hashtag
	 * @generated
	 */
	EClass getHashtag();

	/**
	 * Returns the meta object for class '{@link imaModel2.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see imaModel2.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for class '{@link imaModel2.AVG_Like <em>AVG Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVG Like</em>'.
	 * @see imaModel2.AVG_Like
	 * @generated
	 */
	EClass getAVG_Like();

	/**
	 * Returns the meta object for class '{@link imaModel2.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see imaModel2.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for class '{@link imaModel2.Followers <em>Followers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Followers</em>'.
	 * @see imaModel2.Followers
	 * @generated
	 */
	EClass getFollowers();

	/**
	 * Returns the meta object for class '{@link imaModel2.Positif <em>Positif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positif</em>'.
	 * @see imaModel2.Positif
	 * @generated
	 */
	EClass getPositif();

	/**
	 * Returns the meta object for class '{@link imaModel2.Negatif <em>Negatif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negatif</em>'.
	 * @see imaModel2.Negatif
	 * @generated
	 */
	EClass getNegatif();

	/**
	 * Returns the meta object for class '{@link imaModel2.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see imaModel2.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link imaModel2.Arc#getCouleur <em>Couleur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Couleur</em>'.
	 * @see imaModel2.Arc#getCouleur()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Couleur();

	/**
	 * Returns the meta object for the reference '{@link imaModel2.Arc#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see imaModel2.Arc#getNext()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Next();

	/**
	 * Returns the meta object for the attribute '{@link imaModel2.Arc#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see imaModel2.Arc#getId()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImaModel2Factory getImaModel2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link imaModel2.impl.NoeudImpl <em>Noeud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.NoeudImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getNoeud()
		 * @generated
		 */
		EClass NOEUD = eINSTANCE.getNoeud();

		/**
		 * The meta object literal for the '<em><b>Arc Sortants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOEUD__ARC_SORTANTS = eINSTANCE.getNoeud_ArcSortants();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.ProgImpl <em>Prog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.ProgImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getProg()
		 * @generated
		 */
		EClass PROG = eINSTANCE.getProg();

		/**
		 * The meta object literal for the '<em><b>Noeuds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG__NOEUDS = eINSTANCE.getProg_Noeuds();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG__INIT = eINSTANCE.getProg_Init();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.InitImpl <em>Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.InitImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getInit()
		 * @generated
		 */
		EClass INIT = eINSTANCE.getInit();

		/**
		 * The meta object literal for the '<em><b>Filtre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT__FILTRE = eINSTANCE.getInit_Filtre();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.FiltreImpl <em>Filtre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.FiltreImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getFiltre()
		 * @generated
		 */
		EClass FILTRE = eINSTANCE.getFiltre();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTRE__NAME = eINSTANCE.getFiltre_Name();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.ActionImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.ConditionImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__IF = eINSTANCE.getCondition_If();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE = eINSTANCE.getCondition_Else();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.LocalisationImpl <em>Localisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.LocalisationImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getLocalisation()
		 * @generated
		 */
		EClass LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.UserImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.HashtagImpl <em>Hashtag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.HashtagImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getHashtag()
		 * @generated
		 */
		EClass HASHTAG = eINSTANCE.getHashtag();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.PlotImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getPlot()
		 * @generated
		 */
		EClass PLOT = eINSTANCE.getPlot();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.AVG_LikeImpl <em>AVG Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.AVG_LikeImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getAVG_Like()
		 * @generated
		 */
		EClass AVG_LIKE = eINSTANCE.getAVG_Like();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.PrintImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.FollowersImpl <em>Followers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.FollowersImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getFollowers()
		 * @generated
		 */
		EClass FOLLOWERS = eINSTANCE.getFollowers();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.PositifImpl <em>Positif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.PositifImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getPositif()
		 * @generated
		 */
		EClass POSITIF = eINSTANCE.getPositif();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.NegatifImpl <em>Negatif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.NegatifImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getNegatif()
		 * @generated
		 */
		EClass NEGATIF = eINSTANCE.getNegatif();

		/**
		 * The meta object literal for the '{@link imaModel2.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel2.impl.ArcImpl
		 * @see imaModel2.impl.ImaModel2PackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Couleur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__COULEUR = eINSTANCE.getArc_Couleur();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__NEXT = eINSTANCE.getArc_Next();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__ID = eINSTANCE.getArc_Id();

	}

} //ImaModel2Package
