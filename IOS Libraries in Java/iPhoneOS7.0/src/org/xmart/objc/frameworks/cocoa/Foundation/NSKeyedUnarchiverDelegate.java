package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSKeyedUnarchiverDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (Class)unarchiver:(NSKeyedUnarchiver *)unarchiver cannotDecodeObjectOfClassName:(NSString *)name originalClasses:(NSArray *)classNames;", selector = "unarchiver:cannotDecodeObjectOfClassName:originalClasses:")
    ObjCClass unarchiver$cannotDecodeObjectOfClassName$originalClasses$(NSKeyedUnarchiver unarchiver, NSString name, NSArray classNames);

    @ObjCMethodSign(sign = "- (id)unarchiver:(NSKeyedUnarchiver *)unarchiver didDecodeObject:(id) NS_RELEASES_ARGUMENT object NS_RETURNS_RETAINED;", selector = "unarchiver:didDecodeObject:")
    NSObject unarchiver$didDecodeObject$(NSKeyedUnarchiver unarchiver, NSObject object);

    @ObjCMethodSign(sign = "- (void)unarchiver:(NSKeyedUnarchiver *)unarchiver willReplaceObject:(id)object withObject:(id)newObject;", selector = "unarchiver:willReplaceObject:withObject:")
    void unarchiver$willReplaceObject$withObject$(NSKeyedUnarchiver unarchiver, NSObject object, NSObject newObject);

    @ObjCMethodSign(sign = "- (void)unarchiverWillFinish:(NSKeyedUnarchiver *)unarchiver;", selector = "unarchiverWillFinish:")
    void unarchiverWillFinish$(NSKeyedUnarchiver unarchiver);

    @ObjCMethodSign(sign = "- (void)unarchiverDidFinish:(NSKeyedUnarchiver *)unarchiver;", selector = "unarchiverDidFinish:")
    void unarchiverDidFinish$(NSKeyedUnarchiver unarchiver);
}
