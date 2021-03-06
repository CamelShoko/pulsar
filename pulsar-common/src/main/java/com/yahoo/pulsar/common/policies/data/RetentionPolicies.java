/**
 * Copyright 2016 Yahoo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yahoo.pulsar.common.policies.data;

/**
 */
public class RetentionPolicies {
    private int retentionTimeInMinutes;
    private long retentionSizeInMB;

    public RetentionPolicies() {
        this(0, 0);
    }

    public RetentionPolicies(int retentionTimeInMinutes, int retentionSizeInMB) {
        this.retentionSizeInMB = retentionSizeInMB;
        this.retentionTimeInMinutes = retentionTimeInMinutes;
    }

    public int getRetentionTimeInMinutes() {
        return retentionTimeInMinutes;
    }

    public long getRetentionSizeInMB() {
        return retentionSizeInMB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetentionPolicies that = (RetentionPolicies) o;

        if (retentionTimeInMinutes != that.retentionTimeInMinutes) {
            return false;
        }

        return retentionSizeInMB == that.retentionSizeInMB;
    }

    @Override
    public int hashCode() {
        long result = retentionTimeInMinutes;
        result = 31 * result + retentionSizeInMB;
        return Long.hashCode(result);
    }

    @Override
    public String toString() {
        return "RetentionPolicies{" + "retentionTimeInMinutes=" + retentionTimeInMinutes + ", retentionSizeInMB="
                + retentionSizeInMB + '}';
    }
}
