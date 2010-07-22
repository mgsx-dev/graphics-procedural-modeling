/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.ColorDef#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getColorDef()
 * @model
 * @generated
 */
public interface ColorDef extends ModuleDef
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(EObject)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getColorDef_Def()
   * @model containment="true"
   * @generated
   */
  EObject getDef();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.ColorDef#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(EObject value);

} // ColorDef
