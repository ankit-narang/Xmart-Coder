package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSRegularExpression extends NSObject implements NSCopying, NSCoding {
    
    public NSRegularExpression() {}
    @ObjCPropertyGetter(selector = "pattern")
    public native NSString getPattern();
    @ObjCProperty public NSString pattern;

    @ObjCPropertyGetter(selector = "options")
    public native NSRegularExpressionOptions getOptions();
    @ObjCProperty public NSRegularExpressionOptions options;

    @ObjCPropertyGetter(selector = "numberOfCaptureGroups")
    public native @NSUInteger long getNumberOfCaptureGroups();
    @ObjCProperty public @NSUInteger long numberOfCaptureGroups;
    
    @ObjCMethodSign(sign = "- (id)initWithPattern:(NSString *)pattern options:(NSRegularExpressionOptions)options error:(NSError **)error;", selector = "initWithPattern:options:error:")
    public native NSRegularExpression initWithPattern$options$error$(NSString pattern, NSRegularExpressionOptions options, NSError[] error);

    @ObjCMethodSign(sign = "+ (NSRegularExpression *)regularExpressionWithPattern:(NSString *)pattern options:(NSRegularExpressionOptions)options error:(NSError **)error;", selector = "regularExpressionWithPattern:options:error:")
    public static native NSRegularExpression regularExpressionWithPattern$options$error$(NSString pattern, NSRegularExpressionOptions options, NSError[] error);

    @ObjCMethodSign(sign = "+ (NSString *)escapedPatternForString:(NSString *)string;", selector = "escapedPatternForString:")
    public static native NSString escapedPatternForString$(NSString string);

    @ObjCCategoryMethod(catname = "NSMatching", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (void)enumerateMatchesInString:(NSString *)string options:(NSMatchingOptions)options range:(NSRange)range usingBlock:(void (^)(NSTextCheckingResult *result, NSMatchingFlags flags, BOOL *stop))block;", selector = "enumerateMatchesInString:options:range:usingBlock:")
    public native void enumerateMatchesInString$options$range$usingBlock$(NSString string, NSMatchingOptions options, @ObjCByValue NSRange range, ObjCBlock block);

    @ObjCCategoryMethod(catname = "NSMatching", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (NSArray *)matchesInString:(NSString *)string options:(NSMatchingOptions)options range:(NSRange)range;", selector = "matchesInString:options:range:")
    public native NSArray matchesInString$options$range$(NSString string, NSMatchingOptions options, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSMatching", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (NSUInteger)numberOfMatchesInString:(NSString *)string options:(NSMatchingOptions)options range:(NSRange)range;", selector = "numberOfMatchesInString:options:range:")
    public native @NSUInteger long numberOfMatchesInString$options$range$(NSString string, NSMatchingOptions options, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSMatching", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (NSTextCheckingResult *)firstMatchInString:(NSString *)string options:(NSMatchingOptions)options range:(NSRange)range;", selector = "firstMatchInString:options:range:")
    public native NSTextCheckingResult firstMatchInString$options$range$(NSString string, NSMatchingOptions options, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSMatching", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfFirstMatchInString:(NSString *)string options:(NSMatchingOptions)options range:(NSRange)range;", selector = "rangeOfFirstMatchInString:options:range:")
    public native @ObjCByValue NSRange rangeOfFirstMatchInString$options$range$(NSString string, NSMatchingOptions options, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSReplacement", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (NSString *)stringByReplacingMatchesInString:(NSString *)string options:(NSMatchingOptions)options range:(NSRange)range withTemplate:(NSString *)templ;", selector = "stringByReplacingMatchesInString:options:range:withTemplate:")
    public native NSString stringByReplacingMatchesInString$options$range$withTemplate$(NSString string, NSMatchingOptions options, @ObjCByValue NSRange range, NSString templ);

    @ObjCCategoryMethod(catname = "NSReplacement", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (NSUInteger)replaceMatchesInString:(NSMutableString *)string options:(NSMatchingOptions)options range:(NSRange)range withTemplate:(NSString *)templ;", selector = "replaceMatchesInString:options:range:withTemplate:")
    public native @NSUInteger long replaceMatchesInString$options$range$withTemplate$(NSMutableString string, NSMatchingOptions options, @ObjCByValue NSRange range, NSString templ);

    @ObjCCategoryMethod(catname = "NSReplacement", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "- (NSString *)replacementStringForResult:(NSTextCheckingResult *)result inString:(NSString *)string offset:(NSInteger)offset template:(NSString *)templ;", selector = "replacementStringForResult:inString:offset:template:")
    public native NSString replacementStringForResult$inString$offset$template$(NSTextCheckingResult result, NSString string, @NSInteger long offset, NSString templ);

    @ObjCCategoryMethod(catname = "NSReplacement", catownername = "NSRegularExpression")
    @ObjCMethodSign(sign = "+ (NSString *)escapedTemplateForString:(NSString *)string;", selector = "escapedTemplateForString:")
    public static native NSString escapedTemplateForString$(NSString string);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSRegularExpression initWithCoder$(NSCoder aDecoder);
}
