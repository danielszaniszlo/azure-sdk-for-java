// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmProtectedItemExtendedInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DpmProtectedItemExtendedInfoTests {
    @Test
    public void testDeserialize() {
        DpmProtectedItemExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"protectableObjectLoadPath\":{\"gegizvcjfel\":\"zuwfmdur\",\"zgakgacyrcmj\":\"sdjubggbqigkxkbs\",\"iofrzgbzjedmstk\":\"mspofapvuhryl\"},\"protected\":false,\"isPresentOnCloud\":true,\"lastBackupStatus\":\"c\",\"lastRefreshedAt\":\"2021-11-07T19:34:50Z\",\"oldestRecoveryPoint\":\"2021-03-22T01:54:17Z\",\"recoveryPointCount\":1363158856,\"onPremiseOldestRecoveryPoint\":\"2021-03-28T09:03:38Z\",\"onPremiseLatestRecoveryPoint\":\"2021-04-27T21:47:04Z\",\"onPremiseRecoveryPointCount\":386349585,\"isCollocated\":true,\"protectionGroupName\":\"ibmikostbzb\",\"diskStorageUsedInBytes\":\"wbuqn\",\"totalDiskStorageSizeInBytes\":\"phzfylsgcrp\"}")
                .toObject(DpmProtectedItemExtendedInfo.class);
        Assertions.assertEquals("zuwfmdur", model.protectableObjectLoadPath().get("gegizvcjfel"));
        Assertions.assertEquals(false, model.protectedProperty());
        Assertions.assertEquals(true, model.isPresentOnCloud());
        Assertions.assertEquals("c", model.lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-07T19:34:50Z"), model.lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T01:54:17Z"), model.oldestRecoveryPoint());
        Assertions.assertEquals(1363158856, model.recoveryPointCount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-28T09:03:38Z"), model.onPremiseOldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-27T21:47:04Z"), model.onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(386349585, model.onPremiseRecoveryPointCount());
        Assertions.assertEquals(true, model.isCollocated());
        Assertions.assertEquals("ibmikostbzb", model.protectionGroupName());
        Assertions.assertEquals("wbuqn", model.diskStorageUsedInBytes());
        Assertions.assertEquals("phzfylsgcrp", model.totalDiskStorageSizeInBytes());
    }

    @Test
    public void testSerialize() {
        DpmProtectedItemExtendedInfo model =
            new DpmProtectedItemExtendedInfo()
                .withProtectableObjectLoadPath(
                    mapOf(
                        "gegizvcjfel",
                        "zuwfmdur",
                        "zgakgacyrcmj",
                        "sdjubggbqigkxkbs",
                        "iofrzgbzjedmstk",
                        "mspofapvuhryl"))
                .withProtectedProperty(false)
                .withIsPresentOnCloud(true)
                .withLastBackupStatus("c")
                .withLastRefreshedAt(OffsetDateTime.parse("2021-11-07T19:34:50Z"))
                .withOldestRecoveryPoint(OffsetDateTime.parse("2021-03-22T01:54:17Z"))
                .withRecoveryPointCount(1363158856)
                .withOnPremiseOldestRecoveryPoint(OffsetDateTime.parse("2021-03-28T09:03:38Z"))
                .withOnPremiseLatestRecoveryPoint(OffsetDateTime.parse("2021-04-27T21:47:04Z"))
                .withOnPremiseRecoveryPointCount(386349585)
                .withIsCollocated(true)
                .withProtectionGroupName("ibmikostbzb")
                .withDiskStorageUsedInBytes("wbuqn")
                .withTotalDiskStorageSizeInBytes("phzfylsgcrp");
        model = BinaryData.fromObject(model).toObject(DpmProtectedItemExtendedInfo.class);
        Assertions.assertEquals("zuwfmdur", model.protectableObjectLoadPath().get("gegizvcjfel"));
        Assertions.assertEquals(false, model.protectedProperty());
        Assertions.assertEquals(true, model.isPresentOnCloud());
        Assertions.assertEquals("c", model.lastBackupStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-07T19:34:50Z"), model.lastRefreshedAt());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-22T01:54:17Z"), model.oldestRecoveryPoint());
        Assertions.assertEquals(1363158856, model.recoveryPointCount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-28T09:03:38Z"), model.onPremiseOldestRecoveryPoint());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-27T21:47:04Z"), model.onPremiseLatestRecoveryPoint());
        Assertions.assertEquals(386349585, model.onPremiseRecoveryPointCount());
        Assertions.assertEquals(true, model.isCollocated());
        Assertions.assertEquals("ibmikostbzb", model.protectionGroupName());
        Assertions.assertEquals("wbuqn", model.diskStorageUsedInBytes());
        Assertions.assertEquals("phzfylsgcrp", model.totalDiskStorageSizeInBytes());
    }

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