/**
 * <copyright>
 * </copyright>
 *
 */
package org.mgs.graphics.pm.pmDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mgs.graphics.pm.pmDsl.Expression;
import org.mgs.graphics.pm.pmDsl.PmDslPackage;
import org.mgs.graphics.pm.pmDsl.Stage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl#getFps <em>Fps</em>}</li>
 *   <li>{@link org.mgs.graphics.pm.pmDsl.impl.StageImpl#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StageImpl extends MinimalEObjectImpl.Container implements Stage
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepth()
   * @generated
   * @ordered
   */
  protected static final int DEPTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepth()
   * @generated
   * @ordered
   */
  protected int depth = DEPTH_EDEFAULT;

  /**
   * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected static final int DURATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected int duration = DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getFps() <em>Fps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFps()
   * @generated
   * @ordered
   */
  protected static final int FPS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFps() <em>Fps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFps()
   * @generated
   * @ordered
   */
  protected int fps = FPS_EDEFAULT;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected Expression output;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StageImpl()
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
    return PmDslPackage.Literals.STAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDepth()
  {
    return depth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDepth(int newDepth)
  {
    int oldDepth = depth;
    depth = newDepth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__DEPTH, oldDepth, depth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(int newDuration)
  {
    int oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__DURATION, oldDuration, duration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFps()
  {
    return fps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFps(int newFps)
  {
    int oldFps = fps;
    fps = newFps;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__FPS, oldFps, fps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(Expression newOutput, NotificationChain msgs)
  {
    Expression oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(Expression newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PmDslPackage.STAGE__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PmDslPackage.STAGE__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PmDslPackage.STAGE__OUTPUT, newOutput, newOutput));
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
      case PmDslPackage.STAGE__OUTPUT:
        return basicSetOutput(null, msgs);
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
      case PmDslPackage.STAGE__NAME:
        return getName();
      case PmDslPackage.STAGE__WIDTH:
        return getWidth();
      case PmDslPackage.STAGE__HEIGHT:
        return getHeight();
      case PmDslPackage.STAGE__DEPTH:
        return getDepth();
      case PmDslPackage.STAGE__DURATION:
        return getDuration();
      case PmDslPackage.STAGE__FPS:
        return getFps();
      case PmDslPackage.STAGE__OUTPUT:
        return getOutput();
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
      case PmDslPackage.STAGE__NAME:
        setName((String)newValue);
        return;
      case PmDslPackage.STAGE__WIDTH:
        setWidth((Integer)newValue);
        return;
      case PmDslPackage.STAGE__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case PmDslPackage.STAGE__DEPTH:
        setDepth((Integer)newValue);
        return;
      case PmDslPackage.STAGE__DURATION:
        setDuration((Integer)newValue);
        return;
      case PmDslPackage.STAGE__FPS:
        setFps((Integer)newValue);
        return;
      case PmDslPackage.STAGE__OUTPUT:
        setOutput((Expression)newValue);
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
      case PmDslPackage.STAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PmDslPackage.STAGE__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case PmDslPackage.STAGE__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case PmDslPackage.STAGE__DEPTH:
        setDepth(DEPTH_EDEFAULT);
        return;
      case PmDslPackage.STAGE__DURATION:
        setDuration(DURATION_EDEFAULT);
        return;
      case PmDslPackage.STAGE__FPS:
        setFps(FPS_EDEFAULT);
        return;
      case PmDslPackage.STAGE__OUTPUT:
        setOutput((Expression)null);
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
      case PmDslPackage.STAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PmDslPackage.STAGE__WIDTH:
        return width != WIDTH_EDEFAULT;
      case PmDslPackage.STAGE__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case PmDslPackage.STAGE__DEPTH:
        return depth != DEPTH_EDEFAULT;
      case PmDslPackage.STAGE__DURATION:
        return duration != DURATION_EDEFAULT;
      case PmDslPackage.STAGE__FPS:
        return fps != FPS_EDEFAULT;
      case PmDslPackage.STAGE__OUTPUT:
        return output != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", width: ");
    result.append(width);
    result.append(", height: ");
    result.append(height);
    result.append(", depth: ");
    result.append(depth);
    result.append(", duration: ");
    result.append(duration);
    result.append(", fps: ");
    result.append(fps);
    result.append(')');
    return result.toString();
  }

} //StageImpl
