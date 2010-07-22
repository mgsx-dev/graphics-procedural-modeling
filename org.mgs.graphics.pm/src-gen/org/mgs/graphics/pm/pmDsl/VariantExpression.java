/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.VariantExpression#getVariant <em>Variant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getVariantExpression()
 * @model
 * @generated
 */
public interface VariantExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Variant</b></em>' attribute.
   * The literals are from the enumeration {@link org.mgs.graphics.pm.pmDsl.Variant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' attribute.
   * @see org.mgs.graphics.pm.pmDsl.Variant
   * @see #setVariant(Variant)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getVariantExpression_Variant()
   * @model
   * @generated
   */
  Variant getVariant();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.VariantExpression#getVariant <em>Variant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant</em>' attribute.
   * @see org.mgs.graphics.pm.pmDsl.Variant
   * @see #getVariant()
   * @generated
   */
  void setVariant(Variant value);

} // VariantExpression
