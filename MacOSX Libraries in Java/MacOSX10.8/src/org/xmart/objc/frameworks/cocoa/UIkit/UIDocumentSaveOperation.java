package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIDocumentSaveOperation {
    UIDocumentSaveForCreating($UIKit.UIDocumentSaveForCreating),
    UIDocumentSaveForOverwriting($UIKit.UIDocumentSaveForOverwriting);

    private final long value;

    private UIDocumentSaveOperation(long value) { this.value = value; }
}
