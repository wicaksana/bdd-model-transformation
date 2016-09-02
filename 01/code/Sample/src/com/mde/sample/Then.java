/**
 */
package com.mde.sample;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Then</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mde.sample.Then#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @see com.mde.sample.SamplePackage#getThen()
 * @model
 * @generated
 */
public interface Then extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
	 * The list contents are of type {@link com.mde.sample.Sentence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentences</em>' containment reference list.
	 * @see com.mde.sample.SamplePackage#getThen_Sentences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sentence> getSentences();

} // Then
