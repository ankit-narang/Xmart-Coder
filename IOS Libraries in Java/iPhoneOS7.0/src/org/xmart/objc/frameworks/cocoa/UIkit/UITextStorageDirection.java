package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextStorageDirection {
    UITextStorageDirectionForward($UIKit.UITextStorageDirectionForward),
    UITextStorageDirectionBackward($UIKit.UITextStorageDirectionBackward);

    private final long value;

    private UITextStorageDirection(long value) { this.value = value; }
}
