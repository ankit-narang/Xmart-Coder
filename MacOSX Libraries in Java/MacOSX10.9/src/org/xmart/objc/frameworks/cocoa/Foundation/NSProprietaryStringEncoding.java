package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSProprietaryStringEncoding {
    NSProprietaryStringEncoding($Foundation.NSProprietaryStringEncoding);

    private final long value;

    private NSProprietaryStringEncoding(long value) { this.value = value; }
}
