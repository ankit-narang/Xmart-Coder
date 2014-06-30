package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSKeyValueSetMutationKind {
    NSKeyValueUnionSetMutation($Foundation.NSKeyValueUnionSetMutation),
    NSKeyValueMinusSetMutation($Foundation.NSKeyValueMinusSetMutation),
    NSKeyValueIntersectSetMutation($Foundation.NSKeyValueIntersectSetMutation),
    NSKeyValueSetSetMutation($Foundation.NSKeyValueSetSetMutation);

    private final long value;

    private NSKeyValueSetMutationKind(long value) { this.value = value; }
}
