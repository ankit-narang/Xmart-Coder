package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableData extends NSData  {
    
    public NSMutableData() {}
    
    
    @ObjCMethodSign(sign = "- (void *)mutableBytes NS_RETURNS_INNER_POINTER;", selector = "mutableBytes")
    public native @VoidPointer() Object mutableBytes();

    @ObjCMethodSign(sign = "- (void)setLength:(NSUInteger)length;", selector = "setLength:")
    public native void setLength(@NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSExtendedMutableData", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (void)appendBytes:(const void *)bytes length:(NSUInteger)length;", selector = "appendBytes:length:")
    public native void appendBytes$length$(@VoidPointer() Object bytes, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSExtendedMutableData", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (void)appendData:(NSData *)other;", selector = "appendData:")
    public native void appendData$(NSData other);

    @ObjCCategoryMethod(catname = "NSExtendedMutableData", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (void)increaseLengthBy:(NSUInteger)extraLength;", selector = "increaseLengthBy:")
    public native void increaseLengthBy$(@NSUInteger long extraLength);

    @ObjCCategoryMethod(catname = "NSExtendedMutableData", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (void)replaceBytesInRange:(NSRange)range withBytes:(const void *)bytes;", selector = "replaceBytesInRange:withBytes:")
    public native void replaceBytesInRange$withBytes$(@ObjCByValue NSRange range, @VoidPointer() Object bytes);

    @ObjCCategoryMethod(catname = "NSExtendedMutableData", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (void)resetBytesInRange:(NSRange)range;", selector = "resetBytesInRange:")
    public native void resetBytesInRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableData", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (void)setData:(NSData *)data;", selector = "setData:")
    public native void setData(NSData data);

    @ObjCCategoryMethod(catname = "NSExtendedMutableData", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (void)replaceBytesInRange:(NSRange)range withBytes:(const void *)replacementBytes length:(NSUInteger)replacementLength;", selector = "replaceBytesInRange:withBytes:length:")
    public native void replaceBytesInRange$withBytes$length$(@ObjCByValue NSRange range, @VoidPointer() Object replacementBytes, @NSUInteger long replacementLength);

    @ObjCCategoryMethod(catname = "NSMutableDataCreation", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (id)initWithCapacity:(NSUInteger)capacity;", selector = "initWithCapacity:")
    public native NSMutableData initWithCapacity$(@NSUInteger long capacity);

    @ObjCCategoryMethod(catname = "NSMutableDataCreation", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "- (id)initWithLength:(NSUInteger)length;", selector = "initWithLength:")
    public native NSMutableData initWithLength$(@NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSMutableDataCreation", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "+ (id)dataWithCapacity:(NSUInteger)aNumItems;", selector = "dataWithCapacity:")
    public static native NSObject dataWithCapacity$(@NSUInteger long aNumItems);

    @ObjCCategoryMethod(catname = "NSMutableDataCreation", catownername = "NSMutableData")
    @ObjCMethodSign(sign = "+ (id)dataWithLength:(NSUInteger)length;", selector = "dataWithLength:")
    public static native NSObject dataWithLength$(@NSUInteger long length);
}
