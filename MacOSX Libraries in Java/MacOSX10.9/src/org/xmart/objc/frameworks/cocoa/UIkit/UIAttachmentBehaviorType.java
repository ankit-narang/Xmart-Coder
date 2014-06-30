package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIAttachmentBehaviorType {
    UIAttachmentBehaviorTypeItems($UIKit.UIAttachmentBehaviorTypeItems),
    UIAttachmentBehaviorTypeAnchor($UIKit.UIAttachmentBehaviorTypeAnchor);

    private final long value;

    private UIAttachmentBehaviorType(long value) { this.value = value; }
}
