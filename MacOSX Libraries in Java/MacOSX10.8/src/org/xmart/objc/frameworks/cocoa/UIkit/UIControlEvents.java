package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIControlEvents {
    UIControlEventTouchDown($UIKit.UIControlEventTouchDown),
    UIControlEventTouchDownRepeat($UIKit.UIControlEventTouchDownRepeat),
    UIControlEventTouchDragInside($UIKit.UIControlEventTouchDragInside),
    UIControlEventTouchDragOutside($UIKit.UIControlEventTouchDragOutside),
    UIControlEventTouchDragEnter($UIKit.UIControlEventTouchDragEnter),
    UIControlEventTouchDragExit($UIKit.UIControlEventTouchDragExit),
    UIControlEventTouchUpInside($UIKit.UIControlEventTouchUpInside),
    UIControlEventTouchUpOutside($UIKit.UIControlEventTouchUpOutside),
    UIControlEventTouchCancel($UIKit.UIControlEventTouchCancel),
    UIControlEventValueChanged($UIKit.UIControlEventValueChanged),
    UIControlEventEditingDidBegin($UIKit.UIControlEventEditingDidBegin),
    UIControlEventEditingChanged($UIKit.UIControlEventEditingChanged),
    UIControlEventEditingDidEnd($UIKit.UIControlEventEditingDidEnd),
    UIControlEventEditingDidEndOnExit($UIKit.UIControlEventEditingDidEndOnExit),
    UIControlEventAllTouchEvents($UIKit.UIControlEventAllTouchEvents),
    UIControlEventAllEditingEvents($UIKit.UIControlEventAllEditingEvents),
    UIControlEventApplicationReserved($UIKit.UIControlEventApplicationReserved),
    UIControlEventSystemReserved($UIKit.UIControlEventSystemReserved),
    UIControlEventAllEvents($UIKit.UIControlEventAllEvents);

    private final long value;

    private UIControlEvents(long value) { this.value = value; }
}
