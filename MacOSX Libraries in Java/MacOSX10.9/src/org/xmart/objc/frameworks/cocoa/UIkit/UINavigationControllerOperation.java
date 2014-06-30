package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UINavigationControllerOperation {
    UINavigationControllerOperationNone($UIKit.UINavigationControllerOperationNone),
    UINavigationControllerOperationPush($UIKit.UINavigationControllerOperationPush),
    UINavigationControllerOperationPop($UIKit.UINavigationControllerOperationPop);

    private final long value;

    private UINavigationControllerOperation(long value) { this.value = value; }
}
