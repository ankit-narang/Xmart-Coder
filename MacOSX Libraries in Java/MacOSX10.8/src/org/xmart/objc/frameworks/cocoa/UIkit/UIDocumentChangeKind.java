package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIDocumentChangeKind {
    UIDocumentChangeDone($UIKit.UIDocumentChangeDone),
    UIDocumentChangeUndone($UIKit.UIDocumentChangeUndone),
    UIDocumentChangeRedone($UIKit.UIDocumentChangeRedone),
    UIDocumentChangeCleared($UIKit.UIDocumentChangeCleared);

    private final long value;

    private UIDocumentChangeKind(long value) { this.value = value; }
}
