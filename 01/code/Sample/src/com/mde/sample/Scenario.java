/**
 */
package com.mde.sample;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mde.sample.Scenario#getWhen <em>When</em>}</li>
 *   <li>{@link com.mde.sample.Scenario#getGiven <em>Given</em>}</li>
 *   <li>{@link com.mde.sample.Scenario#getThen <em>Then</em>}</li>
 *   <li>{@link com.mde.sample.Scenario#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see com.mde.sample.SamplePackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(When)
	 * @see com.mde.sample.SamplePackage#getScenario_When()
	 * @model containment="true" required="true"
	 * @generated
	 */
	When getWhen();

	/**
	 * Sets the value of the '{@link com.mde.sample.Scenario#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(When value);

	/**
	 * Returns the value of the '<em><b>Given</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given</em>' containment reference.
	 * @see #setGiven(Given)
	 * @see com.mde.sample.SamplePackage#getScenario_Given()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Given getGiven();

	/**
	 * Sets the value of the '{@link com.mde.sample.Scenario#getGiven <em>Given</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given</em>' containment reference.
	 * @see #getGiven()
	 * @generated
	 */
	void setGiven(Given value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Then)
	 * @see com.mde.sample.SamplePackage#getScenario_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Then getThen();

	/**
	 * Sets the value of the '{@link com.mde.sample.Scenario#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Then value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.mde.sample.SamplePackage#getScenario_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.mde.sample.Scenario#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Scenario
