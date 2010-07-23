/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.Model#getStage <em>Stage</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.Model#getDefs <em>Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.mgs.graphics.pm.pmDsl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Stage</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stage</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stage</em>' containment reference.
   * @see #setStage(Stage)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getModel_Stage()
   * @model containment="true"
   * @generated
   */
  Stage getStage();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.Model#getStage <em>Stage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stage</em>' containment reference.
   * @see #getStage()
   * @generated
   */
  void setStage(Stage value);

  /**
   * Returns the value of the '<em><b>Defs</b></em>' containment reference list.
   * The list contents are of type {@link org.mgs.graphics.pm.pmDsl.ModuleDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defs</em>' containment reference list.
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getModel_Defs()
   * @model containment="true"
   * @generated
   */
  EList<ModuleDef> getDefs();

} // Model
