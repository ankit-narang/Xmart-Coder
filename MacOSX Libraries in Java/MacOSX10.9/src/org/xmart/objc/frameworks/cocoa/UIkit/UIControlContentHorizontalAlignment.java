package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIControlContentHorizontalAlignment {
    UIControlContentHorizontalAlignmentCenter($UIKit.UIControlContentHorizontalAlignmentCenter),
    UIControlContentHorizontalAlignmentLeft($UIKit.UIControlContentHorizontalAlignmentLeft),
    UIControlContentHorizontalAlignmentRight($UIKit.UIControlContentHorizontalAlignmentRight),
    UIControlContentHorizontalAlignmentFill($UIKit.UIControlContentHorizontalAlignmentFill);

    private final long value;

    private UIControlContentHorizontalAlignment(long value) { this.value = value; }
}
