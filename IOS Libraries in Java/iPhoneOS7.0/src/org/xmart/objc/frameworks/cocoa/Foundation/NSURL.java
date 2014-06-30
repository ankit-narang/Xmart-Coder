package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURL extends NSObject implements NSSecureCoding, NSCopying {
    
    public NSURL() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithScheme:(NSString *)scheme host:(NSString *)host path:(NSString *)path;", selector = "initWithScheme:host:path:")
    public native NSURL initWithScheme$host$path$(NSString scheme, NSString host, NSString path);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initFileURLWithPath:(NSString *)path isDirectory:(BOOL)isDir NS_AVAILABLE(10_5, 2_0);", selector = "initFileURLWithPath:isDirectory:")
    public native NSURL initFileURLWithPath$isDirectory$(NSString path, boolean isDir);

    @ObjCMethodSign(sign = "- (id)initFileURLWithPath:(NSString *)path;", selector = "initFileURLWithPath:")
    public native NSURL initFileURLWithPath$(NSString path);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initFileURLWithFileSystemRepresentation:(const char *)path isDirectory:(BOOL)isDir relativeToURL:(NSURL *)baseURL NS_AVAILABLE(10_9, 7_0);", selector = "initFileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public native NSURL initFileURLWithFileSystemRepresentation$isDirectory$relativeToURL$(byte[] path, boolean isDir, NSURL baseURL);

    @ObjCMethodSign(sign = "- (id)initWithString:(NSString *)URLString;", selector = "initWithString:")
    public native NSURL initWithString$(NSString URLString);

    @ObjCMethodSign(sign = "- (id)initWithString:(NSString *)URLString relativeToURL:(NSURL *)baseURL;", selector = "initWithString:relativeToURL:")
    public native NSURL initWithString$relativeToURL$(NSString URLString, NSURL baseURL);

    @ObjCMethodSign(sign = "- (NSString *)absoluteString;", selector = "absoluteString")
    public native NSString absoluteString();

    @ObjCMethodSign(sign = "- (NSString *)relativeString;", selector = "relativeString")
    public native NSString relativeString();

    @ObjCMethodSign(sign = "- (NSURL *)baseURL;", selector = "baseURL")
    public native NSURL baseURL();

    @ObjCMethodSign(sign = "- (NSURL *)absoluteURL;", selector = "absoluteURL")
    public native NSURL absoluteURL();

    @ObjCMethodSign(sign = "- (NSString *)scheme;", selector = "scheme")
    public native NSString scheme();

    @ObjCMethodSign(sign = "- (NSString *)resourceSpecifier;", selector = "resourceSpecifier")
    public native NSString resourceSpecifier();

    @ObjCMethodSign(sign = "- (NSString *)host;", selector = "host")
    public native NSString host();

    @ObjCMethodSign(sign = "- (NSNumber *)port;", selector = "port")
    public native NSNumber port();

    @ObjCMethodSign(sign = "- (NSString *)user;", selector = "user")
    public native NSString user();

    @ObjCMethodSign(sign = "- (NSString *)password;", selector = "password")
    public native NSString password();

    @ObjCMethodSign(sign = "- (NSString *)path;", selector = "path")
    public native NSString path();

    @ObjCMethodSign(sign = "- (NSString *)fragment;", selector = "fragment")
    public native NSString fragment();

    @ObjCMethodSign(sign = "- (NSString *)parameterString;", selector = "parameterString")
    public native NSString parameterString();

    @ObjCMethodSign(sign = "- (NSString *)query;", selector = "query")
    public native NSString query();

    @ObjCMethodSign(sign = "- (NSString *)relativePath;", selector = "relativePath")
    public native NSString relativePath();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)getFileSystemRepresentation:(char *)buffer maxLength:(NSUInteger)maxBufferLength NS_AVAILABLE(10_9, 7_0);", selector = "getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentation$maxLength$(byte[] buffer, @NSUInteger long maxBufferLength);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (__strong const char *)fileSystemRepresentation NS_RETURNS_INNER_POINTER NS_AVAILABLE(10_9, 7_0);", selector = "fileSystemRepresentation")
    public native byte[] fileSystemRepresentation();

    @ObjCMethodSign(sign = "- (BOOL)isFileURL;", selector = "isFileURL")
    public native boolean isFileURL();

    @ObjCMethodSign(sign = "- (NSURL *)standardizedURL;", selector = "standardizedURL")
    public native NSURL standardizedURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)checkResourceIsReachableAndReturnError:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "checkResourceIsReachableAndReturnError:")
    public native boolean checkResourceIsReachableAndReturnError$(NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isFileReferenceURL NS_AVAILABLE(10_6, 4_0);", selector = "isFileReferenceURL")
    public native boolean isFileReferenceURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)fileReferenceURL NS_AVAILABLE(10_6, 4_0);", selector = "fileReferenceURL")
    public native NSURL fileReferenceURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)filePathURL NS_AVAILABLE(10_6, 4_0);", selector = "filePathURL")
    public native NSURL filePathURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)getResourceValue:(out id *)value forKey:(NSString *)key error:(out NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "getResourceValue:forKey:error:")
    public native boolean getResourceValue$forKey$error$(NSObject value, NSString key, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDictionary *)resourceValuesForKeys:(NSArray *)keys error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "resourceValuesForKeys:error:")
    public native NSDictionary resourceValuesForKeys$error$(NSArray keys, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)setResourceValue:(id)value forKey:(NSString *)key error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "setResourceValue:forKey:error:")
    public native boolean setResourceValue$forKey$error$(NSObject value, NSString key, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)setResourceValues:(NSDictionary *)keyedValues error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "setResourceValues:error:")
    public native boolean setResourceValues$error$(NSDictionary keyedValues, NSError[] error);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)removeCachedResourceValueForKey:(NSString *)key NS_AVAILABLE(10_9, 7_0);", selector = "removeCachedResourceValueForKey:")
    public native void removeCachedResourceValueForKey$(NSString key);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)removeAllCachedResourceValues NS_AVAILABLE(10_9, 7_0);", selector = "removeAllCachedResourceValues")
    public native void removeAllCachedResourceValues();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTemporaryResourceValue:(id)value forKey:(NSString *)key NS_AVAILABLE(10_9, 7_0);", selector = "setTemporaryResourceValue:forKey:")
    public native void setTemporaryResourceValue$forKey$(NSObject value, NSString key);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSData *)bookmarkDataWithOptions:(NSURLBookmarkCreationOptions)options includingResourceValuesForKeys:(NSArray *)keys relativeToURL:(NSURL *)relativeURL error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:")
    public native NSData bookmarkDataWithOptions$includingResourceValuesForKeys$relativeToURL$error$(NSURLBookmarkCreationOptions options, NSArray keys, NSURL relativeURL, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initByResolvingBookmarkData:(NSData *)bookmarkData options:(NSURLBookmarkResolutionOptions)options relativeToURL:(NSURL *)relativeURL bookmarkDataIsStale:(BOOL *)isStale error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public native NSURL initByResolvingBookmarkData$options$relativeToURL$bookmarkDataIsStale$error$(NSData bookmarkData, NSURLBookmarkResolutionOptions options, NSURL relativeURL, boolean[] isStale, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)fileURLWithPath:(NSString *)path isDirectory:(BOOL) isDir NS_AVAILABLE(10_5, 2_0);", selector = "fileURLWithPath:isDirectory:")
    public static native NSObject fileURLWithPath$isDirectory$(NSString path, boolean isDir);

    @ObjCMethodSign(sign = "+ (id)fileURLWithPath:(NSString *)path;", selector = "fileURLWithPath:")
    public static native NSObject fileURLWithPath$(NSString path);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)fileURLWithFileSystemRepresentation:(const char *)path isDirectory:(BOOL) isDir relativeToURL:(NSURL *)baseURL NS_AVAILABLE(10_9, 7_0);", selector = "fileURLWithFileSystemRepresentation:isDirectory:relativeToURL:")
    public static native NSObject fileURLWithFileSystemRepresentation$isDirectory$relativeToURL$(byte[] path, boolean isDir, NSURL baseURL);

    @ObjCMethodSign(sign = "+ (id)URLWithString:(NSString *)URLString;", selector = "URLWithString:")
    public static native NSObject URLWithString$(NSString URLString);

    @ObjCMethodSign(sign = "+ (id)URLWithString:(NSString *)URLString relativeToURL:(NSURL *)baseURL;", selector = "URLWithString:relativeToURL:")
    public static native NSObject URLWithString$relativeToURL$(NSString URLString, NSURL baseURL);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)URLByResolvingBookmarkData:(NSData *)bookmarkData options:(NSURLBookmarkResolutionOptions)options relativeToURL:(NSURL *)relativeURL bookmarkDataIsStale:(BOOL *)isStale error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:")
    public static native NSObject URLByResolvingBookmarkData$options$relativeToURL$bookmarkDataIsStale$error$(NSData bookmarkData, NSURLBookmarkResolutionOptions options, NSURL relativeURL, boolean[] isStale, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSDictionary *)resourceValuesForKeys:(NSArray *)keys fromBookmarkData:(NSData *)bookmarkData NS_AVAILABLE(10_6, 4_0);", selector = "resourceValuesForKeys:fromBookmarkData:")
    public static native NSDictionary resourceValuesForKeys$fromBookmarkData$(NSArray keys, NSData bookmarkData);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)writeBookmarkData:(NSData *)bookmarkData toURL:(NSURL *)bookmarkFileURL options:(NSURLBookmarkFileCreationOptions)options error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "writeBookmarkData:toURL:options:error:")
    public static native boolean writeBookmarkData$toURL$options$error$(NSData bookmarkData, NSURL bookmarkFileURL, @NSUInteger long options, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSData *)bookmarkDataWithContentsOfURL:(NSURL *)bookmarkFileURL error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "bookmarkDataWithContentsOfURL:error:")
    public static native NSData bookmarkDataWithContentsOfURL$error$(NSURL bookmarkFileURL, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSArray *)pathComponents NS_AVAILABLE(10_6, 4_0);", selector = "pathComponents")
    public native NSArray pathComponents();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSString *)lastPathComponent NS_AVAILABLE(10_6, 4_0);", selector = "lastPathComponent")
    public native NSString lastPathComponent();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSString *)pathExtension NS_AVAILABLE(10_6, 4_0);", selector = "pathExtension")
    public native NSString pathExtension();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSURL *)URLByAppendingPathComponent:(NSString *)pathComponent NS_AVAILABLE(10_6, 4_0);", selector = "URLByAppendingPathComponent:")
    public native NSURL URLByAppendingPathComponent$(NSString pathComponent);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSURL *)URLByAppendingPathComponent:(NSString *)pathComponent isDirectory:(BOOL)isDirectory NS_AVAILABLE(10_7, 5_0);", selector = "URLByAppendingPathComponent:isDirectory:")
    public native NSURL URLByAppendingPathComponent$isDirectory$(NSString pathComponent, boolean isDirectory);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSURL *)URLByDeletingLastPathComponent NS_AVAILABLE(10_6, 4_0);", selector = "URLByDeletingLastPathComponent")
    public native NSURL URLByDeletingLastPathComponent();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSURL *)URLByAppendingPathExtension:(NSString *)pathExtension NS_AVAILABLE(10_6, 4_0);", selector = "URLByAppendingPathExtension:")
    public native NSURL URLByAppendingPathExtension$(NSString pathExtension);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSURL *)URLByDeletingPathExtension NS_AVAILABLE(10_6, 4_0);", selector = "URLByDeletingPathExtension")
    public native NSURL URLByDeletingPathExtension();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSURL *)URLByStandardizingPath NS_AVAILABLE(10_6, 4_0);", selector = "URLByStandardizingPath")
    public native NSURL URLByStandardizingPath();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "- (NSURL *)URLByResolvingSymlinksInPath NS_AVAILABLE(10_6, 4_0) ;", selector = "URLByResolvingSymlinksInPath")
    public native NSURL URLByResolvingSymlinksInPath();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLPathUtilities", catownername = "NSURL")
    @ObjCMethodSign(sign = "+ (NSURL *)fileURLWithPathComponents:(NSArray *)components NS_AVAILABLE(10_6, 4_0);", selector = "fileURLWithPathComponents:")
    public static native NSURL fileURLWithPathComponents$(NSArray components);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSURL initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
