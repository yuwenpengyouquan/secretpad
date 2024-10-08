/*
 * Copyright 2024 Ant Group Co., Ltd.
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

package org.secretflow.secretpad.manager.integration.job.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author yutu
 * @date 2024/03/28
 */
public class JobSyncErrorOrCompletedEvent extends ApplicationEvent {

    @Getter
    private String nodeId;

    public JobSyncErrorOrCompletedEvent(Object source, String nodeId) {
        super(source);
        this.nodeId = nodeId;
    }

    public Object getSource() {
        return source;
    }
}
