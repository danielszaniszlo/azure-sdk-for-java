// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.Context;

/** Samples for VendorNetworkFunctions List. */
public final class VendorNetworkFunctionsListSamples {
    /*
     * x-ms-original-file: specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2021-05-01/examples/VendorNfListByVendor.json
     */
    /**
     * Sample code: List all nfs of vendor resource.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllNfsOfVendorResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.vendorNetworkFunctions().list("eastus", "testVendor", null, Context.NONE);
    }
}