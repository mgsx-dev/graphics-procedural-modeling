/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mgs.graphics.pm.pmDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage
 * @generated
 */
public class PmDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PmDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PmDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PmDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PmDslSwitch<Adapter> modelSwitch =
    new PmDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStage(Stage object)
      {
        return createStageAdapter();
      }
      @Override
      public Adapter caseModuleDef(ModuleDef object)
      {
        return createModuleDefAdapter();
      }
      @Override
      public Adapter caseColorDef(ColorDef object)
      {
        return createColorDefAdapter();
      }
      @Override
      public Adapter caseColorFloatDef(ColorFloatDef object)
      {
        return createColorFloatDefAdapter();
      }
      @Override
      public Adapter caseColorIntDef(ColorIntDef object)
      {
        return createColorIntDefAdapter();
      }
      @Override
      public Adapter caseColorHexaDef(ColorHexaDef object)
      {
        return createColorHexaDefAdapter();
      }
      @Override
      public Adapter caseOperationDef(OperationDef object)
      {
        return createOperationDefAdapter();
      }
      @Override
      public Adapter caseNoiseDef(NoiseDef object)
      {
        return createNoiseDefAdapter();
      }
      @Override
      public Adapter casePerlinDef(PerlinDef object)
      {
        return createPerlinDefAdapter();
      }
      @Override
      public Adapter caseMarbleDef(MarbleDef object)
      {
        return createMarbleDefAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseBuiltInCall(BuiltInCall object)
      {
        return createBuiltInCallAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseModuleCall(ModuleCall object)
      {
        return createModuleCallAdapter();
      }
      @Override
      public Adapter caseVariantExpression(VariantExpression object)
      {
        return createVariantExpressionAdapter();
      }
      @Override
      public Adapter caseLiteralExpression(LiteralExpression object)
      {
        return createLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseINV(INV object)
      {
        return createINVAdapter();
      }
      @Override
      public Adapter caseMIX(MIX object)
      {
        return createMIXAdapter();
      }
      @Override
      public Adapter caseSIN(SIN object)
      {
        return createSINAdapter();
      }
      @Override
      public Adapter caseBOOL(BOOL object)
      {
        return createBOOLAdapter();
      }
      @Override
      public Adapter caseSCALE(SCALE object)
      {
        return createSCALEAdapter();
      }
      @Override
      public Adapter caseRADIAL(RADIAL object)
      {
        return createRADIALAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.Stage <em>Stage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.Stage
   * @generated
   */
  public Adapter createStageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.ModuleDef <em>Module Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.ModuleDef
   * @generated
   */
  public Adapter createModuleDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.ColorDef <em>Color Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.ColorDef
   * @generated
   */
  public Adapter createColorDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.ColorFloatDef <em>Color Float Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.ColorFloatDef
   * @generated
   */
  public Adapter createColorFloatDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.ColorIntDef <em>Color Int Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.ColorIntDef
   * @generated
   */
  public Adapter createColorIntDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.ColorHexaDef <em>Color Hexa Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.ColorHexaDef
   * @generated
   */
  public Adapter createColorHexaDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.OperationDef <em>Operation Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.OperationDef
   * @generated
   */
  public Adapter createOperationDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.NoiseDef <em>Noise Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.NoiseDef
   * @generated
   */
  public Adapter createNoiseDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.PerlinDef <em>Perlin Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.PerlinDef
   * @generated
   */
  public Adapter createPerlinDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.MarbleDef <em>Marble Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.MarbleDef
   * @generated
   */
  public Adapter createMarbleDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.BuiltInCall <em>Built In Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.BuiltInCall
   * @generated
   */
  public Adapter createBuiltInCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.ModuleCall <em>Module Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.ModuleCall
   * @generated
   */
  public Adapter createModuleCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.VariantExpression <em>Variant Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.VariantExpression
   * @generated
   */
  public Adapter createVariantExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.LiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.LiteralExpression
   * @generated
   */
  public Adapter createLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.INV <em>INV</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.INV
   * @generated
   */
  public Adapter createINVAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.MIX <em>MIX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.MIX
   * @generated
   */
  public Adapter createMIXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.SIN <em>SIN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.SIN
   * @generated
   */
  public Adapter createSINAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.BOOL <em>BOOL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.BOOL
   * @generated
   */
  public Adapter createBOOLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.SCALE <em>SCALE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.SCALE
   * @generated
   */
  public Adapter createSCALEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.mgs.graphics.pm.pmDsl.RADIAL <em>RADIAL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.mgs.graphics.pm.pmDsl.RADIAL
   * @generated
   */
  public Adapter createRADIALAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PmDslAdapterFactory
