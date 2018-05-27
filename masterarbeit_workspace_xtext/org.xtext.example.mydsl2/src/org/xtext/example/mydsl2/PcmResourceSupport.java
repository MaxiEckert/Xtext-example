package org.xtext.example.mydsl2;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class PcmResourceSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		// TODO Auto-generated method stub
		return new MyDslResourceRuntimeModule();
	}

}
