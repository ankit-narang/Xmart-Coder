package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewCellStateMask {
    UITableViewCellStateDefaultMask($UIKit.UITableViewCellStateDefaultMask),
    UITableViewCellStateShowingEditControlMask($UIKit.UITableViewCellStateShowingEditControlMask),
    UITableViewCellStateShowingDeleteConfirmationMask($UIKit.UITableViewCellStateShowingDeleteConfirmationMask);

    private final long value;

    private UITableViewCellStateMask(long value) { this.value = value; }
}
