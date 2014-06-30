package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITextView extends UIScrollView implements UITextInput {
    
    public UITextView() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UITextViewDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITextViewDelegate v);
    @ObjCProperty public UITextViewDelegate delegate;

    @ObjCPropertyGetter(selector = "text")
    public native NSString getText();
    @ObjCPropertySetter(selector = "setText:")
    public native void setText(NSString v);
    @ObjCProperty public NSString text;

    @ObjCPropertyGetter(selector = "font")
    public native UIFont getFont();
    @ObjCPropertySetter(selector = "setFont:")
    public native void setFont(UIFont v);
    @ObjCProperty public UIFont font;

    @ObjCPropertyGetter(selector = "textColor")
    public native UIColor getTextColor();
    @ObjCPropertySetter(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
    @ObjCProperty public UIColor textColor;

    @ObjCPropertyGetter(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    @ObjCPropertySetter(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @ObjCProperty public NSTextAlignment textAlignment;

    @ObjCPropertyGetter(selector = "selectedRange")
    public native @ObjCByValue NSRange getSelectedRange();
    @ObjCPropertySetter(selector = "setSelectedRange:")
    public native void setSelectedRange(@ObjCByValue NSRange v);
    @ObjCProperty public @ObjCByValue NSRange selectedRange;

    @ObjCPropertyGetter(selector = "isEditable")
    public native boolean isEditable();
    @ObjCPropertySetter(selector = "setEditable:")
    public native void setEditable(boolean v);
    @ObjCProperty public boolean editable;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "isSelectable")
    public native boolean isSelectable();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setSelectable:")
    public native void setSelectable(boolean v);
    @ObjCProperty public boolean selectable;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "dataDetectorTypes")
    public native UIDataDetectorTypes getDataDetectorTypes();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setDataDetectorTypes:")
    public native void setDataDetectorTypes(UIDataDetectorTypes v);
    @ObjCProperty public UIDataDetectorTypes dataDetectorTypes;

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
    @ObjCPropertyGetter(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @ObjCProperty public NSAttributedString attributedText;

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

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "textContainer")
    public native NSTextContainer getTextContainer();
    @ObjCProperty public NSTextContainer textContainer;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "textContainerInset")
    public native @ObjCByValue UIEdgeInsets getTextContainerInset();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setTextContainerInset:")
    public native void setTextContainerInset(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets textContainerInset;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "layoutManager")
    public native NSLayoutManager getLayoutManager();
    @ObjCProperty public NSLayoutManager layoutManager;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "textStorage")
    public native NSTextStorage getTextStorage();
    @ObjCProperty public NSTextStorage textStorage;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "linkTextAttributes")
    public native NSDictionary getLinkTextAttributes();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setLinkTextAttributes:")
    public native void setLinkTextAttributes(NSDictionary v);
    @ObjCProperty public NSDictionary linkTextAttributes;

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
    
    @ObjCMethodSign(sign = "- (void)scrollRangeToVisible:(NSRange)range;", selector = "scrollRangeToVisible:")
    public native void scrollRangeToVisible$(@ObjCByValue NSRange range);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (instancetype)initWithFrame:(CGRect)frame textContainer:(NSTextContainer *)textContainer NS_AVAILABLE_IOS(7_0);", selector = "initWithFrame:textContainer:")
    public native UITextView initWithFrame$textContainer$(@ObjCByValue CGRect frame, NSTextContainer textContainer);

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
