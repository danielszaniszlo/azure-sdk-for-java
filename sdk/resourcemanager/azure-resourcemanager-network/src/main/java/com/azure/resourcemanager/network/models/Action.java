// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Action to be taken on a route matching a RouteMap criterion. */
@Fluent
public final class Action {
    /*
     * Type of action to be taken. Supported types are 'Remove', 'Add', 'Replace', and 'Drop.'
     */
    @JsonProperty(value = "type")
    private RouteMapActionType type;

    /*
     * List of parameters relevant to the action.For instance if type is drop then parameters has list of prefixes to
     * be dropped.If type is add, parameters would have list of ASN numbers to be added
     */
    @JsonProperty(value = "parameters")
    private List<Parameter> parameters;

    /** Creates an instance of Action class. */
    public Action() {
    }

    /**
     * Get the type property: Type of action to be taken. Supported types are 'Remove', 'Add', 'Replace', and 'Drop.'.
     *
     * @return the type value.
     */
    public RouteMapActionType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of action to be taken. Supported types are 'Remove', 'Add', 'Replace', and 'Drop.'.
     *
     * @param type the type value to set.
     * @return the Action object itself.
     */
    public Action withType(RouteMapActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the parameters property: List of parameters relevant to the action.For instance if type is drop then
     * parameters has list of prefixes to be dropped.If type is add, parameters would have list of ASN numbers to be
     * added.
     *
     * @return the parameters value.
     */
    public List<Parameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of parameters relevant to the action.For instance if type is drop then
     * parameters has list of prefixes to be dropped.If type is add, parameters would have list of ASN numbers to be
     * added.
     *
     * @param parameters the parameters value to set.
     * @return the Action object itself.
     */
    public Action withParameters(List<Parameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }
}