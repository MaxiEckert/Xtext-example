/**
 */
package featureSolution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see featureSolution.FeatureSolutionPackage
 * @generated
 */
public interface FeatureSolutionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureSolutionFactory eINSTANCE = featureSolution.impl.FeatureSolutionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adapter Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adapter Inclusion</em>'.
	 * @generated
	 */
	AdapterInclusion createAdapterInclusion();

	/**
	 * Returns a new object of class '<em>Extension Inclusion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Inclusion</em>'.
	 * @generated
	 */
	ExtensionInclusion createExtensionInclusion();

	/**
	 * Returns a new object of class '<em>Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Placement Strategy</em>'.
	 * @generated
	 */
	PlacementStrategy createPlacementStrategy();

	/**
	 * Returns a new object of class '<em>External Call Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Call Placement Strategy</em>'.
	 * @generated
	 */
	ExternalCallPlacementStrategy createExternalCallPlacementStrategy();

	/**
	 * Returns a new object of class '<em>Internal Action Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Action Placement Strategy</em>'.
	 * @generated
	 */
	InternalActionPlacementStrategy createInternalActionPlacementStrategy();

	/**
	 * Returns a new object of class '<em>Control Flow Placement Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow Placement Strategy</em>'.
	 * @generated
	 */
	ControlFlowPlacementStrategy createControlFlowPlacementStrategy();

	/**
	 * Returns a new object of class '<em>Point Cut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Cut</em>'.
	 * @generated
	 */
	PointCut createPointCut();

	/**
	 * Returns a new object of class '<em>Advice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advice</em>'.
	 * @generated
	 */
	Advice createAdvice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureSolutionPackage getFeatureSolutionPackage();

} //FeatureSolutionFactory
