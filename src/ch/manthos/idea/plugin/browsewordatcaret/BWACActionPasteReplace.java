/*
 * Copyright (c) 2005 Minas Manthos, mailto:minas@manthos.ch
 */
package ch.manthos.idea.plugin.browsewordatcaret;

import com.intellij.openapi.editor.actionSystem.EditorAction;

public final class BWACActionPasteReplace extends EditorAction {
    public BWACActionPasteReplace() {
        super(new BWACHandlerPasteReplace());
    }
}
