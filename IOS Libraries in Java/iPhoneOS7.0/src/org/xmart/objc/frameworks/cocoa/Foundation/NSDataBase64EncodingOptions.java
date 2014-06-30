package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDataBase64EncodingOptions {
    NSDataBase64Encoding64CharacterLineLength($Foundation.NSDataBase64Encoding64CharacterLineLength),
    NSDataBase64Encoding76CharacterLineLength($Foundation.NSDataBase64Encoding76CharacterLineLength),
    NSDataBase64EncodingEndLineWithCarriageReturn($Foundation.NSDataBase64EncodingEndLineWithCarriageReturn),
    NSDataBase64EncodingEndLineWithLineFeed($Foundation.NSDataBase64EncodingEndLineWithLineFeed);

    private final long value;

    private NSDataBase64EncodingOptions(long value) { this.value = value; }
}
