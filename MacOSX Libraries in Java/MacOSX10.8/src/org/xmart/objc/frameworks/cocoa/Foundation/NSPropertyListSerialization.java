package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSPropertyListSerialization extends NSObject  {
    
    public NSPropertyListSerialization() {}
    
    
    @ObjCMethodSign(sign = "+ (BOOL)propertyList:(id)plist isValidForFormat:(NSPropertyListFormat)format;", selector = "propertyList:isValidForFormat:")
    public static native boolean propertyList$isValidForFormat$(NSObject plist, NSPropertyListFormat format);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSData *)dataWithPropertyList:(id)plist format:(NSPropertyListFormat)format options:(NSPropertyListWriteOptions)opt error:(out NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "dataWithPropertyList:format:options:error:")
    public static native NSData dataWithPropertyList$format$options$error$(NSObject plist, NSPropertyListFormat format, @NSUInteger long opt, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSInteger)writePropertyList:(id)plist toStream:(NSOutputStream *)stream format:(NSPropertyListFormat)format options:(NSPropertyListWriteOptions)opt error:(out NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "writePropertyList:toStream:format:options:error:")
    public static native @NSInteger long writePropertyList$toStream$format$options$error$(NSObject plist, NSOutputStream stream, NSPropertyListFormat format, @NSUInteger long opt, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)propertyListWithData:(NSData *)data options:(NSPropertyListReadOptions)opt format:(NSPropertyListFormat *)format error:(out NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "propertyListWithData:options:format:error:")
    public static native NSObject propertyListWithData$options$format$error$(NSData data, @NSUInteger long opt, @NSUInteger long[] format, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)propertyListWithStream:(NSInputStream *)stream options:(NSPropertyListReadOptions)opt format:(NSPropertyListFormat *)format error:(out NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "propertyListWithStream:options:format:error:")
    public static native NSObject propertyListWithStream$options$format$error$(NSInputStream stream, @NSUInteger long opt, @NSUInteger long[] format, NSError[] error);

    @ObjCMethodSign(sign = "+ (NSData *)dataFromPropertyList:(id)plist format:(NSPropertyListFormat)format errorDescription:(out __strong NSString **)errorString;", selector = "dataFromPropertyList:format:errorDescription:")
    public static native NSData dataFromPropertyList$format$errorDescription$(NSObject plist, NSPropertyListFormat format, ObjCPtr<NSString> errorString);

    @ObjCMethodSign(sign = "+ (id)propertyListFromData:(NSData *)data mutabilityOption:(NSPropertyListMutabilityOptions)opt format:(NSPropertyListFormat *)format errorDescription:(out __strong NSString **)errorString;", selector = "propertyListFromData:mutabilityOption:format:errorDescription:")
    public static native NSObject propertyListFromData$mutabilityOption$format$errorDescription$(NSData data, NSPropertyListMutabilityOptions opt, @NSUInteger long[] format, ObjCPtr<NSString> errorString);
}
