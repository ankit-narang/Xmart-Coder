package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITableViewCellStyle {
    UITableViewCellStyleDefault($UIKit.UITableViewCellStyleDefault),
    UITableViewCellStyleValue1($UIKit.UITableViewCellStyleValue1),
    UITableViewCellStyleValue2($UIKit.UITableViewCellStyleValue2),
    UITableViewCellStyleSubtitle($UIKit.UITableViewCellStyleSubtitle);

    private final long value;

    private UITableViewCellStyle(long value) { this.value = value; }
}
