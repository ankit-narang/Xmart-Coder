package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSProxy extends ObjCObject implements NSObjectProtocol {
    
    public NSProxy() {}
    
    
    @ObjCMethodSign(sign = "- (void)forwardInvocation:(NSInvocation *)invocation;", selector = "forwardInvocation:")
    public native void forwardInvocation$(NSInvocation invocation);

    @ObjCMethodSign(sign = "- (NSMethodSignature *)methodSignatureForSelector:(SEL)sel;", selector = "methodSignatureForSelector:")
    public native NSMethodSignature methodSignatureForSelector$(ObjCSelector sel);

    @ObjCMethodSign(sign = "- (void)dealloc;", selector = "dealloc")
    public native void dealloc();

    @ObjCMethodSign(sign = "- (void)finalize;", selector = "finalize")
    public native void finalize();

    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCMethodSign(sign = "- (NSString *)debugDescription;", selector = "debugDescription")
    public native NSString debugDescription();

    @ObjCMethodSign(sign = "- (BOOL)allowsWeakReference NS_UNAVAILABLE;", selector = "allowsWeakReference")
    public native boolean allowsWeakReference();

    @ObjCMethodSign(sign = "- (BOOL)retainWeakReference NS_UNAVAILABLE;", selector = "retainWeakReference")
    public native boolean retainWeakReference();

    @ObjCMethodSign(sign = "+ (id)alloc;", selector = "alloc")
    public static native NSObject alloc();

    @ObjCMethodSign(sign = "+ (id)allocWithZone:(NSZone *)zone NS_AUTOMATED_REFCOUNT_UNAVAILABLE;", selector = "allocWithZone:")
    public static native NSObject allocWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "+ (Class)class;", selector = "class")
    public static native ObjCClass classObjCClass__STATIC();

    @ObjCMethodSign(sign = "+ (BOOL)respondsToSelector:(SEL)aSelector;", selector = "respondsToSelector:")
    public static native boolean respondsToSelector$__STATIC(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (BOOL)isEqual:(id)object;", selector = "isEqual:")
    public native boolean isEqual$(NSObject object);

    @ObjCMethodSign(sign = "- (NSUInteger)hash;", selector = "hash")
    public native @NSUInteger long hash();

    @ObjCMethodSign(sign = "- (Class)superclass;", selector = "superclass")
    public native ObjCClass superclass();

    @ObjCMethodSign(sign = "- (Class)class;", selector = "class")
    public native ObjCClass classObjCClass();

    @ObjCMethodSign(sign = "- (id)self;", selector = "self")
    public native NSObject self();

    @ObjCMethodSign(sign = "- (struct _NSZone *)zone OBJC_ARC_UNAVAILABLE;", selector = "zone")
    public native NSZone zone();

    @ObjCMethodSign(sign = "- (id)performSelector:(SEL)aSelector;", selector = "performSelector:")
    public native NSObject performSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (id)performSelector:(SEL)aSelector withObject:(id)object;", selector = "performSelector:withObject:")
    public native NSObject performSelector$withObject$(ObjCSelector aSelector, NSObject object);

    @ObjCMethodSign(sign = "- (id)performSelector:(SEL)aSelector withObject:(id)object1 withObject:(id)object2;", selector = "performSelector:withObject:withObject:")
    public native NSObject performSelector$withObject$withObject$(ObjCSelector aSelector, NSObject object1, NSObject object2);

    @ObjCMethodSign(sign = "- (BOOL)isProxy;", selector = "isProxy")
    public native boolean isProxy();

    @ObjCMethodSign(sign = "- (BOOL)isKindOfClass:(Class)aClass;", selector = "isKindOfClass:")
    public native boolean isKindOfClass$(ObjCClass aClass);

    @ObjCMethodSign(sign = "- (BOOL)isMemberOfClass:(Class)aClass;", selector = "isMemberOfClass:")
    public native boolean isMemberOfClass$(ObjCClass aClass);

    @ObjCMethodSign(sign = "- (BOOL)conformsToProtocol:(Protocol *)aProtocol;", selector = "conformsToProtocol:")
    public native boolean conformsToProtocol$(ObjCProtocol aProtocol);

    @ObjCMethodSign(sign = "- (BOOL)respondsToSelector:(SEL)aSelector;", selector = "respondsToSelector:")
    public native boolean respondsToSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (id)retain OBJC_ARC_UNAVAILABLE;", selector = "retain")
    public native NSObject retain();

    @ObjCMethodSign(sign = "- (oneway void)release OBJC_ARC_UNAVAILABLE;", selector = "release")
    public native void release();

    @ObjCMethodSign(sign = "- (id)autorelease OBJC_ARC_UNAVAILABLE;", selector = "autorelease")
    public native NSObject autorelease();

    @ObjCMethodSign(sign = "- (NSUInteger)retainCount OBJC_ARC_UNAVAILABLE;", selector = "retainCount")
    public native @NSUInteger long retainCount();
}
