package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSNumberFormatterStyle {
    NSNumberFormatterNoStyle($Foundation.NSNumberFormatterNoStyle),
    NSNumberFormatterDecimalStyle($Foundation.NSNumberFormatterDecimalStyle),
    NSNumberFormatterCurrencyStyle($Foundation.NSNumberFormatterCurrencyStyle),
    NSNumberFormatterPercentStyle($Foundation.NSNumberFormatterPercentStyle),
    NSNumberFormatterScientificStyle($Foundation.NSNumberFormatterScientificStyle),
    NSNumberFormatterSpellOutStyle($Foundation.NSNumberFormatterSpellOutStyle);

    private final long value;

    private NSNumberFormatterStyle(long value) { this.value = value; }
}
