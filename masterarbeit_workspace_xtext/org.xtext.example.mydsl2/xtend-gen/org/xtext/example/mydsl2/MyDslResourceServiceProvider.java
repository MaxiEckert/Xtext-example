package org.xtext.example.mydsl2;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.impl.DefaultResourceServiceProvider;

@SuppressWarnings("all")
public class MyDslResourceServiceProvider extends DefaultResourceServiceProvider {
  @Override
  public boolean canHandle(final URI uri) {
    return uri.fileExtension().equals("repository");
  }
}
