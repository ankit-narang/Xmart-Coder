package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIScrollViewIndicatorStyle {
    UIScrollViewIndicatorStyleDefault($UIKit.UIScrollViewIndicatorStyleDefault),
    UIScrollViewIndicatorStyleBlack($UIKit.UIScrollViewIndicatorStyleBlack),
    UIScrollViewIndicatorStyleWhite($UIKit.UIScrollViewIndicatorStyleWhite);

    private final long value;

    private UIScrollViewIndicatorStyle(long value) { this.value = value; }
}
