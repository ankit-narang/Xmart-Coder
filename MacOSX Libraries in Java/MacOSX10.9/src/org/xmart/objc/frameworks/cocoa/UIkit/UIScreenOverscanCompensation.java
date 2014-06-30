package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIScreenOverscanCompensation {
    UIScreenOverscanCompensationScale($UIKit.UIScreenOverscanCompensationScale),
    UIScreenOverscanCompensationInsetBounds($UIKit.UIScreenOverscanCompensationInsetBounds),
    UIScreenOverscanCompensationInsetApplicationFrame($UIKit.UIScreenOverscanCompensationInsetApplicationFrame);

    private final long value;

    private UIScreenOverscanCompensation(long value) { this.value = value; }
}
