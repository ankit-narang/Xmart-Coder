package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSAttributedStringEnumerationOptions {
    NSAttributedStringEnumerationReverse($Foundation.NSAttributedStringEnumerationReverse),
    NSAttributedStringEnumerationLongestEffectiveRangeNotRequired($Foundation.NSAttributedStringEnumerationLongestEffectiveRangeNotRequired);

    private final long value;

    private NSAttributedStringEnumerationOptions(long value) { this.value = value; }
}
