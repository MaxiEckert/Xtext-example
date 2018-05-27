package org.xtext.example.mydsl2

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import java.util.LinkedHashSet
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI

class MyDslImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	override protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		System.out.println("--------------- getImportedUris: ------------");
		val temp = super.getImportedUris(resource);
		temp.add(URI.createURI("platform:/resource/TestDSL/src/test.repository"));
		return temp;
	}
	
	/**
	 * Workaround: See usage in RepositoryDSLDocumentProvider
	 * 
	 * @param resource
	 * @return
	 */
//	public LinkedHashSet<URI> getImportedUrisHelper(Resource resource) {
//		return self.getImportedUris(resource);
//	}
	
}