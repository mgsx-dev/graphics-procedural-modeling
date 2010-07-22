/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCALE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.SCALE#getRate <em>Rate</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.SCALE#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getSCALE()
 * @model
 * @generated
 */
public interface SCALE extends BuiltInCall
{
  /**
   * Returns the value of the '<em><b>Rate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rate</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rate</em>' containment reference.
   * @see #setRate(Expression)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getSCALE_Rate()
   * @model containment="true"
   * @generated
   */
  Expression getRate();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.SCALE#getRate <em>Rate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rate</em>' containment reference.
   * @see #getRate()
   * @generated
   */
  void setRate(Expression value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getSCALE_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.SCALE#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // SCALE
