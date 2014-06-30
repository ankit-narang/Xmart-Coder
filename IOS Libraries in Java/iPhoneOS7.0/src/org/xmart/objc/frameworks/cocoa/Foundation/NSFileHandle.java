package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSFileHandle extends NSObject implements NSSecureCoding {
    
    public NSFileHandle() {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "readabilityHandler")
    public native ObjCBlock getReadabilityHandler();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setReadabilityHandler:")
    public native void setReadabilityHandler(ObjCBlock v);
    @ObjCProperty public ObjCBlock readabilityHandler;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "writeabilityHandler")
    public native ObjCBlock getWriteabilityHandler();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setWriteabilityHandler:")
    public native void setWriteabilityHandler(ObjCBlock v);
    @ObjCProperty public ObjCBlock writeabilityHandler;
    
    @ObjCMethodSign(sign = "- (NSData *)availableData;", selector = "availableData")
    public native NSData availableData();

    @ObjCMethodSign(sign = "- (NSData *)readDataToEndOfFile;", selector = "readDataToEndOfFile")
    public native NSData readDataToEndOfFile();

    @ObjCMethodSign(sign = "- (NSData *)readDataOfLength:(NSUInteger)length;", selector = "readDataOfLength:")
    public native NSData readDataOfLength$(@NSUInteger long length);

    @ObjCMethodSign(sign = "- (void)writeData:(NSData *)data;", selector = "writeData:")
    public native void writeData$(NSData data);

    @ObjCMethodSign(sign = "- (unsigned long long)offsetInFile;", selector = "offsetInFile")
    public native @Unsigned @LongLong long offsetInFile();

    @ObjCMethodSign(sign = "- (unsigned long long)seekToEndOfFile;", selector = "seekToEndOfFile")
    public native @Unsigned @LongLong long seekToEndOfFile();

    @ObjCMethodSign(sign = "- (void)seekToFileOffset:(unsigned long long)offset;", selector = "seekToFileOffset:")
    public native void seekToFileOffset$(@Unsigned @LongLong long offset);

    @ObjCMethodSign(sign = "- (void)truncateFileAtOffset:(unsigned long long)offset;", selector = "truncateFileAtOffset:")
    public native void truncateFileAtOffset$(@Unsigned @LongLong long offset);

    @ObjCMethodSign(sign = "- (void)synchronizeFile;", selector = "synchronizeFile")
    public native void synchronizeFile();

    @ObjCMethodSign(sign = "- (void)closeFile;", selector = "closeFile")
    public native void closeFile();

    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleWithStandardInput;", selector = "fileHandleWithStandardInput")
    public static native NSObject fileHandleWithStandardInput();

    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleWithStandardOutput;", selector = "fileHandleWithStandardOutput")
    public static native NSObject fileHandleWithStandardOutput();

    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleWithStandardError;", selector = "fileHandleWithStandardError")
    public static native NSObject fileHandleWithStandardError();

    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleWithNullDevice;", selector = "fileHandleWithNullDevice")
    public static native NSObject fileHandleWithNullDevice();

    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleForReadingAtPath:(NSString *)path;", selector = "fileHandleForReadingAtPath:")
    public static native NSObject fileHandleForReadingAtPath$(NSString path);

    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleForWritingAtPath:(NSString *)path;", selector = "fileHandleForWritingAtPath:")
    public static native NSObject fileHandleForWritingAtPath$(NSString path);

    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleForUpdatingAtPath:(NSString *)path;", selector = "fileHandleForUpdatingAtPath:")
    public static native NSObject fileHandleForUpdatingAtPath$(NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleForReadingFromURL:(NSURL *)url error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "fileHandleForReadingFromURL:error:")
    public static native NSObject fileHandleForReadingFromURL$error$(NSURL url, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleForWritingToURL:(NSURL *)url error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "fileHandleForWritingToURL:error:")
    public static native NSObject fileHandleForWritingToURL$error$(NSURL url, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSFileHandleCreation", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "+ (id)fileHandleForUpdatingURL:(NSURL *)url error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "fileHandleForUpdatingURL:error:")
    public static native NSObject fileHandleForUpdatingURL$error$(NSURL url, NSError[] error);

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)readInBackgroundAndNotifyForModes:(NSArray *)modes;", selector = "readInBackgroundAndNotifyForModes:")
    public native void readInBackgroundAndNotifyForModes$(NSArray modes);

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)readInBackgroundAndNotify;", selector = "readInBackgroundAndNotify")
    public native void readInBackgroundAndNotify();

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)readToEndOfFileInBackgroundAndNotifyForModes:(NSArray *)modes;", selector = "readToEndOfFileInBackgroundAndNotifyForModes:")
    public native void readToEndOfFileInBackgroundAndNotifyForModes$(NSArray modes);

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)readToEndOfFileInBackgroundAndNotify;", selector = "readToEndOfFileInBackgroundAndNotify")
    public native void readToEndOfFileInBackgroundAndNotify();

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)acceptConnectionInBackgroundAndNotifyForModes:(NSArray *)modes;", selector = "acceptConnectionInBackgroundAndNotifyForModes:")
    public native void acceptConnectionInBackgroundAndNotifyForModes$(NSArray modes);

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)acceptConnectionInBackgroundAndNotify;", selector = "acceptConnectionInBackgroundAndNotify")
    public native void acceptConnectionInBackgroundAndNotify();

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)waitForDataInBackgroundAndNotifyForModes:(NSArray *)modes;", selector = "waitForDataInBackgroundAndNotifyForModes:")
    public native void waitForDataInBackgroundAndNotifyForModes$(NSArray modes);

    @ObjCCategoryMethod(catname = "NSFileHandleAsynchronousAccess", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (void)waitForDataInBackgroundAndNotify;", selector = "waitForDataInBackgroundAndNotify")
    public native void waitForDataInBackgroundAndNotify();

    @ObjCCategoryMethod(catname = "NSFileHandlePlatformSpecific", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (id)initWithFileDescriptor:(int)fd closeOnDealloc:(BOOL)closeopt;", selector = "initWithFileDescriptor:closeOnDealloc:")
    public native NSFileHandle initWithFileDescriptor$closeOnDealloc$(int fd, boolean closeopt);

    @ObjCCategoryMethod(catname = "NSFileHandlePlatformSpecific", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (id)initWithFileDescriptor:(int)fd;", selector = "initWithFileDescriptor:")
    public native NSFileHandle initWithFileDescriptor$(int fd);

    @ObjCCategoryMethod(catname = "NSFileHandlePlatformSpecific", catownername = "NSFileHandle")
    @ObjCMethodSign(sign = "- (int)fileDescriptor;", selector = "fileDescriptor")
    public native int fileDescriptor();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSFileHandle initWithCoder$(NSCoder aDecoder);
}
