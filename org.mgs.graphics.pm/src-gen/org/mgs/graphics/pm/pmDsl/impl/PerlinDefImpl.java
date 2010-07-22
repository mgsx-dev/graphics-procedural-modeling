/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mgs.graphics.pm.pmDsl.PerlinDef;
import org.mgs.graphics.pm.pmDsl.PmDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perlin Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.PerlinDefImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.PerlinDefImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.PerlinDefImpl#getTurbulence <em>Turbulence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerlinDefImpl extends ModuleDefImpl implements PerlinDef
{
  /**
   * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeed()
   * @generated
   * @ordered
   */
  protected static final int SEED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeed()
   * @generated
   * @ordered
   */
  protected int seed = SEED_EDEFAULT;

  /**
   * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterations()
   * @generated
   * @ordered
   */
  protected static final int ITERATIONS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterations()
   * @generated
   * @ordered
   */
  protected int iterations = ITERATIONS_EDEFAULT;

  /**
   * The default value of the '{@link #getTurbulence() <em>Turbulence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurbulence()
   * @generated
   * @ordered
   */
  protected static final float TURBULENCE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getTurbulence() <em>Turbulence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurbulence()
   * @generated
   * @ordered
   */
  protected float turbulence = TURBULENCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PerlinDefImpl()
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
    return PmDslPackage.Literals.PERLIN_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSeed()
  {
    return seed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeed(int newSeed)
  {
    int oldSeed = seed;
    seed = newSeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.PERLIN_DEF__SEED, oldSeed, seed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIterations()
  {
    return iterations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIterations(int newIterations)
  {
    int oldIterations = iterations;
    iterations = newIterations;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.PERLIN_DEF__ITERATIONS, oldIterations, iterations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getTurbulence()
  {
    return turbulence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurbulence(float newTurbulence)
  {
    float oldTurbulence = turbulence;
    turbulence = newTurbulence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.PERLIN_DEF__TURBULENCE, oldTurbulence, turbulence));
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
      case PmDslPackage.PERLIN_DEF__SEED:
        return getSeed();
      case PmDslPackage.PERLIN_DEF__ITERATIONS:
        return getIterations();
      case PmDslPackage.PERLIN_DEF__TURBULENCE:
        return getTurbulence();
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
      case PmDslPackage.PERLIN_DEF__SEED:
        setSeed((Integer)newValue);
        return;
      case PmDslPackage.PERLIN_DEF__ITERATIONS:
        setIterations((Integer)newValue);
        return;
      case PmDslPackage.PERLIN_DEF__TURBULENCE:
        setTurbulence((Float)newValue);
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
      case PmDslPackage.PERLIN_DEF__SEED:
        setSeed(SEED_EDEFAULT);
        return;
      case PmDslPackage.PERLIN_DEF__ITERATIONS:
        setIterations(ITERATIONS_EDEFAULT);
        return;
      case PmDslPackage.PERLIN_DEF__TURBULENCE:
        setTurbulence(TURBULENCE_EDEFAULT);
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
      case PmDslPackage.PERLIN_DEF__SEED:
        return seed != SEED_EDEFAULT;
      case PmDslPackage.PERLIN_DEF__ITERATIONS:
        return iterations != ITERATIONS_EDEFAULT;
      case PmDslPackage.PERLIN_DEF__TURBULENCE:
        return turbulence != TURBULENCE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (seed: ");
    result.append(seed);
    result.append(", iterations: ");
    result.append(iterations);
    result.append(", turbulence: ");
    result.append(turbulence);
    result.append(')');
    return result.toString();
  }

} //PerlinDefImpl
