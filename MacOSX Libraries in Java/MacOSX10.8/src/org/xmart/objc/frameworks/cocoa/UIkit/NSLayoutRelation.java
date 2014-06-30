package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSLayoutRelation {
    NSLayoutRelationLessThanOrEqual($UIKit.NSLayoutRelationLessThanOrEqual),
    NSLayoutRelationEqual($UIKit.NSLayoutRelationEqual),
    NSLayoutRelationGreaterThanOrEqual($UIKit.NSLayoutRelationGreaterThanOrEqual);

    private final long value;

    private NSLayoutRelation(long value) { this.value = value; }
}
