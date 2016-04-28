/*
 * Copyright 2016 inpwtepydjuf@gmail.com
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
package mmarquee.automation.controls;

import mmarquee.automation.AutomationElement;
import mmarquee.automation.ControlType;
import mmarquee.automation.ElementNotFoundException;
import mmarquee.automation.condition.ControlIdCondition;
import mmarquee.automation.controls.menu.AutomationMainMenu;
import mmarquee.automation.uiautomation.IUIAutomation;
import mmarquee.automation.uiautomation.TreeScope;

import java.awt.*;

/**
 * Created by inpwt on 04/03/2016.
 *
 * Wrapper for the TitleBar element.
 */
public class AutomationTitleBar extends AutomationContainer {
    /**
     * Constructor for the AutomationTitleBar.
     * @param element The underlying automation element
     * @param automation The IUIAutomation associated with this session
     */
    public AutomationTitleBar(AutomationElement element, IUIAutomation automation) {
        super(element, automation);
    }

    public AutomationMainMenu getMenuBar() throws ElementNotFoundException {
        ControlIdCondition condition = new ControlIdCondition(this.automation, ControlType.MenuBar);

        AutomationElement element = this.findFirst(TreeScope.TreeScope_Descendants, condition);

        return new AutomationMainMenu(this.element, element, this.automation);
    }
}
