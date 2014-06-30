package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UILineBreakMode {
    UILineBreakModeWordWrap($UIKit.UILineBreakModeWordWrap),
    UILineBreakModeCharacterWrap($UIKit.UILineBreakModeCharacterWrap),
    UILineBreakModeClip($UIKit.UILineBreakModeClip),
    UILineBreakModeHeadTruncation($UIKit.UILineBreakModeHeadTruncation),
    UILineBreakModeTailTruncation($UIKit.UILineBreakModeTailTruncation),
    UILineBreakModeMiddleTruncation($UIKit.UILineBreakModeMiddleTruncation);

    private final long value;

    private UILineBreakMode(long value) { this.value = value; }
}
