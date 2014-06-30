package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UISegmentedControlStyle {
    UISegmentedControlStylePlain($UIKit.UISegmentedControlStylePlain),
    UISegmentedControlStyleBordered($UIKit.UISegmentedControlStyleBordered),
    UISegmentedControlStyleBar($UIKit.UISegmentedControlStyleBar),
    UISegmentedControlStyleBezeled($UIKit.UISegmentedControlStyleBezeled);

    private final long value;

    private UISegmentedControlStyle(long value) { this.value = value; }
}
