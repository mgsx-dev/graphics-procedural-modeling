/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mgs.graphics.pm.pmDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PmDslFactoryImpl extends EFactoryImpl implements PmDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PmDslFactory init()
  {
    try
    {
      PmDslFactory thePmDslFactory = (PmDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mgs.org/graphics/pm/PmDsl"); 
      if (thePmDslFactory != null)
      {
        return thePmDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PmDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PmDslPackage.MODEL: return createModel();
      case PmDslPackage.STAGE: return createStage();
      case PmDslPackage.MODULE_DEF: return createModuleDef();
      case PmDslPackage.COLOR_DEF: return createColorDef();
      case PmDslPackage.COLOR_FLOAT_DEF: return createColorFloatDef();
      case PmDslPackage.COLOR_INT_DEF: return createColorIntDef();
      case PmDslPackage.COLOR_HEXA_DEF: return createColorHexaDef();
      case PmDslPackage.OPERATION_DEF: return createOperationDef();
      case PmDslPackage.NOISE_DEF: return createNoiseDef();
      case PmDslPackage.PERLIN_DEF: return createPerlinDef();
      case PmDslPackage.MARBLE_DEF: return createMarbleDef();
      case PmDslPackage.EXPRESSION: return createExpression();
      case PmDslPackage.BUILT_IN_CALL: return createBuiltInCall();
      case PmDslPackage.OPERATION: return createOperation();
      case PmDslPackage.MODULE_CALL: return createModuleCall();
      case PmDslPackage.VARIANT_EXPRESSION: return createVariantExpression();
      case PmDslPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case PmDslPackage.INV: return createINV();
      case PmDslPackage.MIX: return createMIX();
      case PmDslPackage.SIN: return createSIN();
      case PmDslPackage.BOOL: return createBOOL();
      case PmDslPackage.SCALE: return createSCALE();
      case PmDslPackage.RADIAL: return createRADIAL();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PmDslPackage.VARIANT:
        return createVariantFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case PmDslPackage.VARIANT:
        return convertVariantToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stage createStage()
  {
    StageImpl stage = new StageImpl();
    return stage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleDef createModuleDef()
  {
    ModuleDefImpl moduleDef = new ModuleDefImpl();
    return moduleDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorDef createColorDef()
  {
    ColorDefImpl colorDef = new ColorDefImpl();
    return colorDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFloatDef createColorFloatDef()
  {
    ColorFloatDefImpl colorFloatDef = new ColorFloatDefImpl();
    return colorFloatDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorIntDef createColorIntDef()
  {
    ColorIntDefImpl colorIntDef = new ColorIntDefImpl();
    return colorIntDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorHexaDef createColorHexaDef()
  {
    ColorHexaDefImpl colorHexaDef = new ColorHexaDefImpl();
    return colorHexaDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationDef createOperationDef()
  {
    OperationDefImpl operationDef = new OperationDefImpl();
    return operationDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoiseDef createNoiseDef()
  {
    NoiseDefImpl noiseDef = new NoiseDefImpl();
    return noiseDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PerlinDef createPerlinDef()
  {
    PerlinDefImpl perlinDef = new PerlinDefImpl();
    return perlinDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarbleDef createMarbleDef()
  {
    MarbleDefImpl marbleDef = new MarbleDefImpl();
    return marbleDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInCall createBuiltInCall()
  {
    BuiltInCallImpl builtInCall = new BuiltInCallImpl();
    return builtInCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleCall createModuleCall()
  {
    ModuleCallImpl moduleCall = new ModuleCallImpl();
    return moduleCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantExpression createVariantExpression()
  {
    VariantExpressionImpl variantExpression = new VariantExpressionImpl();
    return variantExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INV createINV()
  {
    INVImpl inv = new INVImpl();
    return inv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MIX createMIX()
  {
    MIXImpl mix = new MIXImpl();
    return mix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SIN createSIN()
  {
    SINImpl sin = new SINImpl();
    return sin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOL createBOOL()
  {
    BOOLImpl bool = new BOOLImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SCALE createSCALE()
  {
    SCALEImpl scale = new SCALEImpl();
    return scale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RADIAL createRADIAL()
  {
    RADIALImpl radial = new RADIALImpl();
    return radial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variant createVariantFromString(EDataType eDataType, String initialValue)
  {
    Variant result = Variant.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVariantToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmDslPackage getPmDslPackage()
  {
    return (PmDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PmDslPackage getPackage()
  {
    return PmDslPackage.eINSTANCE;
  }

} //PmDslFactoryImpl
