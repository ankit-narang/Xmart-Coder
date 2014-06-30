package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSVolumeEnumerationOptions {
    NSVolumeEnumerationSkipHiddenVolumes($Foundation.NSVolumeEnumerationSkipHiddenVolumes),
    NSVolumeEnumerationProduceFileReferenceURLs($Foundation.NSVolumeEnumerationProduceFileReferenceURLs);

    private final long value;

    private NSVolumeEnumerationOptions(long value) { this.value = value; }
}
