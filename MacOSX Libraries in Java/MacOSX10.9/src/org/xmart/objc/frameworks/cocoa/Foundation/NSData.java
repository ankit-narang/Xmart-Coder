package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSData extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    
    public NSData() {}
    
    
    @ObjCMethodSign(sign = "- (NSUInteger)length;", selector = "length")
    public native @NSUInteger long length();

    @ObjCMethodSign(sign = "- (const void *)bytes NS_RETURNS_INNER_POINTER;", selector = "bytes")
    public native @VoidPointer() Object bytes();

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (void)getBytes:(void *)buffer length:(NSUInteger)length;", selector = "getBytes:length:")
    public native void getBytes$length$(@VoidPointer() Object buffer, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (void)getBytes:(void *)buffer range:(NSRange)range;", selector = "getBytes:range:")
    public native void getBytes$range$(@VoidPointer() Object buffer, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToData:(NSData *)other;", selector = "isEqualToData:")
    public native boolean isEqualToData$(NSData other);

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (NSData *)subdataWithRange:(NSRange)range;", selector = "subdataWithRange:")
    public native NSData subdataWithRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (BOOL)writeToFile:(NSString *)path atomically:(BOOL)useAuxiliaryFile;", selector = "writeToFile:atomically:")
    public native boolean writeToFile$atomically$(NSString path, boolean useAuxiliaryFile);

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (BOOL)writeToURL:(NSURL *)url atomically:(BOOL)atomically;", selector = "writeToURL:atomically:")
    public native boolean writeToURL$atomically$(NSURL url, boolean atomically);

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (BOOL)writeToFile:(NSString *)path options:(NSDataWritingOptions)writeOptionsMask error:(NSError **)errorPtr;", selector = "writeToFile:options:error:")
    public native boolean writeToFile$options$error$(NSString path, NSDataWritingOptions writeOptionsMask, NSError[] errorPtr);

    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (BOOL)writeToURL:(NSURL *)url options:(NSDataWritingOptions)writeOptionsMask error:(NSError **)errorPtr;", selector = "writeToURL:options:error:")
    public native boolean writeToURL$options$error$(NSURL url, NSDataWritingOptions writeOptionsMask, NSError[] errorPtr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfData:(NSData *)dataToFind options:(NSDataSearchOptions)mask range:(NSRange)searchRange NS_AVAILABLE(10_6, 4_0);", selector = "rangeOfData:options:range:")
    public native @ObjCByValue NSRange rangeOfData$options$range$(NSData dataToFind, NSDataSearchOptions mask, @ObjCByValue NSRange searchRange);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedData", catownername = "NSData")
    @ObjCMethodSign(sign = "- (void) enumerateByteRangesUsingBlock:(void (^)(const void *bytes, NSRange byteRange, BOOL *stop))block NS_AVAILABLE(10_9, 7_0);", selector = "enumerateByteRangesUsingBlock:")
    public native void enumerateByteRangesUsingBlock$(ObjCBlock block);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithBytes:(const void *)bytes length:(NSUInteger)length;", selector = "initWithBytes:length:")
    public native NSData initWithBytes$length$(@VoidPointer() Object bytes, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithBytesNoCopy:(void *)bytes length:(NSUInteger)length;", selector = "initWithBytesNoCopy:length:")
    public native NSData initWithBytesNoCopy$length$(@VoidPointer() Object bytes, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithBytesNoCopy:(void *)bytes length:(NSUInteger)length freeWhenDone:(BOOL)b;", selector = "initWithBytesNoCopy:length:freeWhenDone:")
    public native NSData initWithBytesNoCopy$length$freeWhenDone$(@VoidPointer() Object bytes, @NSUInteger long length, boolean b);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithBytesNoCopy:(void *)bytes length:(NSUInteger)length deallocator:(void (^)(void *bytes, NSUInteger length))deallocator NS_AVAILABLE(10_9, 7_0);", selector = "initWithBytesNoCopy:length:deallocator:")
    public native NSData initWithBytesNoCopy$length$deallocator$(@VoidPointer() Object bytes, @NSUInteger long length, ObjCBlock deallocator);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithContentsOfFile:(NSString *)path options:(NSDataReadingOptions)readOptionsMask error:(NSError **)errorPtr;", selector = "initWithContentsOfFile:options:error:")
    public native NSData initWithContentsOfFile$options$error$(NSString path, NSDataReadingOptions readOptionsMask, NSError[] errorPtr);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithContentsOfURL:(NSURL *)url options:(NSDataReadingOptions)readOptionsMask error:(NSError **)errorPtr;", selector = "initWithContentsOfURL:options:error:")
    public native NSData initWithContentsOfURL$options$error$(NSURL url, NSDataReadingOptions readOptionsMask, NSError[] errorPtr);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithContentsOfFile:(NSString *)path;", selector = "initWithContentsOfFile:")
    public native NSData initWithContentsOfFile$(NSString path);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithContentsOfURL:(NSURL *)url;", selector = "initWithContentsOfURL:")
    public native NSData initWithContentsOfURL$(NSURL url);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data;", selector = "initWithData:")
    public native NSData initWithData$(NSData data);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)data;", selector = "data")
    public static native NSObject data();

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithBytes:(const void *)bytes length:(NSUInteger)length;", selector = "dataWithBytes:length:")
    public static native NSObject dataWithBytes$length$(@VoidPointer() Object bytes, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithBytesNoCopy:(void *)bytes length:(NSUInteger)length;", selector = "dataWithBytesNoCopy:length:")
    public static native NSObject dataWithBytesNoCopy$length$(@VoidPointer() Object bytes, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithBytesNoCopy:(void *)bytes length:(NSUInteger)length freeWhenDone:(BOOL)b;", selector = "dataWithBytesNoCopy:length:freeWhenDone:")
    public static native NSObject dataWithBytesNoCopy$length$freeWhenDone$(@VoidPointer() Object bytes, @NSUInteger long length, boolean b);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithContentsOfFile:(NSString *)path options:(NSDataReadingOptions)readOptionsMask error:(NSError **)errorPtr;", selector = "dataWithContentsOfFile:options:error:")
    public static native NSObject dataWithContentsOfFile$options$error$(NSString path, NSDataReadingOptions readOptionsMask, NSError[] errorPtr);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithContentsOfURL:(NSURL *)url options:(NSDataReadingOptions)readOptionsMask error:(NSError **)errorPtr;", selector = "dataWithContentsOfURL:options:error:")
    public static native NSObject dataWithContentsOfURL$options$error$(NSURL url, NSDataReadingOptions readOptionsMask, NSError[] errorPtr);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithContentsOfFile:(NSString *)path;", selector = "dataWithContentsOfFile:")
    public static native NSObject dataWithContentsOfFile$(NSString path);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithContentsOfURL:(NSURL *)url;", selector = "dataWithContentsOfURL:")
    public static native NSObject dataWithContentsOfURL$(NSURL url);

    @ObjCCategoryMethod(catname = "NSDataCreation", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithData:(NSData *)data;", selector = "dataWithData:")
    public static native NSObject dataWithData$(NSData data);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSDataBase64Encoding", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithBase64EncodedString:(NSString *)base64String options:(NSDataBase64DecodingOptions)options NS_AVAILABLE(10_9, 7_0);", selector = "initWithBase64EncodedString:options:")
    public native NSData initWithBase64EncodedString$options$(NSString base64String, NSDataBase64DecodingOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSDataBase64Encoding", catownername = "NSData")
    @ObjCMethodSign(sign = "- (NSString *)base64EncodedStringWithOptions:(NSDataBase64EncodingOptions)options NS_AVAILABLE(10_9, 7_0);", selector = "base64EncodedStringWithOptions:")
    public native NSString base64EncodedStringWithOptions$(NSDataBase64EncodingOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSDataBase64Encoding", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithBase64EncodedData:(NSData *)base64Data options:(NSDataBase64DecodingOptions)options NS_AVAILABLE(10_9, 7_0);", selector = "initWithBase64EncodedData:options:")
    public native NSData initWithBase64EncodedData$options$(NSData base64Data, NSDataBase64DecodingOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSDataBase64Encoding", catownername = "NSData")
    @ObjCMethodSign(sign = "- (NSData *)base64EncodedDataWithOptions:(NSDataBase64EncodingOptions)options NS_AVAILABLE(10_9, 7_0);", selector = "base64EncodedDataWithOptions:")
    public native NSData base64EncodedDataWithOptions$(NSDataBase64EncodingOptions options);

    @ObjCCategoryMethod(catname = "NSDeprecated", catownername = "NSData")
    @ObjCMethodSign(sign = "- (void)getBytes:(void *)buffer;", selector = "getBytes:")
    public native void getBytes$(@VoidPointer() Object buffer);

    @ObjCCategoryMethod(catname = "NSDeprecated", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithContentsOfMappedFile:(NSString *)path;", selector = "initWithContentsOfMappedFile:")
    public native NSData initWithContentsOfMappedFile$(NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSDeprecated", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)initWithBase64Encoding:(NSString *)base64String NS_DEPRECATED(10_6, 10_9, 4_0, 7_0);", selector = "initWithBase64Encoding:")
    public native NSData initWithBase64Encoding$(NSString base64String);

    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSDeprecated", catownername = "NSData")
    @ObjCMethodSign(sign = "- (NSString *)base64Encoding NS_DEPRECATED(10_6, 10_9, 4_0, 7_0);", selector = "base64Encoding")
    public native NSString base64Encoding();

    @ObjCCategoryMethod(catname = "NSDeprecated", catownername = "NSData")
    @ObjCMethodSign(sign = "+ (id)dataWithContentsOfMappedFile:(NSString *)path;", selector = "dataWithContentsOfMappedFile:")
    public static native NSObject dataWithContentsOfMappedFile$(NSString path);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSData initWithCoder$(NSCoder aDecoder);
}
