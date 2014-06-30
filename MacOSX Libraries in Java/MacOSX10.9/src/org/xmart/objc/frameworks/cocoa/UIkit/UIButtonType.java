package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIButtonType {
    UIButtonTypeCustom($UIKit.UIButtonTypeCustom),
    /**
     * @since Available in iOS 7.0 and later.
     */
    UIButtonTypeSystem($UIKit.UIButtonTypeSystem),
    UIButtonTypeDetailDisclosure($UIKit.UIButtonTypeDetailDisclosure),
    UIButtonTypeInfoLight($UIKit.UIButtonTypeInfoLight),
    UIButtonTypeInfoDark($UIKit.UIButtonTypeInfoDark),
    UIButtonTypeContactAdd($UIKit.UIButtonTypeContactAdd),
    UIButtonTypeRoundedRect($UIKit.UIButtonTypeRoundedRect);

    private final long value;

    private UIButtonType(long value) { this.value = value; }
}
