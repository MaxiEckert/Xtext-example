/**
 */
package featureSolution;

import org.palladiosimulator.pcm.seff.AbstractInternalControlFlowAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Flow Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.ControlFlowPlacementStrategy#getMatchingControlFlow <em>Matching Control Flow</em>}</li>
 *   <li>{@link featureSolution.ControlFlowPlacementStrategy#getControlFlow <em>Control Flow</em>}</li>
 * </ul>
 *
 * @see featureSolution.FeatureSolutionPackage#getControlFlowPlacementStrategy()
 * @model
 * @generated
 */
public interface ControlFlowPlacementStrategy extends PlacementStrategy {
	/**
	 * Returns the value of the '<em><b>Matching Control Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Control Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Control Flow</em>' reference.
	 * @see #setMatchingControlFlow(AbstractInternalControlFlowAction)
	 * @see featureSolution.FeatureSolutionPackage#getControlFlowPlacementStrategy_MatchingControlFlow()
	 * @model
	 * @generated
	 */
	AbstractInternalControlFlowAction getMatchingControlFlow();

	/**
	 * Sets the value of the '{@link featureSolution.ControlFlowPlacementStrategy#getMatchingControlFlow <em>Matching Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Control Flow</em>' reference.
	 * @see #getMatchingControlFlow()
	 * @generated
	 */
	void setMatchingControlFlow(AbstractInternalControlFlowAction value);

	/**
	 * Returns the value of the '<em><b>Control Flow</b></em>' attribute.
	 * The default value is <code>"LOOP"</code>.
	 * The literals are from the enumeration {@link featureSolution.ControlFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow</em>' attribute.
	 * @see featureSolution.ControlFlow
	 * @see #setControlFlow(ControlFlow)
	 * @see featureSolution.FeatureSolutionPackage#getControlFlowPlacementStrategy_ControlFlow()
	 * @model default="LOOP"
	 * @generated
	 */
	ControlFlow getControlFlow();

	/**
	 * Sets the value of the '{@link featureSolution.ControlFlowPlacementStrategy#getControlFlow <em>Control Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Flow</em>' attribute.
	 * @see featureSolution.ControlFlow
	 * @see #getControlFlow()
	 * @generated
	 */
	void setControlFlow(ControlFlow value);

} // ControlFlowPlacementStrategy
