package org.xtext.example.mydsl2;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class MyDslResourceRuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "org.eclipse.uml2.uml.editor.presentation.UMLEditorID";
	}

	@Override
	protected String getFileExtensions() {
		return "repository";
	}

	public Class<? extends MyDslResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return MyDslResourceDescriptionStrategy.class;
	}

	@Override
	public Class<? extends MyDslDeclarativeQualifiedNameProvider> bindIQualifiedNameProvider() {
		return MyDslDeclarativeQualifiedNameProvider.class;
	}

}
