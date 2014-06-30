package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableCharacterSet extends NSCharacterSet implements NSCopying, NSMutableCopying {
    
    public NSMutableCharacterSet() {}
    
    
    @ObjCMethodSign(sign = "- (void)addCharactersInRange:(NSRange)aRange;", selector = "addCharactersInRange:")
    public native void addCharactersInRange$(@ObjCByValue NSRange aRange);

    @ObjCMethodSign(sign = "- (void)removeCharactersInRange:(NSRange)aRange;", selector = "removeCharactersInRange:")
    public native void removeCharactersInRange$(@ObjCByValue NSRange aRange);

    @ObjCMethodSign(sign = "- (void)addCharactersInString:(NSString *)aString;", selector = "addCharactersInString:")
    public native void addCharactersInString$(NSString aString);

    @ObjCMethodSign(sign = "- (void)removeCharactersInString:(NSString *)aString;", selector = "removeCharactersInString:")
    public native void removeCharactersInString$(NSString aString);

    @ObjCMethodSign(sign = "- (void)formUnionWithCharacterSet:(NSCharacterSet *)otherSet;", selector = "formUnionWithCharacterSet:")
    public native void formUnionWithCharacterSet$(NSCharacterSet otherSet);

    @ObjCMethodSign(sign = "- (void)formIntersectionWithCharacterSet:(NSCharacterSet *)otherSet;", selector = "formIntersectionWithCharacterSet:")
    public native void formIntersectionWithCharacterSet$(NSCharacterSet otherSet);

    @ObjCMethodSign(sign = "- (void)invert;", selector = "invert")
    public native void invert();
}
