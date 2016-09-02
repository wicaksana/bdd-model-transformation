/**
 */
package psample;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psample.Class#getMember <em>Member</em>}</li>
 *   <li>{@link psample.Class#getPrimitivetype <em>Primitivetype</em>}</li>
 * </ul>
 *
 * @see psample.PsamplePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link psample.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see psample.PsamplePackage#getClass_Member()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMember();

	/**
	 * Returns the value of the '<em><b>Primitivetype</b></em>' containment reference list.
	 * The list contents are of type {@link psample.PrimitiveTypeVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitivetype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitivetype</em>' containment reference list.
	 * @see psample.PsamplePackage#getClass_Primitivetype()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveTypeVariable> getPrimitivetype();

} // Class
