/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mgs.graphics.pm.pmDsl.BuiltInCall;
import org.mgs.graphics.pm.pmDsl.ColorDef;
import org.mgs.graphics.pm.pmDsl.ColorFloatDef;
import org.mgs.graphics.pm.pmDsl.ColorHexaDef;
import org.mgs.graphics.pm.pmDsl.ColorIntDef;
import org.mgs.graphics.pm.pmDsl.Expression;
import org.mgs.graphics.pm.pmDsl.LiteralExpression;
import org.mgs.graphics.pm.pmDsl.MarbleDef;
import org.mgs.graphics.pm.pmDsl.Model;
import org.mgs.graphics.pm.pmDsl.ModuleCall;
import org.mgs.graphics.pm.pmDsl.ModuleDef;
import org.mgs.graphics.pm.pmDsl.NoiseDef;
import org.mgs.graphics.pm.pmDsl.Operation;
import org.mgs.graphics.pm.pmDsl.OperationDef;
import org.mgs.graphics.pm.pmDsl.PerlinDef;
import org.mgs.graphics.pm.pmDsl.PmDslFactory;
import org.mgs.graphics.pm.pmDsl.PmDslPackage;
import org.mgs.graphics.pm.pmDsl.Stage;
import org.mgs.graphics.pm.pmDsl.Variant;
import org.mgs.graphics.pm.pmDsl.VariantExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PmDslPackageImpl extends EPackageImpl implements PmDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorFloatDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorIntDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorHexaDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noiseDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass perlinDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass marbleDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variantExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scaleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum variantEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PmDslPackageImpl()
  {
    super(eNS_URI, PmDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PmDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PmDslPackage init()
  {
    if (isInited) return (PmDslPackage)EPackage.Registry.INSTANCE.getEPackage(PmDslPackage.eNS_URI);

    // Obtain or create and register package
    PmDslPackageImpl thePmDslPackage = (PmDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PmDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PmDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePmDslPackage.createPackageContents();

    // Initialize created meta-data
    thePmDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePmDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PmDslPackage.eNS_URI, thePmDslPackage);
    return thePmDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Stage()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Defs()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStage()
  {
    return stageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStage_Name()
  {
    return (EAttribute)stageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStage_Width()
  {
    return (EAttribute)stageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStage_Height()
  {
    return (EAttribute)stageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStage_Depth()
  {
    return (EAttribute)stageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStage_Duration()
  {
    return (EAttribute)stageEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStage_Fps()
  {
    return (EAttribute)stageEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStage_Output()
  {
    return (EReference)stageEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleDef()
  {
    return moduleDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModuleDef_Name()
  {
    return (EAttribute)moduleDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorDef()
  {
    return colorDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorDef_Def()
  {
    return (EReference)colorDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorFloatDef()
  {
    return colorFloatDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFloatDef_R()
  {
    return (EAttribute)colorFloatDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFloatDef_G()
  {
    return (EAttribute)colorFloatDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFloatDef_B()
  {
    return (EAttribute)colorFloatDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFloatDef_A()
  {
    return (EAttribute)colorFloatDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorIntDef()
  {
    return colorIntDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorIntDef_R()
  {
    return (EAttribute)colorIntDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorIntDef_G()
  {
    return (EAttribute)colorIntDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorIntDef_B()
  {
    return (EAttribute)colorIntDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorIntDef_A()
  {
    return (EAttribute)colorIntDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorHexaDef()
  {
    return colorHexaDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorHexaDef_S()
  {
    return (EAttribute)colorHexaDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationDef()
  {
    return operationDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationDef_Output()
  {
    return (EReference)operationDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoiseDef()
  {
    return noiseDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNoiseDef_Seed()
  {
    return (EAttribute)noiseDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNoiseDef_Frequency()
  {
    return (EAttribute)noiseDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPerlinDef()
  {
    return perlinDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerlinDef_Seed()
  {
    return (EAttribute)perlinDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerlinDef_Iterations()
  {
    return (EAttribute)perlinDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPerlinDef_Turbulence()
  {
    return (EAttribute)perlinDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMarbleDef()
  {
    return marbleDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMarbleDef_Seed()
  {
    return (EAttribute)marbleDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInCall()
  {
    return builtInCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Left()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Op()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Right()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleCall()
  {
    return moduleCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModuleCall_Ref()
  {
    return (EReference)moduleCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariantExpression()
  {
    return variantExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariantExpression_Variant()
  {
    return (EAttribute)variantExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralExpression()
  {
    return literalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralExpression_Value()
  {
    return (EAttribute)literalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINV()
  {
    return invEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getINV_A()
  {
    return (EReference)invEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMIX()
  {
    return mixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMIX_A()
  {
    return (EReference)mixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMIX_B()
  {
    return (EReference)mixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMIX_T()
  {
    return (EReference)mixEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSIN()
  {
    return sinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSIN_A()
  {
    return (EReference)sinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBOOL()
  {
    return boolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBOOL_A()
  {
    return (EReference)boolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSCALE()
  {
    return scaleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCALE_Rate()
  {
    return (EReference)scaleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSCALE_Expression()
  {
    return (EReference)scaleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRADIAL()
  {
    return radialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRADIAL_Expression()
  {
    return (EReference)radialEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVariant()
  {
    return variantEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmDslFactory getPmDslFactory()
  {
    return (PmDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__STAGE);
    createEReference(modelEClass, MODEL__DEFS);

    stageEClass = createEClass(STAGE);
    createEAttribute(stageEClass, STAGE__NAME);
    createEAttribute(stageEClass, STAGE__WIDTH);
    createEAttribute(stageEClass, STAGE__HEIGHT);
    createEAttribute(stageEClass, STAGE__DEPTH);
    createEAttribute(stageEClass, STAGE__DURATION);
    createEAttribute(stageEClass, STAGE__FPS);
    createEReference(stageEClass, STAGE__OUTPUT);

    moduleDefEClass = createEClass(MODULE_DEF);
    createEAttribute(moduleDefEClass, MODULE_DEF__NAME);

    colorDefEClass = createEClass(COLOR_DEF);
    createEReference(colorDefEClass, COLOR_DEF__DEF);

    colorFloatDefEClass = createEClass(COLOR_FLOAT_DEF);
    createEAttribute(colorFloatDefEClass, COLOR_FLOAT_DEF__R);
    createEAttribute(colorFloatDefEClass, COLOR_FLOAT_DEF__G);
    createEAttribute(colorFloatDefEClass, COLOR_FLOAT_DEF__B);
    createEAttribute(colorFloatDefEClass, COLOR_FLOAT_DEF__A);

    colorIntDefEClass = createEClass(COLOR_INT_DEF);
    createEAttribute(colorIntDefEClass, COLOR_INT_DEF__R);
    createEAttribute(colorIntDefEClass, COLOR_INT_DEF__G);
    createEAttribute(colorIntDefEClass, COLOR_INT_DEF__B);
    createEAttribute(colorIntDefEClass, COLOR_INT_DEF__A);

    colorHexaDefEClass = createEClass(COLOR_HEXA_DEF);
    createEAttribute(colorHexaDefEClass, COLOR_HEXA_DEF__S);

    operationDefEClass = createEClass(OPERATION_DEF);
    createEReference(operationDefEClass, OPERATION_DEF__OUTPUT);

    noiseDefEClass = createEClass(NOISE_DEF);
    createEAttribute(noiseDefEClass, NOISE_DEF__SEED);
    createEAttribute(noiseDefEClass, NOISE_DEF__FREQUENCY);

    perlinDefEClass = createEClass(PERLIN_DEF);
    createEAttribute(perlinDefEClass, PERLIN_DEF__SEED);
    createEAttribute(perlinDefEClass, PERLIN_DEF__ITERATIONS);
    createEAttribute(perlinDefEClass, PERLIN_DEF__TURBULENCE);

    marbleDefEClass = createEClass(MARBLE_DEF);
    createEAttribute(marbleDefEClass, MARBLE_DEF__SEED);

    expressionEClass = createEClass(EXPRESSION);

    builtInCallEClass = createEClass(BUILT_IN_CALL);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__LEFT);
    createEAttribute(operationEClass, OPERATION__OP);
    createEReference(operationEClass, OPERATION__RIGHT);

    moduleCallEClass = createEClass(MODULE_CALL);
    createEReference(moduleCallEClass, MODULE_CALL__REF);

    variantExpressionEClass = createEClass(VARIANT_EXPRESSION);
    createEAttribute(variantExpressionEClass, VARIANT_EXPRESSION__VARIANT);

    literalExpressionEClass = createEClass(LITERAL_EXPRESSION);
    createEAttribute(literalExpressionEClass, LITERAL_EXPRESSION__VALUE);

    invEClass = createEClass(INV);
    createEReference(invEClass, INV__A);

    mixEClass = createEClass(MIX);
    createEReference(mixEClass, MIX__A);
    createEReference(mixEClass, MIX__B);
    createEReference(mixEClass, MIX__T);

    sinEClass = createEClass(SIN);
    createEReference(sinEClass, SIN__A);

    boolEClass = createEClass(BOOL);
    createEReference(boolEClass, BOOL__A);

    scaleEClass = createEClass(SCALE);
    createEReference(scaleEClass, SCALE__RATE);
    createEReference(scaleEClass, SCALE__EXPRESSION);

    radialEClass = createEClass(RADIAL);
    createEReference(radialEClass, RADIAL__EXPRESSION);

    // Create enums
    variantEEnum = createEEnum(VARIANT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    colorDefEClass.getESuperTypes().add(this.getModuleDef());
    operationDefEClass.getESuperTypes().add(this.getModuleDef());
    noiseDefEClass.getESuperTypes().add(this.getModuleDef());
    perlinDefEClass.getESuperTypes().add(this.getModuleDef());
    marbleDefEClass.getESuperTypes().add(this.getModuleDef());
    builtInCallEClass.getESuperTypes().add(this.getExpression());
    operationEClass.getESuperTypes().add(this.getExpression());
    moduleCallEClass.getESuperTypes().add(this.getExpression());
    variantExpressionEClass.getESuperTypes().add(this.getExpression());
    literalExpressionEClass.getESuperTypes().add(this.getExpression());
    invEClass.getESuperTypes().add(this.getBuiltInCall());
    mixEClass.getESuperTypes().add(this.getBuiltInCall());
    sinEClass.getESuperTypes().add(this.getBuiltInCall());
    boolEClass.getESuperTypes().add(this.getBuiltInCall());
    scaleEClass.getESuperTypes().add(this.getBuiltInCall());
    radialEClass.getESuperTypes().add(this.getBuiltInCall());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Stage(), this.getStage(), null, "stage", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Defs(), this.getModuleDef(), null, "defs", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stageEClass, Stage.class, "Stage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStage_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStage_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStage_Depth(), ecorePackage.getEInt(), "depth", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStage_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStage_Fps(), ecorePackage.getEInt(), "fps", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStage_Output(), this.getExpression(), null, "output", null, 0, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleDefEClass, ModuleDef.class, "ModuleDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModuleDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModuleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorDefEClass, ColorDef.class, "ColorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorDef_Def(), ecorePackage.getEObject(), null, "def", null, 0, 1, ColorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorFloatDefEClass, ColorFloatDef.class, "ColorFloatDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorFloatDef_R(), ecorePackage.getEFloat(), "r", null, 0, 1, ColorFloatDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFloatDef_G(), ecorePackage.getEFloat(), "g", null, 0, 1, ColorFloatDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFloatDef_B(), ecorePackage.getEFloat(), "b", null, 0, 1, ColorFloatDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFloatDef_A(), ecorePackage.getEFloat(), "a", null, 0, 1, ColorFloatDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorIntDefEClass, ColorIntDef.class, "ColorIntDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorIntDef_R(), ecorePackage.getEInt(), "r", null, 0, 1, ColorIntDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorIntDef_G(), ecorePackage.getEInt(), "g", null, 0, 1, ColorIntDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorIntDef_B(), ecorePackage.getEInt(), "b", null, 0, 1, ColorIntDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorIntDef_A(), ecorePackage.getEInt(), "a", null, 0, 1, ColorIntDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorHexaDefEClass, ColorHexaDef.class, "ColorHexaDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColorHexaDef_S(), ecorePackage.getEString(), "s", null, 0, 1, ColorHexaDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationDefEClass, OperationDef.class, "OperationDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationDef_Output(), this.getExpression(), null, "output", null, 0, 1, OperationDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noiseDefEClass, NoiseDef.class, "NoiseDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNoiseDef_Seed(), ecorePackage.getEInt(), "seed", null, 0, 1, NoiseDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNoiseDef_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, NoiseDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(perlinDefEClass, PerlinDef.class, "PerlinDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPerlinDef_Seed(), ecorePackage.getEInt(), "seed", null, 0, 1, PerlinDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerlinDef_Iterations(), ecorePackage.getEInt(), "iterations", null, 0, 1, PerlinDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPerlinDef_Turbulence(), ecorePackage.getEFloat(), "turbulence", null, 0, 1, PerlinDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(marbleDefEClass, MarbleDef.class, "MarbleDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMarbleDef_Seed(), ecorePackage.getEInt(), "seed", null, 0, 1, MarbleDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtInCallEClass, BuiltInCall.class, "BuiltInCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Left(), this.getExpression(), null, "left", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Op(), ecorePackage.getEString(), "op", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Right(), this.getExpression(), null, "right", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleCallEClass, ModuleCall.class, "ModuleCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModuleCall_Ref(), this.getModuleDef(), null, "ref", null, 0, 1, ModuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variantExpressionEClass, VariantExpression.class, "VariantExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariantExpression_Variant(), this.getVariant(), "variant", null, 0, 1, VariantExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralExpression_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, LiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invEClass, org.mgs.graphics.pm.pmDsl.INV.class, "INV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getINV_A(), this.getExpression(), null, "a", null, 0, 1, org.mgs.graphics.pm.pmDsl.INV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mixEClass, org.mgs.graphics.pm.pmDsl.MIX.class, "MIX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMIX_A(), this.getExpression(), null, "a", null, 0, 1, org.mgs.graphics.pm.pmDsl.MIX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMIX_B(), this.getExpression(), null, "b", null, 0, 1, org.mgs.graphics.pm.pmDsl.MIX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMIX_T(), this.getExpression(), null, "t", null, 0, 1, org.mgs.graphics.pm.pmDsl.MIX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sinEClass, org.mgs.graphics.pm.pmDsl.SIN.class, "SIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSIN_A(), this.getExpression(), null, "a", null, 0, 1, org.mgs.graphics.pm.pmDsl.SIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolEClass, org.mgs.graphics.pm.pmDsl.BOOL.class, "BOOL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBOOL_A(), this.getExpression(), null, "a", null, 0, 1, org.mgs.graphics.pm.pmDsl.BOOL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scaleEClass, org.mgs.graphics.pm.pmDsl.SCALE.class, "SCALE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSCALE_Rate(), this.getExpression(), null, "rate", null, 0, 1, org.mgs.graphics.pm.pmDsl.SCALE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSCALE_Expression(), this.getExpression(), null, "expression", null, 0, 1, org.mgs.graphics.pm.pmDsl.SCALE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(radialEClass, org.mgs.graphics.pm.pmDsl.RADIAL.class, "RADIAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRADIAL_Expression(), this.getExpression(), null, "expression", null, 0, 1, org.mgs.graphics.pm.pmDsl.RADIAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(variantEEnum, Variant.class, "Variant");
    addEEnumLiteral(variantEEnum, Variant.X);
    addEEnumLiteral(variantEEnum, Variant.Y);
    addEEnumLiteral(variantEEnum, Variant.Z);
    addEEnumLiteral(variantEEnum, Variant.U);
    addEEnumLiteral(variantEEnum, Variant.V);
    addEEnumLiteral(variantEEnum, Variant.W);
    addEEnumLiteral(variantEEnum, Variant.T);

    // Create resource
    createResource(eNS_URI);
  }

} //PmDslPackageImpl
