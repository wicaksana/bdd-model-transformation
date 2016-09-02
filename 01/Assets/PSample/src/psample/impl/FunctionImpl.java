/**
 */
package psample.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import psample.Function;
import psample.PrimitiveTypeVariable;
import psample.PsamplePackage;
import psample.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psample.impl.FunctionImpl#getPrimitivetypevariable <em>Primitivetypevariable</em>}</li>
 *   <li>{@link psample.impl.FunctionImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends MemberImpl implements Function {
	/**
	 * The cached value of the '{@link #getPrimitivetypevariable() <em>Primitivetypevariable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitivetypevariable()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveTypeVariable> primitivetypevariable;
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsamplePackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveTypeVariable> getPrimitivetypevariable() {
		if (primitivetypevariable == null) {
			primitivetypevariable = new EObjectContainmentEList<PrimitiveTypeVariable>(PrimitiveTypeVariable.class, this, PsamplePackage.FUNCTION__PRIMITIVETYPEVARIABLE);
		}
		return primitivetypevariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this, PsamplePackage.FUNCTION__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsamplePackage.FUNCTION__PRIMITIVETYPEVARIABLE:
				return ((InternalEList<?>)getPrimitivetypevariable()).basicRemove(otherEnd, msgs);
			case PsamplePackage.FUNCTION__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PsamplePackage.FUNCTION__PRIMITIVETYPEVARIABLE:
				return getPrimitivetypevariable();
			case PsamplePackage.FUNCTION__VARIABLE:
				return getVariable();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PsamplePackage.FUNCTION__PRIMITIVETYPEVARIABLE:
				getPrimitivetypevariable().clear();
				getPrimitivetypevariable().addAll((Collection<? extends PrimitiveTypeVariable>)newValue);
				return;
			case PsamplePackage.FUNCTION__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
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
			case PsamplePackage.FUNCTION__PRIMITIVETYPEVARIABLE:
				getPrimitivetypevariable().clear();
				return;
			case PsamplePackage.FUNCTION__VARIABLE:
				getVariable().clear();
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
			case PsamplePackage.FUNCTION__PRIMITIVETYPEVARIABLE:
				return primitivetypevariable != null && !primitivetypevariable.isEmpty();
			case PsamplePackage.FUNCTION__VARIABLE:
				return variable != null && !variable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl
