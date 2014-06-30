package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSFileManagerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldCopyItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath;", selector = "fileManager:shouldCopyItemAtPath:toPath:")
    boolean fileManager$shouldCopyItemAtPath$toPath$(NSFileManager fileManager, NSString srcPath, NSString dstPath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldCopyItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldCopyItemAtURL:toURL:")
    boolean fileManager$shouldCopyItemAtURL$toURL$(NSFileManager fileManager, NSURL srcURL, NSURL dstURL);

    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error copyingItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath;", selector = "fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:")
    boolean fileManager$shouldProceedAfterError$copyingItemAtPath$toPath$(NSFileManager fileManager, NSError error, NSString srcPath, NSString dstPath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error copyingItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:")
    boolean fileManager$shouldProceedAfterError$copyingItemAtURL$toURL$(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);

    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldMoveItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath;", selector = "fileManager:shouldMoveItemAtPath:toPath:")
    boolean fileManager$shouldMoveItemAtPath$toPath$(NSFileManager fileManager, NSString srcPath, NSString dstPath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldMoveItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldMoveItemAtURL:toURL:")
    boolean fileManager$shouldMoveItemAtURL$toURL$(NSFileManager fileManager, NSURL srcURL, NSURL dstURL);

    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error movingItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath;", selector = "fileManager:shouldProceedAfterError:movingItemAtPath:toPath:")
    boolean fileManager$shouldProceedAfterError$movingItemAtPath$toPath$(NSFileManager fileManager, NSError error, NSString srcPath, NSString dstPath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error movingItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldProceedAfterError:movingItemAtURL:toURL:")
    boolean fileManager$shouldProceedAfterError$movingItemAtURL$toURL$(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);

    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldLinkItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath;", selector = "fileManager:shouldLinkItemAtPath:toPath:")
    boolean fileManager$shouldLinkItemAtPath$toPath$(NSFileManager fileManager, NSString srcPath, NSString dstPath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldLinkItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldLinkItemAtURL:toURL:")
    boolean fileManager$shouldLinkItemAtURL$toURL$(NSFileManager fileManager, NSURL srcURL, NSURL dstURL);

    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error linkingItemAtPath:(NSString *)srcPath toPath:(NSString *)dstPath;", selector = "fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:")
    boolean fileManager$shouldProceedAfterError$linkingItemAtPath$toPath$(NSFileManager fileManager, NSError error, NSString srcPath, NSString dstPath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error linkingItemAtURL:(NSURL *)srcURL toURL:(NSURL *)dstURL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:")
    boolean fileManager$shouldProceedAfterError$linkingItemAtURL$toURL$(NSFileManager fileManager, NSError error, NSURL srcURL, NSURL dstURL);

    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldRemoveItemAtPath:(NSString *)path;", selector = "fileManager:shouldRemoveItemAtPath:")
    boolean fileManager$shouldRemoveItemAtPath$(NSFileManager fileManager, NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldRemoveItemAtURL:(NSURL *)URL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldRemoveItemAtURL:")
    boolean fileManager$shouldRemoveItemAtURL$(NSFileManager fileManager, NSURL URL);

    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error removingItemAtPath:(NSString *)path;", selector = "fileManager:shouldProceedAfterError:removingItemAtPath:")
    boolean fileManager$shouldProceedAfterError$removingItemAtPath$(NSFileManager fileManager, NSError error, NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fileManager shouldProceedAfterError:(NSError *)error removingItemAtURL:(NSURL *)URL NS_AVAILABLE(10_6, 4_0);", selector = "fileManager:shouldProceedAfterError:removingItemAtURL:")
    boolean fileManager$shouldProceedAfterError$removingItemAtURL$(NSFileManager fileManager, NSError error, NSURL URL);
}
