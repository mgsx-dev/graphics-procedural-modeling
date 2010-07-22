/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOOL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.BOOL#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getBOOL()
 * @model
 * @generated
 */
public interface BOOL extends BuiltInCall
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Expression)
   * @see org.mgs.graphics.pm.pmDsl.PmDslPackage#getBOOL_A()
   * @model containment="true"
   * @generated
   */
  Expression getA();

  /**
   * Sets the value of the '{@link org.mgs.graphics.pm.pmDsl.BOOL#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Expression value);

} // BOOL
