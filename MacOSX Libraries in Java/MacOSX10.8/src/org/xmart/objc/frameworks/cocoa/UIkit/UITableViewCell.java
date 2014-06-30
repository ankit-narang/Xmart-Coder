package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITableViewCell extends UIView implements NSCoding, UIGestureRecognizerDelegate {
    
    public UITableViewCell() {}
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "imageView")
    public native UIImageView getImageView();
    @ObjCProperty public UIImageView imageView;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "textLabel")
    public native UILabel getTextLabel();
    @ObjCProperty public UILabel textLabel;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "detailTextLabel")
    public native UILabel getDetailTextLabel();
    @ObjCProperty public UILabel detailTextLabel;

    @ObjCPropertyGetter(selector = "contentView")
    public native UIView getContentView();
    @ObjCProperty public UIView contentView;

    @ObjCPropertyGetter(selector = "backgroundView")
    public native UIView getBackgroundView();
    @ObjCPropertySetter(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @ObjCProperty public UIView backgroundView;

    @ObjCPropertyGetter(selector = "selectedBackgroundView")
    public native UIView getSelectedBackgroundView();
    @ObjCPropertySetter(selector = "setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView v);
    @ObjCProperty public UIView selectedBackgroundView;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "multipleSelectionBackgroundView")
    public native UIView getMultipleSelectionBackgroundView();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setMultipleSelectionBackgroundView:")
    public native void setMultipleSelectionBackgroundView(UIView v);
    @ObjCProperty public UIView multipleSelectionBackgroundView;

    @ObjCPropertyGetter(selector = "reuseIdentifier")
    public native NSString getReuseIdentifier();
    @ObjCProperty public NSString reuseIdentifier;

    @ObjCPropertyGetter(selector = "selectionStyle")
    public native UITableViewCellSelectionStyle getSelectionStyle();
    @ObjCPropertySetter(selector = "setSelectionStyle:")
    public native void setSelectionStyle(UITableViewCellSelectionStyle v);
    @ObjCProperty public UITableViewCellSelectionStyle selectionStyle;

    @ObjCPropertyGetter(selector = "isSelected")
    public native boolean isSelected();
    @ObjCPropertySetter(selector = "setSelected:")
    public native void setSelected(boolean v);
    @ObjCProperty public boolean selected;

    @ObjCPropertyGetter(selector = "isHighlighted")
    public native boolean isHighlighted();
    @ObjCPropertySetter(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @ObjCProperty public boolean highlighted;

    @ObjCPropertyGetter(selector = "editingStyle")
    public native UITableViewCellEditingStyle getEditingStyle();
    @ObjCProperty public UITableViewCellEditingStyle editingStyle;

    @ObjCPropertyGetter(selector = "showsReorderControl")
    public native boolean isShowsReorderControl();
    @ObjCPropertySetter(selector = "setShowsReorderControl:")
    public native void setShowsReorderControl(boolean v);
    @ObjCProperty public boolean showsReorderControl;

    @ObjCPropertyGetter(selector = "shouldIndentWhileEditing")
    public native boolean isShouldIndentWhileEditing();
    @ObjCPropertySetter(selector = "setShouldIndentWhileEditing:")
    public native void setShouldIndentWhileEditing(boolean v);
    @ObjCProperty public boolean shouldIndentWhileEditing;

    @ObjCPropertyGetter(selector = "accessoryType")
    public native UITableViewCellAccessoryType getAccessoryType();
    @ObjCPropertySetter(selector = "setAccessoryType:")
    public native void setAccessoryType(UITableViewCellAccessoryType v);
    @ObjCProperty public UITableViewCellAccessoryType accessoryType;

    @ObjCPropertyGetter(selector = "accessoryView")
    public native UIView getAccessoryView();
    @ObjCPropertySetter(selector = "setAccessoryView:")
    public native void setAccessoryView(UIView v);
    @ObjCProperty public UIView accessoryView;

    @ObjCPropertyGetter(selector = "editingAccessoryType")
    public native UITableViewCellAccessoryType getEditingAccessoryType();
    @ObjCPropertySetter(selector = "setEditingAccessoryType:")
    public native void setEditingAccessoryType(UITableViewCellAccessoryType v);
    @ObjCProperty public UITableViewCellAccessoryType editingAccessoryType;

    @ObjCPropertyGetter(selector = "editingAccessoryView")
    public native UIView getEditingAccessoryView();
    @ObjCPropertySetter(selector = "setEditingAccessoryView:")
    public native void setEditingAccessoryView(UIView v);
    @ObjCProperty public UIView editingAccessoryView;

    @ObjCPropertyGetter(selector = "indentationLevel")
    public native @NSInteger long getIndentationLevel();
    @ObjCPropertySetter(selector = "setIndentationLevel:")
    public native void setIndentationLevel(@NSInteger long v);
    @ObjCProperty public @NSInteger long indentationLevel;

    @ObjCPropertyGetter(selector = "indentationWidth")
    public native float getIndentationWidth();
    @ObjCPropertySetter(selector = "setIndentationWidth:")
    public native void setIndentationWidth(float v);
    @ObjCProperty public float indentationWidth;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "separatorInset")
    public native @ObjCByValue UIEdgeInsets getSeparatorInset();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setSeparatorInset:")
    public native void setSeparatorInset(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets separatorInset;

    @ObjCPropertyGetter(selector = "isEditing")
    public native boolean isEditing();
    @ObjCPropertySetter(selector = "setEditing:")
    public native void setEditing(boolean v);
    @ObjCProperty public boolean editing;

    @ObjCPropertyGetter(selector = "showingDeleteConfirmation")
    public native boolean isShowingDeleteConfirmation();
    @ObjCProperty public boolean showingDeleteConfirmation;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "text")
    public native NSString getText();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setText:")
    public native void setText(NSString v);
    @ObjCProperty public NSString text;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "font")
    public native UIFont getFont();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setFont:")
    public native void setFont(UIFont v);
    @ObjCProperty public UIFont font;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @ObjCProperty public NSTextAlignment textAlignment;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @ObjCProperty public NSLineBreakMode lineBreakMode;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "textColor")
    public native UIColor getTextColor();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
    @ObjCProperty public UIColor textColor;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "selectedTextColor")
    public native UIColor getSelectedTextColor();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setSelectedTextColor:")
    public native void setSelectedTextColor(UIColor v);
    @ObjCProperty public UIColor selectedTextColor;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "image")
    public native UIImage getImage();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setImage:")
    public native void setImage(UIImage v);
    @ObjCProperty public UIImage image;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "selectedImage")
    public native UIImage getSelectedImage();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setSelectedImage:")
    public native void setSelectedImage(UIImage v);
    @ObjCProperty public UIImage selectedImage;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "hidesAccessoryWhenEditing")
    public native boolean isHidesAccessoryWhenEditing();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setHidesAccessoryWhenEditing:")
    public native void setHidesAccessoryWhenEditing(boolean v);
    @ObjCProperty public boolean hidesAccessoryWhenEditing;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "target")
    public native NSObject getTarget();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setTarget:", strongRef = true)
    public native void setTarget(NSObject v);
    @ObjCProperty public NSObject target;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "editAction")
    public native ObjCSelector getEditAction();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setEditAction:")
    public native void setEditAction(ObjCSelector v);
    @ObjCProperty public ObjCSelector editAction;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "accessoryAction")
    public native ObjCSelector getAccessoryAction();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setAccessoryAction:")
    public native void setAccessoryAction(ObjCSelector v);
    @ObjCProperty public ObjCSelector accessoryAction;
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithStyle:(UITableViewCellStyle)style reuseIdentifier:(NSString *)reuseIdentifier NS_AVAILABLE_IOS(3_0);", selector = "initWithStyle:reuseIdentifier:")
    public native UITableViewCell initWithStyle$reuseIdentifier$(UITableViewCellStyle style, NSString reuseIdentifier);

    @ObjCMethodSign(sign = "- (void)prepareForReuse;", selector = "prepareForReuse")
    public native void prepareForReuse();

    @ObjCMethodSign(sign = "- (void)setSelected:(BOOL)selected animated:(BOOL)animated;", selector = "setSelected:animated:")
    public native void setSelected$animated$(boolean selected, boolean animated);

    @ObjCMethodSign(sign = "- (void)setHighlighted:(BOOL)highlighted animated:(BOOL)animated;", selector = "setHighlighted:animated:")
    public native void setHighlighted$animated$(boolean highlighted, boolean animated);

    @ObjCMethodSign(sign = "- (void)setEditing:(BOOL)editing animated:(BOOL)animated;", selector = "setEditing:animated:")
    public native void setEditing$animated$(boolean editing, boolean animated);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)willTransitionToState:(UITableViewCellStateMask)state NS_AVAILABLE_IOS(3_0);", selector = "willTransitionToState:")
    public native void willTransitionToState$(UITableViewCellStateMask state);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)didTransitionToState:(UITableViewCellStateMask)state NS_AVAILABLE_IOS(3_0);", selector = "didTransitionToState:")
    public native void didTransitionToState$(UITableViewCellStateMask state);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIDeprecated", catownername = "UITableViewCell")
    @ObjCMethodSign(sign = "- (id)initWithFrame:(CGRect)frame reuseIdentifier:(NSString *)reuseIdentifier NS_DEPRECATED_IOS(2_0, 3_0);", selector = "initWithFrame:reuseIdentifier:")
    public native UITableViewCell initWithFrame$reuseIdentifier$(@ObjCByValue CGRect frame, NSString reuseIdentifier);

    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizerShouldBegin:(UIGestureRecognizer *)gestureRecognizer;", selector = "gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin$(UIGestureRecognizer gestureRecognizer);

    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldRecognizeSimultaneouslyWithGestureRecognizer:(UIGestureRecognizer *)otherGestureRecognizer;", selector = "gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean gestureRecognizer$shouldRecognizeSimultaneouslyWithGestureRecognizer$(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldRequireFailureOfGestureRecognizer:(UIGestureRecognizer *)otherGestureRecognizer NS_AVAILABLE_IOS(7_0);", selector = "gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean gestureRecognizer$shouldRequireFailureOfGestureRecognizer$(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldBeRequiredToFailByGestureRecognizer:(UIGestureRecognizer *)otherGestureRecognizer NS_AVAILABLE_IOS(7_0);", selector = "gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean gestureRecognizer$shouldBeRequiredToFailByGestureRecognizer$(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldReceiveTouch:(UITouch *)touch;", selector = "gestureRecognizer:shouldReceiveTouch:")
    public native boolean gestureRecognizer$shouldReceiveTouch$(UIGestureRecognizer gestureRecognizer, UITouch touch);
}
