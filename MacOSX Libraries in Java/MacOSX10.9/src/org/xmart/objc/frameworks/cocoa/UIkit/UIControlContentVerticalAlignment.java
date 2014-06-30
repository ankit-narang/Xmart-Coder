package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIControlContentVerticalAlignment {
    UIControlContentVerticalAlignmentCenter($UIKit.UIControlContentVerticalAlignmentCenter),
    UIControlContentVerticalAlignmentTop($UIKit.UIControlContentVerticalAlignmentTop),
    UIControlContentVerticalAlignmentBottom($UIKit.UIControlContentVerticalAlignmentBottom),
    UIControlContentVerticalAlignmentFill($UIKit.UIControlContentVerticalAlignmentFill);

    private final long value;

    private UIControlContentVerticalAlignment(long value) { this.value = value; }
}
