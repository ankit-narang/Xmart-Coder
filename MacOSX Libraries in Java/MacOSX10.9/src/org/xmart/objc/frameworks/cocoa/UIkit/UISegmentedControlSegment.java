package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UISegmentedControlSegment {
    UISegmentedControlSegmentAny($UIKit.UISegmentedControlSegmentAny),
    UISegmentedControlSegmentLeft($UIKit.UISegmentedControlSegmentLeft),
    UISegmentedControlSegmentCenter($UIKit.UISegmentedControlSegmentCenter),
    UISegmentedControlSegmentRight($UIKit.UISegmentedControlSegmentRight),
    UISegmentedControlSegmentAlone($UIKit.UISegmentedControlSegmentAlone);

    private final long value;

    private UISegmentedControlSegment(long value) { this.value = value; }
}
