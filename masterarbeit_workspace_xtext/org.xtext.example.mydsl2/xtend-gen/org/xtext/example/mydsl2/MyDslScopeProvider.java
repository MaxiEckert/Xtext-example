package org.xtext.example.mydsl2;

import featureSolution.ExternalCallPlacementStrategy;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MyDslScopeProvider extends AbstractDeclarativeScopeProvider {
  private IScope scope_ExternalCallPlacementStrategy_matchingSignature;
  
  private Procedure1<? super ExternalCallPlacementStrategy> a;
}
