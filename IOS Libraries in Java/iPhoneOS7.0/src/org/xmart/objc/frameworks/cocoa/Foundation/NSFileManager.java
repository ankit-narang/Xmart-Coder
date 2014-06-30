package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSFileManager extends NSObject  {
    
    public NSFileManager() {}
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)mountedVolumeURLsIncludingResourceValuesForKeys:(NSArray *)propertyKeys options:(NSVolumeEnumerationOptions)options NS_AVAILABLE(10_6, 4_0);", selector = "mountedVolumeURLsIncludingResourceValuesForKeys:options:")
    public native NSArray mountedVolumeURLsIncludingResourceValuesForKeys$options$(NSArray propertyKeys, NSVolumeEnumerationOptions options);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)contentsOfDirectoryAtURL:(NSURL *)url includingPropertiesForKeys:(NSArray *)keys options:(NSDirectoryEnumerationOptions)mask error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:")
    public native NSArray contentsOfDirectoryAtURL$includingPropertiesForKeys$options$error$(NSURL url, NSArray keys, NSDirectoryEnumerationOptions mask, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)URLsForDirectory:(NSSearchPathDirectory)directory inDomains:(NSSearchPathDomainMask)domainMask NS_AVAILABLE(10_6, 4_0);", selector = "URLsForDirectory:inDomains:")
    public native NSArray URLsForDirectory$inDomains$(NSSearchPathDirectory directory, NSSearchPathDomainMask domainMask);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForDirectory:(NSSearchPathDirectory)directory inDomain:(NSSearchPathDomainMask)domain appropriateForURL:(NSURL *)url create:(BOOL)shouldCreate error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "URLForDirectory:inDomain:appropriateForURL:create:error:")
    public native NSURL URLForDirectory$inDomain$appropriateForURL$create$error$(NSSearchPathDirectory directory, NSSearchPathDomainMask domain, NSURL url, boolean shouldCreate, NSError[] error);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)createDirectoryAtURL:(NSURL *)url withIntermediateDirectories:(BOOL)createIntermediates attributes:(NSDictionary *)attributes error:(NSError **)error NS_AVAILABLE(10_7, 5_0);", selector = "createDirectoryAtURL:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtURL$withIntermediateDirectories$attributes$error$(NSURL url, boolean createIntermediates, NSDictionary attributes, NSError[] error);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)createSymbolicLinkAtURL:(NSURL *)url withDestinationURL:(NSURL *)destURL error:(NSError **)error NS_AVAILABLE(10_7, 5_0);", selector = "createSymbolicLinkAtURL:withDestinationURL:error:")
    public native boolean createSymbolicLinkAtURL$withDestinationURL$error$(NSURL url, NSURL destURL, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setDelegate:(id)delegate NS_AVAILABLE(10_5, 2_0);", selector = "setDelegate:")
    public native void setDelegate(NSObject delegate);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)delegate NS_AVAILABLE(10_5, 2_0);", selector = "delegate")
    public native NSObject delegate();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)setAttributes:(NSDictionary *)attributes ofItemAtPath:(NSString *)path error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "setAttributes:ofItemAtPath:error:")
    public native boolean setAttributes$ofItemAtPath$error$(NSDictionary attributes, NSString path, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)createDirectoryAtPath:(NSString *)path withIntermediateDirectories:(BOOL)createIntermediates attributes:(NSDictionary *)attributes error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "createDirectoryAtPath:withIntermediateDirectories:attributes:error:")
    public native boolean createDirectoryAtPath$withIntermediateDirectories$attributes$error$(NSString path, boolean createIntermediates, NSDictionary attributes, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)contentsOfDirectoryAtPath:(NSString *)path error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "contentsOfDirectoryAtPath:error:")
    public native NSArray contentsOfDirectoryAtPath$error$(NSString path, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)subpathsOfDirectoryAtPath:(NSString *)path error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "subpathsOfDirectoryAtPath:error:")
    public native NSArray subpathsOfDirectoryAtPath$error$(NSString path, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDictionary *)attributesOfItemAtPath:(NSString *)path error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "attributesOfItemAtPath:error:")
    public native NSDictionary attributesOfItemAtPath$error$(NSString path, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDictionary *)attributesOfFileSystemForPath:(NSString *)path error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "attributesOfFileSystemForPath:error:")
    public native NSDictionary attributesOfFileSystemForPath$error$(NSString path, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)createSymbolicLinkAtPath:(NSString *)path withDestinationPath:(NSString *)destPath error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "createSymbolicLinkAtPath:withDestinationPath:error:")
    public native boolean createSymbolicLinkAtPath$withDestinationPath$error$(NSString path, NSString destPath, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)destinationOfSymbolicLinkAtPath:(NSString *)path error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "destinationOfSymbolicLinkAtPath:error:")
    public native NSString destinationOfSymbolicLinkAtPath$error$(NSString path, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)copyItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "copyItemAtPath:toPath:error:")
    public native boolean copyItemAtPath$toPath$error$(NSString srcPath, NSString dstPath, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)moveItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "moveItemAtPath:toPath:error:")
    public native boolean moveItemAtPath$toPath$error$(NSString srcPath, NSString dstPath, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)linkItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "linkItemAtPath:toPath:error:")
    public native boolean linkItemAtPath$toPath$error$(NSString srcPath, NSString dstPath, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)removeItemAtPath:(NSString *)path error:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "removeItemAtPath:error:")
    public native boolean removeItemAtPath$error$(NSString path, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)copyItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "copyItemAtURL:toURL:error:")
    public native boolean copyItemAtURL$toURL$error$(NSURL srcURL, NSURL dstURL, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)moveItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "moveItemAtURL:toURL:error:")
    public native boolean moveItemAtURL$toURL$error$(NSURL srcURL, NSURL dstURL, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)linkItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "linkItemAtURL:toURL:error:")
    public native boolean linkItemAtURL$toURL$error$(NSURL srcURL, NSURL dstURL, NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)removeItemAtURL:(NSURL *)URL error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "removeItemAtURL:error:")
    public native boolean removeItemAtURL$error$(NSURL URL, NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (NSDictionary *)fileAttributesAtPath:(NSString *)path traverseLink:(BOOL)yorn NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "fileAttributesAtPath:traverseLink:")
    public native NSDictionary fileAttributesAtPath$traverseLink$(NSString path, boolean yorn);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (BOOL)changeFileAttributes:(NSDictionary *)attributes atPath:(NSString *)path NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "changeFileAttributes:atPath:")
    public native boolean changeFileAttributes$atPath$(NSDictionary attributes, NSString path);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (NSArray *)directoryContentsAtPath:(NSString *)path NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "directoryContentsAtPath:")
    public native NSArray directoryContentsAtPath$(NSString path);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (NSDictionary *)fileSystemAttributesAtPath:(NSString *)path NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "fileSystemAttributesAtPath:")
    public native NSDictionary fileSystemAttributesAtPath$(NSString path);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (NSString *)pathContentOfSymbolicLinkAtPath:(NSString *)path NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "pathContentOfSymbolicLinkAtPath:")
    public native NSString pathContentOfSymbolicLinkAtPath$(NSString path);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (BOOL)createSymbolicLinkAtPath:(NSString *)path pathContent:(NSString *)otherpath NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "createSymbolicLinkAtPath:pathContent:")
    public native boolean createSymbolicLinkAtPath$pathContent$(NSString path, NSString otherpath);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (BOOL)createDirectoryAtPath:(NSString *)path attributes:(NSDictionary *)attributes NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "createDirectoryAtPath:attributes:")
    public native boolean createDirectoryAtPath$attributes$(NSString path, NSDictionary attributes);

    @ObjCMethodSign(sign = "- (NSString *)currentDirectoryPath;", selector = "currentDirectoryPath")
    public native NSString currentDirectoryPath();

    @ObjCMethodSign(sign = "- (BOOL)changeCurrentDirectoryPath:(NSString *)path;", selector = "changeCurrentDirectoryPath:")
    public native boolean changeCurrentDirectoryPath$(NSString path);

    @ObjCMethodSign(sign = "- (BOOL)fileExistsAtPath:(NSString *)path;", selector = "fileExistsAtPath:")
    public native boolean fileExistsAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (BOOL)fileExistsAtPath:(NSString *)path isDirectory:(BOOL *)isDirectory;", selector = "fileExistsAtPath:isDirectory:")
    public native boolean fileExistsAtPath$isDirectory$(NSString path, boolean[] isDirectory);

    @ObjCMethodSign(sign = "- (BOOL)isReadableFileAtPath:(NSString *)path;", selector = "isReadableFileAtPath:")
    public native boolean isReadableFileAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (BOOL)isWritableFileAtPath:(NSString *)path;", selector = "isWritableFileAtPath:")
    public native boolean isWritableFileAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (BOOL)isExecutableFileAtPath:(NSString *)path;", selector = "isExecutableFileAtPath:")
    public native boolean isExecutableFileAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (BOOL)isDeletableFileAtPath:(NSString *)path;", selector = "isDeletableFileAtPath:")
    public native boolean isDeletableFileAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (BOOL)contentsEqualAtPath:(NSString *)path1 andPath:(NSString *)path2;", selector = "contentsEqualAtPath:andPath:")
    public native boolean contentsEqualAtPath$andPath$(NSString path1, NSString path2);

    @ObjCMethodSign(sign = "- (NSString *)displayNameAtPath:(NSString *)path;", selector = "displayNameAtPath:")
    public native NSString displayNameAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (NSArray *)componentsToDisplayForPath:(NSString *)path;", selector = "componentsToDisplayForPath:")
    public native NSArray componentsToDisplayForPath$(NSString path);

    @ObjCMethodSign(sign = "- (NSDirectoryEnumerator *)enumeratorAtPath:(NSString *)path;", selector = "enumeratorAtPath:")
    public native NSDirectoryEnumerator enumeratorAtPath$(NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDirectoryEnumerator *)enumeratorAtURL:(NSURL *)url includingPropertiesForKeys:(NSArray *)keys options:(NSDirectoryEnumerationOptions)mask errorHandler:(BOOL (^)(NSURL *url, NSError *error))handler NS_AVAILABLE(10_6, 4_0);", selector = "enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:")
    public native NSDirectoryEnumerator enumeratorAtURL$includingPropertiesForKeys$options$errorHandler$(NSURL url, NSArray keys, NSDirectoryEnumerationOptions mask, ObjCBlock handler);

    @ObjCMethodSign(sign = "- (NSArray *)subpathsAtPath:(NSString *)path;", selector = "subpathsAtPath:")
    public native NSArray subpathsAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (NSData *)contentsAtPath:(NSString *)path;", selector = "contentsAtPath:")
    public native NSData contentsAtPath$(NSString path);

    @ObjCMethodSign(sign = "- (BOOL)createFileAtPath:(NSString *)path contents:(NSData *)data attributes:(NSDictionary *)attr;", selector = "createFileAtPath:contents:attributes:")
    public native boolean createFileAtPath$contents$attributes$(NSString path, NSData data, NSDictionary attr);

    @ObjCMethodSign(sign = "- (__strong const char *)fileSystemRepresentationWithPath:(NSString *)path NS_RETURNS_INNER_POINTER;", selector = "fileSystemRepresentationWithPath:")
    public native byte[] fileSystemRepresentationWithPath$(NSString path);

    @ObjCMethodSign(sign = "- (NSString *)stringWithFileSystemRepresentation:(const char *)str length:(NSUInteger)len;", selector = "stringWithFileSystemRepresentation:length:")
    public native NSString stringWithFileSystemRepresentation$length$(byte[] str, @NSUInteger long len);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)replaceItemAtURL:(NSURL *)originalItemURL withItemAtURL:(NSURL *)newItemURL backupItemName:(NSString *)backupItemName options:(NSFileManagerItemReplacementOptions)options resultingItemURL:(NSURL **)resultingURL error:(NSError **)error NS_AVAILABLE(10_6, 4_0);", selector = "replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:")
    public native boolean replaceItemAtURL$withItemAtURL$backupItemName$options$resultingItemURL$error$(NSURL originalItemURL, NSURL newItemURL, NSString backupItemName, NSFileManagerItemReplacementOptions options, NSURL[] resultingURL, NSError[] error);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)setUbiquitous:(BOOL)flag itemAtURL:(NSURL *)url destinationURL:(NSURL *)destinationURL error:(NSError **)error NS_AVAILABLE(10_7, 5_0);", selector = "setUbiquitous:itemAtURL:destinationURL:error:")
    public native boolean setUbiquitous$itemAtURL$destinationURL$error$(boolean flag, NSURL url, NSURL destinationURL, NSError[] error);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isUbiquitousItemAtURL:(NSURL *)url NS_AVAILABLE(10_7, 5_0);", selector = "isUbiquitousItemAtURL:")
    public native boolean isUbiquitousItemAtURL$(NSURL url);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)startDownloadingUbiquitousItemAtURL:(NSURL *)url error:(NSError **)error NS_AVAILABLE(10_7, 5_0);", selector = "startDownloadingUbiquitousItemAtURL:error:")
    public native boolean startDownloadingUbiquitousItemAtURL$error$(NSURL url, NSError[] error);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)evictUbiquitousItemAtURL:(NSURL *)url error:(NSError **)error NS_AVAILABLE(10_7, 5_0);", selector = "evictUbiquitousItemAtURL:error:")
    public native boolean evictUbiquitousItemAtURL$error$(NSURL url, NSError[] error);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForUbiquityContainerIdentifier:(NSString *)containerIdentifier NS_AVAILABLE(10_7, 5_0);", selector = "URLForUbiquityContainerIdentifier:")
    public native NSURL URLForUbiquityContainerIdentifier$(NSString containerIdentifier);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForPublishingUbiquitousItemAtURL:(NSURL *)url expirationDate:(NSDate **)outDate error:(NSError **)error NS_AVAILABLE(10_7, 5_0);", selector = "URLForPublishingUbiquitousItemAtURL:expirationDate:error:")
    public native NSURL URLForPublishingUbiquitousItemAtURL$expirationDate$error$(NSURL url, NSDate[] outDate, NSError[] error);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)containerURLForSecurityApplicationGroupIdentifier:(NSString *)groupIdentifier NS_AVAILABLE(10_8, 7_0);", selector = "containerURLForSecurityApplicationGroupIdentifier:")
    public native NSURL containerURLForSecurityApplicationGroupIdentifier$(NSString groupIdentifier);

    @ObjCMethodSign(sign = "+ (NSFileManager *)defaultManager;", selector = "defaultManager")
    public static native NSFileManager defaultManager();
}
