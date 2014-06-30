package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDataSearchOptions {
    NSDataSearchBackwards($Foundation.NSDataSearchBackwards),
    NSDataSearchAnchored($Foundation.NSDataSearchAnchored);

    private final long value;

    private NSDataSearchOptions(long value) { this.value = value; }
}
