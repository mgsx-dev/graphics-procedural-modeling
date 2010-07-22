/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perlin Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getIterations <em>Iterations</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getTurbulence <em>Turbulence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getPerlinDef()
 * @model
 * @generated
 */
public interface PerlinDef extends ModuleDef
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
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getPerlinDef_Seed()
   * @model
   * @generated
   */
  int getSeed();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getSeed <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seed</em>' attribute.
   * @see #getSeed()
   * @generated
   */
  void setSeed(int value);

  /**
   * Returns the value of the '<em><b>Iterations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterations</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterations</em>' attribute.
   * @see #setIterations(int)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getPerlinDef_Iterations()
   * @model
   * @generated
   */
  int getIterations();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getIterations <em>Iterations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterations</em>' attribute.
   * @see #getIterations()
   * @generated
   */
  void setIterations(int value);

  /**
   * Returns the value of the '<em><b>Turbulence</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Turbulence</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Turbulence</em>' attribute.
   * @see #setTurbulence(float)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getPerlinDef_Turbulence()
   * @model
   * @generated
   */
  float getTurbulence();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.PerlinDef#getTurbulence <em>Turbulence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Turbulence</em>' attribute.
   * @see #getTurbulence()
   * @generated
   */
  void setTurbulence(float value);

} // PerlinDef
