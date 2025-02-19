/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
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
package org.jkiss.dbeaver.model.secret;

import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;

public class DBSSecretValue {
    @NotNull
    private String id;
    @NotNull
    private String displayName;
    @Nullable
    private String value;


    public DBSSecretValue(@NotNull String id, @NotNull String displayName, @Nullable String value) {
        this.id = id;
        this.displayName = displayName;
        this.value = value;
    }

    // for serialization
    public DBSSecretValue() {
    }

    @NotNull
    public String getId() {
        return id;
    }

    @NotNull
    public String getDisplayName() {
        return displayName;
    }

    @Nullable
    public String getValue() {
        return value;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    public void setDisplayName(@NotNull String displayName) {
        this.displayName = displayName;
    }

    public void setValue(@NotNull String value) {
        this.value = value;
    }
}
