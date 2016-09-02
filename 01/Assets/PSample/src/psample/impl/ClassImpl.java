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

import psample.Member;
import psample.PrimitiveTypeVariable;
import psample.PsamplePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link psample.impl.ClassImpl#getMember <em>Member</em>}</li>
 *   <li>{@link psample.impl.ClassImpl#getPrimitivetype <em>Primitivetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends TypedElementImpl implements psample.Class {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> member;

	/**
	 * The cached value of the '{@link #getPrimitivetype() <em>Primitivetype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitivetype()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimitiveTypeVariable> primitivetype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PsamplePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<Member>(Member.class, this, PsamplePackage.CLASS__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimitiveTypeVariable> getPrimitivetype() {
		if (primitivetype == null) {
			primitivetype = new EObjectContainmentEList<PrimitiveTypeVariable>(PrimitiveTypeVariable.class, this, PsamplePackage.CLASS__PRIMITIVETYPE);
		}
		return primitivetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PsamplePackage.CLASS__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
			case PsamplePackage.CLASS__PRIMITIVETYPE:
				return ((InternalEList<?>)getPrimitivetype()).basicRemove(otherEnd, msgs);
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
			case PsamplePackage.CLASS__MEMBER:
				return getMember();
			case PsamplePackage.CLASS__PRIMITIVETYPE:
				return getPrimitivetype();
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
			case PsamplePackage.CLASS__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Member>)newValue);
				return;
			case PsamplePackage.CLASS__PRIMITIVETYPE:
				getPrimitivetype().clear();
				getPrimitivetype().addAll((Collection<? extends PrimitiveTypeVariable>)newValue);
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
			case PsamplePackage.CLASS__MEMBER:
				getMember().clear();
				return;
			case PsamplePackage.CLASS__PRIMITIVETYPE:
				getPrimitivetype().clear();
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
			case PsamplePackage.CLASS__MEMBER:
				return member != null && !member.isEmpty();
			case PsamplePackage.CLASS__PRIMITIVETYPE:
				return primitivetype != null && !primitivetype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
