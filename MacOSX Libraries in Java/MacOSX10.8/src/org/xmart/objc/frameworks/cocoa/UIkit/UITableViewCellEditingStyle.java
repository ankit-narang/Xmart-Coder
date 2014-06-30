package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewCellEditingStyle {
    UITableViewCellEditingStyleNone($UIKit.UITableViewCellEditingStyleNone),
    UITableViewCellEditingStyleDelete($UIKit.UITableViewCellEditingStyleDelete),
    UITableViewCellEditingStyleInsert($UIKit.UITableViewCellEditingStyleInsert);

    private final long value;

    private UITableViewCellEditingStyle(long value) { this.value = value; }
}
