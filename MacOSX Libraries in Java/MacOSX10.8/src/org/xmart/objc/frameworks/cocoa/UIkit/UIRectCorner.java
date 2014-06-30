package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIRectCorner {
    UIRectCornerTopLeft($UIKit.UIRectCornerTopLeft),
    UIRectCornerTopRight($UIKit.UIRectCornerTopRight),
    UIRectCornerBottomLeft($UIKit.UIRectCornerBottomLeft),
    UIRectCornerBottomRight($UIKit.UIRectCornerBottomRight),
    UIRectCornerAllCorners($UIKit.UIRectCornerAllCorners);

    private final long value;

    private UIRectCorner(long value) { this.value = value; }
}
