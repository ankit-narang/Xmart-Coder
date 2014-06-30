package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewCellSelectionStyle {
    UITableViewCellSelectionStyleNone($UIKit.UITableViewCellSelectionStyleNone),
    UITableViewCellSelectionStyleBlue($UIKit.UITableViewCellSelectionStyleBlue),
    UITableViewCellSelectionStyleGray($UIKit.UITableViewCellSelectionStyleGray),
    /**
     * @since Available in iOS 7.0 and later.
     */
    UITableViewCellSelectionStyleDefault($UIKit.UITableViewCellSelectionStyleDefault);

    private final long value;

    private UITableViewCellSelectionStyle(long value) { this.value = value; }
}
