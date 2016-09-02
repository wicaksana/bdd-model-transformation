/**
 */
package psample.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import psample.PrimitiveTypeVariable;
import psample.PsamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psample.impl.PrimitiveTypeVariableImpl#isIsParameter <em>Is Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeVariableImpl extends TypeImpl implements PrimitiveTypeVariable {
	/**
	 * The default value of the '{@link #isIsParameter() <em>Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsParameter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARAMETER_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsParameter() <em>Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsParameter()
	 * @generated
	 * @ordered
	 */
	protected boolean isParameter = IS_PARAMETER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsamplePackage.Literals.PRIMITIVE_TYPE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsParameter() {
		return isParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsParameter(boolean newIsParameter) {
		boolean oldIsParameter = isParameter;
		isParameter = newIsParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PsamplePackage.PRIMITIVE_TYPE_VARIABLE__IS_PARAMETER, oldIsParameter, isParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsamplePackage.PRIMITIVE_TYPE_VARIABLE__IS_PARAMETER:
				return isIsParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PsamplePackage.PRIMITIVE_TYPE_VARIABLE__IS_PARAMETER:
				setIsParameter((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PsamplePackage.PRIMITIVE_TYPE_VARIABLE__IS_PARAMETER:
				setIsParameter(IS_PARAMETER_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PsamplePackage.PRIMITIVE_TYPE_VARIABLE__IS_PARAMETER:
				return isParameter != IS_PARAMETER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isParameter: ");
		result.append(isParameter);
		result.append(')');
		return result.toString();
	}

} //PrimitiveTypeVariableImpl
