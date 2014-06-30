package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSJSONWritingOptions {
    NSJSONWritingPrettyPrinted($Foundation.NSJSONWritingPrettyPrinted);

    private final long value;

    private NSJSONWritingOptions(long value) { this.value = value; }
}
