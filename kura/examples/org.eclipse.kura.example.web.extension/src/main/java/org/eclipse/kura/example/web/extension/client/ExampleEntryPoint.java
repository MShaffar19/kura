/*******************************************************************************
 * Copyright (c) 2019, 2020 Eurotech and/or its affiliates and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Eurotech
 *******************************************************************************/
package org.eclipse.kura.example.web.extension.client;

import org.eclipse.kura.web2.ext.ExtensionRegistry;

import com.google.gwt.core.client.EntryPoint;

public class ExampleEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        final ExtensionRegistry registry = ExtensionRegistry.get();

        registry.registerExtension(new ExampleViewExtension());
        registry.registerExtension(new ExampleAuthenticationHandler());
    }

}
