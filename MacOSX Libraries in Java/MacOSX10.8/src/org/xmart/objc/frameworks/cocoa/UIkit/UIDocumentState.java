package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIDocumentState {
    UIDocumentStateNormal($UIKit.UIDocumentStateNormal),
    UIDocumentStateClosed($UIKit.UIDocumentStateClosed),
    UIDocumentStateInConflict($UIKit.UIDocumentStateInConflict),
    UIDocumentStateSavingError($UIKit.UIDocumentStateSavingError),
    UIDocumentStateEditingDisabled($UIKit.UIDocumentStateEditingDisabled);

    private final long value;

    private UIDocumentState(long value) { this.value = value; }
}
