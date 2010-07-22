/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marble Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.MarbleDef#getSeed <em>Seed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getMarbleDef()
 * @model
 * @generated
 */
public interface MarbleDef extends ModuleDef
{
  /**
   * Returns the value of the '<em><b>Seed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seed</em>' attribute.
   * @see #setSeed(int)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getMarbleDef_Seed()
   * @model
   * @generated
   */
  int getSeed();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.MarbleDef#getSeed <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seed</em>' attribute.
   * @see #getSeed()
   * @generated
   */
  void setSeed(int value);

} // MarbleDef
