package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSNotificationCenter extends NSObject  {
    
    public NSNotificationCenter() {}
    
    
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSNotificationCenter init();

    @ObjCMethodSign(sign = "- (void)addObserver:(id)observer selector:(SEL)aSelector name:(NSString *)aName object:(id)anObject;", selector = "addObserver:selector:name:object:")
    public native void addObserver$selector$name$object$(NSObject observer, ObjCSelector aSelector, NSString aName, NSObject anObject);

    @ObjCMethodSign(sign = "- (void)postNotification:(NSNotification *)notification;", selector = "postNotification:")
    public native void postNotification$(NSNotification notification);

    @ObjCMethodSign(sign = "- (void)postNotificationName:(NSString *)aName object:(id)anObject;", selector = "postNotificationName:object:")
    public native void postNotificationName$object$(NSString aName, NSObject anObject);

    @ObjCMethodSign(sign = "- (void)postNotificationName:(NSString *)aName object:(id)anObject userInfo:(NSDictionary *)aUserInfo;", selector = "postNotificationName:object:userInfo:")
    public native void postNotificationName$object$userInfo$(NSString aName, NSObject anObject, NSDictionary aUserInfo);

    @ObjCMethodSign(sign = "- (void)removeObserver:(id)observer;", selector = "removeObserver:")
    public native void removeObserver$(NSObject observer);

    @ObjCMethodSign(sign = "- (void)removeObserver:(id)observer name:(NSString *)aName object:(id)anObject;", selector = "removeObserver:name:object:")
    public native void removeObserver$name$object$(NSObject observer, NSString aName, NSObject anObject);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)addObserverForName:(NSString *)name object:(id)obj queue:(NSOperationQueue *)queue usingBlock:(void (^)(NSNotification *note))block NS_AVAILABLE(10_6, 4_0);", selector = "addObserverForName:object:queue:usingBlock:")
    public native NSObject addObserverForName$object$queue$usingBlock$(NSString name, NSObject obj, NSOperationQueue queue, ObjCBlock block);

    @ObjCMethodSign(sign = "+ (instancetype)defaultCenter;", selector = "defaultCenter")
    public static native NSNotificationCenter defaultCenter();
}
