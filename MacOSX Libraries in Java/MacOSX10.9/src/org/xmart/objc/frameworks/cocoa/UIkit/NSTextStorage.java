package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSTextStorage extends NSMutableAttributedString  {
    
    public NSTextStorage() {}
    @ObjCPropertyGetter(selector = "layoutManagers")
    public native NSArray getLayoutManagers();
    @ObjCProperty public NSArray layoutManagers;

    @ObjCPropertyGetter(selector = "editedMask")
    public native NSTextStorageEditActions getEditedMask();
    @ObjCPropertySetter(selector = "setEditedMask:")
    public native void setEditedMask(NSTextStorageEditActions v);
    @ObjCProperty public NSTextStorageEditActions editedMask;

    @ObjCPropertyGetter(selector = "editedRange")
    public native @ObjCByValue NSRange getEditedRange();
    @ObjCPropertySetter(selector = "setEditedRange:")
    public native void setEditedRange(@ObjCByValue NSRange v);
    @ObjCProperty public @ObjCByValue NSRange editedRange;

    @ObjCPropertyGetter(selector = "changeInLength")
    public native @NSInteger long getChangeInLength();
    @ObjCPropertySetter(selector = "setChangeInLength:")
    public native void setChangeInLength(@NSInteger long v);
    @ObjCProperty public @NSInteger long changeInLength;

    @ObjCPropertyGetter(selector = "delegate")
    public native NSTextStorageDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSTextStorageDelegate v);
    @ObjCProperty public NSTextStorageDelegate delegate;

    @ObjCPropertyGetter(selector = "fixesAttributesLazily")
    public native boolean isFixesAttributesLazily();
    @ObjCProperty public boolean fixesAttributesLazily;
    
    @ObjCMethodSign(sign = "- (void)addLayoutManager:(NSLayoutManager *)aLayoutManager;", selector = "addLayoutManager:")
    public native void addLayoutManager$(NSLayoutManager aLayoutManager);

    @ObjCMethodSign(sign = "- (void)removeLayoutManager:(NSLayoutManager *)aLayoutManager;", selector = "removeLayoutManager:")
    public native void removeLayoutManager$(NSLayoutManager aLayoutManager);

    @ObjCMethodSign(sign = "- (void)edited:(NSTextStorageEditActions)editedMask range:(NSRange)editedRange changeInLength:(NSInteger)delta;", selector = "edited:range:changeInLength:")
    public native void edited$range$changeInLength$(NSTextStorageEditActions editedMask, @ObjCByValue NSRange editedRange, @NSInteger long delta);

    @ObjCMethodSign(sign = "- (void)processEditing;", selector = "processEditing")
    public native void processEditing();

    @ObjCMethodSign(sign = "- (void)invalidateAttributesInRange:(NSRange)range;", selector = "invalidateAttributesInRange:")
    public native void invalidateAttributesInRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (void)ensureAttributesAreFixedInRange:(NSRange)range;", selector = "ensureAttributesAreFixedInRange:")
    public native void ensureAttributesAreFixedInRange$(@ObjCByValue NSRange range);
}
