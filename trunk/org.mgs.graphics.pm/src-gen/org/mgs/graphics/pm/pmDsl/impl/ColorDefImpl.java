/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mgs.graphics.pm.pmDsl.ColorDef;
import org.mgs.graphics.pm.pmDsl.PmDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.ColorDefImpl#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorDefImpl extends ModuleDefImpl implements ColorDef
{
  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected EObject def;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorDefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PmDslPackage.Literals.COLOR_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(EObject newDef, NotificationChain msgs)
  {
    EObject oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmDslPackage.COLOR_DEF__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(EObject newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PmDslPackage.COLOR_DEF__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PmDslPackage.COLOR_DEF__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.COLOR_DEF__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PmDslPackage.COLOR_DEF__DEF:
        return basicSetDef(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PmDslPackage.COLOR_DEF__DEF:
        return getDef();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PmDslPackage.COLOR_DEF__DEF:
        setDef((EObject)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PmDslPackage.COLOR_DEF__DEF:
        setDef((EObject)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PmDslPackage.COLOR_DEF__DEF:
        return def != null;
    }
    return super.eIsSet(featureID);
  }

} //ColorDefImpl
