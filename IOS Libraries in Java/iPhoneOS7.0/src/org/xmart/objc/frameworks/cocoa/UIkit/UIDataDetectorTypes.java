package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIDataDetectorTypes {
    UIDataDetectorTypePhoneNumber($UIKit.UIDataDetectorTypePhoneNumber),
    UIDataDetectorTypeLink($UIKit.UIDataDetectorTypeLink),
    UIDataDetectorTypeAddress($UIKit.UIDataDetectorTypeAddress),
    UIDataDetectorTypeCalendarEvent($UIKit.UIDataDetectorTypeCalendarEvent),
    UIDataDetectorTypeNone($UIKit.UIDataDetectorTypeNone),
    UIDataDetectorTypeAll($UIKit.UIDataDetectorTypeAll);

    private final long value;

    private UIDataDetectorTypes(long value) { this.value = value; }
}
