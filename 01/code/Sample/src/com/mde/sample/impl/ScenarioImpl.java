/**
 */
package com.mde.sample.impl;

import com.mde.sample.Given;
import com.mde.sample.SamplePackage;
import com.mde.sample.Scenario;
import com.mde.sample.Then;
import com.mde.sample.When;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mde.sample.impl.ScenarioImpl#getWhen <em>When</em>}</li>
 *   <li>{@link com.mde.sample.impl.ScenarioImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link com.mde.sample.impl.ScenarioImpl#getThen <em>Then</em>}</li>
 *   <li>{@link com.mde.sample.impl.ScenarioImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected When when;

	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected Given given;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected Then then;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SamplePackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(When newWhen, NotificationChain msgs) {
		When oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamplePackage.SCENARIO__WHEN, oldWhen, newWhen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(When newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject)when).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamplePackage.SCENARIO__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject)newWhen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamplePackage.SCENARIO__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.SCENARIO__WHEN, newWhen, newWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Given getGiven() {
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGiven(Given newGiven, NotificationChain msgs) {
		Given oldGiven = given;
		given = newGiven;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamplePackage.SCENARIO__GIVEN, oldGiven, newGiven);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGiven(Given newGiven) {
		if (newGiven != given) {
			NotificationChain msgs = null;
			if (given != null)
				msgs = ((InternalEObject)given).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamplePackage.SCENARIO__GIVEN, null, msgs);
			if (newGiven != null)
				msgs = ((InternalEObject)newGiven).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamplePackage.SCENARIO__GIVEN, null, msgs);
			msgs = basicSetGiven(newGiven, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.SCENARIO__GIVEN, newGiven, newGiven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Then getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(Then newThen, NotificationChain msgs) {
		Then oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SamplePackage.SCENARIO__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(Then newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SamplePackage.SCENARIO__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SamplePackage.SCENARIO__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.SCENARIO__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplePackage.SCENARIO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SamplePackage.SCENARIO__WHEN:
				return basicSetWhen(null, msgs);
			case SamplePackage.SCENARIO__GIVEN:
				return basicSetGiven(null, msgs);
			case SamplePackage.SCENARIO__THEN:
				return basicSetThen(null, msgs);
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
			case SamplePackage.SCENARIO__WHEN:
				return getWhen();
			case SamplePackage.SCENARIO__GIVEN:
				return getGiven();
			case SamplePackage.SCENARIO__THEN:
				return getThen();
			case SamplePackage.SCENARIO__TITLE:
				return getTitle();
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
			case SamplePackage.SCENARIO__WHEN:
				setWhen((When)newValue);
				return;
			case SamplePackage.SCENARIO__GIVEN:
				setGiven((Given)newValue);
				return;
			case SamplePackage.SCENARIO__THEN:
				setThen((Then)newValue);
				return;
			case SamplePackage.SCENARIO__TITLE:
				setTitle((String)newValue);
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
			case SamplePackage.SCENARIO__WHEN:
				setWhen((When)null);
				return;
			case SamplePackage.SCENARIO__GIVEN:
				setGiven((Given)null);
				return;
			case SamplePackage.SCENARIO__THEN:
				setThen((Then)null);
				return;
			case SamplePackage.SCENARIO__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case SamplePackage.SCENARIO__WHEN:
				return when != null;
			case SamplePackage.SCENARIO__GIVEN:
				return given != null;
			case SamplePackage.SCENARIO__THEN:
				return then != null;
			case SamplePackage.SCENARIO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (Title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
