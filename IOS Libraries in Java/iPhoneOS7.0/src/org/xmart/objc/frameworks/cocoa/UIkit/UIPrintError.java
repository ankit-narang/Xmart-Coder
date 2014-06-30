package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPrintError {
    UIPrintingNotAvailableError($UIKit.UIPrintingNotAvailableError),
    UIPrintNoContentError($UIKit.UIPrintNoContentError),
    UIPrintUnknownImageFormatError($UIKit.UIPrintUnknownImageFormatError),
    UIPrintJobFailedError($UIKit.UIPrintJobFailedError);

    private final long value;

    private UIPrintError(long value) { this.value = value; }
}
