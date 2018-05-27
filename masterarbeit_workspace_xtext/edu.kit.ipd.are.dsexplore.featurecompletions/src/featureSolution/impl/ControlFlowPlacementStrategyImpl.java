/**
 */
package featureSolution.impl;

import featureSolution.ControlFlow;
import featureSolution.ControlFlowPlacementStrategy;
import featureSolution.FeatureSolutionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.seff.AbstractInternalControlFlowAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.ControlFlowPlacementStrategyImpl#getMatchingControlFlow <em>Matching Control Flow</em>}</li>
 *   <li>{@link featureSolution.impl.ControlFlowPlacementStrategyImpl#getControlFlow <em>Control Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlowPlacementStrategyImpl extends PlacementStrategyImpl implements ControlFlowPlacementStrategy {
	/**
	 * The cached value of the '{@link #getMatchingControlFlow() <em>Matching Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingControlFlow()
	 * @generated
	 * @ordered
	 */
	protected AbstractInternalControlFlowAction matchingControlFlow;

	/**
	 * The default value of the '{@link #getControlFlow() <em>Control Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlow()
	 * @generated
	 * @ordered
	 */
	protected static final ControlFlow CONTROL_FLOW_EDEFAULT = ControlFlow.LOOP;
	/**
	 * The cached value of the '{@link #getControlFlow() <em>Control Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlow()
	 * @generated
	 * @ordered
	 */
	protected ControlFlow controlFlow = CONTROL_FLOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowPlacementStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.CONTROL_FLOW_PLACEMENT_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction getMatchingControlFlow() {
		if (matchingControlFlow != null && ((EObject)matchingControlFlow).eIsProxy()) {
			InternalEObject oldMatchingControlFlow = (InternalEObject)matchingControlFlow;
			matchingControlFlow = (AbstractInternalControlFlowAction)eResolveProxy(oldMatchingControlFlow);
			if (matchingControlFlow != oldMatchingControlFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW, oldMatchingControlFlow, matchingControlFlow));
			}
		}
		return matchingControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInternalControlFlowAction basicGetMatchingControlFlow() {
		return matchingControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingControlFlow(AbstractInternalControlFlowAction newMatchingControlFlow) {
		AbstractInternalControlFlowAction oldMatchingControlFlow = matchingControlFlow;
		matchingControlFlow = newMatchingControlFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW, oldMatchingControlFlow, matchingControlFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow getControlFlow() {
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlFlow(ControlFlow newControlFlow) {
		ControlFlow oldControlFlow = controlFlow;
		controlFlow = newControlFlow == null ? CONTROL_FLOW_EDEFAULT : newControlFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__CONTROL_FLOW, oldControlFlow, controlFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				if (resolve) return getMatchingControlFlow();
				return basicGetMatchingControlFlow();
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__CONTROL_FLOW:
				return getControlFlow();
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
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				setMatchingControlFlow((AbstractInternalControlFlowAction)newValue);
				return;
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__CONTROL_FLOW:
				setControlFlow((ControlFlow)newValue);
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
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				setMatchingControlFlow((AbstractInternalControlFlowAction)null);
				return;
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__CONTROL_FLOW:
				setControlFlow(CONTROL_FLOW_EDEFAULT);
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
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				return matchingControlFlow != null;
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__CONTROL_FLOW:
				return controlFlow != CONTROL_FLOW_EDEFAULT;
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
		result.append(" (controlFlow: ");
		result.append(controlFlow);
		result.append(')');
		return result.toString();
	}

} //ControlFlowPlacementStrategyImpl
