package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewCellSeparatorStyle {
    UITableViewCellSeparatorStyleNone($UIKit.UITableViewCellSeparatorStyleNone),
    UITableViewCellSeparatorStyleSingleLine($UIKit.UITableViewCellSeparatorStyleSingleLine),
    UITableViewCellSeparatorStyleSingleLineEtched($UIKit.UITableViewCellSeparatorStyleSingleLineEtched);

    private final long value;

    private UITableViewCellSeparatorStyle(long value) { this.value = value; }
}
