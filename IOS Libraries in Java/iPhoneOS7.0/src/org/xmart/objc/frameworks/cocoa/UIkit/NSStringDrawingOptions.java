package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSStringDrawingOptions {
    NSStringDrawingTruncatesLastVisibleLine($UIKit.NSStringDrawingTruncatesLastVisibleLine),
    NSStringDrawingUsesLineFragmentOrigin($UIKit.NSStringDrawingUsesLineFragmentOrigin),
    NSStringDrawingUsesFontLeading($UIKit.NSStringDrawingUsesFontLeading),
    NSStringDrawingUsesDeviceMetrics($UIKit.NSStringDrawingUsesDeviceMetrics);

    private final long value;

    private NSStringDrawingOptions(long value) { this.value = value; }
}
