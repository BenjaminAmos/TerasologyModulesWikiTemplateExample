/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.WikiExampleModule;

import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterMode;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.logic.console.commandSystem.annotations.Command;

import java.util.ArrayList;
import java.util.List;

@RegisterSystem(RegisterMode.AUTHORITY)
public class WikiExampleSystem extends BaseComponentSystem {
    private static List<String> texts = new ArrayList<String>();

    public WikiExampleSystem() {
        texts.add("Initialised system");
    }

    @Command
    public String ShowText() {
        String fullText = "";

        for (String text : texts) {
            fullText += text;
        }

        return fullText;
    }

    public static void AddText(String text) {
        texts.add(text);
    }
}
