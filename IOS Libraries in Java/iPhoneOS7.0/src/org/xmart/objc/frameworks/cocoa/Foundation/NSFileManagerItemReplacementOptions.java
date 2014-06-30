package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSFileManagerItemReplacementOptions {
    NSFileManagerItemReplacementUsingNewMetadataOnly($Foundation.NSFileManagerItemReplacementUsingNewMetadataOnly),
    NSFileManagerItemReplacementWithoutDeletingBackupItem($Foundation.NSFileManagerItemReplacementWithoutDeletingBackupItem);

    private final long value;

    private NSFileManagerItemReplacementOptions(long value) { this.value = value; }
}
