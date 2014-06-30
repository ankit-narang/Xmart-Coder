package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSStringEncoding {
    NSASCIIStringEncoding($Foundation.NSASCIIStringEncoding),
    NSNEXTSTEPStringEncoding($Foundation.NSNEXTSTEPStringEncoding),
    NSJapaneseEUCStringEncoding($Foundation.NSJapaneseEUCStringEncoding),
    NSUTF8StringEncoding($Foundation.NSUTF8StringEncoding),
    NSISOLatin1StringEncoding($Foundation.NSISOLatin1StringEncoding),
    NSSymbolStringEncoding($Foundation.NSSymbolStringEncoding),
    NSNonLossyASCIIStringEncoding($Foundation.NSNonLossyASCIIStringEncoding),
    NSShiftJISStringEncoding($Foundation.NSShiftJISStringEncoding),
    NSISOLatin2StringEncoding($Foundation.NSISOLatin2StringEncoding),
    NSUnicodeStringEncoding($Foundation.NSUnicodeStringEncoding),
    NSWindowsCP1251StringEncoding($Foundation.NSWindowsCP1251StringEncoding),
    NSWindowsCP1252StringEncoding($Foundation.NSWindowsCP1252StringEncoding),
    NSWindowsCP1253StringEncoding($Foundation.NSWindowsCP1253StringEncoding),
    NSWindowsCP1254StringEncoding($Foundation.NSWindowsCP1254StringEncoding),
    NSWindowsCP1250StringEncoding($Foundation.NSWindowsCP1250StringEncoding),
    NSISO2022JPStringEncoding($Foundation.NSISO2022JPStringEncoding),
    NSMacOSRomanStringEncoding($Foundation.NSMacOSRomanStringEncoding),
    NSUTF16StringEncoding($Foundation.NSUTF16StringEncoding),
    NSUTF16BigEndianStringEncoding($Foundation.NSUTF16BigEndianStringEncoding),
    NSUTF16LittleEndianStringEncoding($Foundation.NSUTF16LittleEndianStringEncoding),
    NSUTF32StringEncoding($Foundation.NSUTF32StringEncoding),
    NSUTF32BigEndianStringEncoding($Foundation.NSUTF32BigEndianStringEncoding),
    NSUTF32LittleEndianStringEncoding($Foundation.NSUTF32LittleEndianStringEncoding);

    private final long value;

    private NSStringEncoding(long value) { this.value = value; }
}
