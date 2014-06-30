package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITextViewDelegate 
    extends NSObjectProtocol, UIScrollViewDelegate {

    
    
    @ObjCMethodSign(sign = "- (BOOL)textViewShouldBeginEditing:(UITextView *)textView;", selector = "textViewShouldBeginEditing:")
    boolean textViewShouldBeginEditing$(UITextView textView);

    @ObjCMethodSign(sign = "- (BOOL)textViewShouldEndEditing:(UITextView *)textView;", selector = "textViewShouldEndEditing:")
    boolean textViewShouldEndEditing$(UITextView textView);

    @ObjCMethodSign(sign = "- (void)textViewDidBeginEditing:(UITextView *)textView;", selector = "textViewDidBeginEditing:")
    void textViewDidBeginEditing$(UITextView textView);

    @ObjCMethodSign(sign = "- (void)textViewDidEndEditing:(UITextView *)textView;", selector = "textViewDidEndEditing:")
    void textViewDidEndEditing$(UITextView textView);

    @ObjCMethodSign(sign = "- (BOOL)textView:(UITextView *)textView shouldChangeTextInRange:(NSRange)range replacementText:(NSString *)text;", selector = "textView:shouldChangeTextInRange:replacementText:")
    boolean textView$shouldChangeTextInRange$replacementText$(UITextView textView, @ObjCByValue NSRange range, NSString text);

    @ObjCMethodSign(sign = "- (void)textViewDidChange:(UITextView *)textView;", selector = "textViewDidChange:")
    void textViewDidChange$(UITextView textView);

    @ObjCMethodSign(sign = "- (void)textViewDidChangeSelection:(UITextView *)textView;", selector = "textViewDidChangeSelection:")
    void textViewDidChangeSelection$(UITextView textView);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)textView:(UITextView *)textView shouldInteractWithURL:(NSURL *)URL inRange:(NSRange)characterRange NS_AVAILABLE_IOS(7_0);", selector = "textView:shouldInteractWithURL:inRange:")
    boolean textView$shouldInteractWithURL$inRange$(UITextView textView, NSURL URL, @ObjCByValue NSRange characterRange);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)textView:(UITextView *)textView shouldInteractWithTextAttachment:(NSTextAttachment *)textAttachment inRange:(NSRange)characterRange NS_AVAILABLE_IOS(7_0);", selector = "textView:shouldInteractWithTextAttachment:inRange:")
    boolean textView$shouldInteractWithTextAttachment$inRange$(UITextView textView, NSTextAttachment textAttachment, @ObjCByValue NSRange characterRange);
}
