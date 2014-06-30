package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSFileWrapper extends NSObject implements NSCoding {
    
    public NSFileWrapper() {}
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithURL:(NSURL *)url options:(NSFileWrapperReadingOptions)options error:(NSError **)outError NS_AVAILABLE(10_6, 4_0);", selector = "initWithURL:options:error:")
    public native NSFileWrapper initWithURL$options$error$(NSURL url, NSFileWrapperReadingOptions options, NSError[] outError);

    @ObjCMethodSign(sign = "- (id)initDirectoryWithFileWrappers:(NSDictionary *)childrenByPreferredName;", selector = "initDirectoryWithFileWrappers:")
    public native NSFileWrapper initDirectoryWithFileWrappers$(NSDictionary childrenByPreferredName);

    @ObjCMethodSign(sign = "- (id)initRegularFileWithContents:(NSData *)contents;", selector = "initRegularFileWithContents:")
    public native NSFileWrapper initRegularFileWithContents$(NSData contents);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initSymbolicLinkWithDestinationURL:(NSURL *)url NS_AVAILABLE(10_6, 4_0);", selector = "initSymbolicLinkWithDestinationURL:")
    public native NSFileWrapper initSymbolicLinkWithDestinationURL$(NSURL url);

    @ObjCMethodSign(sign = "- (id)initWithSerializedRepresentation:(NSData *)serializeRepresentation;", selector = "initWithSerializedRepresentation:")
    public native NSFileWrapper initWithSerializedRepresentation$(NSData serializeRepresentation);

    @ObjCMethodSign(sign = "- (BOOL)isDirectory;", selector = "isDirectory")
    public native boolean isDirectory();

    @ObjCMethodSign(sign = "- (BOOL)isRegularFile;", selector = "isRegularFile")
    public native boolean isRegularFile();

    @ObjCMethodSign(sign = "- (BOOL)isSymbolicLink;", selector = "isSymbolicLink")
    public native boolean isSymbolicLink();

    @ObjCMethodSign(sign = "- (void)setPreferredFilename:(NSString *)fileName;", selector = "setPreferredFilename:")
    public native void setPreferredFilename(NSString fileName);

    @ObjCMethodSign(sign = "- (NSString *)preferredFilename;", selector = "preferredFilename")
    public native NSString preferredFilename();

    @ObjCMethodSign(sign = "- (void)setFilename:(NSString *)fileName;", selector = "setFilename:")
    public native void setFilename(NSString fileName);

    @ObjCMethodSign(sign = "- (NSString *)filename;", selector = "filename")
    public native NSString filename();

    @ObjCMethodSign(sign = "- (void)setFileAttributes:(NSDictionary *)fileAttributes;", selector = "setFileAttributes:")
    public native void setFileAttributes(NSDictionary fileAttributes);

    @ObjCMethodSign(sign = "- (NSDictionary *)fileAttributes;", selector = "fileAttributes")
    public native NSDictionary fileAttributes();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)matchesContentsOfURL:(NSURL *)url NS_AVAILABLE(10_6, 4_0);", selector = "matchesContentsOfURL:")
    public native boolean matchesContentsOfURL$(NSURL url);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)readFromURL:(NSURL *)url options:(NSFileWrapperReadingOptions)options error:(NSError **)outError NS_AVAILABLE(10_6, 4_0);", selector = "readFromURL:options:error:")
    public native boolean readFromURL$options$error$(NSURL url, NSFileWrapperReadingOptions options, NSError[] outError);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)writeToURL:(NSURL *)url options:(NSFileWrapperWritingOptions)options originalContentsURL:(NSURL *)originalContentsURL error:(NSError **)outError NS_AVAILABLE(10_6, 4_0);", selector = "writeToURL:options:originalContentsURL:error:")
    public native boolean writeToURL$options$originalContentsURL$error$(NSURL url, NSFileWrapperWritingOptions options, NSURL originalContentsURL, NSError[] outError);

    @ObjCMethodSign(sign = "- (NSData *)serializedRepresentation;", selector = "serializedRepresentation")
    public native NSData serializedRepresentation();

    @ObjCMethodSign(sign = "- (NSString *)addFileWrapper:(NSFileWrapper *)child;", selector = "addFileWrapper:")
    public native NSString addFileWrapper$(NSFileWrapper child);

    @ObjCMethodSign(sign = "- (NSString *)addRegularFileWithContents:(NSData *)data preferredFilename:(NSString *)fileName;", selector = "addRegularFileWithContents:preferredFilename:")
    public native NSString addRegularFileWithContents$preferredFilename$(NSData data, NSString fileName);

    @ObjCMethodSign(sign = "- (void)removeFileWrapper:(NSFileWrapper *)child;", selector = "removeFileWrapper:")
    public native void removeFileWrapper$(NSFileWrapper child);

    @ObjCMethodSign(sign = "- (NSDictionary *)fileWrappers;", selector = "fileWrappers")
    public native NSDictionary fileWrappers();

    @ObjCMethodSign(sign = "- (NSString *)keyForFileWrapper:(NSFileWrapper *)child;", selector = "keyForFileWrapper:")
    public native NSString keyForFileWrapper$(NSFileWrapper child);

    @ObjCMethodSign(sign = "- (NSData *)regularFileContents;", selector = "regularFileContents")
    public native NSData regularFileContents();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)symbolicLinkDestinationURL NS_AVAILABLE(10_6, 4_0);", selector = "symbolicLinkDestinationURL")
    public native NSURL symbolicLinkDestinationURL();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSFileWrapper initWithCoder$(NSCoder aDecoder);
}
