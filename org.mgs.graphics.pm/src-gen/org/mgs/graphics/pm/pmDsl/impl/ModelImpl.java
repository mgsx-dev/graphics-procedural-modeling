/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mgs.graphics.pm.pmDsl.Model;
import org.mgs.graphics.pm.pmDsl.ModuleDef;
import org.mgs.graphics.pm.pmDsl.PmDslPackage;
import org.mgs.graphics.pm.pmDsl.Stage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.ModelImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.ModelImpl#getDefs <em>Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getStage() <em>Stage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStage()
   * @generated
   * @ordered
   */
  protected Stage stage;

  /**
   * The cached value of the '{@link #getDefs() <em>Defs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefs()
   * @generated
   * @ordered
   */
  protected EList<ModuleDef> defs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return PmDslPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stage getStage()
  {
    return stage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStage(Stage newStage, NotificationChain msgs)
  {
    Stage oldStage = stage;
    stage = newStage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmDslPackage.MODEL__STAGE, oldStage, newStage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStage(Stage newStage)
  {
    if (newStage != stage)
    {
      NotificationChain msgs = null;
      if (stage != null)
        msgs = ((InternalEObject)stage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PmDslPackage.MODEL__STAGE, null, msgs);
      if (newStage != null)
        msgs = ((InternalEObject)newStage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PmDslPackage.MODEL__STAGE, null, msgs);
      msgs = basicSetStage(newStage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.MODEL__STAGE, newStage, newStage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ModuleDef> getDefs()
  {
    if (defs == null)
    {
      defs = new EObjectContainmentEList<ModuleDef>(ModuleDef.class, this, PmDslPackage.MODEL__DEFS);
    }
    return defs;
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
      case PmDslPackage.MODEL__STAGE:
        return basicSetStage(null, msgs);
      case PmDslPackage.MODEL__DEFS:
        return ((InternalEList<?>)getDefs()).basicRemove(otherEnd, msgs);
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
      case PmDslPackage.MODEL__STAGE:
        return getStage();
      case PmDslPackage.MODEL__DEFS:
        return getDefs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PmDslPackage.MODEL__STAGE:
        setStage((Stage)newValue);
        return;
      case PmDslPackage.MODEL__DEFS:
        getDefs().clear();
        getDefs().addAll((Collection<? extends ModuleDef>)newValue);
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
      case PmDslPackage.MODEL__STAGE:
        setStage((Stage)null);
        return;
      case PmDslPackage.MODEL__DEFS:
        getDefs().clear();
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
      case PmDslPackage.MODEL__STAGE:
        return stage != null;
      case PmDslPackage.MODEL__DEFS:
        return defs != null && !defs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
