package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSFormatter extends NSObject implements NSCopying, NSCoding {
    
    public NSFormatter() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)stringForObjectValue:(id)obj;", selector = "stringForObjectValue:")
    public native NSString stringForObjectValue$(NSObject obj);

    @ObjCMethodSign(sign = "- (NSAttributedString *)attributedStringForObjectValue:(id)obj withDefaultAttributes:(NSDictionary *)attrs;", selector = "attributedStringForObjectValue:withDefaultAttributes:")
    public native NSAttributedString attributedStringForObjectValue$withDefaultAttributes$(NSObject obj, NSDictionary attrs);

    @ObjCMethodSign(sign = "- (NSString *)editingStringForObjectValue:(id)obj;", selector = "editingStringForObjectValue:")
    public native NSString editingStringForObjectValue$(NSObject obj);

    @ObjCMethodSign(sign = "- (BOOL)getObjectValue:(out id *)obj forString:(NSString *)string errorDescription:(out NSString **)error;", selector = "getObjectValue:forString:errorDescription:")
    public native boolean getObjectValue$forString$errorDescription$(NSObject obj, NSString string, ObjCPtr<NSString> error);

    @ObjCMethodSign(sign = "- (BOOL)isPartialStringValid:(NSString *)partialString newEditingString:(NSString **)newString errorDescription:(NSString **)error;", selector = "isPartialStringValid:newEditingString:errorDescription:")
    public native boolean isPartialStringValid$newEditingString$errorDescription$(NSString partialString, ObjCPtr<NSString> newString, ObjCPtr<NSString> error);

    @ObjCMethodSign(sign = "- (BOOL)isPartialStringValid:(NSString **)partialStringPtr proposedSelectedRange:(NSRangePointer)proposedSelRangePtr originalString:(NSString *)origString originalSelectedRange:(NSRange)origSelRange errorDescription:(NSString **)error;", selector = "isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:")
    public native boolean isPartialStringValid$proposedSelectedRange$originalString$originalSelectedRange$errorDescription$(ObjCPtr<NSString> partialStringPtr, NSRange proposedSelRangePtr, NSString origString, @ObjCByValue NSRange origSelRange, ObjCPtr<NSString> error);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSFormatter initWithCoder$(NSCoder aDecoder);
}
