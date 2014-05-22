package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
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
 * #L%
 */

import com.google.gwt.dom.client.Document;
import org.gwtbootstrap3.client.ui.base.ComplexWidget;
import org.gwtbootstrap3.client.ui.constants.Styles;
import org.gwtbootstrap3.client.ui.html.Text;

/**
 * Badge for highlighting new or unread items.
 *
 * <h3>UiBinder example</h3>
 *
 * <pre>
 * {@code
 *     <b:Badge>42</b:Badge>
 * }
 * </pre>
 *
 * @author Sven Jacobs
 */
public class Badge extends ComplexWidget {
    private final Text text = new Text();

    public Badge() {
        setElement(Document.get().createSpanElement());
        setStyleName(Styles.BADGE);
    }

    /**
     * Returns the text of the badge.
     *
     * @return text of the badge
     */
    public String getText() {
        return text.getText();
    }

    /**
     * Sets the text for the badge
     *
     * @param text the text of the badge
     */
    public void setText(final String text) {
        this.text.setText(text);
        insert(this.text, 0);
    }
}
