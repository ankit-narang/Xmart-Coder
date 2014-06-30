package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSTextCheckingType {
    NSTextCheckingTypeOrthography($Foundation.NSTextCheckingTypeOrthography),
    NSTextCheckingTypeSpelling($Foundation.NSTextCheckingTypeSpelling),
    NSTextCheckingTypeGrammar($Foundation.NSTextCheckingTypeGrammar),
    NSTextCheckingTypeDate($Foundation.NSTextCheckingTypeDate),
    NSTextCheckingTypeAddress($Foundation.NSTextCheckingTypeAddress),
    NSTextCheckingTypeLink($Foundation.NSTextCheckingTypeLink),
    NSTextCheckingTypeQuote($Foundation.NSTextCheckingTypeQuote),
    NSTextCheckingTypeDash($Foundation.NSTextCheckingTypeDash),
    NSTextCheckingTypeReplacement($Foundation.NSTextCheckingTypeReplacement),
    NSTextCheckingTypeCorrection($Foundation.NSTextCheckingTypeCorrection),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSTextCheckingTypeRegularExpression($Foundation.NSTextCheckingTypeRegularExpression),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSTextCheckingTypePhoneNumber($Foundation.NSTextCheckingTypePhoneNumber),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSTextCheckingTypeTransitInformation($Foundation.NSTextCheckingTypeTransitInformation);

    private final long value;

    private NSTextCheckingType(long value) { this.value = value; }
}
