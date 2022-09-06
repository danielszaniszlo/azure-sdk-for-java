// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecordingChannelInternal. */
public final class RecordingChannelInternal extends ExpandableStringEnum<RecordingChannelInternal> {
    /** Static value mixed for RecordingChannelInternal. */
    public static final RecordingChannelInternal MIXED = fromString("mixed");

    /** Static value unmixed for RecordingChannelInternal. */
    public static final RecordingChannelInternal UNMIXED = fromString("unmixed");

    /**
     * Creates or finds a RecordingChannelInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingChannelInternal.
     */
    @JsonCreator
    public static RecordingChannelInternal fromString(String name) {
        return fromString(name, RecordingChannelInternal.class);
    }

    /** @return known RecordingChannelInternal values. */
    public static Collection<RecordingChannelInternal> values() {
        return values(RecordingChannelInternal.class);
    }
}