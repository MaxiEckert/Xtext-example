package org.xtext.example.mydsl2

import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider
import org.eclipse.emf.common.util.URI

class MyDslResourceServiceProvider extends DefaultResourceServiceProvider {
	
	override public boolean canHandle(URI uri) {
		return uri.fileExtension().equals("repository");
	}
}