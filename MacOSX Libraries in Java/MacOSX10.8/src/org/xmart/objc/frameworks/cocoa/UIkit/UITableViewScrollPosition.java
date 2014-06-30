package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewScrollPosition {
    UITableViewScrollPositionNone($UIKit.UITableViewScrollPositionNone),
    UITableViewScrollPositionTop($UIKit.UITableViewScrollPositionTop),
    UITableViewScrollPositionMiddle($UIKit.UITableViewScrollPositionMiddle),
    UITableViewScrollPositionBottom($UIKit.UITableViewScrollPositionBottom);

    private final long value;

    private UITableViewScrollPosition(long value) { this.value = value; }
}
