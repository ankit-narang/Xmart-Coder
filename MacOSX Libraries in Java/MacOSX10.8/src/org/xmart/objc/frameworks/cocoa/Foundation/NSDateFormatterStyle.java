package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDateFormatterStyle {
    NSDateFormatterNoStyle($Foundation.NSDateFormatterNoStyle),
    NSDateFormatterShortStyle($Foundation.NSDateFormatterShortStyle),
    NSDateFormatterMediumStyle($Foundation.NSDateFormatterMediumStyle),
    NSDateFormatterLongStyle($Foundation.NSDateFormatterLongStyle),
    NSDateFormatterFullStyle($Foundation.NSDateFormatterFullStyle);

    private final long value;

    private NSDateFormatterStyle(long value) { this.value = value; }
}
