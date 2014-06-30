package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface NSLayoutManagerDelegate 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)layoutManager:(NSLayoutManager *)layoutManager shouldGenerateGlyphs:(const CGGlyph *)glyphs properties:(const NSGlyphProperty *)props characterIndexes:(const NSUInteger *)charIndexes font:(UIFont *)aFont forGlyphRange:(NSRange)glyphRange NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:shouldGenerateGlyphs:properties:characterIndexes:font:forGlyphRange:")
    @NSUInteger long layoutManager$shouldGenerateGlyphs$properties$characterIndexes$font$forGlyphRange$(NSLayoutManager layoutManager, @Unsigned short[] glyphs, @NSInteger long[] props, @NSUInteger long[] charIndexes, UIFont aFont, @ObjCByValue NSRange glyphRange);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)layoutManager:(NSLayoutManager *)layoutManager lineSpacingAfterGlyphAtIndex:(NSUInteger)glyphIndex withProposedLineFragmentRect:(CGRect)rect NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    float layoutManager$lineSpacingAfterGlyphAtIndex$withProposedLineFragmentRect$(NSLayoutManager layoutManager, @NSUInteger long glyphIndex, @ObjCByValue CGRect rect);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)layoutManager:(NSLayoutManager *)layoutManager paragraphSpacingBeforeGlyphAtIndex:(NSUInteger)glyphIndex withProposedLineFragmentRect:(CGRect)rect NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:")
    float layoutManager$paragraphSpacingBeforeGlyphAtIndex$withProposedLineFragmentRect$(NSLayoutManager layoutManager, @NSUInteger long glyphIndex, @ObjCByValue CGRect rect);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)layoutManager:(NSLayoutManager *)layoutManager paragraphSpacingAfterGlyphAtIndex:(NSUInteger)glyphIndex withProposedLineFragmentRect:(CGRect)rect NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:")
    float layoutManager$paragraphSpacingAfterGlyphAtIndex$withProposedLineFragmentRect$(NSLayoutManager layoutManager, @NSUInteger long glyphIndex, @ObjCByValue CGRect rect);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSControlCharacterAction)layoutManager:(NSLayoutManager *)layoutManager shouldUseAction:(NSControlCharacterAction)action forControlCharacterAtIndex:(NSUInteger)charIndex NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:shouldUseAction:forControlCharacterAtIndex:")
    NSControlCharacterAction layoutManager$shouldUseAction$forControlCharacterAtIndex$(NSLayoutManager layoutManager, NSControlCharacterAction action, @NSUInteger long charIndex);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)layoutManager:(NSLayoutManager *)layoutManager shouldBreakLineByWordBeforeCharacterAtIndex:(NSUInteger)charIndex NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:shouldBreakLineByWordBeforeCharacterAtIndex:")
    boolean layoutManager$shouldBreakLineByWordBeforeCharacterAtIndex$(NSLayoutManager layoutManager, @NSUInteger long charIndex);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)layoutManager:(NSLayoutManager *)layoutManager shouldBreakLineByHyphenatingBeforeCharacterAtIndex:(NSUInteger)charIndex NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:shouldBreakLineByHyphenatingBeforeCharacterAtIndex:")
    boolean layoutManager$shouldBreakLineByHyphenatingBeforeCharacterAtIndex$(NSLayoutManager layoutManager, @NSUInteger long charIndex);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGRect)layoutManager:(NSLayoutManager *)layoutManager boundingBoxForControlGlyphAtIndex:(NSUInteger)glyphIndex forTextContainer:(NSTextContainer *)textContainer proposedLineFragment:(CGRect)proposedRect glyphPosition:(CGPoint)glyphPosition characterIndex:(NSUInteger)charIndex NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    @ObjCByValue CGRect layoutManager$boundingBoxForControlGlyphAtIndex$forTextContainer$proposedLineFragment$glyphPosition$characterIndex$(NSLayoutManager layoutManager, @NSUInteger long glyphIndex, NSTextContainer textContainer, @ObjCByValue CGRect proposedRect, @ObjCByValue CGPoint glyphPosition, @NSUInteger long charIndex);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)layoutManagerDidInvalidateLayout:(NSLayoutManager *)sender NS_AVAILABLE_IOS(7_0);", selector = "layoutManagerDidInvalidateLayout:")
    void layoutManagerDidInvalidateLayout$(NSLayoutManager sender);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)layoutManager:(NSLayoutManager *)layoutManager didCompleteLayoutForTextContainer:(NSTextContainer *)textContainer atEnd:(BOOL)layoutFinishedFlag NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:didCompleteLayoutForTextContainer:atEnd:")
    void layoutManager$didCompleteLayoutForTextContainer$atEnd$(NSLayoutManager layoutManager, NSTextContainer textContainer, boolean layoutFinishedFlag);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)layoutManager:(NSLayoutManager *)layoutManager textContainer:(NSTextContainer *)textContainer didChangeGeometryFromSize:(CGSize)oldSize NS_AVAILABLE_IOS(7_0);", selector = "layoutManager:textContainer:didChangeGeometryFromSize:")
    void layoutManager$textContainer$didChangeGeometryFromSize$(NSLayoutManager layoutManager, NSTextContainer textContainer, @ObjCByValue CGSize oldSize);
}
