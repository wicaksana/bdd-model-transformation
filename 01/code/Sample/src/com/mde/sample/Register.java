/**
 */
package com.mde.sample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mde.sample.Register#getStories <em>Stories</em>}</li>
 *   <li>{@link com.mde.sample.Register#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.mde.sample.SamplePackage#getRegister()
 * @model
 * @generated
 */
public interface Register extends EObject {
	/**
	 * Returns the value of the '<em><b>Stories</b></em>' containment reference list.
	 * The list contents are of type {@link com.mde.sample.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stories</em>' containment reference list.
	 * @see com.mde.sample.SamplePackage#getRegister_Stories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Story> getStories();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mde.sample.SamplePackage#getRegister_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mde.sample.Register#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Register
