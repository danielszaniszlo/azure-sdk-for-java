// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Used to map workload profile types to billing meter. */
public final class Category extends ExpandableStringEnum<Category> {
    /** Static value PremiumSkuGeneralPurpose for Category. */
    public static final Category PREMIUM_SKU_GENERAL_PURPOSE = fromString("PremiumSkuGeneralPurpose");

    /** Static value PremiumSkuMemoryOptimized for Category. */
    public static final Category PREMIUM_SKU_MEMORY_OPTIMIZED = fromString("PremiumSkuMemoryOptimized");

    /** Static value PremiumSkuComputeOptimized for Category. */
    public static final Category PREMIUM_SKU_COMPUTE_OPTIMIZED = fromString("PremiumSkuComputeOptimized");

    /**
     * Creates or finds a Category from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Category.
     */
    @JsonCreator
    public static Category fromString(String name) {
        return fromString(name, Category.class);
    }

    /**
     * Gets known Category values.
     *
     * @return known Category values.
     */
    public static Collection<Category> values() {
        return values(Category.class);
    }
}