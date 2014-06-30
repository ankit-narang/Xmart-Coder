package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSTextStorageEditActions {
    NSTextStorageEditedAttributes($UIKit.NSTextStorageEditedAttributes),
    NSTextStorageEditedCharacters($UIKit.NSTextStorageEditedCharacters);

    private final long value;

    private NSTextStorageEditActions(long value) { this.value = value; }
}
