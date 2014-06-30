package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSProgress extends NSObject  {
    
    public NSProgress() {}
    @ObjCPropertyGetter(selector = "totalUnitCount")
    public native @LongLong long getTotalUnitCount();
    @ObjCPropertySetter(selector = "setTotalUnitCount:")
    public native void setTotalUnitCount(@LongLong long v);
    @ObjCProperty public @LongLong long totalUnitCount;

    @ObjCPropertyGetter(selector = "completedUnitCount")
    public native @LongLong long getCompletedUnitCount();
    @ObjCPropertySetter(selector = "setCompletedUnitCount:")
    public native void setCompletedUnitCount(@LongLong long v);
    @ObjCProperty public @LongLong long completedUnitCount;

    @ObjCPropertyGetter(selector = "localizedDescription")
    public native NSString getLocalizedDescription();
    @ObjCPropertySetter(selector = "setLocalizedDescription:")
    public native void setLocalizedDescription(NSString v);
    @ObjCProperty public NSString localizedDescription;

    @ObjCPropertyGetter(selector = "localizedAdditionalDescription")
    public native NSString getLocalizedAdditionalDescription();
    @ObjCPropertySetter(selector = "setLocalizedAdditionalDescription:")
    public native void setLocalizedAdditionalDescription(NSString v);
    @ObjCProperty public NSString localizedAdditionalDescription;

    @ObjCPropertyGetter(selector = "isCancellable")
    public native boolean isCancellable();
    @ObjCPropertySetter(selector = "setCancellable:")
    public native void setCancellable(boolean v);
    @ObjCProperty public boolean cancellable;

    @ObjCPropertyGetter(selector = "isPausable")
    public native boolean isPausable();
    @ObjCPropertySetter(selector = "setPausable:")
    public native void setPausable(boolean v);
    @ObjCProperty public boolean pausable;

    @ObjCPropertyGetter(selector = "isCancelled")
    public native boolean isCancelled();
    @ObjCProperty public boolean cancelled;

    @ObjCPropertyGetter(selector = "isPaused")
    public native boolean isPaused();
    @ObjCProperty public boolean paused;

    @ObjCPropertyGetter(selector = "cancellationHandler")
    public native ObjCBlock getCancellationHandler();
    @ObjCPropertySetter(selector = "setCancellationHandler:")
    public native void setCancellationHandler(ObjCBlock v);
    @ObjCProperty public ObjCBlock cancellationHandler;

    @ObjCPropertyGetter(selector = "pausingHandler")
    public native ObjCBlock getPausingHandler();
    @ObjCPropertySetter(selector = "setPausingHandler:")
    public native void setPausingHandler(ObjCBlock v);
    @ObjCProperty public ObjCBlock pausingHandler;

    @ObjCPropertyGetter(selector = "isIndeterminate")
    public native boolean isIndeterminate();
    @ObjCProperty public boolean indeterminate;

    @ObjCPropertyGetter(selector = "fractionCompleted")
    public native double getFractionCompleted();
    @ObjCProperty public double fractionCompleted;

    @ObjCPropertyGetter(selector = "kind")
    public native NSString getKind();
    @ObjCPropertySetter(selector = "setKind:")
    public native void setKind(NSString v);
    @ObjCProperty public NSString kind;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithParent:(NSProgress *)parentProgressOrNil userInfo:(NSDictionary *)userInfoOrNil;", selector = "initWithParent:userInfo:")
    public native NSProgress initWithParent$userInfo$(NSProgress parentProgressOrNil, NSDictionary userInfoOrNil);

    @ObjCMethodSign(sign = "- (void)becomeCurrentWithPendingUnitCount:(int64_t)unitCount;", selector = "becomeCurrentWithPendingUnitCount:")
    public native void becomeCurrentWithPendingUnitCount$(@LongLong long unitCount);

    @ObjCMethodSign(sign = "- (void)resignCurrent;", selector = "resignCurrent")
    public native void resignCurrent();

    @ObjCMethodSign(sign = "- (void)setUserInfoObject:(id)objectOrNil forKey:(NSString *)key;", selector = "setUserInfoObject:forKey:")
    public native void setUserInfoObject$forKey$(NSObject objectOrNil, NSString key);

    @ObjCMethodSign(sign = "- (void)cancel;", selector = "cancel")
    public native void cancel();

    @ObjCMethodSign(sign = "- (void)pause;", selector = "pause")
    public native void pause();

    @ObjCMethodSign(sign = "- (NSDictionary *)userInfo;", selector = "userInfo")
    public native NSDictionary userInfo();

    @ObjCMethodSign(sign = "+ (NSProgress *)currentProgress;", selector = "currentProgress")
    public static native NSProgress currentProgress();

    @ObjCMethodSign(sign = "+ (NSProgress *)progressWithTotalUnitCount:(int64_t)unitCount;", selector = "progressWithTotalUnitCount:")
    public static native NSProgress progressWithTotalUnitCount$(@LongLong long unitCount);
}
