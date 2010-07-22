/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mgs.graphics.pm.pmDsl.*;

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
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage
 * @generated
 */
public class PmDslSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PmDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PmDslPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PmDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.STAGE:
      {
        Stage stage = (Stage)theEObject;
        T result = caseStage(stage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.MODULE_DEF:
      {
        ModuleDef moduleDef = (ModuleDef)theEObject;
        T result = caseModuleDef(moduleDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.COLOR_DEF:
      {
        ColorDef colorDef = (ColorDef)theEObject;
        T result = caseColorDef(colorDef);
        if (result == null) result = caseModuleDef(colorDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.COLOR_FLOAT_DEF:
      {
        ColorFloatDef colorFloatDef = (ColorFloatDef)theEObject;
        T result = caseColorFloatDef(colorFloatDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.COLOR_INT_DEF:
      {
        ColorIntDef colorIntDef = (ColorIntDef)theEObject;
        T result = caseColorIntDef(colorIntDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.COLOR_HEXA_DEF:
      {
        ColorHexaDef colorHexaDef = (ColorHexaDef)theEObject;
        T result = caseColorHexaDef(colorHexaDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.OPERATION_DEF:
      {
        OperationDef operationDef = (OperationDef)theEObject;
        T result = caseOperationDef(operationDef);
        if (result == null) result = caseModuleDef(operationDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.NOISE_DEF:
      {
        NoiseDef noiseDef = (NoiseDef)theEObject;
        T result = caseNoiseDef(noiseDef);
        if (result == null) result = caseModuleDef(noiseDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.PERLIN_DEF:
      {
        PerlinDef perlinDef = (PerlinDef)theEObject;
        T result = casePerlinDef(perlinDef);
        if (result == null) result = caseModuleDef(perlinDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.MARBLE_DEF:
      {
        MarbleDef marbleDef = (MarbleDef)theEObject;
        T result = caseMarbleDef(marbleDef);
        if (result == null) result = caseModuleDef(marbleDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.BUILT_IN_CALL:
      {
        BuiltInCall builtInCall = (BuiltInCall)theEObject;
        T result = caseBuiltInCall(builtInCall);
        if (result == null) result = caseExpression(builtInCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseExpression(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.MODULE_CALL:
      {
        ModuleCall moduleCall = (ModuleCall)theEObject;
        T result = caseModuleCall(moduleCall);
        if (result == null) result = caseExpression(moduleCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.VARIANT_EXPRESSION:
      {
        VariantExpression variantExpression = (VariantExpression)theEObject;
        T result = caseVariantExpression(variantExpression);
        if (result == null) result = caseExpression(variantExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.LITERAL_EXPRESSION:
      {
        LiteralExpression literalExpression = (LiteralExpression)theEObject;
        T result = caseLiteralExpression(literalExpression);
        if (result == null) result = caseExpression(literalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.INV:
      {
        INV inv = (INV)theEObject;
        T result = caseINV(inv);
        if (result == null) result = caseBuiltInCall(inv);
        if (result == null) result = caseExpression(inv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.MIX:
      {
        MIX mix = (MIX)theEObject;
        T result = caseMIX(mix);
        if (result == null) result = caseBuiltInCall(mix);
        if (result == null) result = caseExpression(mix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.SIN:
      {
        SIN sin = (SIN)theEObject;
        T result = caseSIN(sin);
        if (result == null) result = caseBuiltInCall(sin);
        if (result == null) result = caseExpression(sin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.BOOL:
      {
        BOOL bool = (BOOL)theEObject;
        T result = caseBOOL(bool);
        if (result == null) result = caseBuiltInCall(bool);
        if (result == null) result = caseExpression(bool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.SCALE:
      {
        SCALE scale = (SCALE)theEObject;
        T result = caseSCALE(scale);
        if (result == null) result = caseBuiltInCall(scale);
        if (result == null) result = caseExpression(scale);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PmDslPackage.RADIAL:
      {
        RADIAL radial = (RADIAL)theEObject;
        T result = caseRADIAL(radial);
        if (result == null) result = caseBuiltInCall(radial);
        if (result == null) result = caseExpression(radial);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStage(Stage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleDef(ModuleDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorDef(ColorDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Float Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Float Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorFloatDef(ColorFloatDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Int Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Int Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorIntDef(ColorIntDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Hexa Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Hexa Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorHexaDef(ColorHexaDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationDef(OperationDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Noise Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Noise Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoiseDef(NoiseDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Perlin Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Perlin Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerlinDef(PerlinDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Marble Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Marble Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarbleDef(MarbleDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInCall(BuiltInCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleCall(ModuleCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariantExpression(VariantExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralExpression(LiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>INV</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>INV</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseINV(INV object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MIX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MIX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMIX(MIX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SIN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SIN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSIN(SIN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOOL(BOOL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SCALE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SCALE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSCALE(SCALE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RADIAL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RADIAL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRADIAL(RADIAL object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PmDslSwitch
