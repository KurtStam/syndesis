/*
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.syndesis.connector.odata2.verifier;

import org.apache.camel.CamelContext;
import org.apache.camel.component.extension.ComponentVerifierExtension;

import io.syndesis.connector.support.verifier.api.ComponentVerifier;

public class ODataVerifier extends ComponentVerifier {

    public ODataVerifier() {
        super("odata-v2", ODataVerifierExtension.class);
    }

    @Override
    protected ComponentVerifierExtension resolveComponentVerifierExtension(CamelContext context, String scheme) {
        return new ODataVerifierExtension(scheme, context);
    }
}
