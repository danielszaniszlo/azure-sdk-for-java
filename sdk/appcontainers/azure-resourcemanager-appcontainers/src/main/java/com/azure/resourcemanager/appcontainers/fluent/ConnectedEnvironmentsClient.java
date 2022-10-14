// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appcontainers.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentInner;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityRequest;

/** An instance of this class provides access to all the operations defined in ConnectedEnvironmentsClient. */
public interface ConnectedEnvironmentsClient {
    /**
     * Get all connectedEnvironments for a subscription.
     *
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all connectedEnvironments for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedEnvironmentInner> list();

    /**
     * Get all connectedEnvironments for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all connectedEnvironments for a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedEnvironmentInner> list(Context context);

    /**
     * Get all connectedEnvironments in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all connectedEnvironments in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedEnvironmentInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get all connectedEnvironments in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all connectedEnvironments in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ConnectedEnvironmentInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Get the properties of an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an connectedEnvironment along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectedEnvironmentInner> getByResourceGroupWithResponse(
        String resourceGroupName, String connectedEnvironmentName, Context context);

    /**
     * Get the properties of an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of an connectedEnvironment.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedEnvironmentInner getByResourceGroup(String resourceGroupName, String connectedEnvironmentName);

    /**
     * Creates or updates an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param environmentEnvelope Configuration details of the connectedEnvironment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an environment for Kubernetes cluster specialized for web workloads
     *     by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConnectedEnvironmentInner>, ConnectedEnvironmentInner> beginCreateOrUpdate(
        String resourceGroupName, String connectedEnvironmentName, ConnectedEnvironmentInner environmentEnvelope);

    /**
     * Creates or updates an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param environmentEnvelope Configuration details of the connectedEnvironment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an environment for Kubernetes cluster specialized for web workloads
     *     by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ConnectedEnvironmentInner>, ConnectedEnvironmentInner> beginCreateOrUpdate(
        String resourceGroupName,
        String connectedEnvironmentName,
        ConnectedEnvironmentInner environmentEnvelope,
        Context context);

    /**
     * Creates or updates an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param environmentEnvelope Configuration details of the connectedEnvironment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedEnvironmentInner createOrUpdate(
        String resourceGroupName, String connectedEnvironmentName, ConnectedEnvironmentInner environmentEnvelope);

    /**
     * Creates or updates an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param environmentEnvelope Configuration details of the connectedEnvironment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedEnvironmentInner createOrUpdate(
        String resourceGroupName,
        String connectedEnvironmentName,
        ConnectedEnvironmentInner environmentEnvelope,
        Context context);

    /**
     * Delete an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String connectedEnvironmentName);

    /**
     * Delete an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String connectedEnvironmentName, Context context);

    /**
     * Delete an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String connectedEnvironmentName);

    /**
     * Delete an connectedEnvironment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String connectedEnvironmentName, Context context);

    /**
     * Update connected Environment's properties.
     *
     * <p>Patches a Managed Environment. Only patching of tags is supported currently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for Kubernetes cluster specialized for web workloads by Azure App Service along with
     *     {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ConnectedEnvironmentInner> updateWithResponse(
        String resourceGroupName, String connectedEnvironmentName, Context context);

    /**
     * Update connected Environment's properties.
     *
     * <p>Patches a Managed Environment. Only patching of tags is supported currently.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the connectedEnvironment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an environment for Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ConnectedEnvironmentInner update(String resourceGroupName, String connectedEnvironmentName);

    /**
     * Checks the resource connectedEnvironmentName availability.
     *
     * <p>Checks if resource connectedEnvironmentName is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Managed Environment.
     * @param checkNameAvailabilityRequest The check connectedEnvironmentName availability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String connectedEnvironmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest,
        Context context);

    /**
     * Checks the resource connectedEnvironmentName availability.
     *
     * <p>Checks if resource connectedEnvironmentName is available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param connectedEnvironmentName Name of the Managed Environment.
     * @param checkNameAvailabilityRequest The check connectedEnvironmentName availability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseInner checkNameAvailability(
        String resourceGroupName,
        String connectedEnvironmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest);
}