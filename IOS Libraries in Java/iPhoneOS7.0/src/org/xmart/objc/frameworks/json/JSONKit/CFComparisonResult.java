package org.xmart.objc.frameworks.json.JSONKit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("JSONKit")
public enum CFComparisonResult {
    kCFCompareLessThan($JSONKit.kCFCompareLessThan),
    kCFCompareEqualTo($JSONKit.kCFCompareEqualTo),
    kCFCompareGreaterThan($JSONKit.kCFCompareGreaterThan);

    private final long value;

    private CFComparisonResult(long value) { this.value = value; }
}
