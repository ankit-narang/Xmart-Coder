package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDirectoryEnumerator extends NSEnumerator  {
    
    public NSDirectoryEnumerator() {}
    
    
    @ObjCMethodSign(sign = "- (NSDictionary *)fileAttributes;", selector = "fileAttributes")
    public native NSDictionary fileAttributes();

    @ObjCMethodSign(sign = "- (NSDictionary *)directoryAttributes;", selector = "directoryAttributes")
    public native NSDictionary directoryAttributes();

    @ObjCMethodSign(sign = "- (void)skipDescendents;", selector = "skipDescendents")
    public native void skipDescendents();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)level NS_AVAILABLE(10_6, 4_0);", selector = "level")
    public native @NSUInteger long level();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)skipDescendants NS_AVAILABLE(10_6, 4_0);", selector = "skipDescendants")
    public native void skipDescendants();
}
