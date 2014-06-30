package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSUnderlineStyle {
    NSUnderlineStyleNone($UIKit.NSUnderlineStyleNone),
    NSUnderlineStyleSingle($UIKit.NSUnderlineStyleSingle),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlineStyleThick($UIKit.NSUnderlineStyleThick),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlineStyleDouble($UIKit.NSUnderlineStyleDouble),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlinePatternSolid($UIKit.NSUnderlinePatternSolid),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlinePatternDot($UIKit.NSUnderlinePatternDot),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlinePatternDash($UIKit.NSUnderlinePatternDash),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlinePatternDashDot($UIKit.NSUnderlinePatternDashDot),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlinePatternDashDotDot($UIKit.NSUnderlinePatternDashDotDot),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSUnderlineByWord($UIKit.NSUnderlineByWord);

    private final long value;

    private NSUnderlineStyle(long value) { this.value = value; }
}
