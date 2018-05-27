package org.xtext.example.mydsl2

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.IScope
import featureSolution.ExternalCallPlacementStrategy

class MyDslScopeProvider extends AbstractDeclarativeScopeProvider {
	
	IScope scope_ExternalCallPlacementStrategy_matchingSignature(ExternalCallPlacementStrategy a, EReference ref){
		return Scopes.scopeFor(a.getMatchingSignature());
	}
	
	
}