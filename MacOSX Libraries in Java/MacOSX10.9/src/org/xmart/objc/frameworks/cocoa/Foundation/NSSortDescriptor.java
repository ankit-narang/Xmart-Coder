package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSSortDescriptor extends NSObject implements NSSecureCoding, NSCopying {
    
    public NSSortDescriptor() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithKey:(NSString *)key ascending:(BOOL)ascending;", selector = "initWithKey:ascending:")
    public native NSSortDescriptor initWithKey$ascending$(NSString key, boolean ascending);

    @ObjCMethodSign(sign = "- (id)initWithKey:(NSString *)key ascending:(BOOL)ascending selector:(SEL)selector;", selector = "initWithKey:ascending:selector:")
    public native NSSortDescriptor initWithKey$ascending$selector$(NSString key, boolean ascending, ObjCSelector selector);

    @ObjCMethodSign(sign = "- (NSString *)key;", selector = "key")
    public native NSString key();

    @ObjCMethodSign(sign = "- (BOOL)ascending;", selector = "ascending")
    public native boolean ascending();

    @ObjCMethodSign(sign = "- (SEL)selector;", selector = "selector")
    public native ObjCSelector selector();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)allowEvaluation NS_AVAILABLE(10_9, 7_0);", selector = "allowEvaluation")
    public native void allowEvaluation();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithKey:(NSString *)key ascending:(BOOL)ascending comparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "initWithKey:ascending:comparator:")
    public native NSSortDescriptor initWithKey$ascending$comparator$(NSString key, boolean ascending, ObjCFunctionPtr cmptr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSComparator)comparator NS_AVAILABLE(10_6, 4_0);", selector = "comparator")
    public native ObjCFunctionPtr comparator();

    @ObjCMethodSign(sign = "- (NSComparisonResult)compareObject:(id)object1 toObject:(id)object2;", selector = "compareObject:toObject:")
    public native NSComparisonResult compareObject$toObject$(NSObject object1, NSObject object2);

    @ObjCMethodSign(sign = "- (id)reversedSortDescriptor;", selector = "reversedSortDescriptor")
    public native NSObject reversedSortDescriptor();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)sortDescriptorWithKey:(NSString *)key ascending:(BOOL)ascending NS_AVAILABLE(10_6, 4_0);", selector = "sortDescriptorWithKey:ascending:")
    public static native NSObject sortDescriptorWithKey$ascending$(NSString key, boolean ascending);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)sortDescriptorWithKey:(NSString *)key ascending:(BOOL)ascending selector:(SEL)selector NS_AVAILABLE(10_6, 4_0);", selector = "sortDescriptorWithKey:ascending:selector:")
    public static native NSObject sortDescriptorWithKey$ascending$selector$(NSString key, boolean ascending, ObjCSelector selector);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)sortDescriptorWithKey:(NSString *)key ascending:(BOOL)ascending comparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "sortDescriptorWithKey:ascending:comparator:")
    public static native NSObject sortDescriptorWithKey$ascending$comparator$(NSString key, boolean ascending, ObjCFunctionPtr cmptr);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSSortDescriptor initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
