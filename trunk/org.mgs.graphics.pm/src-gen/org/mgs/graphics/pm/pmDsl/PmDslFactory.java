/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage
 * @generated
 */
public interface PmDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PmDslFactory eINSTANCE = org.mgs.graphics.pm.pmDsl.impl.PmDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Stage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stage</em>'.
   * @generated
   */
  Stage createStage();

  /**
   * Returns a new object of class '<em>Module Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Def</em>'.
   * @generated
   */
  ModuleDef createModuleDef();

  /**
   * Returns a new object of class '<em>Color Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Def</em>'.
   * @generated
   */
  ColorDef createColorDef();

  /**
   * Returns a new object of class '<em>Color Float Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Float Def</em>'.
   * @generated
   */
  ColorFloatDef createColorFloatDef();

  /**
   * Returns a new object of class '<em>Color Int Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Int Def</em>'.
   * @generated
   */
  ColorIntDef createColorIntDef();

  /**
   * Returns a new object of class '<em>Color Hexa Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Hexa Def</em>'.
   * @generated
   */
  ColorHexaDef createColorHexaDef();

  /**
   * Returns a new object of class '<em>Operation Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Def</em>'.
   * @generated
   */
  OperationDef createOperationDef();

  /**
   * Returns a new object of class '<em>Noise Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Noise Def</em>'.
   * @generated
   */
  NoiseDef createNoiseDef();

  /**
   * Returns a new object of class '<em>Perlin Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Perlin Def</em>'.
   * @generated
   */
  PerlinDef createPerlinDef();

  /**
   * Returns a new object of class '<em>Marble Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Marble Def</em>'.
   * @generated
   */
  MarbleDef createMarbleDef();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Built In Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Call</em>'.
   * @generated
   */
  BuiltInCall createBuiltInCall();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Module Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Call</em>'.
   * @generated
   */
  ModuleCall createModuleCall();

  /**
   * Returns a new object of class '<em>Variant Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variant Expression</em>'.
   * @generated
   */
  VariantExpression createVariantExpression();

  /**
   * Returns a new object of class '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Expression</em>'.
   * @generated
   */
  LiteralExpression createLiteralExpression();

  /**
   * Returns a new object of class '<em>INV</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>INV</em>'.
   * @generated
   */
  INV createINV();

  /**
   * Returns a new object of class '<em>MIX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MIX</em>'.
   * @generated
   */
  MIX createMIX();

  /**
   * Returns a new object of class '<em>SIN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SIN</em>'.
   * @generated
   */
  SIN createSIN();

  /**
   * Returns a new object of class '<em>BOOL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BOOL</em>'.
   * @generated
   */
  BOOL createBOOL();

  /**
   * Returns a new object of class '<em>SCALE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SCALE</em>'.
   * @generated
   */
  SCALE createSCALE();

  /**
   * Returns a new object of class '<em>RADIAL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RADIAL</em>'.
   * @generated
   */
  RADIAL createRADIAL();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PmDslPackage getPmDslPackage();

} //PmDslFactory
