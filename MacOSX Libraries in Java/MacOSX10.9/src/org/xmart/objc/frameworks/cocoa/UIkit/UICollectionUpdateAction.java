package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UICollectionUpdateAction {
    UICollectionUpdateActionInsert($UIKit.UICollectionUpdateActionInsert),
    UICollectionUpdateActionDelete($UIKit.UICollectionUpdateActionDelete),
    UICollectionUpdateActionReload($UIKit.UICollectionUpdateActionReload),
    UICollectionUpdateActionMove($UIKit.UICollectionUpdateActionMove),
    UICollectionUpdateActionNone($UIKit.UICollectionUpdateActionNone);

    private final long value;

    private UICollectionUpdateAction(long value) { this.value = value; }
}
