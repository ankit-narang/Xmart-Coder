package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITextField extends UIControl implements UITextInput, NSCoding {
    
    public UITextField() {}
    @ObjCPropertyGetter(selector = "text")
    public native NSString getText();
    @ObjCPropertySetter(selector = "setText:")
    public native void setText(NSString v);
    @ObjCProperty public NSString text;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @ObjCProperty public NSAttributedString attributedText;

    @ObjCPropertyGetter(selector = "textColor")
    public native UIColor getTextColor();
    @ObjCPropertySetter(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
    @ObjCProperty public UIColor textColor;

    @ObjCPropertyGetter(selector = "font")
    public native UIFont getFont();
    @ObjCPropertySetter(selector = "setFont:")
    public native void setFont(UIFont v);
    @ObjCProperty public UIFont font;

    @ObjCPropertyGetter(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    @ObjCPropertySetter(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @ObjCProperty public NSTextAlignment textAlignment;

    @ObjCPropertyGetter(selector = "borderStyle")
    public native UITextBorderStyle getBorderStyle();
    @ObjCPropertySetter(selector = "setBorderStyle:")
    public native void setBorderStyle(UITextBorderStyle v);
    @ObjCProperty public UITextBorderStyle borderStyle;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "defaultTextAttributes")
    public native NSDictionary getDefaultTextAttributes();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setDefaultTextAttributes:")
    public native void setDefaultTextAttributes(NSDictionary v);
    @ObjCProperty public NSDictionary defaultTextAttributes;

    @ObjCPropertyGetter(selector = "placeholder")
    public native NSString getPlaceholder();
    @ObjCPropertySetter(selector = "setPlaceholder:")
    public native void setPlaceholder(NSString v);
    @ObjCProperty public NSString placeholder;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "attributedPlaceholder")
    public native NSAttributedString getAttributedPlaceholder();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setAttributedPlaceholder:")
    public native void setAttributedPlaceholder(NSAttributedString v);
    @ObjCProperty public NSAttributedString attributedPlaceholder;

    @ObjCPropertyGetter(selector = "clearsOnBeginEditing")
    public native boolean isClearsOnBeginEditing();
    @ObjCPropertySetter(selector = "setClearsOnBeginEditing:")
    public native void setClearsOnBeginEditing(boolean v);
    @ObjCProperty public boolean clearsOnBeginEditing;

    @ObjCPropertyGetter(selector = "adjustsFontSizeToFitWidth")
    public native boolean isAdjustsFontSizeToFitWidth();
    @ObjCPropertySetter(selector = "setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean v);
    @ObjCProperty public boolean adjustsFontSizeToFitWidth;

    @ObjCPropertyGetter(selector = "minimumFontSize")
    public native float getMinimumFontSize();
    @ObjCPropertySetter(selector = "setMinimumFontSize:")
    public native void setMinimumFontSize(float v);
    @ObjCProperty public float minimumFontSize;

    @ObjCPropertyGetter(selector = "delegate")
    public native UITextFieldDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITextFieldDelegate v);
    @ObjCProperty public UITextFieldDelegate delegate;

    @ObjCPropertyGetter(selector = "background")
    public native UIImage getBackground();
    @ObjCPropertySetter(selector = "setBackground:")
    public native void setBackground(UIImage v);
    @ObjCProperty public UIImage background;

    @ObjCPropertyGetter(selector = "disabledBackground")
    public native UIImage getDisabledBackground();
    @ObjCPropertySetter(selector = "setDisabledBackground:")
    public native void setDisabledBackground(UIImage v);
    @ObjCProperty public UIImage disabledBackground;

    @ObjCPropertyGetter(selector = "isEditing")
    public native boolean isEditing();
    @ObjCProperty public boolean editing;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "allowsEditingTextAttributes")
    public native boolean isAllowsEditingTextAttributes();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setAllowsEditingTextAttributes:")
    public native void setAllowsEditingTextAttributes(boolean v);
    @ObjCProperty public boolean allowsEditingTextAttributes;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "typingAttributes")
    public native NSDictionary getTypingAttributes();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setTypingAttributes:")
    public native void setTypingAttributes(NSDictionary v);
    @ObjCProperty public NSDictionary typingAttributes;

    @ObjCPropertyGetter(selector = "clearButtonMode")
    public native UITextFieldViewMode getClearButtonMode();
    @ObjCPropertySetter(selector = "setClearButtonMode:")
    public native void setClearButtonMode(UITextFieldViewMode v);
    @ObjCProperty public UITextFieldViewMode clearButtonMode;

    @ObjCPropertyGetter(selector = "leftView")
    public native UIView getLeftView();
    @ObjCPropertySetter(selector = "setLeftView:")
    public native void setLeftView(UIView v);
    @ObjCProperty public UIView leftView;

    @ObjCPropertyGetter(selector = "leftViewMode")
    public native UITextFieldViewMode getLeftViewMode();
    @ObjCPropertySetter(selector = "setLeftViewMode:")
    public native void setLeftViewMode(UITextFieldViewMode v);
    @ObjCProperty public UITextFieldViewMode leftViewMode;

    @ObjCPropertyGetter(selector = "rightView")
    public native UIView getRightView();
    @ObjCPropertySetter(selector = "setRightView:")
    public native void setRightView(UIView v);
    @ObjCProperty public UIView rightView;

    @ObjCPropertyGetter(selector = "rightViewMode")
    public native UITextFieldViewMode getRightViewMode();
    @ObjCPropertySetter(selector = "setRightViewMode:")
    public native void setRightViewMode(UITextFieldViewMode v);
    @ObjCProperty public UITextFieldViewMode rightViewMode;

    @ObjCPropertyGetter(selector = "inputView")
    public native UIView getInputView();
    @ObjCPropertySetter(selector = "setInputView:")
    public native void setInputView(UIView v);
    @ObjCProperty public UIView inputView;

    @ObjCPropertyGetter(selector = "inputAccessoryView")
    public native UIView getInputAccessoryView();
    @ObjCPropertySetter(selector = "setInputAccessoryView:")
    public native void setInputAccessoryView(UIView v);
    @ObjCProperty public UIView inputAccessoryView;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "clearsOnInsertion")
    public native boolean isClearsOnInsertion();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setClearsOnInsertion:")
    public native void setClearsOnInsertion(boolean v);
    @ObjCProperty public boolean clearsOnInsertion;

    @ObjCPropertyGetter(selector = "selectedTextRange")
    public native UITextRange getSelectedTextRange();
    @ObjCPropertySetter(selector = "setSelectedTextRange:")
    public native void setSelectedTextRange(UITextRange v);
    @ObjCProperty public UITextRange selectedTextRange;

    @ObjCPropertyGetter(selector = "markedTextRange")
    public native UITextRange getMarkedTextRange();
    @ObjCProperty public UITextRange markedTextRange;

    @ObjCPropertyGetter(selector = "markedTextStyle")
    public native NSDictionary getMarkedTextStyle();
    @ObjCPropertySetter(selector = "setMarkedTextStyle:")
    public native void setMarkedTextStyle(NSDictionary v);
    @ObjCProperty public NSDictionary markedTextStyle;

    @ObjCPropertyGetter(selector = "beginningOfDocument")
    public native UITextPosition getBeginningOfDocument();
    @ObjCProperty public UITextPosition beginningOfDocument;

    @ObjCPropertyGetter(selector = "endOfDocument")
    public native UITextPosition getEndOfDocument();
    @ObjCProperty public UITextPosition endOfDocument;

    @ObjCPropertyGetter(selector = "inputDelegate")
    public native UITextInputDelegate getInputDelegate();
    @ObjCPropertySetter(selector = "setInputDelegate:", strongRef = true)
    public native void setInputDelegate(UITextInputDelegate v);
    @ObjCProperty public UITextInputDelegate inputDelegate;

    @ObjCPropertyGetter(selector = "tokenizer")
    public native UITextInputTokenizer getTokenizer();
    @ObjCProperty public UITextInputTokenizer tokenizer;

    @ObjCPropertyGetter(selector = "textInputView")
    public native UIView getTextInputView();
    @ObjCProperty public UIView textInputView;

    @ObjCPropertyGetter(selector = "selectionAffinity")
    public native UITextStorageDirection getSelectionAffinity();
    @ObjCPropertySetter(selector = "setSelectionAffinity:")
    public native void setSelectionAffinity(UITextStorageDirection v);
    @ObjCProperty public UITextStorageDirection selectionAffinity;

    @ObjCPropertyGetter(selector = "autocapitalizationType")
    public native UITextAutocapitalizationType getAutocapitalizationType();
    @ObjCPropertySetter(selector = "setAutocapitalizationType:")
    public native void setAutocapitalizationType(UITextAutocapitalizationType v);
    @ObjCProperty public UITextAutocapitalizationType autocapitalizationType;

    @ObjCPropertyGetter(selector = "autocorrectionType")
    public native UITextAutocorrectionType getAutocorrectionType();
    @ObjCPropertySetter(selector = "setAutocorrectionType:")
    public native void setAutocorrectionType(UITextAutocorrectionType v);
    @ObjCProperty public UITextAutocorrectionType autocorrectionType;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "spellCheckingType")
    public native UITextSpellCheckingType getSpellCheckingType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setSpellCheckingType:")
    public native void setSpellCheckingType(UITextSpellCheckingType v);
    @ObjCProperty public UITextSpellCheckingType spellCheckingType;

    @ObjCPropertyGetter(selector = "keyboardType")
    public native UIKeyboardType getKeyboardType();
    @ObjCPropertySetter(selector = "setKeyboardType:")
    public native void setKeyboardType(UIKeyboardType v);
    @ObjCProperty public UIKeyboardType keyboardType;

    @ObjCPropertyGetter(selector = "keyboardAppearance")
    public native UIKeyboardAppearance getKeyboardAppearance();
    @ObjCPropertySetter(selector = "setKeyboardAppearance:")
    public native void setKeyboardAppearance(UIKeyboardAppearance v);
    @ObjCProperty public UIKeyboardAppearance keyboardAppearance;

    @ObjCPropertyGetter(selector = "returnKeyType")
    public native UIReturnKeyType getReturnKeyType();
    @ObjCPropertySetter(selector = "setReturnKeyType:")
    public native void setReturnKeyType(UIReturnKeyType v);
    @ObjCProperty public UIReturnKeyType returnKeyType;

    @ObjCPropertyGetter(selector = "enablesReturnKeyAutomatically")
    public native boolean isEnablesReturnKeyAutomatically();
    @ObjCPropertySetter(selector = "setEnablesReturnKeyAutomatically:")
    public native void setEnablesReturnKeyAutomatically(boolean v);
    @ObjCProperty public boolean enablesReturnKeyAutomatically;

    @ObjCPropertyGetter(selector = "isSecureTextEntry")
    public native boolean isSecureTextEntry();
    @ObjCPropertySetter(selector = "setSecureTextEntry:")
    public native void setSecureTextEntry(boolean v);
    @ObjCProperty public boolean secureTextEntry;
    
    @ObjCMethodSign(sign = "- (CGRect)borderRectForBounds:(CGRect)bounds;", selector = "borderRectForBounds:")
    public native @ObjCByValue CGRect borderRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)textRectForBounds:(CGRect)bounds;", selector = "textRectForBounds:")
    public native @ObjCByValue CGRect textRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)placeholderRectForBounds:(CGRect)bounds;", selector = "placeholderRectForBounds:")
    public native @ObjCByValue CGRect placeholderRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)editingRectForBounds:(CGRect)bounds;", selector = "editingRectForBounds:")
    public native @ObjCByValue CGRect editingRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)clearButtonRectForBounds:(CGRect)bounds;", selector = "clearButtonRectForBounds:")
    public native @ObjCByValue CGRect clearButtonRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)leftViewRectForBounds:(CGRect)bounds;", selector = "leftViewRectForBounds:")
    public native @ObjCByValue CGRect leftViewRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)rightViewRectForBounds:(CGRect)bounds;", selector = "rightViewRectForBounds:")
    public native @ObjCByValue CGRect rightViewRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (void)drawTextInRect:(CGRect)rect;", selector = "drawTextInRect:")
    public native void drawTextInRect$(@ObjCByValue CGRect rect);

    @ObjCMethodSign(sign = "- (void)drawPlaceholderInRect:(CGRect)rect;", selector = "drawPlaceholderInRect:")
    public native void drawPlaceholderInRect$(@ObjCByValue CGRect rect);

    @ObjCMethodSign(sign = "- (NSString *)textInRange:(UITextRange *)range;", selector = "textInRange:")
    public native NSString textInRange$(UITextRange range);

    @ObjCMethodSign(sign = "- (void)replaceRange:(UITextRange *)range withText:(NSString *)text;", selector = "replaceRange:withText:")
    public native void replaceRange$withText$(UITextRange range, NSString text);

    @ObjCMethodSign(sign = "- (void)setMarkedText:(NSString *)markedText selectedRange:(NSRange)selectedRange;", selector = "setMarkedText:selectedRange:")
    public native void setMarkedText$selectedRange$(NSString markedText, @ObjCByValue NSRange selectedRange);

    @ObjCMethodSign(sign = "- (void)unmarkText;", selector = "unmarkText")
    public native void unmarkText();

    @ObjCMethodSign(sign = "- (UITextRange *)textRangeFromPosition:(UITextPosition *)fromPosition toPosition:(UITextPosition *)toPosition;", selector = "textRangeFromPosition:toPosition:")
    public native UITextRange textRangeFromPosition$toPosition$(UITextPosition fromPosition, UITextPosition toPosition);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionFromPosition:(UITextPosition *)position offset:(NSInteger)offset;", selector = "positionFromPosition:offset:")
    public native UITextPosition positionFromPosition$offset$(UITextPosition position, @NSInteger long offset);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionFromPosition:(UITextPosition *)position inDirection:(UITextLayoutDirection)direction offset:(NSInteger)offset;", selector = "positionFromPosition:inDirection:offset:")
    public native UITextPosition positionFromPosition$inDirection$offset$(UITextPosition position, UITextLayoutDirection direction, @NSInteger long offset);

    @ObjCMethodSign(sign = "- (NSComparisonResult)comparePosition:(UITextPosition *)position toPosition:(UITextPosition *)other;", selector = "comparePosition:toPosition:")
    public native NSComparisonResult comparePosition$toPosition$(UITextPosition position, UITextPosition other);

    @ObjCMethodSign(sign = "- (NSInteger)offsetFromPosition:(UITextPosition *)from toPosition:(UITextPosition *)toPosition;", selector = "offsetFromPosition:toPosition:")
    public native @NSInteger long offsetFromPosition$toPosition$(UITextPosition from, UITextPosition toPosition);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionWithinRange:(UITextRange *)range farthestInDirection:(UITextLayoutDirection)direction;", selector = "positionWithinRange:farthestInDirection:")
    public native UITextPosition positionWithinRange$farthestInDirection$(UITextRange range, UITextLayoutDirection direction);

    @ObjCMethodSign(sign = "- (UITextRange *)characterRangeByExtendingPosition:(UITextPosition *)position inDirection:(UITextLayoutDirection)direction;", selector = "characterRangeByExtendingPosition:inDirection:")
    public native UITextRange characterRangeByExtendingPosition$inDirection$(UITextPosition position, UITextLayoutDirection direction);

    @ObjCMethodSign(sign = "- (UITextWritingDirection)baseWritingDirectionForPosition:(UITextPosition *)position inDirection:(UITextStorageDirection)direction;", selector = "baseWritingDirectionForPosition:inDirection:")
    public native UITextWritingDirection baseWritingDirectionForPosition$inDirection$(UITextPosition position, UITextStorageDirection direction);

    @ObjCMethodSign(sign = "- (void)setBaseWritingDirection:(UITextWritingDirection)writingDirection forRange:(UITextRange *)range;", selector = "setBaseWritingDirection:forRange:")
    public native void setBaseWritingDirection$forRange$(UITextWritingDirection writingDirection, UITextRange range);

    @ObjCMethodSign(sign = "- (CGRect)firstRectForRange:(UITextRange *)range;", selector = "firstRectForRange:")
    public native @ObjCByValue CGRect firstRectForRange$(UITextRange range);

    @ObjCMethodSign(sign = "- (CGRect)caretRectForPosition:(UITextPosition *)position;", selector = "caretRectForPosition:")
    public native @ObjCByValue CGRect caretRectForPosition$(UITextPosition position);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)selectionRectsForRange:(UITextRange *)range NS_AVAILABLE_IOS(6_0);", selector = "selectionRectsForRange:")
    public native NSArray selectionRectsForRange$(UITextRange range);

    @ObjCMethodSign(sign = "- (UITextPosition *)closestPositionToPoint:(CGPoint)point;", selector = "closestPositionToPoint:")
    public native UITextPosition closestPositionToPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (UITextPosition *)closestPositionToPoint:(CGPoint)point withinRange:(UITextRange *)range;", selector = "closestPositionToPoint:withinRange:")
    public native UITextPosition closestPositionToPoint$withinRange$(@ObjCByValue CGPoint point, UITextRange range);

    @ObjCMethodSign(sign = "- (UITextRange *)characterRangeAtPoint:(CGPoint)point;", selector = "characterRangeAtPoint:")
    public native UITextRange characterRangeAtPoint$(@ObjCByValue CGPoint point);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)shouldChangeTextInRange:(UITextRange *)range replacementText:(NSString *)text NS_AVAILABLE_IOS(6_0);", selector = "shouldChangeTextInRange:replacementText:")
    public native boolean shouldChangeTextInRange$replacementText$(UITextRange range, NSString text);

    @ObjCMethodSign(sign = "- (NSDictionary *)textStylingAtPosition:(UITextPosition *)position inDirection:(UITextStorageDirection)direction;", selector = "textStylingAtPosition:inDirection:")
    public native NSDictionary textStylingAtPosition$inDirection$(UITextPosition position, UITextStorageDirection direction);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionWithinRange:(UITextRange *)range atCharacterOffset:(NSInteger)offset;", selector = "positionWithinRange:atCharacterOffset:")
    public native UITextPosition positionWithinRange$atCharacterOffset$(UITextRange range, @NSInteger long offset);

    @ObjCMethodSign(sign = "- (NSInteger)characterOffsetOfPosition:(UITextPosition *)position withinRange:(UITextRange *)range;", selector = "characterOffsetOfPosition:withinRange:")
    public native @NSInteger long characterOffsetOfPosition$withinRange$(UITextPosition position, UITextRange range);

    @ObjCMethodSign(sign = "- (void)insertDictationResult:(NSArray *)dictationResult;", selector = "insertDictationResult:")
    public native void insertDictationResult$(NSArray dictationResult);

    @ObjCMethodSign(sign = "- (void)dictationRecordingDidEnd;", selector = "dictationRecordingDidEnd")
    public native void dictationRecordingDidEnd();

    @ObjCMethodSign(sign = "- (void)dictationRecognitionFailed;", selector = "dictationRecognitionFailed")
    public native void dictationRecognitionFailed();

    @ObjCMethodSign(sign = "- (id)insertDictationResultPlaceholder;", selector = "insertDictationResultPlaceholder")
    public native NSObject insertDictationResultPlaceholder();

    @ObjCMethodSign(sign = "- (CGRect)frameForDictationResultPlaceholder:(id)placeholder;", selector = "frameForDictationResultPlaceholder:")
    public native @ObjCByValue CGRect frameForDictationResultPlaceholder$(NSObject placeholder);

    @ObjCMethodSign(sign = "- (void)removeDictationResultPlaceholder:(id)placeholder willInsertResult:(BOOL)willInsertResult;", selector = "removeDictationResultPlaceholder:willInsertResult:")
    public native void removeDictationResultPlaceholder$willInsertResult$(NSObject placeholder, boolean willInsertResult);

    @ObjCMethodSign(sign = "- (BOOL)hasText;", selector = "hasText")
    public native boolean hasText();

    @ObjCMethodSign(sign = "- (void)insertText:(NSString *)text;", selector = "insertText:")
    public native void insertText$(NSString text);

    @ObjCMethodSign(sign = "- (void)deleteBackward;", selector = "deleteBackward")
    public native void deleteBackward();
}
