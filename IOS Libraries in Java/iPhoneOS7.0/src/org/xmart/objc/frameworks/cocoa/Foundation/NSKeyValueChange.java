package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSKeyValueChange {
    NSKeyValueChangeSetting($Foundation.NSKeyValueChangeSetting),
    NSKeyValueChangeInsertion($Foundation.NSKeyValueChangeInsertion),
    NSKeyValueChangeRemoval($Foundation.NSKeyValueChangeRemoval),
    NSKeyValueChangeReplacement($Foundation.NSKeyValueChangeReplacement);

    private final long value;

    private NSKeyValueChange(long value) { this.value = value; }
}
