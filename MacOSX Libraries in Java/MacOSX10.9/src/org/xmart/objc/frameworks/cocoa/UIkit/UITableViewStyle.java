package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewStyle {
    UITableViewStylePlain($UIKit.UITableViewStylePlain),
    UITableViewStyleGrouped($UIKit.UITableViewStyleGrouped);

    private final long value;

    private UITableViewStyle(long value) { this.value = value; }
}
