package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSLayoutManager extends NSObject implements NSCoding {
    
    public NSLayoutManager() {}
    @ObjCPropertyGetter(selector = "textStorage")
    public native NSTextStorage getTextStorage();
    @ObjCPropertySetter(selector = "setTextStorage:", strongRef = true)
    public native void setTextStorage(NSTextStorage v);
    @ObjCProperty public NSTextStorage textStorage;

    @ObjCPropertyGetter(selector = "textContainers")
    public native NSArray getTextContainers();
    @ObjCProperty public NSArray textContainers;

    @ObjCPropertyGetter(selector = "delegate")
    public native NSLayoutManagerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSLayoutManagerDelegate v);
    @ObjCProperty public NSLayoutManagerDelegate delegate;

    @ObjCPropertyGetter(selector = "showsInvisibleCharacters")
    public native boolean isShowsInvisibleCharacters();
    @ObjCPropertySetter(selector = "setShowsInvisibleCharacters:")
    public native void setShowsInvisibleCharacters(boolean v);
    @ObjCProperty public boolean showsInvisibleCharacters;

    @ObjCPropertyGetter(selector = "showsControlCharacters")
    public native boolean isShowsControlCharacters();
    @ObjCPropertySetter(selector = "setShowsControlCharacters:")
    public native void setShowsControlCharacters(boolean v);
    @ObjCProperty public boolean showsControlCharacters;

    @ObjCPropertyGetter(selector = "hyphenationFactor")
    public native float getHyphenationFactor();
    @ObjCPropertySetter(selector = "setHyphenationFactor:")
    public native void setHyphenationFactor(float v);
    @ObjCProperty public float hyphenationFactor;

    @ObjCPropertyGetter(selector = "usesFontLeading")
    public native boolean isUsesFontLeading();
    @ObjCPropertySetter(selector = "setUsesFontLeading:")
    public native void setUsesFontLeading(boolean v);
    @ObjCProperty public boolean usesFontLeading;

    @ObjCPropertyGetter(selector = "allowsNonContiguousLayout")
    public native boolean isAllowsNonContiguousLayout();
    @ObjCPropertySetter(selector = "setAllowsNonContiguousLayout:")
    public native void setAllowsNonContiguousLayout(boolean v);
    @ObjCProperty public boolean allowsNonContiguousLayout;

    @ObjCPropertyGetter(selector = "hasNonContiguousLayout")
    public native boolean isHasNonContiguousLayout();
    @ObjCProperty public boolean hasNonContiguousLayout;

    @ObjCPropertyGetter(selector = "numberOfGlyphs")
    public native @NSUInteger long getNumberOfGlyphs();
    @ObjCProperty public @NSUInteger long numberOfGlyphs;

    @ObjCPropertyGetter(selector = "extraLineFragmentRect")
    public native @ObjCByValue CGRect getExtraLineFragmentRect();
    @ObjCProperty public @ObjCByValue CGRect extraLineFragmentRect;

    @ObjCPropertyGetter(selector = "extraLineFragmentUsedRect")
    public native @ObjCByValue CGRect getExtraLineFragmentUsedRect();
    @ObjCProperty public @ObjCByValue CGRect extraLineFragmentUsedRect;

    @ObjCPropertyGetter(selector = "extraLineFragmentTextContainer")
    public native NSTextContainer getExtraLineFragmentTextContainer();
    @ObjCProperty public NSTextContainer extraLineFragmentTextContainer;
    
    @ObjCMethodSign(sign = "- (void)addTextContainer:(NSTextContainer *)container;", selector = "addTextContainer:")
    public native void addTextContainer$(NSTextContainer container);

    @ObjCMethodSign(sign = "- (void)insertTextContainer:(NSTextContainer *)container atIndex:(NSUInteger)index;", selector = "insertTextContainer:atIndex:")
    public native void insertTextContainer$atIndex$(NSTextContainer container, @NSUInteger long index);

    @ObjCMethodSign(sign = "- (void)removeTextContainerAtIndex:(NSUInteger)index;", selector = "removeTextContainerAtIndex:")
    public native void removeTextContainerAtIndex$(@NSUInteger long index);

    @ObjCMethodSign(sign = "- (void)textContainerChangedGeometry:(NSTextContainer *)container;", selector = "textContainerChangedGeometry:")
    public native void textContainerChangedGeometry$(NSTextContainer container);

    @ObjCMethodSign(sign = "- (void)invalidateGlyphsForCharacterRange:(NSRange)charRange changeInLength:(NSInteger)delta actualCharacterRange:(NSRangePointer)actualCharRange;", selector = "invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:")
    public native void invalidateGlyphsForCharacterRange$changeInLength$actualCharacterRange$(@ObjCByValue NSRange charRange, @NSInteger long delta, NSRange actualCharRange);

    @ObjCMethodSign(sign = "- (void)invalidateLayoutForCharacterRange:(NSRange)charRange actualCharacterRange:(NSRangePointer)actualCharRange;", selector = "invalidateLayoutForCharacterRange:actualCharacterRange:")
    public native void invalidateLayoutForCharacterRange$actualCharacterRange$(@ObjCByValue NSRange charRange, NSRange actualCharRange);

    @ObjCMethodSign(sign = "- (void)invalidateDisplayForCharacterRange:(NSRange)charRange;", selector = "invalidateDisplayForCharacterRange:")
    public native void invalidateDisplayForCharacterRange$(@ObjCByValue NSRange charRange);

    @ObjCMethodSign(sign = "- (void)invalidateDisplayForGlyphRange:(NSRange)glyphRange;", selector = "invalidateDisplayForGlyphRange:")
    public native void invalidateDisplayForGlyphRange$(@ObjCByValue NSRange glyphRange);

    @ObjCMethodSign(sign = "- (void)processEditingForTextStorage:(NSTextStorage *)textStorage edited:(NSTextStorageEditActions)editMask range:(NSRange)newCharRange changeInLength:(NSInteger)delta invalidatedRange:(NSRange)invalidatedCharRange;", selector = "processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    public native void processEditingForTextStorage$edited$range$changeInLength$invalidatedRange$(NSTextStorage textStorage, NSTextStorageEditActions editMask, @ObjCByValue NSRange newCharRange, @NSInteger long delta, @ObjCByValue NSRange invalidatedCharRange);

    @ObjCMethodSign(sign = "- (void)ensureGlyphsForCharacterRange:(NSRange)charRange;", selector = "ensureGlyphsForCharacterRange:")
    public native void ensureGlyphsForCharacterRange$(@ObjCByValue NSRange charRange);

    @ObjCMethodSign(sign = "- (void)ensureGlyphsForGlyphRange:(NSRange)glyphRange;", selector = "ensureGlyphsForGlyphRange:")
    public native void ensureGlyphsForGlyphRange$(@ObjCByValue NSRange glyphRange);

    @ObjCMethodSign(sign = "- (void)ensureLayoutForCharacterRange:(NSRange)charRange;", selector = "ensureLayoutForCharacterRange:")
    public native void ensureLayoutForCharacterRange$(@ObjCByValue NSRange charRange);

    @ObjCMethodSign(sign = "- (void)ensureLayoutForGlyphRange:(NSRange)glyphRange;", selector = "ensureLayoutForGlyphRange:")
    public native void ensureLayoutForGlyphRange$(@ObjCByValue NSRange glyphRange);

    @ObjCMethodSign(sign = "- (void)ensureLayoutForTextContainer:(NSTextContainer *)container;", selector = "ensureLayoutForTextContainer:")
    public native void ensureLayoutForTextContainer$(NSTextContainer container);

    @ObjCMethodSign(sign = "- (void)ensureLayoutForBoundingRect:(CGRect)bounds inTextContainer:(NSTextContainer *)container;", selector = "ensureLayoutForBoundingRect:inTextContainer:")
    public native void ensureLayoutForBoundingRect$inTextContainer$(@ObjCByValue CGRect bounds, NSTextContainer container);

    @ObjCMethodSign(sign = "- (void)setGlyphs:(const CGGlyph *)glyphs properties:(const NSGlyphProperty *)props characterIndexes:(const NSUInteger *)charIndexes font:(UIFont *)aFont forGlyphRange:(NSRange)glyphRange;", selector = "setGlyphs:properties:characterIndexes:font:forGlyphRange:")
    public native void setGlyphs$properties$characterIndexes$font$forGlyphRange$(@Unsigned short[] glyphs, @NSInteger long[] props, @NSUInteger long[] charIndexes, UIFont aFont, @ObjCByValue NSRange glyphRange);

    @ObjCMethodSign(sign = "- (CGGlyph)glyphAtIndex:(NSUInteger)glyphIndex isValidIndex:(BOOL *)isValidIndex;", selector = "glyphAtIndex:isValidIndex:")
    public native @Unsigned short glyphAtIndex$isValidIndex$(@NSUInteger long glyphIndex, boolean[] isValidIndex);

    @ObjCMethodSign(sign = "- (CGGlyph)glyphAtIndex:(NSUInteger)glyphIndex;", selector = "glyphAtIndex:")
    public native @Unsigned short glyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (BOOL)isValidGlyphIndex:(NSUInteger)glyphIndex;", selector = "isValidGlyphIndex:")
    public native boolean isValidGlyphIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (NSGlyphProperty)propertyForGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "propertyForGlyphAtIndex:")
    public native NSGlyphProperty propertyForGlyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (NSUInteger)characterIndexForGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "characterIndexForGlyphAtIndex:")
    public native @NSUInteger long characterIndexForGlyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (NSUInteger)glyphIndexForCharacterAtIndex:(NSUInteger)charIndex;", selector = "glyphIndexForCharacterAtIndex:")
    public native @NSUInteger long glyphIndexForCharacterAtIndex$(@NSUInteger long charIndex);

    @ObjCMethodSign(sign = "- (NSUInteger)getGlyphsInRange:(NSRange)glyphRange glyphs:(CGGlyph *)glyphBuffer properties:(NSGlyphProperty *)props characterIndexes:(NSUInteger *)charIndexBuffer bidiLevels:(unsigned char *)bidiLevelBuffer;", selector = "getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:")
    public native @NSUInteger long getGlyphsInRange$glyphs$properties$characterIndexes$bidiLevels$(@ObjCByValue NSRange glyphRange, @Unsigned short[] glyphBuffer, @NSInteger long[] props, @NSUInteger long[] charIndexBuffer, byte[] bidiLevelBuffer);

    @ObjCMethodSign(sign = "- (void)setTextContainer:(NSTextContainer *)container forGlyphRange:(NSRange)glyphRange;", selector = "setTextContainer:forGlyphRange:")
    public native void setTextContainer$forGlyphRange$(NSTextContainer container, @ObjCByValue NSRange glyphRange);

    @ObjCMethodSign(sign = "- (void)setLineFragmentRect:(CGRect)fragmentRect forGlyphRange:(NSRange)glyphRange usedRect:(CGRect)usedRect;", selector = "setLineFragmentRect:forGlyphRange:usedRect:")
    public native void setLineFragmentRect$forGlyphRange$usedRect$(@ObjCByValue CGRect fragmentRect, @ObjCByValue NSRange glyphRange, @ObjCByValue CGRect usedRect);

    @ObjCMethodSign(sign = "- (void)setExtraLineFragmentRect:(CGRect)fragmentRect usedRect:(CGRect)usedRect textContainer:(NSTextContainer *)container;", selector = "setExtraLineFragmentRect:usedRect:textContainer:")
    public native void setExtraLineFragmentRect$usedRect$textContainer$(@ObjCByValue CGRect fragmentRect, @ObjCByValue CGRect usedRect, NSTextContainer container);

    @ObjCMethodSign(sign = "- (void)setLocation:(CGPoint)location forStartOfGlyphRange:(NSRange)glyphRange;", selector = "setLocation:forStartOfGlyphRange:")
    public native void setLocation$forStartOfGlyphRange$(@ObjCByValue CGPoint location, @ObjCByValue NSRange glyphRange);

    @ObjCMethodSign(sign = "- (void)setNotShownAttribute:(BOOL)flag forGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "setNotShownAttribute:forGlyphAtIndex:")
    public native void setNotShownAttribute$forGlyphAtIndex$(boolean flag, @NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (void)setDrawsOutsideLineFragment:(BOOL)flag forGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "setDrawsOutsideLineFragment:forGlyphAtIndex:")
    public native void setDrawsOutsideLineFragment$forGlyphAtIndex$(boolean flag, @NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (void)setAttachmentSize:(CGSize)attachmentSize forGlyphRange:(NSRange)glyphRange;", selector = "setAttachmentSize:forGlyphRange:")
    public native void setAttachmentSize$forGlyphRange$(@ObjCByValue CGSize attachmentSize, @ObjCByValue NSRange glyphRange);

    @ObjCMethodSign(sign = "- (void)getFirstUnlaidCharacterIndex:(NSUInteger *)charIndex glyphIndex:(NSUInteger *)glyphIndex;", selector = "getFirstUnlaidCharacterIndex:glyphIndex:")
    public native void getFirstUnlaidCharacterIndex$glyphIndex$(@NSUInteger long[] charIndex, @NSUInteger long[] glyphIndex);

    @ObjCMethodSign(sign = "- (NSUInteger)firstUnlaidCharacterIndex;", selector = "firstUnlaidCharacterIndex")
    public native @NSUInteger long firstUnlaidCharacterIndex();

    @ObjCMethodSign(sign = "- (NSUInteger)firstUnlaidGlyphIndex;", selector = "firstUnlaidGlyphIndex")
    public native @NSUInteger long firstUnlaidGlyphIndex();

    @ObjCMethodSign(sign = "- (NSTextContainer *)textContainerForGlyphAtIndex:(NSUInteger)glyphIndex effectiveRange:(NSRangePointer)effectiveGlyphRange;", selector = "textContainerForGlyphAtIndex:effectiveRange:")
    public native NSTextContainer textContainerForGlyphAtIndex$effectiveRange$(@NSUInteger long glyphIndex, NSRange effectiveGlyphRange);

    @ObjCMethodSign(sign = "- (CGRect)usedRectForTextContainer:(NSTextContainer *)container;", selector = "usedRectForTextContainer:")
    public native @ObjCByValue CGRect usedRectForTextContainer$(NSTextContainer container);

    @ObjCMethodSign(sign = "- (CGRect)lineFragmentRectForGlyphAtIndex:(NSUInteger)glyphIndex effectiveRange:(NSRangePointer)effectiveGlyphRange;", selector = "lineFragmentRectForGlyphAtIndex:effectiveRange:")
    public native @ObjCByValue CGRect lineFragmentRectForGlyphAtIndex$effectiveRange$(@NSUInteger long glyphIndex, NSRange effectiveGlyphRange);

    @ObjCMethodSign(sign = "- (CGRect)lineFragmentUsedRectForGlyphAtIndex:(NSUInteger)glyphIndex effectiveRange:(NSRangePointer)effectiveGlyphRange;", selector = "lineFragmentUsedRectForGlyphAtIndex:effectiveRange:")
    public native @ObjCByValue CGRect lineFragmentUsedRectForGlyphAtIndex$effectiveRange$(@NSUInteger long glyphIndex, NSRange effectiveGlyphRange);

    @ObjCMethodSign(sign = "- (CGPoint)locationForGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "locationForGlyphAtIndex:")
    public native @ObjCByValue CGPoint locationForGlyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (BOOL)notShownAttributeForGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "notShownAttributeForGlyphAtIndex:")
    public native boolean notShownAttributeForGlyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (BOOL)drawsOutsideLineFragmentForGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "drawsOutsideLineFragmentForGlyphAtIndex:")
    public native boolean drawsOutsideLineFragmentForGlyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (CGSize)attachmentSizeForGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "attachmentSizeForGlyphAtIndex:")
    public native @ObjCByValue CGSize attachmentSizeForGlyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (NSRange)truncatedGlyphRangeInLineFragmentForGlyphAtIndex:(NSUInteger)glyphIndex;", selector = "truncatedGlyphRangeInLineFragmentForGlyphAtIndex:")
    public native @ObjCByValue NSRange truncatedGlyphRangeInLineFragmentForGlyphAtIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (NSRange)glyphRangeForCharacterRange:(NSRange)charRange actualCharacterRange:(NSRangePointer)actualCharRange;", selector = "glyphRangeForCharacterRange:actualCharacterRange:")
    public native @ObjCByValue NSRange glyphRangeForCharacterRange$actualCharacterRange$(@ObjCByValue NSRange charRange, NSRange actualCharRange);

    @ObjCMethodSign(sign = "- (NSRange)characterRangeForGlyphRange:(NSRange)glyphRange actualGlyphRange:(NSRangePointer)actualGlyphRange;", selector = "characterRangeForGlyphRange:actualGlyphRange:")
    public native @ObjCByValue NSRange characterRangeForGlyphRange$actualGlyphRange$(@ObjCByValue NSRange glyphRange, NSRange actualGlyphRange);

    @ObjCMethodSign(sign = "- (NSRange)glyphRangeForTextContainer:(NSTextContainer *)container;", selector = "glyphRangeForTextContainer:")
    public native @ObjCByValue NSRange glyphRangeForTextContainer$(NSTextContainer container);

    @ObjCMethodSign(sign = "- (NSRange)rangeOfNominallySpacedGlyphsContainingIndex:(NSUInteger)glyphIndex;", selector = "rangeOfNominallySpacedGlyphsContainingIndex:")
    public native @ObjCByValue NSRange rangeOfNominallySpacedGlyphsContainingIndex$(@NSUInteger long glyphIndex);

    @ObjCMethodSign(sign = "- (CGRect)boundingRectForGlyphRange:(NSRange)glyphRange inTextContainer:(NSTextContainer *)container;", selector = "boundingRectForGlyphRange:inTextContainer:")
    public native @ObjCByValue CGRect boundingRectForGlyphRange$inTextContainer$(@ObjCByValue NSRange glyphRange, NSTextContainer container);

    @ObjCMethodSign(sign = "- (NSRange)glyphRangeForBoundingRect:(CGRect)bounds inTextContainer:(NSTextContainer *)container;", selector = "glyphRangeForBoundingRect:inTextContainer:")
    public native @ObjCByValue NSRange glyphRangeForBoundingRect$inTextContainer$(@ObjCByValue CGRect bounds, NSTextContainer container);

    @ObjCMethodSign(sign = "- (NSRange)glyphRangeForBoundingRectWithoutAdditionalLayout:(CGRect)bounds inTextContainer:(NSTextContainer *)container;", selector = "glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:")
    public native @ObjCByValue NSRange glyphRangeForBoundingRectWithoutAdditionalLayout$inTextContainer$(@ObjCByValue CGRect bounds, NSTextContainer container);

    @ObjCMethodSign(sign = "- (NSUInteger)glyphIndexForPoint:(CGPoint)point inTextContainer:(NSTextContainer *)container fractionOfDistanceThroughGlyph:(CGFloat *)partialFraction;", selector = "glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:")
    public native @NSUInteger long glyphIndexForPoint$inTextContainer$fractionOfDistanceThroughGlyph$(@ObjCByValue CGPoint point, NSTextContainer container, float[] partialFraction);

    @ObjCMethodSign(sign = "- (NSUInteger)glyphIndexForPoint:(CGPoint)point inTextContainer:(NSTextContainer *)container;", selector = "glyphIndexForPoint:inTextContainer:")
    public native @NSUInteger long glyphIndexForPoint$inTextContainer$(@ObjCByValue CGPoint point, NSTextContainer container);

    @ObjCMethodSign(sign = "- (CGFloat)fractionOfDistanceThroughGlyphForPoint:(CGPoint)point inTextContainer:(NSTextContainer *)container;", selector = "fractionOfDistanceThroughGlyphForPoint:inTextContainer:")
    public native float fractionOfDistanceThroughGlyphForPoint$inTextContainer$(@ObjCByValue CGPoint point, NSTextContainer container);

    @ObjCMethodSign(sign = "- (NSUInteger)characterIndexForPoint:(CGPoint)point inTextContainer:(NSTextContainer *)container fractionOfDistanceBetweenInsertionPoints:(CGFloat *)partialFraction;", selector = "characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:")
    public native @NSUInteger long characterIndexForPoint$inTextContainer$fractionOfDistanceBetweenInsertionPoints$(@ObjCByValue CGPoint point, NSTextContainer container, float[] partialFraction);

    @ObjCMethodSign(sign = "- (NSUInteger)getLineFragmentInsertionPointsForCharacterAtIndex:(NSUInteger)charIndex alternatePositions:(BOOL)aFlag inDisplayOrder:(BOOL)dFlag positions:(CGFloat *)positions characterIndexes:(NSUInteger *)charIndexes;", selector = "getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:")
    public native @NSUInteger long getLineFragmentInsertionPointsForCharacterAtIndex$alternatePositions$inDisplayOrder$positions$characterIndexes$(@NSUInteger long charIndex, boolean aFlag, boolean dFlag, float[] positions, @NSUInteger long[] charIndexes);

    @ObjCMethodSign(sign = "- (void)enumerateLineFragmentsForGlyphRange:(NSRange)glyphRange usingBlock:(void (^)(CGRect rect, CGRect usedRect, NSTextContainer *textContainer, NSRange glyphRange, BOOL *stop))block;", selector = "enumerateLineFragmentsForGlyphRange:usingBlock:")
    public native void enumerateLineFragmentsForGlyphRange$usingBlock$(@ObjCByValue NSRange glyphRange, ObjCBlock block);

    @ObjCMethodSign(sign = "- (void)enumerateEnclosingRectsForGlyphRange:(NSRange)glyphRange withinSelectedGlyphRange:(NSRange)selectedRange inTextContainer:(NSTextContainer *)textContainer usingBlock:(void (^)(CGRect rect, BOOL *stop))block;", selector = "enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:")
    public native void enumerateEnclosingRectsForGlyphRange$withinSelectedGlyphRange$inTextContainer$usingBlock$(@ObjCByValue NSRange glyphRange, @ObjCByValue NSRange selectedRange, NSTextContainer textContainer, ObjCBlock block);

    @ObjCMethodSign(sign = "- (void)drawBackgroundForGlyphRange:(NSRange)glyphsToShow atPoint:(CGPoint)origin;", selector = "drawBackgroundForGlyphRange:atPoint:")
    public native void drawBackgroundForGlyphRange$atPoint$(@ObjCByValue NSRange glyphsToShow, @ObjCByValue CGPoint origin);

    @ObjCMethodSign(sign = "- (void)drawGlyphsForGlyphRange:(NSRange)glyphsToShow atPoint:(CGPoint)origin;", selector = "drawGlyphsForGlyphRange:atPoint:")
    public native void drawGlyphsForGlyphRange$atPoint$(@ObjCByValue NSRange glyphsToShow, @ObjCByValue CGPoint origin);

    @ObjCMethodSign(sign = "- (void)showCGGlyphs:(const CGGlyph *)glyphs positions:(const CGPoint *)positions count:(NSUInteger)glyphCount font:(UIFont *)font matrix:(CGAffineTransform)textMatrix attributes:(NSDictionary *)attributes inContext:(CGContextRef)graphicsContext;", selector = "showCGGlyphs:positions:count:font:matrix:attributes:inContext:")
    public native void showCGGlyphs$positions$count$font$matrix$attributes$inContext$(@Unsigned short[] glyphs, CGPoint positions, @NSUInteger long glyphCount, UIFont font, @ObjCByValue CGAffineTransform textMatrix, NSDictionary attributes, CGContextRef graphicsContext);

    @ObjCMethodSign(sign = "- (void)fillBackgroundRectArray:(const CGRect *)rectArray count:(NSUInteger)rectCount forCharacterRange:(NSRange)charRange color:(UIColor *)color;", selector = "fillBackgroundRectArray:count:forCharacterRange:color:")
    public native void fillBackgroundRectArray$count$forCharacterRange$color$(CGRect rectArray, @NSUInteger long rectCount, @ObjCByValue NSRange charRange, UIColor color);

    @ObjCMethodSign(sign = "- (void)drawUnderlineForGlyphRange:(NSRange)glyphRange underlineType:(NSUnderlineStyle)underlineVal baselineOffset:(CGFloat)baselineOffset lineFragmentRect:(CGRect)lineRect lineFragmentGlyphRange:(NSRange)lineGlyphRange containerOrigin:(CGPoint)containerOrigin;", selector = "drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawUnderlineForGlyphRange$underlineType$baselineOffset$lineFragmentRect$lineFragmentGlyphRange$containerOrigin$(@ObjCByValue NSRange glyphRange, NSUnderlineStyle underlineVal, float baselineOffset, @ObjCByValue CGRect lineRect, @ObjCByValue NSRange lineGlyphRange, @ObjCByValue CGPoint containerOrigin);

    @ObjCMethodSign(sign = "- (void)underlineGlyphRange:(NSRange)glyphRange underlineType:(NSUnderlineStyle)underlineVal lineFragmentRect:(CGRect)lineRect lineFragmentGlyphRange:(NSRange)lineGlyphRange containerOrigin:(CGPoint)containerOrigin;", selector = "underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void underlineGlyphRange$underlineType$lineFragmentRect$lineFragmentGlyphRange$containerOrigin$(@ObjCByValue NSRange glyphRange, NSUnderlineStyle underlineVal, @ObjCByValue CGRect lineRect, @ObjCByValue NSRange lineGlyphRange, @ObjCByValue CGPoint containerOrigin);

    @ObjCMethodSign(sign = "- (void)drawStrikethroughForGlyphRange:(NSRange)glyphRange strikethroughType:(NSUnderlineStyle)strikethroughVal baselineOffset:(CGFloat)baselineOffset lineFragmentRect:(CGRect)lineRect lineFragmentGlyphRange:(NSRange)lineGlyphRange containerOrigin:(CGPoint)containerOrigin;", selector = "drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawStrikethroughForGlyphRange$strikethroughType$baselineOffset$lineFragmentRect$lineFragmentGlyphRange$containerOrigin$(@ObjCByValue NSRange glyphRange, NSUnderlineStyle strikethroughVal, float baselineOffset, @ObjCByValue CGRect lineRect, @ObjCByValue NSRange lineGlyphRange, @ObjCByValue CGPoint containerOrigin);

    @ObjCMethodSign(sign = "- (void)strikethroughGlyphRange:(NSRange)glyphRange strikethroughType:(NSUnderlineStyle)strikethroughVal lineFragmentRect:(CGRect)lineRect lineFragmentGlyphRange:(NSRange)lineGlyphRange containerOrigin:(CGPoint)containerOrigin;", selector = "strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void strikethroughGlyphRange$strikethroughType$lineFragmentRect$lineFragmentGlyphRange$containerOrigin$(@ObjCByValue NSRange glyphRange, NSUnderlineStyle strikethroughVal, @ObjCByValue CGRect lineRect, @ObjCByValue NSRange lineGlyphRange, @ObjCByValue CGPoint containerOrigin);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSLayoutManager initWithCoder$(NSCoder aDecoder);
}
