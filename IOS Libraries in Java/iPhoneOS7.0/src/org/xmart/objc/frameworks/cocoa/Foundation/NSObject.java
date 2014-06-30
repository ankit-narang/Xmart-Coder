package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSObject extends ObjCObject implements NSObjectProtocol {
    
    public NSObject() {}
    
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSObject init();

    @ObjCMethodSign(sign = "- (void)dealloc;", selector = "dealloc")
    public native void dealloc();

    @ObjCMethodSign(sign = "- (void)finalize;", selector = "finalize")
    public native void finalize();

    @ObjCMethodSign(sign = "- (id)copy;", selector = "copy")
    public native NSObject copy();

    @ObjCMethodSign(sign = "- (id)mutableCopy;", selector = "mutableCopy")
    public native NSObject mutableCopy();

    @ObjCMethodSign(sign = "- (IMP)methodForSelector:(SEL)aSelector;", selector = "methodForSelector:")
    public native ObjCFunctionPtr methodForSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (void)doesNotRecognizeSelector:(SEL)aSelector;", selector = "doesNotRecognizeSelector:")
    public native void doesNotRecognizeSelector$(ObjCSelector aSelector);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)forwardingTargetForSelector:(SEL)aSelector __OSX_AVAILABLE_STARTING(__MAC_10_5, __IPHONE_2_0);", selector = "forwardingTargetForSelector:")
    public native NSObject forwardingTargetForSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (void)forwardInvocation:(NSInvocation *)anInvocation;", selector = "forwardInvocation:")
    public native void forwardInvocation$(NSInvocation anInvocation);

    @ObjCMethodSign(sign = "- (NSMethodSignature *)methodSignatureForSelector:(SEL)aSelector;", selector = "methodSignatureForSelector:")
    public native NSMethodSignature methodSignatureForSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "- (BOOL)allowsWeakReference UNAVAILABLE_ATTRIBUTE;", selector = "allowsWeakReference")
    public native boolean allowsWeakReference();

    @ObjCMethodSign(sign = "- (BOOL)retainWeakReference UNAVAILABLE_ATTRIBUTE;", selector = "retainWeakReference")
    public native boolean retainWeakReference();

    @ObjCMethodSign(sign = "+ (void)initialize;", selector = "initialize")
    public static native void initialize();

    @ObjCMethodSign(sign = "+ (id)allocWithZone:(struct _NSZone *)zone;", selector = "allocWithZone:")
    public static native NSObject allocWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "+ (id)alloc;", selector = "alloc")
    public static native <E extends NSObject> E alloc();

    @ObjCMethodSign(sign = "+ (id)copyWithZone:(struct _NSZone *)zone OBJC_ARC_UNAVAILABLE;", selector = "copyWithZone:")
    public static native NSObject copyWithZone__STATIC(NSZone zone);

    @ObjCMethodSign(sign = "+ (id)mutableCopyWithZone:(struct _NSZone *)zone OBJC_ARC_UNAVAILABLE;", selector = "mutableCopyWithZone:")
    public static native NSObject mutableCopyWithZone__STATIC(NSZone zone);

    @ObjCMethodSign(sign = "+ (Class)superclass;", selector = "superclass")
    public static native ObjCClass superclass__STATIC();

    @ObjCMethodSign(sign = "+ (Class)class;", selector = "class")
    public static native ObjCClass classObjCClass__STATIC();

    @ObjCMethodSign(sign = "+ (BOOL)instancesRespondToSelector:(SEL)aSelector;", selector = "instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "+ (BOOL)conformsToProtocol:(Protocol *)protocol;", selector = "conformsToProtocol:")
    public static native boolean conformsToProtocol$__STATIC(ObjCProtocol protocol);

    @ObjCMethodSign(sign = "+ (IMP)instanceMethodForSelector:(SEL)aSelector;", selector = "instanceMethodForSelector:")
    public static native ObjCFunctionPtr instanceMethodForSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "+ (NSMethodSignature *)instanceMethodSignatureForSelector:(SEL)aSelector;", selector = "instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector$(ObjCSelector aSelector);

    @ObjCMethodSign(sign = "+ (NSString *)description;", selector = "description")
    public static native NSString description__STATIC();

    @ObjCMethodSign(sign = "+ (BOOL)isSubclassOfClass:(Class)aClass;", selector = "isSubclassOfClass:")
    public static native boolean isSubclassOfClass$(ObjCClass aClass);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)resolveClassMethod:(SEL)sel __OSX_AVAILABLE_STARTING(__MAC_10_5, __IPHONE_2_0);", selector = "resolveClassMethod:")
    public static native boolean resolveClassMethod$(ObjCSelector sel);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)resolveInstanceMethod:(SEL)sel __OSX_AVAILABLE_STARTING(__MAC_10_5, __IPHONE_2_0);", selector = "resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod$(ObjCSelector sel);

    @ObjCCategoryMethod(catname = "NSCoderMethods", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (Class)classForCoder;", selector = "classForCoder")
    public native ObjCClass classForCoder();

    @ObjCCategoryMethod(catname = "NSCoderMethods", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (id)replacementObjectForCoder:(NSCoder *)aCoder;", selector = "replacementObjectForCoder:")
    public native NSObject replacementObjectForCoder$(NSCoder aCoder);

    @ObjCCategoryMethod(catname = "NSCoderMethods", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (id)awakeAfterUsingCoder:(NSCoder *)aDecoder NS_REPLACES_RECEIVER;", selector = "awakeAfterUsingCoder:")
    public native NSObject awakeAfterUsingCoder$(NSCoder aDecoder);

    @ObjCCategoryMethod(catname = "NSCoderMethods", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (NSInteger)version;", selector = "version")
    public static native @NSInteger long version__STATIC();

    @ObjCCategoryMethod(catname = "NSCoderMethods", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (void)setVersion:(NSInteger)aVersion;", selector = "setVersion:")
    public static native void setVersion(@NSInteger long aVersion);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSDiscardableContentProxy", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (id)autoContentAccessingProxy NS_AVAILABLE(10_6, 4_0);", selector = "autoContentAccessingProxy")
    public native NSObject autoContentAccessingProxy();

    @ObjCCategoryMethod(catname = "NSErrorRecoveryAttempting", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)attemptRecoveryFromError:(NSError *)error optionIndex:(NSUInteger)recoveryOptionIndex delegate:(id)delegate didRecoverSelector:(SEL)didRecoverSelector contextInfo:(void *)contextInfo;", selector = "attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:")
    public native void attemptRecoveryFromError$optionIndex$delegate$didRecoverSelector$contextInfo$(NSError error, @NSUInteger long recoveryOptionIndex, NSObject delegate, ObjCSelector didRecoverSelector, @VoidPointer() Object contextInfo);

    @ObjCCategoryMethod(catname = "NSErrorRecoveryAttempting", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (BOOL)attemptRecoveryFromError:(NSError *)error optionIndex:(NSUInteger)recoveryOptionIndex;", selector = "attemptRecoveryFromError:optionIndex:")
    public native boolean attemptRecoveryFromError$optionIndex$(NSError error, @NSUInteger long recoveryOptionIndex);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSCopyLinkMoveHandler", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (BOOL)fileManager:(NSFileManager *)fm shouldProceedAfterError:(NSDictionary *)errorInfo NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "fileManager:shouldProceedAfterError:")
    public native boolean fileManager$shouldProceedAfterError$(NSFileManager fm, NSDictionary errorInfo);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSCopyLinkMoveHandler", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)fileManager:(NSFileManager *)fm willProcessPath:(NSString *)path NS_DEPRECATED(10_0, 10_5, 2_0, 2_0);", selector = "fileManager:willProcessPath:")
    public native void fileManager$willProcessPath$(NSFileManager fm, NSString path);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (id)valueForKey:(NSString *)key;", selector = "valueForKey:")
    public native NSObject valueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)setValue:(id)value forKey:(NSString *)key;", selector = "setValue:forKey:")
    public native void setValue$forKey$(NSObject value, NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (BOOL)validateValue:(inout id *)ioValue forKey:(NSString *)inKey error:(out NSError **)outError;", selector = "validateValue:forKey:error:")
    public native boolean validateValue$forKey$error$(NSObject ioValue, NSString inKey, NSError[] outError);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (NSMutableArray *)mutableArrayValueForKey:(NSString *)key;", selector = "mutableArrayValueForKey:")
    public native NSMutableArray mutableArrayValueForKey$(NSString key);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (NSMutableOrderedSet *)mutableOrderedSetValueForKey:(NSString *)key NS_AVAILABLE(10_7, 5_0);", selector = "mutableOrderedSetValueForKey:")
    public native NSMutableOrderedSet mutableOrderedSetValueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (NSMutableSet *)mutableSetValueForKey:(NSString *)key;", selector = "mutableSetValueForKey:")
    public native NSMutableSet mutableSetValueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (id)valueForKeyPath:(NSString *)keyPath;", selector = "valueForKeyPath:")
    public native NSObject valueForKeyPath$(NSString keyPath);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)setValue:(id)value forKeyPath:(NSString *)keyPath;", selector = "setValue:forKeyPath:")
    public native void setValue$forKeyPath$(NSObject value, NSString keyPath);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (BOOL)validateValue:(inout id *)ioValue forKeyPath:(NSString *)inKeyPath error:(out NSError **)outError;", selector = "validateValue:forKeyPath:error:")
    public native boolean validateValue$forKeyPath$error$(NSObject ioValue, NSString inKeyPath, NSError[] outError);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (NSMutableArray *)mutableArrayValueForKeyPath:(NSString *)keyPath;", selector = "mutableArrayValueForKeyPath:")
    public native NSMutableArray mutableArrayValueForKeyPath$(NSString keyPath);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (NSMutableOrderedSet *)mutableOrderedSetValueForKeyPath:(NSString *)keyPath NS_AVAILABLE(10_7, 5_0);", selector = "mutableOrderedSetValueForKeyPath:")
    public native NSMutableOrderedSet mutableOrderedSetValueForKeyPath$(NSString keyPath);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (NSMutableSet *)mutableSetValueForKeyPath:(NSString *)keyPath;", selector = "mutableSetValueForKeyPath:")
    public native NSMutableSet mutableSetValueForKeyPath$(NSString keyPath);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (id)valueForUndefinedKey:(NSString *)key;", selector = "valueForUndefinedKey:")
    public native NSObject valueForUndefinedKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)setValue:(id)value forUndefinedKey:(NSString *)key;", selector = "setValue:forUndefinedKey:")
    public native void setValue$forUndefinedKey$(NSObject value, NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)setNilValueForKey:(NSString *)key;", selector = "setNilValueForKey:")
    public native void setNilValueForKey(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (NSDictionary *)dictionaryWithValuesForKeys:(NSArray *)keys;", selector = "dictionaryWithValuesForKeys:")
    public native NSDictionary dictionaryWithValuesForKeys$(NSArray keys);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)setValuesForKeysWithDictionary:(NSDictionary *)keyedValues;", selector = "setValuesForKeysWithDictionary:")
    public native void setValuesForKeysWithDictionary(NSDictionary keyedValues);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (BOOL)accessInstanceVariablesDirectly;", selector = "accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @ObjCCategoryMethod(catname = "NSKeyValueObserving", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)observeValueForKeyPath:(NSString *)keyPath ofObject:(id)object change:(NSDictionary *)change context:(void *)context;", selector = "observeValueForKeyPath:ofObject:change:context:")
    public native void observeValueForKeyPath$ofObject$change$context$(NSString keyPath, NSObject object, NSDictionary change, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)addObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath options:(NSKeyValueObservingOptions)options context:(void *)context;", selector = "addObserver:forKeyPath:options:context:")
    public native void addObserver$forKeyPath$options$context$(NSObject observer, NSString keyPath, NSKeyValueObservingOptions options, @VoidPointer() Object context);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath context:(void *)context NS_AVAILABLE(10_7, 5_0);", selector = "removeObserver:forKeyPath:context:")
    public native void removeObserver$forKeyPath$context$(NSObject observer, NSString keyPath, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath;", selector = "removeObserver:forKeyPath:")
    public native void removeObserver$forKeyPath$(NSObject observer, NSString keyPath);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverNotification", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)willChangeValueForKey:(NSString *)key;", selector = "willChangeValueForKey:")
    public native void willChangeValueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverNotification", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)didChangeValueForKey:(NSString *)key;", selector = "didChangeValueForKey:")
    public native void didChangeValueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverNotification", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)willChange:(NSKeyValueChange)changeKind valuesAtIndexes:(NSIndexSet *)indexes forKey:(NSString *)key;", selector = "willChange:valuesAtIndexes:forKey:")
    public native void willChange$valuesAtIndexes$forKey$(NSKeyValueChange changeKind, NSIndexSet indexes, NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverNotification", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)didChange:(NSKeyValueChange)changeKind valuesAtIndexes:(NSIndexSet *)indexes forKey:(NSString *)key;", selector = "didChange:valuesAtIndexes:forKey:")
    public native void didChange$valuesAtIndexes$forKey$(NSKeyValueChange changeKind, NSIndexSet indexes, NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverNotification", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)willChangeValueForKey:(NSString *)key withSetMutation:(NSKeyValueSetMutationKind)mutationKind usingObjects:(NSSet *)objects;", selector = "willChangeValueForKey:withSetMutation:usingObjects:")
    public native void willChangeValueForKey$withSetMutation$usingObjects$(NSString key, NSKeyValueSetMutationKind mutationKind, NSSet objects);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverNotification", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)didChangeValueForKey:(NSString *)key withSetMutation:(NSKeyValueSetMutationKind)mutationKind usingObjects:(NSSet *)objects;", selector = "didChangeValueForKey:withSetMutation:usingObjects:")
    public native void didChangeValueForKey$withSetMutation$usingObjects$(NSString key, NSKeyValueSetMutationKind mutationKind, NSSet objects);

    @ObjCCategoryMethod(catname = "NSKeyValueObservingCustomization", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)setObservationInfo:(void *)observationInfo;", selector = "setObservationInfo:")
    public native void setObservationInfo(@VoidPointer() Object observationInfo);

    @ObjCCategoryMethod(catname = "NSKeyValueObservingCustomization", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void *)observationInfo NS_RETURNS_INNER_POINTER;", selector = "observationInfo")
    public native @VoidPointer() Object observationInfo();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueObservingCustomization", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (NSSet *)keyPathsForValuesAffectingValueForKey:(NSString *)key NS_AVAILABLE(10_5, 2_0);", selector = "keyPathsForValuesAffectingValueForKey:")
    public static native NSSet keyPathsForValuesAffectingValueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObservingCustomization", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (BOOL)automaticallyNotifiesObserversForKey:(NSString *)key;", selector = "automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyedArchiverObjectSubstitution", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (Class)classForKeyedArchiver;", selector = "classForKeyedArchiver")
    public native ObjCClass classForKeyedArchiver();

    @ObjCCategoryMethod(catname = "NSKeyedArchiverObjectSubstitution", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (id)replacementObjectForKeyedArchiver:(NSKeyedArchiver *)archiver;", selector = "replacementObjectForKeyedArchiver:")
    public native NSObject replacementObjectForKeyedArchiver$(NSKeyedArchiver archiver);

    @ObjCCategoryMethod(catname = "NSKeyedArchiverObjectSubstitution", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (NSArray *)classFallbacksForKeyedArchiver;", selector = "classFallbacksForKeyedArchiver")
    public static native NSArray classFallbacksForKeyedArchiver();

    @ObjCCategoryMethod(catname = "NSKeyedUnarchiverObjectSubstitution", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (Class)classForKeyedUnarchiver;", selector = "classForKeyedUnarchiver")
    public static native ObjCClass classForKeyedUnarchiver();

    @ObjCCategoryMethod(catname = "NSDelayedPerforming", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)performSelector:(SEL)aSelector withObject:(id)anArgument afterDelay:(NSTimeInterval)delay inModes:(NSArray *)modes;", selector = "performSelector:withObject:afterDelay:inModes:")
    public native void performSelector$withObject$afterDelay$inModes$(ObjCSelector aSelector, NSObject anArgument, double delay, NSArray modes);

    @ObjCCategoryMethod(catname = "NSDelayedPerforming", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)performSelector:(SEL)aSelector withObject:(id)anArgument afterDelay:(NSTimeInterval)delay;", selector = "performSelector:withObject:afterDelay:")
    public native void performSelector$withObject$afterDelay$(ObjCSelector aSelector, NSObject anArgument, double delay);

    @ObjCCategoryMethod(catname = "NSDelayedPerforming", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (void)cancelPreviousPerformRequestsWithTarget:(id)aTarget selector:(SEL)aSelector object:(id)anArgument;", selector = "cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTarget$selector$object$(NSObject aTarget, ObjCSelector aSelector, NSObject anArgument);

    @ObjCCategoryMethod(catname = "NSDelayedPerforming", catownername = "NSObject")
    @ObjCMethodSign(sign = "+ (void)cancelPreviousPerformRequestsWithTarget:(id)aTarget;", selector = "cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget$(NSObject aTarget);

    @ObjCCategoryMethod(catname = "NSThreadPerformAdditions", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)performSelectorOnMainThread:(SEL)aSelector withObject:(id)arg waitUntilDone:(BOOL)wait modes:(NSArray *)array;", selector = "performSelectorOnMainThread:withObject:waitUntilDone:modes:")
    public native void performSelectorOnMainThread$withObject$waitUntilDone$modes$(ObjCSelector aSelector, NSObject arg, boolean wait, NSArray array);

    @ObjCCategoryMethod(catname = "NSThreadPerformAdditions", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)performSelectorOnMainThread:(SEL)aSelector withObject:(id)arg waitUntilDone:(BOOL)wait;", selector = "performSelectorOnMainThread:withObject:waitUntilDone:")
    public native void performSelectorOnMainThread$withObject$waitUntilDone$(ObjCSelector aSelector, NSObject arg, boolean wait);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSThreadPerformAdditions", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)performSelector:(SEL)aSelector onThread:(NSThread *)thr withObject:(id)arg waitUntilDone:(BOOL)wait modes:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "performSelector:onThread:withObject:waitUntilDone:modes:")
    public native void performSelector$onThread$withObject$waitUntilDone$modes$(ObjCSelector aSelector, NSThread thr, NSObject arg, boolean wait, NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSThreadPerformAdditions", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)performSelector:(SEL)aSelector onThread:(NSThread *)thr withObject:(id)arg waitUntilDone:(BOOL)wait NS_AVAILABLE(10_5, 2_0);", selector = "performSelector:onThread:withObject:waitUntilDone:")
    public native void performSelector$onThread$withObject$waitUntilDone$(ObjCSelector aSelector, NSThread thr, NSObject arg, boolean wait);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSThreadPerformAdditions", catownername = "NSObject")
    @ObjCMethodSign(sign = "- (void)performSelectorInBackground:(SEL)aSelector withObject:(id)arg NS_AVAILABLE(10_5, 2_0);", selector = "performSelectorInBackground:withObject:")
    public native void performSelectorInBackground$withObject$(ObjCSelector aSelector, NSObject arg);

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

    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCMethodSign(sign = "- (NSString *)debugDescription;", selector = "debugDescription")
    public native NSString debugDescription();
}
