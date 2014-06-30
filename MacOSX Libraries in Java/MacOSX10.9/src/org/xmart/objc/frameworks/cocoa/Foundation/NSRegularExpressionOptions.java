package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSRegularExpressionOptions {
    NSRegularExpressionCaseInsensitive($Foundation.NSRegularExpressionCaseInsensitive),
    NSRegularExpressionAllowCommentsAndWhitespace($Foundation.NSRegularExpressionAllowCommentsAndWhitespace),
    NSRegularExpressionIgnoreMetacharacters($Foundation.NSRegularExpressionIgnoreMetacharacters),
    NSRegularExpressionDotMatchesLineSeparators($Foundation.NSRegularExpressionDotMatchesLineSeparators),
    NSRegularExpressionAnchorsMatchLines($Foundation.NSRegularExpressionAnchorsMatchLines),
    NSRegularExpressionUseUnixLineSeparators($Foundation.NSRegularExpressionUseUnixLineSeparators),
    NSRegularExpressionUseUnicodeWordBoundaries($Foundation.NSRegularExpressionUseUnicodeWordBoundaries);

    private final long value;

    private NSRegularExpressionOptions(long value) { this.value = value; }
}
