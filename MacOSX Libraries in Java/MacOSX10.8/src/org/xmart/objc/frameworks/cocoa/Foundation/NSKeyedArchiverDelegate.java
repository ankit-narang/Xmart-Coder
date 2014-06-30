package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSKeyedArchiverDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (id)archiver:(NSKeyedArchiver *)archiver willEncodeObject:(id)object;", selector = "archiver:willEncodeObject:")
    NSObject archiver$willEncodeObject$(NSKeyedArchiver archiver, NSObject object);

    @ObjCMethodSign(sign = "- (void)archiver:(NSKeyedArchiver *)archiver didEncodeObject:(id)object;", selector = "archiver:didEncodeObject:")
    void archiver$didEncodeObject$(NSKeyedArchiver archiver, NSObject object);

    @ObjCMethodSign(sign = "- (void)archiver:(NSKeyedArchiver *)archiver willReplaceObject:(id)object withObject:(id)newObject;", selector = "archiver:willReplaceObject:withObject:")
    void archiver$willReplaceObject$withObject$(NSKeyedArchiver archiver, NSObject object, NSObject newObject);

    @ObjCMethodSign(sign = "- (void)archiverWillFinish:(NSKeyedArchiver *)archiver;", selector = "archiverWillFinish:")
    void archiverWillFinish$(NSKeyedArchiver archiver);

    @ObjCMethodSign(sign = "- (void)archiverDidFinish:(NSKeyedArchiver *)archiver;", selector = "archiverDidFinish:")
    void archiverDidFinish$(NSKeyedArchiver archiver);
}
