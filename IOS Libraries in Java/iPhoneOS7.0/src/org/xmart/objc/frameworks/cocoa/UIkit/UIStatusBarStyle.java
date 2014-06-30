package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIStatusBarStyle {
    UIStatusBarStyleDefault($UIKit.UIStatusBarStyleDefault),
    /**
     * @since Available in iOS 7.0 and later.
     */
    UIStatusBarStyleLightContent($UIKit.UIStatusBarStyleLightContent),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    UIStatusBarStyleBlackTranslucent($UIKit.UIStatusBarStyleBlackTranslucent),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    UIStatusBarStyleBlackOpaque($UIKit.UIStatusBarStyleBlackOpaque);

    private final long value;

    private UIStatusBarStyle(long value) { this.value = value; }
}
