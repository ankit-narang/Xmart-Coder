package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSUndoManager extends NSObject  {
    
    public NSUndoManager() {}
    
    
    @ObjCMethodSign(sign = "- (void)beginUndoGrouping;", selector = "beginUndoGrouping")
    public native void beginUndoGrouping();

    @ObjCMethodSign(sign = "- (void)endUndoGrouping;", selector = "endUndoGrouping")
    public native void endUndoGrouping();

    @ObjCMethodSign(sign = "- (NSInteger)groupingLevel;", selector = "groupingLevel")
    public native @NSInteger long groupingLevel();

    @ObjCMethodSign(sign = "- (void)disableUndoRegistration;", selector = "disableUndoRegistration")
    public native void disableUndoRegistration();

    @ObjCMethodSign(sign = "- (void)enableUndoRegistration;", selector = "enableUndoRegistration")
    public native void enableUndoRegistration();

    @ObjCMethodSign(sign = "- (BOOL)isUndoRegistrationEnabled;", selector = "isUndoRegistrationEnabled")
    public native boolean isUndoRegistrationEnabled();

    @ObjCMethodSign(sign = "- (BOOL)groupsByEvent;", selector = "groupsByEvent")
    public native boolean groupsByEvent();

    @ObjCMethodSign(sign = "- (void)setGroupsByEvent:(BOOL)groupsByEvent;", selector = "setGroupsByEvent:")
    public native void setGroupsByEvent(boolean groupsByEvent);

    @ObjCMethodSign(sign = "- (void)setLevelsOfUndo:(NSUInteger)levels;", selector = "setLevelsOfUndo:")
    public native void setLevelsOfUndo(@NSUInteger long levels);

    @ObjCMethodSign(sign = "- (NSUInteger)levelsOfUndo;", selector = "levelsOfUndo")
    public native @NSUInteger long levelsOfUndo();

    @ObjCMethodSign(sign = "- (void)setRunLoopModes:(NSArray *)runLoopModes;", selector = "setRunLoopModes:")
    public native void setRunLoopModes(NSArray runLoopModes);

    @ObjCMethodSign(sign = "- (NSArray *)runLoopModes;", selector = "runLoopModes")
    public native NSArray runLoopModes();

    @ObjCMethodSign(sign = "- (void)undo;", selector = "undo")
    public native void undo();

    @ObjCMethodSign(sign = "- (void)redo;", selector = "redo")
    public native void redo();

    @ObjCMethodSign(sign = "- (void)undoNestedGroup;", selector = "undoNestedGroup")
    public native void undoNestedGroup();

    @ObjCMethodSign(sign = "- (BOOL)canUndo;", selector = "canUndo")
    public native boolean canUndo();

    @ObjCMethodSign(sign = "- (BOOL)canRedo;", selector = "canRedo")
    public native boolean canRedo();

    @ObjCMethodSign(sign = "- (BOOL)isUndoing;", selector = "isUndoing")
    public native boolean isUndoing();

    @ObjCMethodSign(sign = "- (BOOL)isRedoing;", selector = "isRedoing")
    public native boolean isRedoing();

    @ObjCMethodSign(sign = "- (void)removeAllActions;", selector = "removeAllActions")
    public native void removeAllActions();

    @ObjCMethodSign(sign = "- (void)removeAllActionsWithTarget:(id)target;", selector = "removeAllActionsWithTarget:")
    public native void removeAllActionsWithTarget$(NSObject target);

    @ObjCMethodSign(sign = "- (void)registerUndoWithTarget:(id)target selector:(SEL)selector object:(id)anObject;", selector = "registerUndoWithTarget:selector:object:")
    public native void registerUndoWithTarget$selector$object$(NSObject target, ObjCSelector selector, NSObject anObject);

    @ObjCMethodSign(sign = "- (id)prepareWithInvocationTarget:(id)target;", selector = "prepareWithInvocationTarget:")
    public native NSObject prepareWithInvocationTarget$(NSObject target);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setActionIsDiscardable:(BOOL)discardable NS_AVAILABLE(10_7, 5_0);", selector = "setActionIsDiscardable:")
    public native void setActionIsDiscardable(boolean discardable);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)undoActionIsDiscardable NS_AVAILABLE(10_7, 5_0);", selector = "undoActionIsDiscardable")
    public native boolean undoActionIsDiscardable();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)redoActionIsDiscardable NS_AVAILABLE(10_7, 5_0);", selector = "redoActionIsDiscardable")
    public native boolean redoActionIsDiscardable();

    @ObjCMethodSign(sign = "- (NSString *)undoActionName;", selector = "undoActionName")
    public native NSString undoActionName();

    @ObjCMethodSign(sign = "- (NSString *)redoActionName;", selector = "redoActionName")
    public native NSString redoActionName();

    @ObjCMethodSign(sign = "- (void)setActionName:(NSString *)actionName;", selector = "setActionName:")
    public native void setActionName(NSString actionName);

    @ObjCMethodSign(sign = "- (NSString *)undoMenuItemTitle;", selector = "undoMenuItemTitle")
    public native NSString undoMenuItemTitle();

    @ObjCMethodSign(sign = "- (NSString *)redoMenuItemTitle;", selector = "redoMenuItemTitle")
    public native NSString redoMenuItemTitle();

    @ObjCMethodSign(sign = "- (NSString *)undoMenuTitleForUndoActionName:(NSString *)actionName;", selector = "undoMenuTitleForUndoActionName:")
    public native NSString undoMenuTitleForUndoActionName$(NSString actionName);

    @ObjCMethodSign(sign = "- (NSString *)redoMenuTitleForUndoActionName:(NSString *)actionName;", selector = "redoMenuTitleForUndoActionName:")
    public native NSString redoMenuTitleForUndoActionName$(NSString actionName);
}
