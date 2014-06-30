package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIActionSheetStyle {
    UIActionSheetStyleAutomatic($UIKit.UIActionSheetStyleAutomatic),
    UIActionSheetStyleDefault($UIKit.UIActionSheetStyleDefault),
    UIActionSheetStyleBlackTranslucent($UIKit.UIActionSheetStyleBlackTranslucent),
    UIActionSheetStyleBlackOpaque($UIKit.UIActionSheetStyleBlackOpaque);

    private final long value;

    private UIActionSheetStyle(long value) { this.value = value; }
}
