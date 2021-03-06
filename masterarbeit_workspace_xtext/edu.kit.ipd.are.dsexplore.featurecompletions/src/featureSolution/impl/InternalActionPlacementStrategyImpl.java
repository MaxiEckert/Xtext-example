/**
 */
package featureSolution.impl;

import featureSolution.FeatureSolutionPackage;
import featureSolution.InternalActionPlacementStrategy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.seff.InternalAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Action Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.InternalActionPlacementStrategyImpl#getMatchingInternalAction <em>Matching Internal Action</em>}</li>
 *   <li>{@link featureSolution.impl.InternalActionPlacementStrategyImpl#getMatchingName <em>Matching Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalActionPlacementStrategyImpl extends PlacementStrategyImpl implements InternalActionPlacementStrategy {
	/**
	 * The cached value of the '{@link #getMatchingInternalAction() <em>Matching Internal Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingInternalAction()
	 * @generated
	 * @ordered
	 */
	protected InternalAction matchingInternalAction;

	/**
	 * The default value of the '{@link #getMatchingName() <em>Matching Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingName()
	 * @generated
	 * @ordered
	 */
	protected static final String MATCHING_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMatchingName() <em>Matching Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingName()
	 * @generated
	 * @ordered
	 */
	protected String matchingName = MATCHING_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalActionPlacementStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.INTERNAL_ACTION_PLACEMENT_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAction getMatchingInternalAction() {
		if (matchingInternalAction != null && ((EObject)matchingInternalAction).eIsProxy()) {
			InternalEObject oldMatchingInternalAction = (InternalEObject)matchingInternalAction;
			matchingInternalAction = (InternalAction)eResolveProxy(oldMatchingInternalAction);
			if (matchingInternalAction != oldMatchingInternalAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_INTERNAL_ACTION, oldMatchingInternalAction, matchingInternalAction));
			}
		}
		return matchingInternalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAction basicGetMatchingInternalAction() {
		return matchingInternalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingInternalAction(InternalAction newMatchingInternalAction) {
		InternalAction oldMatchingInternalAction = matchingInternalAction;
		matchingInternalAction = newMatchingInternalAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_INTERNAL_ACTION, oldMatchingInternalAction, matchingInternalAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatchingName() {
		return matchingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingName(String newMatchingName) {
		String oldMatchingName = matchingName;
		matchingName = newMatchingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_NAME, oldMatchingName, matchingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_INTERNAL_ACTION:
				if (resolve) return getMatchingInternalAction();
				return basicGetMatchingInternalAction();
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_NAME:
				return getMatchingName();
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
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_INTERNAL_ACTION:
				setMatchingInternalAction((InternalAction)newValue);
				return;
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_NAME:
				setMatchingName((String)newValue);
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
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_INTERNAL_ACTION:
				setMatchingInternalAction((InternalAction)null);
				return;
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_NAME:
				setMatchingName(MATCHING_NAME_EDEFAULT);
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
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_INTERNAL_ACTION:
				return matchingInternalAction != null;
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_NAME:
				return MATCHING_NAME_EDEFAULT == null ? matchingName != null : !MATCHING_NAME_EDEFAULT.equals(matchingName);
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
		result.append(" (matchingName: ");
		result.append(matchingName);
		result.append(')');
		return result.toString();
	}

} //InternalActionPlacementStrategyImpl
