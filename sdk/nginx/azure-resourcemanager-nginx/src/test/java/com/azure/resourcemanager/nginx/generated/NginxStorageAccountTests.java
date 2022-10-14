// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxStorageAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NginxStorageAccountTests {
    @Test
    public void testDeserialize() {
        NginxStorageAccount model =
            BinaryData
                .fromString("{\"accountName\":\"erhhbcsglumm\",\"containerName\":\"tjaodxobnb\"}")
                .toObject(NginxStorageAccount.class);
        Assertions.assertEquals("erhhbcsglumm", model.accountName());
        Assertions.assertEquals("tjaodxobnb", model.containerName());
    }

    @Test
    public void testSerialize() {
        NginxStorageAccount model =
            new NginxStorageAccount().withAccountName("erhhbcsglumm").withContainerName("tjaodxobnb");
        model = BinaryData.fromObject(model).toObject(NginxStorageAccount.class);
        Assertions.assertEquals("erhhbcsglumm", model.accountName());
        Assertions.assertEquals("tjaodxobnb", model.containerName());
    }
}