// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The remove participant by identifier request. */
@Fluent
public final class RemoveParticipantsRequestInternal {
    /*
     * The participants to invite.
     */
    @JsonProperty(value = "participantsToRemove", required = true)
    private List<CommunicationIdentifierModel> participantsToRemove;

    /*
     * The operation context.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the participantsToRemove property: The participants to invite.
     *
     * @return the participantsToRemove value.
     */
    public List<CommunicationIdentifierModel> getParticipantsToRemove() {
        return this.participantsToRemove;
    }

    /**
     * Set the participantsToRemove property: The participants to invite.
     *
     * @param participantsToRemove the participantsToRemove value to set.
     * @return the RemoveParticipantsRequestInternal object itself.
     */
    public RemoveParticipantsRequestInternal setParticipantsToRemove(
            List<CommunicationIdentifierModel> participantsToRemove) {
        this.participantsToRemove = participantsToRemove;
        return this;
    }

    /**
     * Get the operationContext property: The operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The operation context.
     *
     * @param operationContext the operationContext value to set.
     * @return the RemoveParticipantsRequestInternal object itself.
     */
    public RemoveParticipantsRequestInternal setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}