/**
 */
package psample;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link psample.Function#getPrimitivetypevariable <em>Primitivetypevariable</em>}</li>
 *   <li>{@link psample.Function#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see psample.PsamplePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Member {

	/**
	 * Returns the value of the '<em><b>Primitivetypevariable</b></em>' containment reference list.
	 * The list contents are of type {@link psample.PrimitiveTypeVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitivetypevariable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitivetypevariable</em>' containment reference list.
	 * @see psample.PsamplePackage#getFunction_Primitivetypevariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<PrimitiveTypeVariable> getPrimitivetypevariable();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link psample.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see psample.PsamplePackage#getFunction_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();
} // Function
