// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.resourcemanager.hybridcompute.models.MachineRunCommand;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for MachineRunCommands Update.
 */
public final class MachineRunCommandsUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2024-03-31-preview/examples/runCommand/RunCommands_Update.json
     */
    /**
     * Sample code: Update a Run Command.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void updateARunCommand(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        MachineRunCommand resource = manager.machineRunCommands()
            .getWithResponse("myResourceGroup", "myMachine", "myRunCommand", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
