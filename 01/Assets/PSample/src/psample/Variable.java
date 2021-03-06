/**
 */
package psample;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psample.Variable#isIsParameter <em>Is Parameter</em>}</li>
 * </ul>
 *
 * @see psample.PsamplePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Member {

	/**
	 * Returns the value of the '<em><b>Is Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Parameter</em>' attribute.
	 * @see #setIsParameter(boolean)
	 * @see psample.PsamplePackage#getVariable_IsParameter()
	 * @model
	 * @generated
	 */
	boolean isIsParameter();

	/**
	 * Sets the value of the '{@link psample.Variable#isIsParameter <em>Is Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Parameter</em>' attribute.
	 * @see #isIsParameter()
	 * @generated
	 */
	void setIsParameter(boolean value);
} // Variable
