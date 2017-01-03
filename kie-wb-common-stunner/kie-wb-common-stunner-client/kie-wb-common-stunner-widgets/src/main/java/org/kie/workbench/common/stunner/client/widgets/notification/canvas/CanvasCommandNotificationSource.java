/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.client.widgets.notification.canvas;

public final class CanvasCommandNotificationSource {

    private final String commandRaw;
    private final String resultRaw;

    CanvasCommandNotificationSource( final String commandRaw,
                                     final String resultRaw ) {
        this.commandRaw = commandRaw;
        this.resultRaw = resultRaw;
    }

    public String getCommandRaw() {
        return commandRaw;
    }

    public String getResultRaw() {
        return resultRaw;
    }

    @Override
    public String toString() {
        return "[Command=" + commandRaw + ", Result=" + resultRaw + "] ";
    }
}