package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSCalendarOptions {
    NSCalendarWrapComponents($Foundation.NSCalendarWrapComponents),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSCalendarMatchStrictly($Foundation.NSCalendarMatchStrictly),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSCalendarSearchBackwards($Foundation.NSCalendarSearchBackwards),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSCalendarMatchPreviousTimePreservingSmallerUnits($Foundation.NSCalendarMatchPreviousTimePreservingSmallerUnits),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSCalendarMatchNextTimePreservingSmallerUnits($Foundation.NSCalendarMatchNextTimePreservingSmallerUnits),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSCalendarMatchNextTime($Foundation.NSCalendarMatchNextTime),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSCalendarMatchFirst($Foundation.NSCalendarMatchFirst),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSCalendarMatchLast($Foundation.NSCalendarMatchLast);

    private final long value;

    private NSCalendarOptions(long value) { this.value = value; }
}
