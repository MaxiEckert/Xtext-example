package org.xtext.example.mydsl2;

import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

@SuppressWarnings("all")
public class MyDslImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider {
  @Override
  protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
    System.out.println("--------------- getImportedUris: ------------");
    final LinkedHashSet<URI> temp = super.getImportedUris(resource);
    temp.add(URI.createURI("platform:/resource/TestDSL/src/test.repository"));
    return temp;
  }
}
