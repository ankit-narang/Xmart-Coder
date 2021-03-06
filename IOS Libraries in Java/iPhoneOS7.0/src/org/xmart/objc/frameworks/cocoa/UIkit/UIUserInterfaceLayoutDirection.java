package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIUserInterfaceLayoutDirection {
    UIUserInterfaceLayoutDirectionLeftToRight($UIKit.UIUserInterfaceLayoutDirectionLeftToRight),
    UIUserInterfaceLayoutDirectionRightToLeft($UIKit.UIUserInterfaceLayoutDirectionRightToLeft);

    private final long value;

    private UIUserInterfaceLayoutDirection(long value) { this.value = value; }
}
