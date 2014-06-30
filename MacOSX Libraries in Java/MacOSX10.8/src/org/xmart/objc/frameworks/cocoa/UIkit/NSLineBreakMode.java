package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSLineBreakMode {
    NSLineBreakByWordWrapping($UIKit.NSLineBreakByWordWrapping),
    NSLineBreakByCharWrapping($UIKit.NSLineBreakByCharWrapping),
    NSLineBreakByClipping($UIKit.NSLineBreakByClipping),
    NSLineBreakByTruncatingHead($UIKit.NSLineBreakByTruncatingHead),
    NSLineBreakByTruncatingTail($UIKit.NSLineBreakByTruncatingTail),
    NSLineBreakByTruncatingMiddle($UIKit.NSLineBreakByTruncatingMiddle);

    private final long value;

    private NSLineBreakMode(long value) { this.value = value; }
}
