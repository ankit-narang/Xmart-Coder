package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableString extends NSString  {
    
    public NSMutableString() {}
    
    
    @ObjCMethodSign(sign = "- (void)replaceCharactersInRange:(NSRange)range withString:(NSString *)aString;", selector = "replaceCharactersInRange:withString:")
    public native void replaceCharactersInRange$withString$(@ObjCByValue NSRange range, NSString aString);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "- (void)insertString:(NSString *)aString atIndex:(NSUInteger)loc;", selector = "insertString:atIndex:")
    public native void insertString$atIndex$(NSString aString, @NSUInteger long loc);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "- (void)deleteCharactersInRange:(NSRange)range;", selector = "deleteCharactersInRange:")
    public native void deleteCharactersInRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "- (void)appendString:(NSString *)aString;", selector = "appendString:")
    public native void appendString$(NSString aString);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "- (void)appendFormat:(NSString *)format, ... NS_FORMAT_FUNCTION(1,2);", selector = "appendFormat:")
    public native void appendFormat$(NSString format, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "- (void)setString:(NSString *)aString;", selector = "setString:")
    public native void setString(NSString aString);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "- (id)initWithCapacity:(NSUInteger)capacity;", selector = "initWithCapacity:")
    public native NSMutableString initWithCapacity$(@NSUInteger long capacity);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "- (NSUInteger)replaceOccurrencesOfString:(NSString *)target withString:(NSString *)replacement options:(NSStringCompareOptions)options range:(NSRange)searchRange;", selector = "replaceOccurrencesOfString:withString:options:range:")
    public native @NSUInteger long replaceOccurrencesOfString$withString$options$range$(NSString target, NSString replacement, NSStringCompareOptions options, @ObjCByValue NSRange searchRange);

    @ObjCCategoryMethod(catname = "NSMutableStringExtensionMethods", catownername = "NSMutableString")
    @ObjCMethodSign(sign = "+ (id)stringWithCapacity:(NSUInteger)capacity;", selector = "stringWithCapacity:")
    public static native NSObject stringWithCapacity$(@NSUInteger long capacity);
}
