package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITextInput 
    extends UIKeyInput {

    
    @ObjCPropertyGetter(selector = "selectedTextRange")
    UITextRange getSelectedTextRange();
    @ObjCPropertySetter(selector = "setSelectedTextRange:")
    void setSelectedTextRange(UITextRange v);
    @ObjCPropertyGetter(selector = "markedTextRange")
    UITextRange getMarkedTextRange();
    @ObjCPropertyGetter(selector = "markedTextStyle")
    NSDictionary getMarkedTextStyle();
    @ObjCPropertySetter(selector = "setMarkedTextStyle:")
    void setMarkedTextStyle(NSDictionary v);
    @ObjCPropertyGetter(selector = "beginningOfDocument")
    UITextPosition getBeginningOfDocument();
    @ObjCPropertyGetter(selector = "endOfDocument")
    UITextPosition getEndOfDocument();
    @ObjCPropertyGetter(selector = "inputDelegate")
    UITextInputDelegate getInputDelegate();
    @ObjCPropertySetter(selector = "setInputDelegate:", strongRef = true)
    void setInputDelegate(UITextInputDelegate v);
    @ObjCPropertyGetter(selector = "tokenizer")
    UITextInputTokenizer getTokenizer();
    @ObjCPropertyGetter(selector = "textInputView")
    UIView getTextInputView();
    @ObjCPropertyGetter(selector = "selectionAffinity")
    UITextStorageDirection getSelectionAffinity();
    @ObjCPropertySetter(selector = "setSelectionAffinity:")
    void setSelectionAffinity(UITextStorageDirection v);
    @ObjCMethodSign(sign = "- (NSString *)textInRange:(UITextRange *)range;", selector = "textInRange:")
    NSString textInRange$(UITextRange range);

    @ObjCMethodSign(sign = "- (void)replaceRange:(UITextRange *)range withText:(NSString *)text;", selector = "replaceRange:withText:")
    void replaceRange$withText$(UITextRange range, NSString text);

    @ObjCMethodSign(sign = "- (void)setMarkedText:(NSString *)markedText selectedRange:(NSRange)selectedRange;", selector = "setMarkedText:selectedRange:")
    void setMarkedText$selectedRange$(NSString markedText, @ObjCByValue NSRange selectedRange);

    @ObjCMethodSign(sign = "- (void)unmarkText;", selector = "unmarkText")
    void unmarkText();

    @ObjCMethodSign(sign = "- (UITextRange *)textRangeFromPosition:(UITextPosition *)fromPosition toPosition:(UITextPosition *)toPosition;", selector = "textRangeFromPosition:toPosition:")
    UITextRange textRangeFromPosition$toPosition$(UITextPosition fromPosition, UITextPosition toPosition);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionFromPosition:(UITextPosition *)position offset:(NSInteger)offset;", selector = "positionFromPosition:offset:")
    UITextPosition positionFromPosition$offset$(UITextPosition position, @NSInteger long offset);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionFromPosition:(UITextPosition *)position inDirection:(UITextLayoutDirection)direction offset:(NSInteger)offset;", selector = "positionFromPosition:inDirection:offset:")
    UITextPosition positionFromPosition$inDirection$offset$(UITextPosition position, UITextLayoutDirection direction, @NSInteger long offset);

    @ObjCMethodSign(sign = "- (NSComparisonResult)comparePosition:(UITextPosition *)position toPosition:(UITextPosition *)other;", selector = "comparePosition:toPosition:")
    NSComparisonResult comparePosition$toPosition$(UITextPosition position, UITextPosition other);

    @ObjCMethodSign(sign = "- (NSInteger)offsetFromPosition:(UITextPosition *)from toPosition:(UITextPosition *)toPosition;", selector = "offsetFromPosition:toPosition:")
    @NSInteger long offsetFromPosition$toPosition$(UITextPosition from, UITextPosition toPosition);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionWithinRange:(UITextRange *)range farthestInDirection:(UITextLayoutDirection)direction;", selector = "positionWithinRange:farthestInDirection:")
    UITextPosition positionWithinRange$farthestInDirection$(UITextRange range, UITextLayoutDirection direction);

    @ObjCMethodSign(sign = "- (UITextRange *)characterRangeByExtendingPosition:(UITextPosition *)position inDirection:(UITextLayoutDirection)direction;", selector = "characterRangeByExtendingPosition:inDirection:")
    UITextRange characterRangeByExtendingPosition$inDirection$(UITextPosition position, UITextLayoutDirection direction);

    @ObjCMethodSign(sign = "- (UITextWritingDirection)baseWritingDirectionForPosition:(UITextPosition *)position inDirection:(UITextStorageDirection)direction;", selector = "baseWritingDirectionForPosition:inDirection:")
    UITextWritingDirection baseWritingDirectionForPosition$inDirection$(UITextPosition position, UITextStorageDirection direction);

    @ObjCMethodSign(sign = "- (void)setBaseWritingDirection:(UITextWritingDirection)writingDirection forRange:(UITextRange *)range;", selector = "setBaseWritingDirection:forRange:")
    void setBaseWritingDirection$forRange$(UITextWritingDirection writingDirection, UITextRange range);

    @ObjCMethodSign(sign = "- (CGRect)firstRectForRange:(UITextRange *)range;", selector = "firstRectForRange:")
    @ObjCByValue CGRect firstRectForRange$(UITextRange range);

    @ObjCMethodSign(sign = "- (CGRect)caretRectForPosition:(UITextPosition *)position;", selector = "caretRectForPosition:")
    @ObjCByValue CGRect caretRectForPosition$(UITextPosition position);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)selectionRectsForRange:(UITextRange *)range NS_AVAILABLE_IOS(6_0);", selector = "selectionRectsForRange:")
    NSArray selectionRectsForRange$(UITextRange range);

    @ObjCMethodSign(sign = "- (UITextPosition *)closestPositionToPoint:(CGPoint)point;", selector = "closestPositionToPoint:")
    UITextPosition closestPositionToPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (UITextPosition *)closestPositionToPoint:(CGPoint)point withinRange:(UITextRange *)range;", selector = "closestPositionToPoint:withinRange:")
    UITextPosition closestPositionToPoint$withinRange$(@ObjCByValue CGPoint point, UITextRange range);

    @ObjCMethodSign(sign = "- (UITextRange *)characterRangeAtPoint:(CGPoint)point;", selector = "characterRangeAtPoint:")
    UITextRange characterRangeAtPoint$(@ObjCByValue CGPoint point);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)shouldChangeTextInRange:(UITextRange *)range replacementText:(NSString *)text NS_AVAILABLE_IOS(6_0);", selector = "shouldChangeTextInRange:replacementText:")
    boolean shouldChangeTextInRange$replacementText$(UITextRange range, NSString text);

    @ObjCMethodSign(sign = "- (NSDictionary *)textStylingAtPosition:(UITextPosition *)position inDirection:(UITextStorageDirection)direction;", selector = "textStylingAtPosition:inDirection:")
    NSDictionary textStylingAtPosition$inDirection$(UITextPosition position, UITextStorageDirection direction);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionWithinRange:(UITextRange *)range atCharacterOffset:(NSInteger)offset;", selector = "positionWithinRange:atCharacterOffset:")
    UITextPosition positionWithinRange$atCharacterOffset$(UITextRange range, @NSInteger long offset);

    @ObjCMethodSign(sign = "- (NSInteger)characterOffsetOfPosition:(UITextPosition *)position withinRange:(UITextRange *)range;", selector = "characterOffsetOfPosition:withinRange:")
    @NSInteger long characterOffsetOfPosition$withinRange$(UITextPosition position, UITextRange range);

    @ObjCMethodSign(sign = "- (void)insertDictationResult:(NSArray *)dictationResult;", selector = "insertDictationResult:")
    void insertDictationResult$(NSArray dictationResult);

    @ObjCMethodSign(sign = "- (void)dictationRecordingDidEnd;", selector = "dictationRecordingDidEnd")
    void dictationRecordingDidEnd();

    @ObjCMethodSign(sign = "- (void)dictationRecognitionFailed;", selector = "dictationRecognitionFailed")
    void dictationRecognitionFailed();

    @ObjCMethodSign(sign = "- (id)insertDictationResultPlaceholder;", selector = "insertDictationResultPlaceholder")
    NSObject insertDictationResultPlaceholder();

    @ObjCMethodSign(sign = "- (CGRect)frameForDictationResultPlaceholder:(id)placeholder;", selector = "frameForDictationResultPlaceholder:")
    @ObjCByValue CGRect frameForDictationResultPlaceholder$(NSObject placeholder);

    @ObjCMethodSign(sign = "- (void)removeDictationResultPlaceholder:(id)placeholder willInsertResult:(BOOL)willInsertResult;", selector = "removeDictationResultPlaceholder:willInsertResult:")
    void removeDictationResultPlaceholder$willInsertResult$(NSObject placeholder, boolean willInsertResult);
}
