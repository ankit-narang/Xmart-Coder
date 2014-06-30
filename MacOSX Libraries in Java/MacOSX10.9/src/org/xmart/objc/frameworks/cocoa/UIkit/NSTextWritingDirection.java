package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSTextWritingDirection {
    NSTextWritingDirectionEmbedding($UIKit.NSTextWritingDirectionEmbedding),
    NSTextWritingDirectionOverride($UIKit.NSTextWritingDirectionOverride);

    private final long value;

    private NSTextWritingDirection(long value) { this.value = value; }
}
