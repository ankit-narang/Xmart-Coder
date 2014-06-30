package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIEventSubtype {
    UIEventSubtypeNone($UIKit.UIEventSubtypeNone),
    UIEventSubtypeMotionShake($UIKit.UIEventSubtypeMotionShake),
    UIEventSubtypeRemoteControlPlay($UIKit.UIEventSubtypeRemoteControlPlay),
    UIEventSubtypeRemoteControlPause($UIKit.UIEventSubtypeRemoteControlPause),
    UIEventSubtypeRemoteControlStop($UIKit.UIEventSubtypeRemoteControlStop),
    UIEventSubtypeRemoteControlTogglePlayPause($UIKit.UIEventSubtypeRemoteControlTogglePlayPause),
    UIEventSubtypeRemoteControlNextTrack($UIKit.UIEventSubtypeRemoteControlNextTrack),
    UIEventSubtypeRemoteControlPreviousTrack($UIKit.UIEventSubtypeRemoteControlPreviousTrack),
    UIEventSubtypeRemoteControlBeginSeekingBackward($UIKit.UIEventSubtypeRemoteControlBeginSeekingBackward),
    UIEventSubtypeRemoteControlEndSeekingBackward($UIKit.UIEventSubtypeRemoteControlEndSeekingBackward),
    UIEventSubtypeRemoteControlBeginSeekingForward($UIKit.UIEventSubtypeRemoteControlBeginSeekingForward),
    UIEventSubtypeRemoteControlEndSeekingForward($UIKit.UIEventSubtypeRemoteControlEndSeekingForward);

    private final long value;

    private UIEventSubtype(long value) { this.value = value; }
}
