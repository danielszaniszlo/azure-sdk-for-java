// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.agrifood.models.PrivateEndpointConnectionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionListResultTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\"},\"id\":\"ruwiqzbqjvsov\",\"name\":\"yokacspkw\",\"type\":\"hzdobpxjmflbvvnc\"},{\"properties\":{\"provisioningState\":\"Deleting\"},\"id\":\"wwzjuqkhrsajiwku\",\"name\":\"foskghsauuimj\",\"type\":\"vxieduugidyj\"},{\"properties\":{\"provisioningState\":\"Succeeded\"},\"id\":\"osvexcsonpclhoc\",\"name\":\"hslkevleggzf\",\"type\":\"u\"}]}")
                .toObject(PrivateEndpointConnectionListResult.class);
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionListResult model =
            new PrivateEndpointConnectionListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner(),
                            new PrivateEndpointConnectionInner()));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
    }
}