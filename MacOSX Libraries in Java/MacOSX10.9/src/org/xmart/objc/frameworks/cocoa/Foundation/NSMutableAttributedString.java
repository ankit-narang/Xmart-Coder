package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableAttributedString extends NSAttributedString  {
    
    public NSMutableAttributedString() {}
    
    
    @ObjCMethodSign(sign = "- (void)replaceCharactersInRange:(NSRange)range withString:(NSString *)str;", selector = "replaceCharactersInRange:withString:")
    public native void replaceCharactersInRange$withString$(@ObjCByValue NSRange range, NSString str);

    @ObjCMethodSign(sign = "- (void)setAttributes:(NSDictionary *)attrs range:(NSRange)range;", selector = "setAttributes:range:")
    public native void setAttributes$range$(NSDictionary attrs, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (NSMutableString *)mutableString;", selector = "mutableString")
    public native NSMutableString mutableString();

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)addAttribute:(NSString *)name value:(id)value range:(NSRange)range;", selector = "addAttribute:value:range:")
    public native void addAttribute$value$range$(NSString name, NSObject value, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)addAttributes:(NSDictionary *)attrs range:(NSRange)range;", selector = "addAttributes:range:")
    public native void addAttributes$range$(NSDictionary attrs, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)removeAttribute:(NSString *)name range:(NSRange)range;", selector = "removeAttribute:range:")
    public native void removeAttribute$range$(NSString name, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)replaceCharactersInRange:(NSRange)range withAttributedString:(NSAttributedString *)attrString;", selector = "replaceCharactersInRange:withAttributedString:")
    public native void replaceCharactersInRange$withAttributedString$(@ObjCByValue NSRange range, NSAttributedString attrString);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)insertAttributedString:(NSAttributedString *)attrString atIndex:(NSUInteger)loc;", selector = "insertAttributedString:atIndex:")
    public native void insertAttributedString$atIndex$(NSAttributedString attrString, @NSUInteger long loc);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)appendAttributedString:(NSAttributedString *)attrString;", selector = "appendAttributedString:")
    public native void appendAttributedString$(NSAttributedString attrString);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)deleteCharactersInRange:(NSRange)range;", selector = "deleteCharactersInRange:")
    public native void deleteCharactersInRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)setAttributedString:(NSAttributedString *)attrString;", selector = "setAttributedString:")
    public native void setAttributedString(NSAttributedString attrString);

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)beginEditing;", selector = "beginEditing")
    public native void beginEditing();

    @ObjCCategoryMethod(catname = "NSExtendedMutableAttributedString", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)endEditing;", selector = "endEditing")
    public native void endEditing();
}
