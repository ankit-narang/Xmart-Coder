package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSSortOptions {
    NSSortConcurrent($Foundation.NSSortConcurrent),
    NSSortStable($Foundation.NSSortStable);

    private final long value;

    private NSSortOptions(long value) { this.value = value; }
}
