package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewCellAccessoryType {
    UITableViewCellAccessoryNone($UIKit.UITableViewCellAccessoryNone),
    UITableViewCellAccessoryDisclosureIndicator($UIKit.UITableViewCellAccessoryDisclosureIndicator),
    UITableViewCellAccessoryDetailDisclosureButton($UIKit.UITableViewCellAccessoryDetailDisclosureButton),
    UITableViewCellAccessoryCheckmark($UIKit.UITableViewCellAccessoryCheckmark),
    /**
     * @since Available in iOS 7.0 and later.
     */
    UITableViewCellAccessoryDetailButton($UIKit.UITableViewCellAccessoryDetailButton);

    private final long value;

    private UITableViewCellAccessoryType(long value) { this.value = value; }
}
