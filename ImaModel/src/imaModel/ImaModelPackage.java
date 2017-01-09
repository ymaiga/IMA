/**
 */
package imaModel;

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
 * @see imaModel.ImaModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ImaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "imaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/imaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "imaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImaModelPackage eINSTANCE = imaModel.impl.ImaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link imaModel.impl.NoeudImpl <em>Noeud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.NoeudImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getNoeud()
	 * @generated
	 */
	int NOEUD = 0;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__CONDITION_IF = 0;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__CONDITION_ELSE = 1;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__PREV_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD__PREV_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Noeud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Noeud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOEUD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imaModel.impl.FiltreImpl <em>Filtre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.FiltreImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getFiltre()
	 * @generated
	 */
	int FILTRE = 1;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__CONDITION_IF = NOEUD__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__CONDITION_ELSE = NOEUD__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__PREV_FILTER = NOEUD__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__PREV_ACTION = NOEUD__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Init Filtre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__INIT_FILTRE = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__FILTER_NAME = NOEUD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE__NEXT = NOEUD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filtre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Filtre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTRE_OPERATION_COUNT = NOEUD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.ActionImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONDITION_IF = NOEUD__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONDITION_ELSE = NOEUD__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PREV_FILTER = NOEUD__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PREV_ACTION = NOEUD__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NEXT = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NOEUD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NOEUD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel.impl.PlotImpl <em>Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.PlotImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getPlot()
	 * @generated
	 */
	int PLOT = 3;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__CONDITION_IF = ACTION__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__CONDITION_ELSE = ACTION__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__PREV_FILTER = ACTION__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__PREV_ACTION = ACTION__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLOT__NEXT = ACTION__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.PrintImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 4;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CONDITION_IF = ACTION__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__CONDITION_ELSE = ACTION__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__PREV_FILTER = ACTION__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__PREV_ACTION = ACTION__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__NEXT = ACTION__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.ProgImpl <em>Prog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.ProgImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getProg()
	 * @generated
	 */
	int PROG = 5;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG__INIT = 0;

	/**
	 * The number of structural features of the '<em>Prog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Prog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link imaModel.impl.InitImpl <em>Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.InitImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getInit()
	 * @generated
	 */
	int INIT = 6;

	/**
	 * The feature id for the '<em><b>Filtre Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT__FILTRE_INIT = 0;

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
	 * The meta object id for the '{@link imaModel.impl.HashtagImpl <em>Hashtag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.HashtagImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getHashtag()
	 * @generated
	 */
	int HASHTAG = 7;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__CONDITION_IF = FILTRE__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__CONDITION_ELSE = FILTRE__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__PREV_FILTER = FILTRE__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__PREV_ACTION = FILTRE__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Init Filtre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__INIT_FILTRE = FILTRE__INIT_FILTRE;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__FILTER_NAME = FILTRE__FILTER_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASHTAG__NEXT = FILTRE__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.UserImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 8;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONDITION_IF = FILTRE__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONDITION_ELSE = FILTRE__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PREV_FILTER = FILTRE__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PREV_ACTION = FILTRE__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Init Filtre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INIT_FILTRE = FILTRE__INIT_FILTRE;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FILTER_NAME = FILTRE__FILTER_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NEXT = FILTRE__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.LocalisationImpl <em>Localisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.LocalisationImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getLocalisation()
	 * @generated
	 */
	int LOCALISATION = 9;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__CONDITION_IF = FILTRE__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__CONDITION_ELSE = FILTRE__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__PREV_FILTER = FILTRE__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__PREV_ACTION = FILTRE__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Init Filtre</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__INIT_FILTRE = FILTRE__INIT_FILTRE;

	/**
	 * The feature id for the '<em><b>Filter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__FILTER_NAME = FILTRE__FILTER_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALISATION__NEXT = FILTRE__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.ConditionImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_IF = NOEUD__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_ELSE = NOEUD__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PREV_FILTER = NOEUD__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PREV_ACTION = NOEUD__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__IF = NOEUD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE = NOEUD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPERATOR = NOEUD_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link imaModel.impl.PositifImpl <em>Positif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.PositifImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getPositif()
	 * @generated
	 */
	int POSITIF = 11;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF__CONDITION_IF = ACTION__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF__CONDITION_ELSE = ACTION__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF__PREV_FILTER = ACTION__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF__PREV_ACTION = ACTION__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIF__NEXT = ACTION__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.NegatifImpl <em>Negatif</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.NegatifImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getNegatif()
	 * @generated
	 */
	int NEGATIF = 12;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF__CONDITION_IF = ACTION__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF__CONDITION_ELSE = ACTION__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF__PREV_FILTER = ACTION__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF__PREV_ACTION = ACTION__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIF__NEXT = ACTION__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.AVG_RetweetImpl <em>AVG Retweet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.AVG_RetweetImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getAVG_Retweet()
	 * @generated
	 */
	int AVG_RETWEET = 13;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_RETWEET__CONDITION_IF = ACTION__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_RETWEET__CONDITION_ELSE = ACTION__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_RETWEET__PREV_FILTER = ACTION__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_RETWEET__PREV_ACTION = ACTION__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_RETWEET__NEXT = ACTION__NEXT;

	/**
	 * The number of structural features of the '<em>AVG Retweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_RETWEET_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AVG Retweet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_RETWEET_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link imaModel.impl.AVG_LikeImpl <em>AVG Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.AVG_LikeImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getAVG_Like()
	 * @generated
	 */
	int AVG_LIKE = 14;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE__CONDITION_IF = ACTION__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE__CONDITION_ELSE = ACTION__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE__PREV_FILTER = ACTION__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE__PREV_ACTION = ACTION__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_LIKE__NEXT = ACTION__NEXT;

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
	 * The meta object id for the '{@link imaModel.impl.AVG_FollowerImpl <em>AVG Follower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see imaModel.impl.AVG_FollowerImpl
	 * @see imaModel.impl.ImaModelPackageImpl#getAVG_Follower()
	 * @generated
	 */
	int AVG_FOLLOWER = 15;

	/**
	 * The feature id for the '<em><b>Condition If</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FOLLOWER__CONDITION_IF = ACTION__CONDITION_IF;

	/**
	 * The feature id for the '<em><b>Condition Else</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FOLLOWER__CONDITION_ELSE = ACTION__CONDITION_ELSE;

	/**
	 * The feature id for the '<em><b>Prev Filter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FOLLOWER__PREV_FILTER = ACTION__PREV_FILTER;

	/**
	 * The feature id for the '<em><b>Prev Action</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FOLLOWER__PREV_ACTION = ACTION__PREV_ACTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FOLLOWER__NEXT = ACTION__NEXT;

	/**
	 * The number of structural features of the '<em>AVG Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FOLLOWER_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AVG Follower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_FOLLOWER_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link imaModel.Noeud <em>Noeud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noeud</em>'.
	 * @see imaModel.Noeud
	 * @generated
	 */
	EClass getNoeud();

	/**
	 * Returns the meta object for the container reference '{@link imaModel.Noeud#getConditionIf <em>Condition If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Condition If</em>'.
	 * @see imaModel.Noeud#getConditionIf()
	 * @see #getNoeud()
	 * @generated
	 */
	EReference getNoeud_ConditionIf();

	/**
	 * Returns the meta object for the container reference '{@link imaModel.Noeud#getConditionElse <em>Condition Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Condition Else</em>'.
	 * @see imaModel.Noeud#getConditionElse()
	 * @see #getNoeud()
	 * @generated
	 */
	EReference getNoeud_ConditionElse();

	/**
	 * Returns the meta object for the container reference '{@link imaModel.Noeud#getPrevFilter <em>Prev Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Prev Filter</em>'.
	 * @see imaModel.Noeud#getPrevFilter()
	 * @see #getNoeud()
	 * @generated
	 */
	EReference getNoeud_PrevFilter();

	/**
	 * Returns the meta object for the container reference '{@link imaModel.Noeud#getPrevAction <em>Prev Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Prev Action</em>'.
	 * @see imaModel.Noeud#getPrevAction()
	 * @see #getNoeud()
	 * @generated
	 */
	EReference getNoeud_PrevAction();

	/**
	 * Returns the meta object for class '{@link imaModel.Filtre <em>Filtre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtre</em>'.
	 * @see imaModel.Filtre
	 * @generated
	 */
	EClass getFiltre();

	/**
	 * Returns the meta object for the container reference '{@link imaModel.Filtre#getInitFiltre <em>Init Filtre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Init Filtre</em>'.
	 * @see imaModel.Filtre#getInitFiltre()
	 * @see #getFiltre()
	 * @generated
	 */
	EReference getFiltre_InitFiltre();

	/**
	 * Returns the meta object for the attribute '{@link imaModel.Filtre#getFilterName <em>Filter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Name</em>'.
	 * @see imaModel.Filtre#getFilterName()
	 * @see #getFiltre()
	 * @generated
	 */
	EAttribute getFiltre_FilterName();

	/**
	 * Returns the meta object for the containment reference '{@link imaModel.Filtre#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see imaModel.Filtre#getNext()
	 * @see #getFiltre()
	 * @generated
	 */
	EReference getFiltre_Next();

	/**
	 * Returns the meta object for class '{@link imaModel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see imaModel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link imaModel.Action#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see imaModel.Action#getNext()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Next();

	/**
	 * Returns the meta object for class '{@link imaModel.Plot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plot</em>'.
	 * @see imaModel.Plot
	 * @generated
	 */
	EClass getPlot();

	/**
	 * Returns the meta object for class '{@link imaModel.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see imaModel.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for class '{@link imaModel.Prog <em>Prog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prog</em>'.
	 * @see imaModel.Prog
	 * @generated
	 */
	EClass getProg();

	/**
	 * Returns the meta object for the containment reference list '{@link imaModel.Prog#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Init</em>'.
	 * @see imaModel.Prog#getInit()
	 * @see #getProg()
	 * @generated
	 */
	EReference getProg_Init();

	/**
	 * Returns the meta object for class '{@link imaModel.Init <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init</em>'.
	 * @see imaModel.Init
	 * @generated
	 */
	EClass getInit();

	/**
	 * Returns the meta object for the containment reference '{@link imaModel.Init#getFiltreInit <em>Filtre Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filtre Init</em>'.
	 * @see imaModel.Init#getFiltreInit()
	 * @see #getInit()
	 * @generated
	 */
	EReference getInit_FiltreInit();

	/**
	 * Returns the meta object for class '{@link imaModel.Hashtag <em>Hashtag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hashtag</em>'.
	 * @see imaModel.Hashtag
	 * @generated
	 */
	EClass getHashtag();

	/**
	 * Returns the meta object for class '{@link imaModel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see imaModel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link imaModel.Localisation <em>Localisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localisation</em>'.
	 * @see imaModel.Localisation
	 * @generated
	 */
	EClass getLocalisation();

	/**
	 * Returns the meta object for class '{@link imaModel.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see imaModel.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link imaModel.Condition#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see imaModel.Condition#getIf()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_If();

	/**
	 * Returns the meta object for the containment reference '{@link imaModel.Condition#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see imaModel.Condition#getElse()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Else();

	/**
	 * Returns the meta object for the attribute '{@link imaModel.Condition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see imaModel.Condition#getOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operator();

	/**
	 * Returns the meta object for class '{@link imaModel.Positif <em>Positif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positif</em>'.
	 * @see imaModel.Positif
	 * @generated
	 */
	EClass getPositif();

	/**
	 * Returns the meta object for class '{@link imaModel.Negatif <em>Negatif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negatif</em>'.
	 * @see imaModel.Negatif
	 * @generated
	 */
	EClass getNegatif();

	/**
	 * Returns the meta object for class '{@link imaModel.AVG_Retweet <em>AVG Retweet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVG Retweet</em>'.
	 * @see imaModel.AVG_Retweet
	 * @generated
	 */
	EClass getAVG_Retweet();

	/**
	 * Returns the meta object for class '{@link imaModel.AVG_Like <em>AVG Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVG Like</em>'.
	 * @see imaModel.AVG_Like
	 * @generated
	 */
	EClass getAVG_Like();

	/**
	 * Returns the meta object for class '{@link imaModel.AVG_Follower <em>AVG Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AVG Follower</em>'.
	 * @see imaModel.AVG_Follower
	 * @generated
	 */
	EClass getAVG_Follower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImaModelFactory getImaModelFactory();

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
		 * The meta object literal for the '{@link imaModel.impl.NoeudImpl <em>Noeud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.NoeudImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getNoeud()
		 * @generated
		 */
		EClass NOEUD = eINSTANCE.getNoeud();

		/**
		 * The meta object literal for the '<em><b>Condition If</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOEUD__CONDITION_IF = eINSTANCE.getNoeud_ConditionIf();

		/**
		 * The meta object literal for the '<em><b>Condition Else</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOEUD__CONDITION_ELSE = eINSTANCE.getNoeud_ConditionElse();

		/**
		 * The meta object literal for the '<em><b>Prev Filter</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOEUD__PREV_FILTER = eINSTANCE.getNoeud_PrevFilter();

		/**
		 * The meta object literal for the '<em><b>Prev Action</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOEUD__PREV_ACTION = eINSTANCE.getNoeud_PrevAction();

		/**
		 * The meta object literal for the '{@link imaModel.impl.FiltreImpl <em>Filtre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.FiltreImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getFiltre()
		 * @generated
		 */
		EClass FILTRE = eINSTANCE.getFiltre();

		/**
		 * The meta object literal for the '<em><b>Init Filtre</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTRE__INIT_FILTRE = eINSTANCE.getFiltre_InitFiltre();

		/**
		 * The meta object literal for the '<em><b>Filter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTRE__FILTER_NAME = eINSTANCE.getFiltre_FilterName();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTRE__NEXT = eINSTANCE.getFiltre_Next();

		/**
		 * The meta object literal for the '{@link imaModel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.ActionImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__NEXT = eINSTANCE.getAction_Next();

		/**
		 * The meta object literal for the '{@link imaModel.impl.PlotImpl <em>Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.PlotImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getPlot()
		 * @generated
		 */
		EClass PLOT = eINSTANCE.getPlot();

		/**
		 * The meta object literal for the '{@link imaModel.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.PrintImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '{@link imaModel.impl.ProgImpl <em>Prog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.ProgImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getProg()
		 * @generated
		 */
		EClass PROG = eINSTANCE.getProg();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROG__INIT = eINSTANCE.getProg_Init();

		/**
		 * The meta object literal for the '{@link imaModel.impl.InitImpl <em>Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.InitImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getInit()
		 * @generated
		 */
		EClass INIT = eINSTANCE.getInit();

		/**
		 * The meta object literal for the '<em><b>Filtre Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT__FILTRE_INIT = eINSTANCE.getInit_FiltreInit();

		/**
		 * The meta object literal for the '{@link imaModel.impl.HashtagImpl <em>Hashtag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.HashtagImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getHashtag()
		 * @generated
		 */
		EClass HASHTAG = eINSTANCE.getHashtag();

		/**
		 * The meta object literal for the '{@link imaModel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.UserImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link imaModel.impl.LocalisationImpl <em>Localisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.LocalisationImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getLocalisation()
		 * @generated
		 */
		EClass LOCALISATION = eINSTANCE.getLocalisation();

		/**
		 * The meta object literal for the '{@link imaModel.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.ConditionImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__IF = eINSTANCE.getCondition_If();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE = eINSTANCE.getCondition_Else();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

		/**
		 * The meta object literal for the '{@link imaModel.impl.PositifImpl <em>Positif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.PositifImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getPositif()
		 * @generated
		 */
		EClass POSITIF = eINSTANCE.getPositif();

		/**
		 * The meta object literal for the '{@link imaModel.impl.NegatifImpl <em>Negatif</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.NegatifImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getNegatif()
		 * @generated
		 */
		EClass NEGATIF = eINSTANCE.getNegatif();

		/**
		 * The meta object literal for the '{@link imaModel.impl.AVG_RetweetImpl <em>AVG Retweet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.AVG_RetweetImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getAVG_Retweet()
		 * @generated
		 */
		EClass AVG_RETWEET = eINSTANCE.getAVG_Retweet();

		/**
		 * The meta object literal for the '{@link imaModel.impl.AVG_LikeImpl <em>AVG Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.AVG_LikeImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getAVG_Like()
		 * @generated
		 */
		EClass AVG_LIKE = eINSTANCE.getAVG_Like();

		/**
		 * The meta object literal for the '{@link imaModel.impl.AVG_FollowerImpl <em>AVG Follower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see imaModel.impl.AVG_FollowerImpl
		 * @see imaModel.impl.ImaModelPackageImpl#getAVG_Follower()
		 * @generated
		 */
		EClass AVG_FOLLOWER = eINSTANCE.getAVG_Follower();

	}

} //ImaModelPackage
