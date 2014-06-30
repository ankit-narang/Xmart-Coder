package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSObjectProtocol 
    extends ObjCProtocol {

    
    
    @ObjCMethodSign(sign = "- (BOOL)isEqual:(id)object;", selector = "isEqual:")
    boolean isEqual$(NSObject object);

    @ObjCMethodSign(sign = "- (NSUInteger)hash;", selector = "hash")
    @NSUInteger long hash();

    @ObjCMethodSign(sign = "- (Class)superclass;", selector = "superclass")
    ObjCClass superclass();

    @ObjCMethodSign(sign = "- (Class)class;", selector = "class")
    ObjCClass classObjCClass();

    @ObjCMethodSign(sign = "- (id)self;", selector = "self")
    NSObject self();

    @ObjCMethodSign(sign = "- (struct _NSZone *)zone OBJC_ARC_UNAVAILABLE;", selector = "zone")
    NSZone zone();

    @ObjCMethodSign(sign = "- (id)performSelector:(SEL)aSelector;", selector = "performSelector:")
    NSObject performSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (id)performSelector:(SEL)aSelector withObject:(id)object;", selector = "performSelector:withObject:")
    NSObject performSelector$withObject$(ObjCSelector aSelector, NSObject object);

    @ObjCMethodSign(sign = "- (id)performSelector:(SEL)aSelector withObject:(id)object1 withObject:(id)object2;", selector = "performSelector:withObject:withObject:")
    NSObject performSelector$withObject$withObject$(ObjCSelector aSelector, NSObject object1, NSObject object2);

    @ObjCMethodSign(sign = "- (BOOL)isProxy;", selector = "isProxy")
    boolean isProxy();

    @ObjCMethodSign(sign = "- (BOOL)isKindOfClass:(Class)aClass;", selector = "isKindOfClass:")
    boolean isKindOfClass$(ObjCClass aClass);

    @ObjCMethodSign(sign = "- (BOOL)isMemberOfClass:(Class)aClass;", selector = "isMemberOfClass:")
    boolean isMemberOfClass$(ObjCClass aClass);

    @ObjCMethodSign(sign = "- (BOOL)conformsToProtocol:(Protocol *)aProtocol;", selector = "conformsToProtocol:")
    boolean conformsToProtocol$(ObjCProtocol aProtocol);

    @ObjCMethodSign(sign = "- (BOOL)respondsToSelector:(SEL)aSelector;", selector = "respondsToSelector:")
    boolean respondsToSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (id)retain OBJC_ARC_UNAVAILABLE;", selector = "retain")
    NSObject retain();

    @ObjCMethodSign(sign = "- (oneway void)release OBJC_ARC_UNAVAILABLE;", selector = "release")
    void release();

    @ObjCMethodSign(sign = "- (id)autorelease OBJC_ARC_UNAVAILABLE;", selector = "autorelease")
    NSObject autorelease();

    @ObjCMethodSign(sign = "- (NSUInteger)retainCount OBJC_ARC_UNAVAILABLE;", selector = "retainCount")
    @NSUInteger long retainCount();

    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    NSString description();

    @ObjCMethodSign(sign = "- (NSString *)debugDescription;", selector = "debugDescription")
    NSString debugDescription();
}
