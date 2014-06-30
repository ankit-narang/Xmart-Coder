package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSTimeZoneNameStyle {
    NSTimeZoneNameStyleStandard($Foundation.NSTimeZoneNameStyleStandard),
    NSTimeZoneNameStyleShortStandard($Foundation.NSTimeZoneNameStyleShortStandard),
    NSTimeZoneNameStyleDaylightSaving($Foundation.NSTimeZoneNameStyleDaylightSaving),
    NSTimeZoneNameStyleShortDaylightSaving($Foundation.NSTimeZoneNameStyleShortDaylightSaving),
    NSTimeZoneNameStyleGeneric($Foundation.NSTimeZoneNameStyleGeneric),
    NSTimeZoneNameStyleShortGeneric($Foundation.NSTimeZoneNameStyleShortGeneric);

    private final long value;

    private NSTimeZoneNameStyle(long value) { this.value = value; }
}
