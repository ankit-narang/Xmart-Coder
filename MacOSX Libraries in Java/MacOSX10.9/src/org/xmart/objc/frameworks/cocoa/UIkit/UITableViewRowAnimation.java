package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewRowAnimation {
    UITableViewRowAnimationFade($UIKit.UITableViewRowAnimationFade),
    UITableViewRowAnimationRight($UIKit.UITableViewRowAnimationRight),
    UITableViewRowAnimationLeft($UIKit.UITableViewRowAnimationLeft),
    UITableViewRowAnimationTop($UIKit.UITableViewRowAnimationTop),
    UITableViewRowAnimationBottom($UIKit.UITableViewRowAnimationBottom),
    UITableViewRowAnimationNone($UIKit.UITableViewRowAnimationNone),
    UITableViewRowAnimationMiddle($UIKit.UITableViewRowAnimationMiddle),
    UITableViewRowAnimationAutomatic($UIKit.UITableViewRowAnimationAutomatic);

    private final long value;

    private UITableViewRowAnimation(long value) { this.value = value; }
}
