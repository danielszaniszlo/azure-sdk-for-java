// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceProviderOperationDisplay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceProviderOperationInnerTests {
    @Test
    public void testDeserialize() {
        ResourceProviderOperationInner model =
            BinaryData
                .fromString(
                    "{\"isDataAction\":\"pxgy\",\"name\":\"gvr\",\"display\":{\"provider\":\"pkukghi\",\"resource\":\"blxgwimf\",\"operation\":\"hfjx\",\"description\":\"szkkfoqre\"}}")
                .toObject(ResourceProviderOperationInner.class);
        Assertions.assertEquals("pxgy", model.isDataAction());
        Assertions.assertEquals("gvr", model.name());
        Assertions.assertEquals("pkukghi", model.display().provider());
        Assertions.assertEquals("blxgwimf", model.display().resource());
        Assertions.assertEquals("hfjx", model.display().operation());
        Assertions.assertEquals("szkkfoqre", model.display().description());
    }

    @Test
    public void testSerialize() {
        ResourceProviderOperationInner model =
            new ResourceProviderOperationInner()
                .withIsDataAction("pxgy")
                .withName("gvr")
                .withDisplay(
                    new ResourceProviderOperationDisplay()
                        .withProvider("pkukghi")
                        .withResource("blxgwimf")
                        .withOperation("hfjx")
                        .withDescription("szkkfoqre"));
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationInner.class);
        Assertions.assertEquals("pxgy", model.isDataAction());
        Assertions.assertEquals("gvr", model.name());
        Assertions.assertEquals("pkukghi", model.display().provider());
        Assertions.assertEquals("blxgwimf", model.display().resource());
        Assertions.assertEquals("hfjx", model.display().operation());
        Assertions.assertEquals("szkkfoqre", model.display().description());
    }
}