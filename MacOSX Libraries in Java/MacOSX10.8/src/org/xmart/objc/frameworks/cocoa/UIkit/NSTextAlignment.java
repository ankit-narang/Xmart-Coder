package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSTextAlignment {
    NSTextAlignmentLeft($UIKit.NSTextAlignmentLeft),
    NSTextAlignmentCenter($UIKit.NSTextAlignmentCenter),
    NSTextAlignmentRight($UIKit.NSTextAlignmentRight),
    NSTextAlignmentJustified($UIKit.NSTextAlignmentJustified),
    NSTextAlignmentNatural($UIKit.NSTextAlignmentNatural);

    private final long value;

    private NSTextAlignment(long value) { this.value = value; }
}
