/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mgs.graphics.pm.pmDsl.PmDslFactory
 * @model kind="package"
 * @generated
 */
public interface PmDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pmDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.mgs.org/graphics/pm/PmDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pmDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PmDslPackage eINSTANCE = org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ModelImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Stage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STAGE = 1;

  /**
   * The feature id for the '<em><b>Defs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEFS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ImportImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl <em>Stage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.StageImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getStage()
   * @generated
   */
  int STAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__WIDTH = 1;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__HEIGHT = 2;

  /**
   * The feature id for the '<em><b>Depth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__DEPTH = 3;

  /**
   * The feature id for the '<em><b>Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__DURATION = 4;

  /**
   * The feature id for the '<em><b>Fps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__FPS = 5;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE__OUTPUT = 6;

  /**
   * The number of structural features of the '<em>Stage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAGE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ModuleDefImpl <em>Module Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ModuleDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getModuleDef()
   * @generated
   */
  int MODULE_DEF = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DEF__NAME = 0;

  /**
   * The number of structural features of the '<em>Module Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorDefImpl <em>Color Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ColorDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorDef()
   * @generated
   */
  int COLOR_DEF = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_DEF__NAME = MODULE_DEF__NAME;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_DEF__DEF = MODULE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Color Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_DEF_FEATURE_COUNT = MODULE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorFloatDefImpl <em>Color Float Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ColorFloatDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorFloatDef()
   * @generated
   */
  int COLOR_FLOAT_DEF = 5;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FLOAT_DEF__R = 0;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FLOAT_DEF__G = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FLOAT_DEF__B = 2;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FLOAT_DEF__A = 3;

  /**
   * The number of structural features of the '<em>Color Float Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FLOAT_DEF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorIntDefImpl <em>Color Int Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ColorIntDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorIntDef()
   * @generated
   */
  int COLOR_INT_DEF = 6;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_INT_DEF__R = 0;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_INT_DEF__G = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_INT_DEF__B = 2;

  /**
   * The feature id for the '<em><b>A</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_INT_DEF__A = 3;

  /**
   * The number of structural features of the '<em>Color Int Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_INT_DEF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorHexaDefImpl <em>Color Hexa Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ColorHexaDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorHexaDef()
   * @generated
   */
  int COLOR_HEXA_DEF = 7;

  /**
   * The feature id for the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_HEXA_DEF__S = 0;

  /**
   * The number of structural features of the '<em>Color Hexa Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_HEXA_DEF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.OperationDefImpl <em>Operation Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.OperationDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getOperationDef()
   * @generated
   */
  int OPERATION_DEF = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEF__NAME = MODULE_DEF__NAME;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEF__OUTPUT = MODULE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operation Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_DEF_FEATURE_COUNT = MODULE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.NoiseDefImpl <em>Noise Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.NoiseDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getNoiseDef()
   * @generated
   */
  int NOISE_DEF = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOISE_DEF__NAME = MODULE_DEF__NAME;

  /**
   * The feature id for the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOISE_DEF__SEED = MODULE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Frequency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOISE_DEF__FREQUENCY = MODULE_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Noise Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOISE_DEF_FEATURE_COUNT = MODULE_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.PerlinDefImpl <em>Perlin Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.PerlinDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getPerlinDef()
   * @generated
   */
  int PERLIN_DEF = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERLIN_DEF__NAME = MODULE_DEF__NAME;

  /**
   * The feature id for the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERLIN_DEF__SEED = MODULE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Iterations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERLIN_DEF__ITERATIONS = MODULE_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Turbulence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERLIN_DEF__TURBULENCE = MODULE_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Perlin Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERLIN_DEF_FEATURE_COUNT = MODULE_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.MarbleDefImpl <em>Marble Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.MarbleDefImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getMarbleDef()
   * @generated
   */
  int MARBLE_DEF = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARBLE_DEF__NAME = MODULE_DEF__NAME;

  /**
   * The feature id for the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARBLE_DEF__SEED = MODULE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Marble Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARBLE_DEF_FEATURE_COUNT = MODULE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ExpressionImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 12;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.BuiltInCallImpl <em>Built In Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.BuiltInCallImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getBuiltInCall()
   * @generated
   */
  int BUILT_IN_CALL = 13;

  /**
   * The number of structural features of the '<em>Built In Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.OperationImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.ModuleCallImpl <em>Module Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.ModuleCallImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getModuleCall()
   * @generated
   */
  int MODULE_CALL = 15;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_CALL__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Module Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.VariantExpressionImpl <em>Variant Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.VariantExpressionImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getVariantExpression()
   * @generated
   */
  int VARIANT_EXPRESSION = 16;

  /**
   * The feature id for the '<em><b>Variant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_EXPRESSION__VARIANT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variant Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.LiteralExpressionImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getLiteralExpression()
   * @generated
   */
  int LITERAL_EXPRESSION = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.INVImpl <em>INV</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.INVImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getINV()
   * @generated
   */
  int INV = 18;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV__A = BUILT_IN_CALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>INV</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INV_FEATURE_COUNT = BUILT_IN_CALL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.MIXImpl <em>MIX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.MIXImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getMIX()
   * @generated
   */
  int MIX = 19;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIX__A = BUILT_IN_CALL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIX__B = BUILT_IN_CALL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIX__T = BUILT_IN_CALL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>MIX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIX_FEATURE_COUNT = BUILT_IN_CALL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.SINImpl <em>SIN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.SINImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getSIN()
   * @generated
   */
  int SIN = 20;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIN__A = BUILT_IN_CALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SIN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIN_FEATURE_COUNT = BUILT_IN_CALL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.BOOLImpl <em>BOOL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.BOOLImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getBOOL()
   * @generated
   */
  int BOOL = 21;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL__A = BUILT_IN_CALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BOOL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FEATURE_COUNT = BUILT_IN_CALL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.SCALEImpl <em>SCALE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.SCALEImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getSCALE()
   * @generated
   */
  int SCALE = 22;

  /**
   * The feature id for the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE__RATE = BUILT_IN_CALL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE__EXPRESSION = BUILT_IN_CALL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SCALE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALE_FEATURE_COUNT = BUILT_IN_CALL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.impl.RADIALImpl <em>RADIAL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.impl.RADIALImpl
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getRADIAL()
   * @generated
   */
  int RADIAL = 23;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL__EXPRESSION = BUILT_IN_CALL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RADIAL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_FEATURE_COUNT = BUILT_IN_CALL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.mgs.graphics.pm.pmDsl.Variant <em>Variant</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.mgs.graphics.pm.pmDsl.Variant
   * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getVariant()
   * @generated
   */
  int VARIANT = 24;


  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.mgs.graphics.pm.pmDsl.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.Model#getStage <em>Stage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Stage</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Model#getStage()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Stage();

  /**
   * Returns the meta object for the containment reference list '{@link org.mgs.graphics.pm.pmDsl.Model#getDefs <em>Defs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defs</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Model#getDefs()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Defs();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.Stage <em>Stage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stage</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage
   * @generated
   */
  EClass getStage();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Stage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage#getName()
   * @see #getStage()
   * @generated
   */
  EAttribute getStage_Name();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Stage#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage#getWidth()
   * @see #getStage()
   * @generated
   */
  EAttribute getStage_Width();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Stage#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage#getHeight()
   * @see #getStage()
   * @generated
   */
  EAttribute getStage_Height();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Stage#getDepth <em>Depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Depth</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage#getDepth()
   * @see #getStage()
   * @generated
   */
  EAttribute getStage_Depth();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Stage#getDuration <em>Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duration</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage#getDuration()
   * @see #getStage()
   * @generated
   */
  EAttribute getStage_Duration();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Stage#getFps <em>Fps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fps</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage#getFps()
   * @see #getStage()
   * @generated
   */
  EAttribute getStage_Fps();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.Stage#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Stage#getOutput()
   * @see #getStage()
   * @generated
   */
  EReference getStage_Output();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.ModuleDef <em>Module Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ModuleDef
   * @generated
   */
  EClass getModuleDef();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ModuleDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ModuleDef#getName()
   * @see #getModuleDef()
   * @generated
   */
  EAttribute getModuleDef_Name();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.ColorDef <em>Color Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorDef
   * @generated
   */
  EClass getColorDef();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.ColorDef#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorDef#getDef()
   * @see #getColorDef()
   * @generated
   */
  EReference getColorDef_Def();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.ColorFloatDef <em>Color Float Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Float Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorFloatDef
   * @generated
   */
  EClass getColorFloatDef();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorFloatDef#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorFloatDef#getR()
   * @see #getColorFloatDef()
   * @generated
   */
  EAttribute getColorFloatDef_R();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorFloatDef#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorFloatDef#getG()
   * @see #getColorFloatDef()
   * @generated
   */
  EAttribute getColorFloatDef_G();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorFloatDef#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorFloatDef#getB()
   * @see #getColorFloatDef()
   * @generated
   */
  EAttribute getColorFloatDef_B();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorFloatDef#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorFloatDef#getA()
   * @see #getColorFloatDef()
   * @generated
   */
  EAttribute getColorFloatDef_A();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.ColorIntDef <em>Color Int Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Int Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorIntDef
   * @generated
   */
  EClass getColorIntDef();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorIntDef#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorIntDef#getR()
   * @see #getColorIntDef()
   * @generated
   */
  EAttribute getColorIntDef_R();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorIntDef#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorIntDef#getG()
   * @see #getColorIntDef()
   * @generated
   */
  EAttribute getColorIntDef_G();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorIntDef#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorIntDef#getB()
   * @see #getColorIntDef()
   * @generated
   */
  EAttribute getColorIntDef_B();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorIntDef#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorIntDef#getA()
   * @see #getColorIntDef()
   * @generated
   */
  EAttribute getColorIntDef_A();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.ColorHexaDef <em>Color Hexa Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Hexa Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorHexaDef
   * @generated
   */
  EClass getColorHexaDef();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.ColorHexaDef#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>S</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ColorHexaDef#getS()
   * @see #getColorHexaDef()
   * @generated
   */
  EAttribute getColorHexaDef_S();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.OperationDef <em>Operation Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.OperationDef
   * @generated
   */
  EClass getOperationDef();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.OperationDef#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.mgs.graphics.pm.pmDsl.OperationDef#getOutput()
   * @see #getOperationDef()
   * @generated
   */
  EReference getOperationDef_Output();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.NoiseDef <em>Noise Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Noise Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.NoiseDef
   * @generated
   */
  EClass getNoiseDef();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.NoiseDef#getSeed <em>Seed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seed</em>'.
   * @see org.mgs.graphics.pm.pmDsl.NoiseDef#getSeed()
   * @see #getNoiseDef()
   * @generated
   */
  EAttribute getNoiseDef_Seed();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.NoiseDef#getFrequency <em>Frequency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frequency</em>'.
   * @see org.mgs.graphics.pm.pmDsl.NoiseDef#getFrequency()
   * @see #getNoiseDef()
   * @generated
   */
  EAttribute getNoiseDef_Frequency();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.PerlinDef <em>Perlin Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Perlin Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.PerlinDef
   * @generated
   */
  EClass getPerlinDef();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getSeed <em>Seed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seed</em>'.
   * @see org.mgs.graphics.pm.pmDsl.PerlinDef#getSeed()
   * @see #getPerlinDef()
   * @generated
   */
  EAttribute getPerlinDef_Seed();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getIterations <em>Iterations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iterations</em>'.
   * @see org.mgs.graphics.pm.pmDsl.PerlinDef#getIterations()
   * @see #getPerlinDef()
   * @generated
   */
  EAttribute getPerlinDef_Iterations();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getTurbulence <em>Turbulence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Turbulence</em>'.
   * @see org.mgs.graphics.pm.pmDsl.PerlinDef#getTurbulence()
   * @see #getPerlinDef()
   * @generated
   */
  EAttribute getPerlinDef_Turbulence();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.MarbleDef <em>Marble Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Marble Def</em>'.
   * @see org.mgs.graphics.pm.pmDsl.MarbleDef
   * @generated
   */
  EClass getMarbleDef();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.MarbleDef#getSeed <em>Seed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seed</em>'.
   * @see org.mgs.graphics.pm.pmDsl.MarbleDef#getSeed()
   * @see #getMarbleDef()
   * @generated
   */
  EAttribute getMarbleDef_Seed();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.BuiltInCall <em>Built In Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Call</em>'.
   * @see org.mgs.graphics.pm.pmDsl.BuiltInCall
   * @generated
   */
  EClass getBuiltInCall();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.Operation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Operation#getLeft()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.Operation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Operation#getOp()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.Operation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Operation#getRight()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Right();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.ModuleCall <em>Module Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Call</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ModuleCall
   * @generated
   */
  EClass getModuleCall();

  /**
   * Returns the meta object for the reference '{@link org.mgs.graphics.pm.pmDsl.ModuleCall#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.mgs.graphics.pm.pmDsl.ModuleCall#getRef()
   * @see #getModuleCall()
   * @generated
   */
  EReference getModuleCall_Ref();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.VariantExpression <em>Variant Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variant Expression</em>'.
   * @see org.mgs.graphics.pm.pmDsl.VariantExpression
   * @generated
   */
  EClass getVariantExpression();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.VariantExpression#getVariant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variant</em>'.
   * @see org.mgs.graphics.pm.pmDsl.VariantExpression#getVariant()
   * @see #getVariantExpression()
   * @generated
   */
  EAttribute getVariantExpression_Variant();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Expression</em>'.
   * @see org.mgs.graphics.pm.pmDsl.LiteralExpression
   * @generated
   */
  EClass getLiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link org.mgs.graphics.pm.pmDsl.LiteralExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.mgs.graphics.pm.pmDsl.LiteralExpression#getValue()
   * @see #getLiteralExpression()
   * @generated
   */
  EAttribute getLiteralExpression_Value();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.INV <em>INV</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INV</em>'.
   * @see org.mgs.graphics.pm.pmDsl.INV
   * @generated
   */
  EClass getINV();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.INV#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.mgs.graphics.pm.pmDsl.INV#getA()
   * @see #getINV()
   * @generated
   */
  EReference getINV_A();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.MIX <em>MIX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MIX</em>'.
   * @see org.mgs.graphics.pm.pmDsl.MIX
   * @generated
   */
  EClass getMIX();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.MIX#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.mgs.graphics.pm.pmDsl.MIX#getA()
   * @see #getMIX()
   * @generated
   */
  EReference getMIX_A();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.MIX#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.mgs.graphics.pm.pmDsl.MIX#getB()
   * @see #getMIX()
   * @generated
   */
  EReference getMIX_B();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.MIX#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.mgs.graphics.pm.pmDsl.MIX#getT()
   * @see #getMIX()
   * @generated
   */
  EReference getMIX_T();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.SIN <em>SIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SIN</em>'.
   * @see org.mgs.graphics.pm.pmDsl.SIN
   * @generated
   */
  EClass getSIN();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.SIN#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.mgs.graphics.pm.pmDsl.SIN#getA()
   * @see #getSIN()
   * @generated
   */
  EReference getSIN_A();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.BOOL <em>BOOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOL</em>'.
   * @see org.mgs.graphics.pm.pmDsl.BOOL
   * @generated
   */
  EClass getBOOL();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.BOOL#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.mgs.graphics.pm.pmDsl.BOOL#getA()
   * @see #getBOOL()
   * @generated
   */
  EReference getBOOL_A();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.SCALE <em>SCALE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SCALE</em>'.
   * @see org.mgs.graphics.pm.pmDsl.SCALE
   * @generated
   */
  EClass getSCALE();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.SCALE#getRate <em>Rate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rate</em>'.
   * @see org.mgs.graphics.pm.pmDsl.SCALE#getRate()
   * @see #getSCALE()
   * @generated
   */
  EReference getSCALE_Rate();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.SCALE#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.mgs.graphics.pm.pmDsl.SCALE#getExpression()
   * @see #getSCALE()
   * @generated
   */
  EReference getSCALE_Expression();

  /**
   * Returns the meta object for class '{@link org.mgs.graphics.pm.pmDsl.RADIAL <em>RADIAL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RADIAL</em>'.
   * @see org.mgs.graphics.pm.pmDsl.RADIAL
   * @generated
   */
  EClass getRADIAL();

  /**
   * Returns the meta object for the containment reference '{@link org.mgs.graphics.pm.pmDsl.RADIAL#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.mgs.graphics.pm.pmDsl.RADIAL#getExpression()
   * @see #getRADIAL()
   * @generated
   */
  EReference getRADIAL_Expression();

  /**
   * Returns the meta object for enum '{@link org.mgs.graphics.pm.pmDsl.Variant <em>Variant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Variant</em>'.
   * @see org.mgs.graphics.pm.pmDsl.Variant
   * @generated
   */
  EEnum getVariant();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PmDslFactory getPmDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ModelImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Stage</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STAGE = eINSTANCE.getModel_Stage();

    /**
     * The meta object literal for the '<em><b>Defs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEFS = eINSTANCE.getModel_Defs();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ImportImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl <em>Stage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.StageImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getStage()
     * @generated
     */
    EClass STAGE = eINSTANCE.getStage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAGE__WIDTH = eINSTANCE.getStage_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAGE__HEIGHT = eINSTANCE.getStage_Height();

    /**
     * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAGE__DEPTH = eINSTANCE.getStage_Depth();

    /**
     * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAGE__DURATION = eINSTANCE.getStage_Duration();

    /**
     * The meta object literal for the '<em><b>Fps</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAGE__FPS = eINSTANCE.getStage_Fps();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAGE__OUTPUT = eINSTANCE.getStage_Output();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ModuleDefImpl <em>Module Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ModuleDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getModuleDef()
     * @generated
     */
    EClass MODULE_DEF = eINSTANCE.getModuleDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_DEF__NAME = eINSTANCE.getModuleDef_Name();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorDefImpl <em>Color Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ColorDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorDef()
     * @generated
     */
    EClass COLOR_DEF = eINSTANCE.getColorDef();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_DEF__DEF = eINSTANCE.getColorDef_Def();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorFloatDefImpl <em>Color Float Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ColorFloatDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorFloatDef()
     * @generated
     */
    EClass COLOR_FLOAT_DEF = eINSTANCE.getColorFloatDef();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FLOAT_DEF__R = eINSTANCE.getColorFloatDef_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FLOAT_DEF__G = eINSTANCE.getColorFloatDef_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FLOAT_DEF__B = eINSTANCE.getColorFloatDef_B();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FLOAT_DEF__A = eINSTANCE.getColorFloatDef_A();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorIntDefImpl <em>Color Int Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ColorIntDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorIntDef()
     * @generated
     */
    EClass COLOR_INT_DEF = eINSTANCE.getColorIntDef();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_INT_DEF__R = eINSTANCE.getColorIntDef_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_INT_DEF__G = eINSTANCE.getColorIntDef_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_INT_DEF__B = eINSTANCE.getColorIntDef_B();

    /**
     * The meta object literal for the '<em><b>A</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_INT_DEF__A = eINSTANCE.getColorIntDef_A();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ColorHexaDefImpl <em>Color Hexa Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ColorHexaDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getColorHexaDef()
     * @generated
     */
    EClass COLOR_HEXA_DEF = eINSTANCE.getColorHexaDef();

    /**
     * The meta object literal for the '<em><b>S</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_HEXA_DEF__S = eINSTANCE.getColorHexaDef_S();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.OperationDefImpl <em>Operation Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.OperationDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getOperationDef()
     * @generated
     */
    EClass OPERATION_DEF = eINSTANCE.getOperationDef();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_DEF__OUTPUT = eINSTANCE.getOperationDef_Output();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.NoiseDefImpl <em>Noise Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.NoiseDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getNoiseDef()
     * @generated
     */
    EClass NOISE_DEF = eINSTANCE.getNoiseDef();

    /**
     * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOISE_DEF__SEED = eINSTANCE.getNoiseDef_Seed();

    /**
     * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOISE_DEF__FREQUENCY = eINSTANCE.getNoiseDef_Frequency();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.PerlinDefImpl <em>Perlin Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.PerlinDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getPerlinDef()
     * @generated
     */
    EClass PERLIN_DEF = eINSTANCE.getPerlinDef();

    /**
     * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERLIN_DEF__SEED = eINSTANCE.getPerlinDef_Seed();

    /**
     * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERLIN_DEF__ITERATIONS = eINSTANCE.getPerlinDef_Iterations();

    /**
     * The meta object literal for the '<em><b>Turbulence</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERLIN_DEF__TURBULENCE = eINSTANCE.getPerlinDef_Turbulence();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.MarbleDefImpl <em>Marble Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.MarbleDefImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getMarbleDef()
     * @generated
     */
    EClass MARBLE_DEF = eINSTANCE.getMarbleDef();

    /**
     * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARBLE_DEF__SEED = eINSTANCE.getMarbleDef_Seed();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ExpressionImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.BuiltInCallImpl <em>Built In Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.BuiltInCallImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getBuiltInCall()
     * @generated
     */
    EClass BUILT_IN_CALL = eINSTANCE.getBuiltInCall();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.OperationImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__LEFT = eINSTANCE.getOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OP = eINSTANCE.getOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RIGHT = eINSTANCE.getOperation_Right();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.ModuleCallImpl <em>Module Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.ModuleCallImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getModuleCall()
     * @generated
     */
    EClass MODULE_CALL = eINSTANCE.getModuleCall();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_CALL__REF = eINSTANCE.getModuleCall_Ref();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.VariantExpressionImpl <em>Variant Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.VariantExpressionImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getVariantExpression()
     * @generated
     */
    EClass VARIANT_EXPRESSION = eINSTANCE.getVariantExpression();

    /**
     * The meta object literal for the '<em><b>Variant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIANT_EXPRESSION__VARIANT = eINSTANCE.getVariantExpression_Variant();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.LiteralExpressionImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getLiteralExpression()
     * @generated
     */
    EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__VALUE = eINSTANCE.getLiteralExpression_Value();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.INVImpl <em>INV</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.INVImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getINV()
     * @generated
     */
    EClass INV = eINSTANCE.getINV();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INV__A = eINSTANCE.getINV_A();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.MIXImpl <em>MIX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.MIXImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getMIX()
     * @generated
     */
    EClass MIX = eINSTANCE.getMIX();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIX__A = eINSTANCE.getMIX_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIX__B = eINSTANCE.getMIX_B();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIX__T = eINSTANCE.getMIX_T();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.SINImpl <em>SIN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.SINImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getSIN()
     * @generated
     */
    EClass SIN = eINSTANCE.getSIN();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIN__A = eINSTANCE.getSIN_A();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.BOOLImpl <em>BOOL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.BOOLImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getBOOL()
     * @generated
     */
    EClass BOOL = eINSTANCE.getBOOL();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOL__A = eINSTANCE.getBOOL_A();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.SCALEImpl <em>SCALE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.SCALEImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getSCALE()
     * @generated
     */
    EClass SCALE = eINSTANCE.getSCALE();

    /**
     * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCALE__RATE = eINSTANCE.getSCALE_Rate();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCALE__EXPRESSION = eINSTANCE.getSCALE_Expression();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.impl.RADIALImpl <em>RADIAL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.impl.RADIALImpl
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getRADIAL()
     * @generated
     */
    EClass RADIAL = eINSTANCE.getRADIAL();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL__EXPRESSION = eINSTANCE.getRADIAL_Expression();

    /**
     * The meta object literal for the '{@link org.mgs.graphics.pm.pmDsl.Variant <em>Variant</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.mgs.graphics.pm.pmDsl.Variant
     * @see org.mgs.graphics.pm.pmDsl.impl.PmDslPackageImpl#getVariant()
     * @generated
     */
    EEnum VARIANT = eINSTANCE.getVariant();

  }

} //PmDslPackage
