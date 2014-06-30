package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class $UIKit extends NSObject  {
    @ObjCEnumValue(enumname="UIRectCorner") public static final long UIRectCornerTopLeft = 1L;
    @ObjCEnumValue(enumname="UIRectCorner") public static final long UIRectCornerTopRight = 2L;
    @ObjCEnumValue(enumname="UIRectCorner") public static final long UIRectCornerBottomLeft = 4L;
    @ObjCEnumValue(enumname="UIRectCorner") public static final long UIRectCornerBottomRight = 8L;
    @ObjCEnumValue(enumname="UIRectCorner") public static final long UIRectCornerAllCorners = -1L;
    @ObjCEnumValue(enumname="UIEventType") public static final long UIEventTypeTouches = 0L;
    @ObjCEnumValue(enumname="UIEventType") public static final long UIEventTypeMotion = 1L;
    @ObjCEnumValue(enumname="UIEventType") public static final long UIEventTypeRemoteControl = 2L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeNone = 0L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeMotionShake = 1L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlPlay = 100L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlPause = 101L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlStop = 102L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlTogglePlayPause = 103L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlNextTrack = 104L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlPreviousTrack = 105L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlBeginSeekingBackward = 106L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlEndSeekingBackward = 107L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlBeginSeekingForward = 108L;
    @ObjCEnumValue(enumname="UIEventSubtype") public static final long UIEventSubtypeRemoteControlEndSeekingForward = 109L;
    @ObjCEnumValue(enumname="UIKeyModifierFlags") public static final long UIKeyModifierAlphaShift = 65536L;
    @ObjCEnumValue(enumname="UIKeyModifierFlags") public static final long UIKeyModifierShift = 131072L;
    @ObjCEnumValue(enumname="UIKeyModifierFlags") public static final long UIKeyModifierControl = 262144L;
    @ObjCEnumValue(enumname="UIKeyModifierFlags") public static final long UIKeyModifierAlternate = 524288L;
    @ObjCEnumValue(enumname="UIKeyModifierFlags") public static final long UIKeyModifierCommand = 1048576L;
    @ObjCEnumValue(enumname="UIKeyModifierFlags") public static final long UIKeyModifierNumericPad = 2097152L;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitItalic = 1;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitBold = 2;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitExpanded = 32;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitCondensed = 64;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitMonoSpace = 1024;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitVertical = 2048;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitUIOptimized = 4096;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitTightLeading = 32768;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorTraitLooseLeading = 65536;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassMask = -268435456;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassUnknown = 0;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassOldStyleSerifs = 268435456;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassTransitionalSerifs = 536870912;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassModernSerifs = 805306368;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassClarendonSerifs = 1073741824;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassSlabSerifs = 1342177280;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassFreeformSerifs = 1879048192;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassSansSerif = -2147483648;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassOrnamentals = -1879048192;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassScripts = -1610612736;
    @ObjCEnumValue(enumname="UIFontDescriptorSymbolicTraits") public static final int UIFontDescriptorClassSymbolic = -1073741824;
    @ObjCEnumValue(enumname="UIBarStyle") public static final long UIBarStyleDefault = 0L;
    @ObjCEnumValue(enumname="UIBarStyle") public static final long UIBarStyleBlack = 1L;
    @ObjCEnumValue(enumname="UIBarStyle") public static final long UIBarStyleBlackOpaque = 1L;
    @ObjCEnumValue(enumname="UIBarStyle") public static final long UIBarStyleBlackTranslucent = 2L;
    @ObjCEnumValue(enumname="UIRectEdge") public static final long UIRectEdgeNone = 0L;
    @ObjCEnumValue(enumname="UIRectEdge") public static final long UIRectEdgeTop = 1L;
    @ObjCEnumValue(enumname="UIRectEdge") public static final long UIRectEdgeLeft = 2L;
    @ObjCEnumValue(enumname="UIRectEdge") public static final long UIRectEdgeBottom = 4L;
    @ObjCEnumValue(enumname="UIRectEdge") public static final long UIRectEdgeRight = 8L;
    @ObjCEnumValue(enumname="UIRectEdge") public static final long UIRectEdgeAll = 15L;
    @ObjCEnumValue(enumname="NSLayoutRelation") public static final long NSLayoutRelationLessThanOrEqual = -1L;
    @ObjCEnumValue(enumname="NSLayoutRelation") public static final long NSLayoutRelationEqual = 0L;
    @ObjCEnumValue(enumname="NSLayoutRelation") public static final long NSLayoutRelationGreaterThanOrEqual = 1L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeLeft = 1L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeRight = 2L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeTop = 3L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeBottom = 4L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeLeading = 5L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeTrailing = 6L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeWidth = 7L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeHeight = 8L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeCenterX = 9L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeCenterY = 10L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeBaseline = 11L;
    @ObjCEnumValue(enumname="NSLayoutAttribute") public static final long NSLayoutAttributeNotAnAttribute = 0L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllLeft = 2L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllRight = 4L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllTop = 8L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllBottom = 16L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllLeading = 32L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllTrailing = 64L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllCenterX = 512L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllCenterY = 1024L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignAllBaseline = 2048L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatAlignmentMask = 65535L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatDirectionLeadingToTrailing = 0L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatDirectionLeftToRight = 65536L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatDirectionRightToLeft = 131072L;
    @ObjCEnumValue(enumname="NSLayoutFormatOptions") public static final long NSLayoutFormatDirectionMask = 196608L;
    @ObjCEnumValue(enumname="") public static final int UILayoutPriorityRequired = 1000;
    @ObjCEnumValue(enumname="") public static final int UILayoutPriorityDefaultHigh = 750;
    @ObjCEnumValue(enumname="") public static final int UILayoutPriorityDefaultLow = 250;
    @ObjCEnumValue(enumname="") public static final int UILayoutPriorityFittingSizeLevel = 50;
    @ObjCEnumValue(enumname="UIViewAnimationCurve") public static final long UIViewAnimationCurveEaseInOut = 0L;
    @ObjCEnumValue(enumname="UIViewAnimationCurve") public static final long UIViewAnimationCurveEaseIn = 1L;
    @ObjCEnumValue(enumname="UIViewAnimationCurve") public static final long UIViewAnimationCurveEaseOut = 2L;
    @ObjCEnumValue(enumname="UIViewAnimationCurve") public static final long UIViewAnimationCurveLinear = 3L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeScaleToFill = 0L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeScaleAspectFit = 1L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeScaleAspectFill = 2L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeRedraw = 3L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeCenter = 4L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeTop = 5L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeBottom = 6L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeLeft = 7L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeRight = 8L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeTopLeft = 9L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeTopRight = 10L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeBottomLeft = 11L;
    @ObjCEnumValue(enumname="UIViewContentMode") public static final long UIViewContentModeBottomRight = 12L;
    @ObjCEnumValue(enumname="UIViewAnimationTransition") public static final long UIViewAnimationTransitionNone = 0L;
    @ObjCEnumValue(enumname="UIViewAnimationTransition") public static final long UIViewAnimationTransitionFlipFromLeft = 1L;
    @ObjCEnumValue(enumname="UIViewAnimationTransition") public static final long UIViewAnimationTransitionFlipFromRight = 2L;
    @ObjCEnumValue(enumname="UIViewAnimationTransition") public static final long UIViewAnimationTransitionCurlUp = 3L;
    @ObjCEnumValue(enumname="UIViewAnimationTransition") public static final long UIViewAnimationTransitionCurlDown = 4L;
    @ObjCEnumValue(enumname="UIViewAutoresizing") public static final long UIViewAutoresizingNone = 0L;
    @ObjCEnumValue(enumname="UIViewAutoresizing") public static final long UIViewAutoresizingFlexibleLeftMargin = 1L;
    @ObjCEnumValue(enumname="UIViewAutoresizing") public static final long UIViewAutoresizingFlexibleWidth = 2L;
    @ObjCEnumValue(enumname="UIViewAutoresizing") public static final long UIViewAutoresizingFlexibleRightMargin = 4L;
    @ObjCEnumValue(enumname="UIViewAutoresizing") public static final long UIViewAutoresizingFlexibleTopMargin = 8L;
    @ObjCEnumValue(enumname="UIViewAutoresizing") public static final long UIViewAutoresizingFlexibleHeight = 16L;
    @ObjCEnumValue(enumname="UIViewAutoresizing") public static final long UIViewAutoresizingFlexibleBottomMargin = 32L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionLayoutSubviews = 1L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionAllowUserInteraction = 2L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionBeginFromCurrentState = 4L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionRepeat = 8L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionAutoreverse = 16L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionOverrideInheritedDuration = 32L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionOverrideInheritedCurve = 64L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionAllowAnimatedContent = 128L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionShowHideTransitionViews = 256L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionOverrideInheritedOptions = 512L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionCurveEaseInOut = 0L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionCurveEaseIn = 65536L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionCurveEaseOut = 131072L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionCurveLinear = 196608L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionNone = 0L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionFlipFromLeft = 1048576L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionFlipFromRight = 2097152L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionCurlUp = 3145728L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionCurlDown = 4194304L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionCrossDissolve = 5242880L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionFlipFromTop = 6291456L;
    @ObjCEnumValue(enumname="UIViewAnimationOptions") public static final long UIViewAnimationOptionTransitionFlipFromBottom = 7340032L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionLayoutSubviews = 1L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionAllowUserInteraction = 2L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionBeginFromCurrentState = 4L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionRepeat = 8L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionAutoreverse = 16L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionOverrideInheritedDuration = 32L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionOverrideInheritedOptions = 512L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionCalculationModeLinear = 0L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionCalculationModeDiscrete = 1024L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionCalculationModePaced = 2048L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionCalculationModeCubic = 3072L;
    @ObjCEnumValue(enumname="UIViewKeyframeAnimationOptions") public static final long UIViewKeyframeAnimationOptionCalculationModeCubicPaced = 4096L;
    @ObjCEnumValue(enumname="UISystemAnimation") public static final long UISystemAnimationDelete = 0L;
    @ObjCEnumValue(enumname="UIViewTintAdjustmentMode") public static final long UIViewTintAdjustmentModeAutomatic = 0L;
    @ObjCEnumValue(enumname="UIViewTintAdjustmentMode") public static final long UIViewTintAdjustmentModeNormal = 1L;
    @ObjCEnumValue(enumname="UIViewTintAdjustmentMode") public static final long UIViewTintAdjustmentModeDimmed = 2L;
    @ObjCEnumValue(enumname="UILayoutConstraintAxis") public static final long UILayoutConstraintAxisHorizontal = 0L;
    @ObjCEnumValue(enumname="UILayoutConstraintAxis") public static final long UILayoutConstraintAxisVertical = 1L;
    @ObjCEnumValue(enumname="UIScrollViewIndicatorStyle") public static final long UIScrollViewIndicatorStyleDefault = 0L;
    @ObjCEnumValue(enumname="UIScrollViewIndicatorStyle") public static final long UIScrollViewIndicatorStyleBlack = 1L;
    @ObjCEnumValue(enumname="UIScrollViewIndicatorStyle") public static final long UIScrollViewIndicatorStyleWhite = 2L;
    @ObjCEnumValue(enumname="UIScrollViewKeyboardDismissMode") public static final long UIScrollViewKeyboardDismissModeNone = 0L;
    @ObjCEnumValue(enumname="UIScrollViewKeyboardDismissMode") public static final long UIScrollViewKeyboardDismissModeOnDrag = 1L;
    @ObjCEnumValue(enumname="UIScrollViewKeyboardDismissMode") public static final long UIScrollViewKeyboardDismissModeInteractive = 2L;
    @ObjCEnumValue(enumname="UIGestureRecognizerState") public static final long UIGestureRecognizerStatePossible = 0L;
    @ObjCEnumValue(enumname="UIGestureRecognizerState") public static final long UIGestureRecognizerStateBegan = 1L;
    @ObjCEnumValue(enumname="UIGestureRecognizerState") public static final long UIGestureRecognizerStateChanged = 2L;
    @ObjCEnumValue(enumname="UIGestureRecognizerState") public static final long UIGestureRecognizerStateEnded = 3L;
    @ObjCEnumValue(enumname="UIGestureRecognizerState") public static final long UIGestureRecognizerStateCancelled = 4L;
    @ObjCEnumValue(enumname="UIGestureRecognizerState") public static final long UIGestureRecognizerStateFailed = 5L;
    @ObjCEnumValue(enumname="UIGestureRecognizerState") public static final long UIGestureRecognizerStateRecognized = 3L;
    @ObjCEnumValue(enumname="UISwipeGestureRecognizerDirection") public static final long UISwipeGestureRecognizerDirectionRight = 1L;
    @ObjCEnumValue(enumname="UISwipeGestureRecognizerDirection") public static final long UISwipeGestureRecognizerDirectionLeft = 2L;
    @ObjCEnumValue(enumname="UISwipeGestureRecognizerDirection") public static final long UISwipeGestureRecognizerDirectionUp = 4L;
    @ObjCEnumValue(enumname="UISwipeGestureRecognizerDirection") public static final long UISwipeGestureRecognizerDirectionDown = 8L;
    @ObjCEnumValue(enumname="NSTextAlignment") public static final long NSTextAlignmentLeft = 0L;
    @ObjCEnumValue(enumname="NSTextAlignment") public static final long NSTextAlignmentCenter = 1L;
    @ObjCEnumValue(enumname="NSTextAlignment") public static final long NSTextAlignmentRight = 2L;
    @ObjCEnumValue(enumname="NSTextAlignment") public static final long NSTextAlignmentJustified = 3L;
    @ObjCEnumValue(enumname="NSTextAlignment") public static final long NSTextAlignmentNatural = 4L;
    @ObjCEnumValue(enumname="NSWritingDirection") public static final long NSWritingDirectionNatural = -1L;
    @ObjCEnumValue(enumname="NSWritingDirection") public static final long NSWritingDirectionLeftToRight = 0L;
    @ObjCEnumValue(enumname="NSWritingDirection") public static final long NSWritingDirectionRightToLeft = 1L;
    @ObjCEnumValue(enumname="NSLineBreakMode") public static final long NSLineBreakByWordWrapping = 0L;
    @ObjCEnumValue(enumname="NSLineBreakMode") public static final long NSLineBreakByCharWrapping = 1L;
    @ObjCEnumValue(enumname="NSLineBreakMode") public static final long NSLineBreakByClipping = 2L;
    @ObjCEnumValue(enumname="NSLineBreakMode") public static final long NSLineBreakByTruncatingHead = 3L;
    @ObjCEnumValue(enumname="NSLineBreakMode") public static final long NSLineBreakByTruncatingTail = 4L;
    @ObjCEnumValue(enumname="NSLineBreakMode") public static final long NSLineBreakByTruncatingMiddle = 5L;
    @ObjCEnumValue(enumname="UILineBreakMode") public static final long UILineBreakModeWordWrap = 0L;
    @ObjCEnumValue(enumname="UILineBreakMode") public static final long UILineBreakModeCharacterWrap = 1L;
    @ObjCEnumValue(enumname="UILineBreakMode") public static final long UILineBreakModeClip = 2L;
    @ObjCEnumValue(enumname="UILineBreakMode") public static final long UILineBreakModeHeadTruncation = 3L;
    @ObjCEnumValue(enumname="UILineBreakMode") public static final long UILineBreakModeTailTruncation = 4L;
    @ObjCEnumValue(enumname="UILineBreakMode") public static final long UILineBreakModeMiddleTruncation = 5L;
    @ObjCEnumValue(enumname="UITextAlignment") public static final long UITextAlignmentLeft = 0L;
    @ObjCEnumValue(enumname="UITextAlignment") public static final long UITextAlignmentCenter = 1L;
    @ObjCEnumValue(enumname="UITextAlignment") public static final long UITextAlignmentRight = 2L;
    @ObjCEnumValue(enumname="UIBaselineAdjustment") public static final long UIBaselineAdjustmentAlignBaselines = 0L;
    @ObjCEnumValue(enumname="UIBaselineAdjustment") public static final long UIBaselineAdjustmentAlignCenters = 1L;
    @ObjCEnumValue(enumname="UIBaselineAdjustment") public static final long UIBaselineAdjustmentNone = 2L;
    @ObjCEnumValue(enumname="UITableViewCellStyle") public static final long UITableViewCellStyleDefault = 0L;
    @ObjCEnumValue(enumname="UITableViewCellStyle") public static final long UITableViewCellStyleValue1 = 1L;
    @ObjCEnumValue(enumname="UITableViewCellStyle") public static final long UITableViewCellStyleValue2 = 2L;
    @ObjCEnumValue(enumname="UITableViewCellStyle") public static final long UITableViewCellStyleSubtitle = 3L;
    @ObjCEnumValue(enumname="UITableViewCellSeparatorStyle") public static final long UITableViewCellSeparatorStyleNone = 0L;
    @ObjCEnumValue(enumname="UITableViewCellSeparatorStyle") public static final long UITableViewCellSeparatorStyleSingleLine = 1L;
    @ObjCEnumValue(enumname="UITableViewCellSeparatorStyle") public static final long UITableViewCellSeparatorStyleSingleLineEtched = 2L;
    @ObjCEnumValue(enumname="UITableViewCellSelectionStyle") public static final long UITableViewCellSelectionStyleNone = 0L;
    @ObjCEnumValue(enumname="UITableViewCellSelectionStyle") public static final long UITableViewCellSelectionStyleBlue = 1L;
    @ObjCEnumValue(enumname="UITableViewCellSelectionStyle") public static final long UITableViewCellSelectionStyleGray = 2L;
    @ObjCEnumValue(enumname="UITableViewCellSelectionStyle") public static final long UITableViewCellSelectionStyleDefault = 3L;
    @ObjCEnumValue(enumname="UITableViewCellEditingStyle") public static final long UITableViewCellEditingStyleNone = 0L;
    @ObjCEnumValue(enumname="UITableViewCellEditingStyle") public static final long UITableViewCellEditingStyleDelete = 1L;
    @ObjCEnumValue(enumname="UITableViewCellEditingStyle") public static final long UITableViewCellEditingStyleInsert = 2L;
    @ObjCEnumValue(enumname="UITableViewCellAccessoryType") public static final long UITableViewCellAccessoryNone = 0L;
    @ObjCEnumValue(enumname="UITableViewCellAccessoryType") public static final long UITableViewCellAccessoryDisclosureIndicator = 1L;
    @ObjCEnumValue(enumname="UITableViewCellAccessoryType") public static final long UITableViewCellAccessoryDetailDisclosureButton = 2L;
    @ObjCEnumValue(enumname="UITableViewCellAccessoryType") public static final long UITableViewCellAccessoryCheckmark = 3L;
    @ObjCEnumValue(enumname="UITableViewCellAccessoryType") public static final long UITableViewCellAccessoryDetailButton = 4L;
    @ObjCEnumValue(enumname="UITableViewCellStateMask") public static final long UITableViewCellStateDefaultMask = 0L;
    @ObjCEnumValue(enumname="UITableViewCellStateMask") public static final long UITableViewCellStateShowingEditControlMask = 1L;
    @ObjCEnumValue(enumname="UITableViewCellStateMask") public static final long UITableViewCellStateShowingDeleteConfirmationMask = 2L;
    @ObjCEnumValue(enumname="UITableViewStyle") public static final long UITableViewStylePlain = 0L;
    @ObjCEnumValue(enumname="UITableViewStyle") public static final long UITableViewStyleGrouped = 1L;
    @ObjCEnumValue(enumname="UITableViewScrollPosition") public static final long UITableViewScrollPositionNone = 0L;
    @ObjCEnumValue(enumname="UITableViewScrollPosition") public static final long UITableViewScrollPositionTop = 1L;
    @ObjCEnumValue(enumname="UITableViewScrollPosition") public static final long UITableViewScrollPositionMiddle = 2L;
    @ObjCEnumValue(enumname="UITableViewScrollPosition") public static final long UITableViewScrollPositionBottom = 3L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationFade = 0L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationRight = 1L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationLeft = 2L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationTop = 3L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationBottom = 4L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationNone = 5L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationMiddle = 6L;
    @ObjCEnumValue(enumname="UITableViewRowAnimation") public static final long UITableViewRowAnimationAutomatic = 100L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationUp = 0L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationDown = 1L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationLeft = 2L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationRight = 3L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationUpMirrored = 4L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationDownMirrored = 5L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationLeftMirrored = 6L;
    @ObjCEnumValue(enumname="UIImageOrientation") public static final long UIImageOrientationRightMirrored = 7L;
    @ObjCEnumValue(enumname="UIImageResizingMode") public static final long UIImageResizingModeTile = 0L;
    @ObjCEnumValue(enumname="UIImageResizingMode") public static final long UIImageResizingModeStretch = 1L;
    @ObjCEnumValue(enumname="UIImageRenderingMode") public static final long UIImageRenderingModeAutomatic = 0L;
    @ObjCEnumValue(enumname="UIImageRenderingMode") public static final long UIImageRenderingModeAlwaysOriginal = 1L;
    @ObjCEnumValue(enumname="UIImageRenderingMode") public static final long UIImageRenderingModeAlwaysTemplate = 2L;
    @ObjCEnumValue(enumname="UIAccessibilityZoomType") public static final long UIAccessibilityZoomTypeInsertionPoint = 0L;
    @ObjCEnumValue(enumname="UIGuidedAccessRestrictionState") public static final long UIGuidedAccessRestrictionStateAllow = 0L;
    @ObjCEnumValue(enumname="UIGuidedAccessRestrictionState") public static final long UIGuidedAccessRestrictionStateDeny = 1L;
    @ObjCEnumValue(enumname="UIAccessibilityScrollDirection") public static final long UIAccessibilityScrollDirectionRight = 1L;
    @ObjCEnumValue(enumname="UIAccessibilityScrollDirection") public static final long UIAccessibilityScrollDirectionLeft = 2L;
    @ObjCEnumValue(enumname="UIAccessibilityScrollDirection") public static final long UIAccessibilityScrollDirectionUp = 3L;
    @ObjCEnumValue(enumname="UIAccessibilityScrollDirection") public static final long UIAccessibilityScrollDirectionDown = 4L;
    @ObjCEnumValue(enumname="UIAccessibilityScrollDirection") public static final long UIAccessibilityScrollDirectionNext = 5L;
    @ObjCEnumValue(enumname="UIAccessibilityScrollDirection") public static final long UIAccessibilityScrollDirectionPrevious = 6L;
    @ObjCEnumValue(enumname="UIActivityIndicatorViewStyle") public static final long UIActivityIndicatorViewStyleWhiteLarge = 0L;
    @ObjCEnumValue(enumname="UIActivityIndicatorViewStyle") public static final long UIActivityIndicatorViewStyleWhite = 1L;
    @ObjCEnumValue(enumname="UIActivityIndicatorViewStyle") public static final long UIActivityIndicatorViewStyleGray = 2L;
    @ObjCEnumValue(enumname="UIActivityCategory") public static final long UIActivityCategoryAction = 0L;
    @ObjCEnumValue(enumname="UIActivityCategory") public static final long UIActivityCategoryShare = 1L;
    @ObjCEnumValue(enumname="UIDeviceOrientation") public static final long UIDeviceOrientationUnknown = 0L;
    @ObjCEnumValue(enumname="UIDeviceOrientation") public static final long UIDeviceOrientationPortrait = 1L;
    @ObjCEnumValue(enumname="UIDeviceOrientation") public static final long UIDeviceOrientationPortraitUpsideDown = 2L;
    @ObjCEnumValue(enumname="UIDeviceOrientation") public static final long UIDeviceOrientationLandscapeLeft = 3L;
    @ObjCEnumValue(enumname="UIDeviceOrientation") public static final long UIDeviceOrientationLandscapeRight = 4L;
    @ObjCEnumValue(enumname="UIDeviceOrientation") public static final long UIDeviceOrientationFaceUp = 5L;
    @ObjCEnumValue(enumname="UIDeviceOrientation") public static final long UIDeviceOrientationFaceDown = 6L;
    @ObjCEnumValue(enumname="UIDeviceBatteryState") public static final long UIDeviceBatteryStateUnknown = 0L;
    @ObjCEnumValue(enumname="UIDeviceBatteryState") public static final long UIDeviceBatteryStateUnplugged = 1L;
    @ObjCEnumValue(enumname="UIDeviceBatteryState") public static final long UIDeviceBatteryStateCharging = 2L;
    @ObjCEnumValue(enumname="UIDeviceBatteryState") public static final long UIDeviceBatteryStateFull = 3L;
    @ObjCEnumValue(enumname="UIUserInterfaceIdiom") public static final long UIUserInterfaceIdiomPhone = 0L;
    @ObjCEnumValue(enumname="UIUserInterfaceIdiom") public static final long UIUserInterfaceIdiomPad = 1L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchDown = 1L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchDownRepeat = 2L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchDragInside = 4L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchDragOutside = 8L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchDragEnter = 16L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchDragExit = 32L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchUpInside = 64L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchUpOutside = 128L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventTouchCancel = 256L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventValueChanged = 4096L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventEditingDidBegin = 65536L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventEditingChanged = 131072L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventEditingDidEnd = 262144L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventEditingDidEndOnExit = 524288L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventAllTouchEvents = 4095L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventAllEditingEvents = 983040L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventApplicationReserved = 251658240L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventSystemReserved = -268435456L;
    @ObjCEnumValue(enumname="UIControlEvents") public static final long UIControlEventAllEvents = -1L;
    @ObjCEnumValue(enumname="UIControlContentVerticalAlignment") public static final long UIControlContentVerticalAlignmentCenter = 0L;
    @ObjCEnumValue(enumname="UIControlContentVerticalAlignment") public static final long UIControlContentVerticalAlignmentTop = 1L;
    @ObjCEnumValue(enumname="UIControlContentVerticalAlignment") public static final long UIControlContentVerticalAlignmentBottom = 2L;
    @ObjCEnumValue(enumname="UIControlContentVerticalAlignment") public static final long UIControlContentVerticalAlignmentFill = 3L;
    @ObjCEnumValue(enumname="UIControlContentHorizontalAlignment") public static final long UIControlContentHorizontalAlignmentCenter = 0L;
    @ObjCEnumValue(enumname="UIControlContentHorizontalAlignment") public static final long UIControlContentHorizontalAlignmentLeft = 1L;
    @ObjCEnumValue(enumname="UIControlContentHorizontalAlignment") public static final long UIControlContentHorizontalAlignmentRight = 2L;
    @ObjCEnumValue(enumname="UIControlContentHorizontalAlignment") public static final long UIControlContentHorizontalAlignmentFill = 3L;
    @ObjCEnumValue(enumname="UIControlState") public static final long UIControlStateNormal = 0L;
    @ObjCEnumValue(enumname="UIControlState") public static final long UIControlStateHighlighted = 1L;
    @ObjCEnumValue(enumname="UIControlState") public static final long UIControlStateDisabled = 2L;
    @ObjCEnumValue(enumname="UIControlState") public static final long UIControlStateSelected = 4L;
    @ObjCEnumValue(enumname="UIControlState") public static final long UIControlStateApplication = 16711680L;
    @ObjCEnumValue(enumname="UIControlState") public static final long UIControlStateReserved = -16777216L;
    @ObjCEnumValue(enumname="UITextAutocapitalizationType") public static final long UITextAutocapitalizationTypeNone = 0L;
    @ObjCEnumValue(enumname="UITextAutocapitalizationType") public static final long UITextAutocapitalizationTypeWords = 1L;
    @ObjCEnumValue(enumname="UITextAutocapitalizationType") public static final long UITextAutocapitalizationTypeSentences = 2L;
    @ObjCEnumValue(enumname="UITextAutocapitalizationType") public static final long UITextAutocapitalizationTypeAllCharacters = 3L;
    @ObjCEnumValue(enumname="UITextAutocorrectionType") public static final long UITextAutocorrectionTypeDefault = 0L;
    @ObjCEnumValue(enumname="UITextAutocorrectionType") public static final long UITextAutocorrectionTypeNo = 1L;
    @ObjCEnumValue(enumname="UITextAutocorrectionType") public static final long UITextAutocorrectionTypeYes = 2L;
    @ObjCEnumValue(enumname="UITextSpellCheckingType") public static final long UITextSpellCheckingTypeDefault = 0L;
    @ObjCEnumValue(enumname="UITextSpellCheckingType") public static final long UITextSpellCheckingTypeNo = 1L;
    @ObjCEnumValue(enumname="UITextSpellCheckingType") public static final long UITextSpellCheckingTypeYes = 2L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeDefault = 0L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeASCIICapable = 1L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeNumbersAndPunctuation = 2L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeURL = 3L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeNumberPad = 4L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypePhonePad = 5L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeNamePhonePad = 6L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeEmailAddress = 7L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeDecimalPad = 8L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeTwitter = 9L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeWebSearch = 10L;
    @ObjCEnumValue(enumname="UIKeyboardType") public static final long UIKeyboardTypeAlphabet = 1L;
    @ObjCEnumValue(enumname="UIKeyboardAppearance") public static final long UIKeyboardAppearanceDefault = 0L;
    @ObjCEnumValue(enumname="UIKeyboardAppearance") public static final long UIKeyboardAppearanceDark = 1L;
    @ObjCEnumValue(enumname="UIKeyboardAppearance") public static final long UIKeyboardAppearanceLight = 2L;
    @ObjCEnumValue(enumname="UIKeyboardAppearance") public static final long UIKeyboardAppearanceAlert = 1L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyDefault = 0L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyGo = 1L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyGoogle = 2L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyJoin = 3L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyNext = 4L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyRoute = 5L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeySearch = 6L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeySend = 7L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyYahoo = 8L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyDone = 9L;
    @ObjCEnumValue(enumname="UIReturnKeyType") public static final long UIReturnKeyEmergencyCall = 10L;
    @ObjCEnumValue(enumname="UITextStorageDirection") public static final long UITextStorageDirectionForward = 0L;
    @ObjCEnumValue(enumname="UITextStorageDirection") public static final long UITextStorageDirectionBackward = 1L;
    @ObjCEnumValue(enumname="UITextLayoutDirection") public static final long UITextLayoutDirectionRight = 2L;
    @ObjCEnumValue(enumname="UITextLayoutDirection") public static final long UITextLayoutDirectionLeft = 3L;
    @ObjCEnumValue(enumname="UITextLayoutDirection") public static final long UITextLayoutDirectionUp = 4L;
    @ObjCEnumValue(enumname="UITextLayoutDirection") public static final long UITextLayoutDirectionDown = 5L;
    @ObjCEnumValue(enumname="UITextWritingDirection") public static final long UITextWritingDirectionNatural = -1L;
    @ObjCEnumValue(enumname="UITextWritingDirection") public static final long UITextWritingDirectionLeftToRight = 0L;
    @ObjCEnumValue(enumname="UITextWritingDirection") public static final long UITextWritingDirectionRightToLeft = 1L;
    @ObjCEnumValue(enumname="UITextGranularity") public static final long UITextGranularityCharacter = 0L;
    @ObjCEnumValue(enumname="UITextGranularity") public static final long UITextGranularityWord = 1L;
    @ObjCEnumValue(enumname="UITextGranularity") public static final long UITextGranularitySentence = 2L;
    @ObjCEnumValue(enumname="UITextGranularity") public static final long UITextGranularityParagraph = 3L;
    @ObjCEnumValue(enumname="UITextGranularity") public static final long UITextGranularityLine = 4L;
    @ObjCEnumValue(enumname="UITextGranularity") public static final long UITextGranularityDocument = 5L;
    @ObjCEnumValue(enumname="UITextBorderStyle") public static final long UITextBorderStyleNone = 0L;
    @ObjCEnumValue(enumname="UITextBorderStyle") public static final long UITextBorderStyleLine = 1L;
    @ObjCEnumValue(enumname="UITextBorderStyle") public static final long UITextBorderStyleBezel = 2L;
    @ObjCEnumValue(enumname="UITextBorderStyle") public static final long UITextBorderStyleRoundedRect = 3L;
    @ObjCEnumValue(enumname="UITextFieldViewMode") public static final long UITextFieldViewModeNever = 0L;
    @ObjCEnumValue(enumname="UITextFieldViewMode") public static final long UITextFieldViewModeWhileEditing = 1L;
    @ObjCEnumValue(enumname="UITextFieldViewMode") public static final long UITextFieldViewModeUnlessEditing = 2L;
    @ObjCEnumValue(enumname="UITextFieldViewMode") public static final long UITextFieldViewModeAlways = 3L;
    @ObjCEnumValue(enumname="UIActionSheetStyle") public static final long UIActionSheetStyleAutomatic = -1L;
    @ObjCEnumValue(enumname="UIActionSheetStyle") public static final long UIActionSheetStyleDefault = 0L;
    @ObjCEnumValue(enumname="UIActionSheetStyle") public static final long UIActionSheetStyleBlackTranslucent = 2L;
    @ObjCEnumValue(enumname="UIActionSheetStyle") public static final long UIActionSheetStyleBlackOpaque = 1L;
    @ObjCEnumValue(enumname="UIAlertViewStyle") public static final long UIAlertViewStyleDefault = 0L;
    @ObjCEnumValue(enumname="UIAlertViewStyle") public static final long UIAlertViewStyleSecureTextInput = 1L;
    @ObjCEnumValue(enumname="UIAlertViewStyle") public static final long UIAlertViewStylePlainTextInput = 2L;
    @ObjCEnumValue(enumname="UIAlertViewStyle") public static final long UIAlertViewStyleLoginAndPasswordInput = 3L;
    @ObjCEnumValue(enumname="UIStatusBarStyle") public static final long UIStatusBarStyleDefault = 0L;
    @ObjCEnumValue(enumname="UIStatusBarStyle") public static final long UIStatusBarStyleLightContent = 1L;
    @ObjCEnumValue(enumname="UIStatusBarStyle") public static final long UIStatusBarStyleBlackTranslucent = 1L;
    @ObjCEnumValue(enumname="UIStatusBarStyle") public static final long UIStatusBarStyleBlackOpaque = 2L;
    @ObjCEnumValue(enumname="UIStatusBarAnimation") public static final long UIStatusBarAnimationNone = 0L;
    @ObjCEnumValue(enumname="UIStatusBarAnimation") public static final long UIStatusBarAnimationFade = 1L;
    @ObjCEnumValue(enumname="UIStatusBarAnimation") public static final long UIStatusBarAnimationSlide = 2L;
    @ObjCEnumValue(enumname="UIInterfaceOrientation") public static final long UIInterfaceOrientationPortrait = 1L;
    @ObjCEnumValue(enumname="UIInterfaceOrientation") public static final long UIInterfaceOrientationPortraitUpsideDown = 2L;
    @ObjCEnumValue(enumname="UIInterfaceOrientation") public static final long UIInterfaceOrientationLandscapeLeft = 4L;
    @ObjCEnumValue(enumname="UIInterfaceOrientation") public static final long UIInterfaceOrientationLandscapeRight = 3L;
    @ObjCEnumValue(enumname="UIInterfaceOrientationMask") public static final long UIInterfaceOrientationMaskPortrait = 2L;
    @ObjCEnumValue(enumname="UIInterfaceOrientationMask") public static final long UIInterfaceOrientationMaskLandscapeLeft = 16L;
    @ObjCEnumValue(enumname="UIInterfaceOrientationMask") public static final long UIInterfaceOrientationMaskLandscapeRight = 8L;
    @ObjCEnumValue(enumname="UIInterfaceOrientationMask") public static final long UIInterfaceOrientationMaskPortraitUpsideDown = 4L;
    @ObjCEnumValue(enumname="UIInterfaceOrientationMask") public static final long UIInterfaceOrientationMaskLandscape = 24L;
    @ObjCEnumValue(enumname="UIInterfaceOrientationMask") public static final long UIInterfaceOrientationMaskAll = 30L;
    @ObjCEnumValue(enumname="UIInterfaceOrientationMask") public static final long UIInterfaceOrientationMaskAllButUpsideDown = 26L;
    @ObjCEnumValue(enumname="UIRemoteNotificationType") public static final long UIRemoteNotificationTypeNone = 0L;
    @ObjCEnumValue(enumname="UIRemoteNotificationType") public static final long UIRemoteNotificationTypeBadge = 1L;
    @ObjCEnumValue(enumname="UIRemoteNotificationType") public static final long UIRemoteNotificationTypeSound = 2L;
    @ObjCEnumValue(enumname="UIRemoteNotificationType") public static final long UIRemoteNotificationTypeAlert = 4L;
    @ObjCEnumValue(enumname="UIRemoteNotificationType") public static final long UIRemoteNotificationTypeNewsstandContentAvailability = 8L;
    @ObjCEnumValue(enumname="UIBackgroundFetchResult") public static final long UIBackgroundFetchResultNewData = 0L;
    @ObjCEnumValue(enumname="UIBackgroundFetchResult") public static final long UIBackgroundFetchResultNoData = 1L;
    @ObjCEnumValue(enumname="UIBackgroundFetchResult") public static final long UIBackgroundFetchResultFailed = 2L;
    @ObjCEnumValue(enumname="UIBackgroundRefreshStatus") public static final long UIBackgroundRefreshStatusRestricted = 0L;
    @ObjCEnumValue(enumname="UIBackgroundRefreshStatus") public static final long UIBackgroundRefreshStatusDenied = 1L;
    @ObjCEnumValue(enumname="UIBackgroundRefreshStatus") public static final long UIBackgroundRefreshStatusAvailable = 2L;
    @ObjCEnumValue(enumname="UIApplicationState") public static final long UIApplicationStateActive = 0L;
    @ObjCEnumValue(enumname="UIApplicationState") public static final long UIApplicationStateInactive = 1L;
    @ObjCEnumValue(enumname="UIApplicationState") public static final long UIApplicationStateBackground = 2L;
    @ObjCEnumValue(enumname="UIUserInterfaceLayoutDirection") public static final long UIUserInterfaceLayoutDirectionLeftToRight = 0L;
    @ObjCEnumValue(enumname="UIUserInterfaceLayoutDirection") public static final long UIUserInterfaceLayoutDirectionRightToLeft = 1L;
    @ObjCEnumValue(enumname="UIModalTransitionStyle") public static final long UIModalTransitionStyleCoverVertical = 0L;
    @ObjCEnumValue(enumname="UIModalTransitionStyle") public static final long UIModalTransitionStyleFlipHorizontal = 1L;
    @ObjCEnumValue(enumname="UIModalTransitionStyle") public static final long UIModalTransitionStyleCrossDissolve = 2L;
    @ObjCEnumValue(enumname="UIModalTransitionStyle") public static final long UIModalTransitionStylePartialCurl = 3L;
    @ObjCEnumValue(enumname="UIModalPresentationStyle") public static final long UIModalPresentationFullScreen = 0L;
    @ObjCEnumValue(enumname="UIModalPresentationStyle") public static final long UIModalPresentationPageSheet = 1L;
    @ObjCEnumValue(enumname="UIModalPresentationStyle") public static final long UIModalPresentationFormSheet = 2L;
    @ObjCEnumValue(enumname="UIModalPresentationStyle") public static final long UIModalPresentationCurrentContext = 3L;
    @ObjCEnumValue(enumname="UIModalPresentationStyle") public static final long UIModalPresentationCustom = 4L;
    @ObjCEnumValue(enumname="UIModalPresentationStyle") public static final long UIModalPresentationNone = -1L;
    @ObjCEnumValue(enumname="UIBarMetrics") public static final long UIBarMetricsDefault = 0L;
    @ObjCEnumValue(enumname="UIBarMetrics") public static final long UIBarMetricsLandscapePhone = 1L;
    @ObjCEnumValue(enumname="UIBarMetrics") public static final long UIBarMetricsDefaultPrompt = 101L;
    @ObjCEnumValue(enumname="UIBarMetrics") public static final long UIBarMetricsLandscapePhonePrompt = 102L;
    @ObjCEnumValue(enumname="UIBarPosition") public static final long UIBarPositionAny = 0L;
    @ObjCEnumValue(enumname="UIBarPosition") public static final long UIBarPositionBottom = 1L;
    @ObjCEnumValue(enumname="UIBarPosition") public static final long UIBarPositionTop = 2L;
    @ObjCEnumValue(enumname="UIBarPosition") public static final long UIBarPositionTopAttached = 3L;
    @ObjCEnumValue(enumname="UIBarButtonItemStyle") public static final long UIBarButtonItemStylePlain = 0L;
    @ObjCEnumValue(enumname="UIBarButtonItemStyle") public static final long UIBarButtonItemStyleBordered = 1L;
    @ObjCEnumValue(enumname="UIBarButtonItemStyle") public static final long UIBarButtonItemStyleDone = 2L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemDone = 0L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemCancel = 1L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemEdit = 2L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemSave = 3L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemAdd = 4L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemFlexibleSpace = 5L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemFixedSpace = 6L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemCompose = 7L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemReply = 8L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemAction = 9L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemOrganize = 10L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemBookmarks = 11L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemSearch = 12L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemRefresh = 13L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemStop = 14L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemCamera = 15L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemTrash = 16L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemPlay = 17L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemPause = 18L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemRewind = 19L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemFastForward = 20L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemUndo = 21L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemRedo = 22L;
    @ObjCEnumValue(enumname="UIBarButtonSystemItem") public static final long UIBarButtonSystemItemPageCurl = 23L;
    @ObjCEnumValue(enumname="UIButtonType") public static final long UIButtonTypeCustom = 0L;
    @ObjCEnumValue(enumname="UIButtonType") public static final long UIButtonTypeSystem = 1L;
    @ObjCEnumValue(enumname="UIButtonType") public static final long UIButtonTypeDetailDisclosure = 2L;
    @ObjCEnumValue(enumname="UIButtonType") public static final long UIButtonTypeInfoLight = 3L;
    @ObjCEnumValue(enumname="UIButtonType") public static final long UIButtonTypeInfoDark = 4L;
    @ObjCEnumValue(enumname="UIButtonType") public static final long UIButtonTypeContactAdd = 5L;
    @ObjCEnumValue(enumname="UIButtonType") public static final long UIButtonTypeRoundedRect = 1L;
    @ObjCEnumValue(enumname="UICollectionViewScrollPosition") public static final long UICollectionViewScrollPositionNone = 0L;
    @ObjCEnumValue(enumname="UICollectionViewScrollPosition") public static final long UICollectionViewScrollPositionTop = 1L;
    @ObjCEnumValue(enumname="UICollectionViewScrollPosition") public static final long UICollectionViewScrollPositionCenteredVertically = 2L;
    @ObjCEnumValue(enumname="UICollectionViewScrollPosition") public static final long UICollectionViewScrollPositionBottom = 4L;
    @ObjCEnumValue(enumname="UICollectionViewScrollPosition") public static final long UICollectionViewScrollPositionLeft = 8L;
    @ObjCEnumValue(enumname="UICollectionViewScrollPosition") public static final long UICollectionViewScrollPositionCenteredHorizontally = 16L;
    @ObjCEnumValue(enumname="UICollectionViewScrollPosition") public static final long UICollectionViewScrollPositionRight = 32L;
    @ObjCEnumValue(enumname="UICollectionElementCategory") public static final long UICollectionElementCategoryCell = 0L;
    @ObjCEnumValue(enumname="UICollectionElementCategory") public static final long UICollectionElementCategorySupplementaryView = 1L;
    @ObjCEnumValue(enumname="UICollectionElementCategory") public static final long UICollectionElementCategoryDecorationView = 2L;
    @ObjCEnumValue(enumname="UICollectionUpdateAction") public static final long UICollectionUpdateActionInsert = 0L;
    @ObjCEnumValue(enumname="UICollectionUpdateAction") public static final long UICollectionUpdateActionDelete = 1L;
    @ObjCEnumValue(enumname="UICollectionUpdateAction") public static final long UICollectionUpdateActionReload = 2L;
    @ObjCEnumValue(enumname="UICollectionUpdateAction") public static final long UICollectionUpdateActionMove = 3L;
    @ObjCEnumValue(enumname="UICollectionUpdateAction") public static final long UICollectionUpdateActionNone = 4L;
    @ObjCEnumValue(enumname="UICollectionViewScrollDirection") public static final long UICollectionViewScrollDirectionVertical = 0L;
    @ObjCEnumValue(enumname="UICollectionViewScrollDirection") public static final long UICollectionViewScrollDirectionHorizontal = 1L;
    @ObjCEnumValue(enumname="UIDataDetectorTypes") public static final long UIDataDetectorTypePhoneNumber = 1L;
    @ObjCEnumValue(enumname="UIDataDetectorTypes") public static final long UIDataDetectorTypeLink = 2L;
    @ObjCEnumValue(enumname="UIDataDetectorTypes") public static final long UIDataDetectorTypeAddress = 4L;
    @ObjCEnumValue(enumname="UIDataDetectorTypes") public static final long UIDataDetectorTypeCalendarEvent = 8L;
    @ObjCEnumValue(enumname="UIDataDetectorTypes") public static final long UIDataDetectorTypeNone = 0L;
    @ObjCEnumValue(enumname="UIDataDetectorTypes") public static final long UIDataDetectorTypeAll = -1L;
    @ObjCEnumValue(enumname="UIDatePickerMode") public static final long UIDatePickerModeTime = 0L;
    @ObjCEnumValue(enumname="UIDatePickerMode") public static final long UIDatePickerModeDate = 1L;
    @ObjCEnumValue(enumname="UIDatePickerMode") public static final long UIDatePickerModeDateAndTime = 2L;
    @ObjCEnumValue(enumname="UIDatePickerMode") public static final long UIDatePickerModeCountDownTimer = 3L;
    @ObjCEnumValue(enumname="UIDocumentChangeKind") public static final long UIDocumentChangeDone = 0L;
    @ObjCEnumValue(enumname="UIDocumentChangeKind") public static final long UIDocumentChangeUndone = 1L;
    @ObjCEnumValue(enumname="UIDocumentChangeKind") public static final long UIDocumentChangeRedone = 2L;
    @ObjCEnumValue(enumname="UIDocumentChangeKind") public static final long UIDocumentChangeCleared = 3L;
    @ObjCEnumValue(enumname="UIDocumentSaveOperation") public static final long UIDocumentSaveForCreating = 0L;
    @ObjCEnumValue(enumname="UIDocumentSaveOperation") public static final long UIDocumentSaveForOverwriting = 1L;
    @ObjCEnumValue(enumname="UIDocumentState") public static final long UIDocumentStateNormal = 0L;
    @ObjCEnumValue(enumname="UIDocumentState") public static final long UIDocumentStateClosed = 1L;
    @ObjCEnumValue(enumname="UIDocumentState") public static final long UIDocumentStateInConflict = 2L;
    @ObjCEnumValue(enumname="UIDocumentState") public static final long UIDocumentStateSavingError = 4L;
    @ObjCEnumValue(enumname="UIDocumentState") public static final long UIDocumentStateEditingDisabled = 8L;
    @ObjCEnumValue(enumname="UINavigationControllerOperation") public static final long UINavigationControllerOperationNone = 0L;
    @ObjCEnumValue(enumname="UINavigationControllerOperation") public static final long UINavigationControllerOperationPush = 1L;
    @ObjCEnumValue(enumname="UINavigationControllerOperation") public static final long UINavigationControllerOperationPop = 2L;
    @ObjCEnumValue(enumname="UIImagePickerControllerSourceType") public static final long UIImagePickerControllerSourceTypePhotoLibrary = 0L;
    @ObjCEnumValue(enumname="UIImagePickerControllerSourceType") public static final long UIImagePickerControllerSourceTypeCamera = 1L;
    @ObjCEnumValue(enumname="UIImagePickerControllerSourceType") public static final long UIImagePickerControllerSourceTypeSavedPhotosAlbum = 2L;
    @ObjCEnumValue(enumname="UIImagePickerControllerQualityType") public static final long UIImagePickerControllerQualityTypeHigh = 0L;
    @ObjCEnumValue(enumname="UIImagePickerControllerQualityType") public static final long UIImagePickerControllerQualityTypeMedium = 1L;
    @ObjCEnumValue(enumname="UIImagePickerControllerQualityType") public static final long UIImagePickerControllerQualityTypeLow = 2L;
    @ObjCEnumValue(enumname="UIImagePickerControllerQualityType") public static final long UIImagePickerControllerQualityType640x480 = 3L;
    @ObjCEnumValue(enumname="UIImagePickerControllerQualityType") public static final long UIImagePickerControllerQualityTypeIFrame1280x720 = 4L;
    @ObjCEnumValue(enumname="UIImagePickerControllerQualityType") public static final long UIImagePickerControllerQualityTypeIFrame960x540 = 5L;
    @ObjCEnumValue(enumname="UIImagePickerControllerCameraCaptureMode") public static final long UIImagePickerControllerCameraCaptureModePhoto = 0L;
    @ObjCEnumValue(enumname="UIImagePickerControllerCameraCaptureMode") public static final long UIImagePickerControllerCameraCaptureModeVideo = 1L;
    @ObjCEnumValue(enumname="UIImagePickerControllerCameraDevice") public static final long UIImagePickerControllerCameraDeviceRear = 0L;
    @ObjCEnumValue(enumname="UIImagePickerControllerCameraDevice") public static final long UIImagePickerControllerCameraDeviceFront = 1L;
    @ObjCEnumValue(enumname="UIImagePickerControllerCameraFlashMode") public static final long UIImagePickerControllerCameraFlashModeOff = -1L;
    @ObjCEnumValue(enumname="UIImagePickerControllerCameraFlashMode") public static final long UIImagePickerControllerCameraFlashModeAuto = 0L;
    @ObjCEnumValue(enumname="UIImagePickerControllerCameraFlashMode") public static final long UIImagePickerControllerCameraFlashModeOn = 1L;
    @ObjCEnumValue(enumname="UIInputViewStyle") public static final long UIInputViewStyleDefault = 0L;
    @ObjCEnumValue(enumname="UIInputViewStyle") public static final long UIInputViewStyleKeyboard = 1L;
    @ObjCEnumValue(enumname="UIMenuControllerArrowDirection") public static final long UIMenuControllerArrowDefault = 0L;
    @ObjCEnumValue(enumname="UIMenuControllerArrowDirection") public static final long UIMenuControllerArrowUp = 1L;
    @ObjCEnumValue(enumname="UIMenuControllerArrowDirection") public static final long UIMenuControllerArrowDown = 2L;
    @ObjCEnumValue(enumname="UIMenuControllerArrowDirection") public static final long UIMenuControllerArrowLeft = 3L;
    @ObjCEnumValue(enumname="UIMenuControllerArrowDirection") public static final long UIMenuControllerArrowRight = 4L;
    @ObjCEnumValue(enumname="UIInterpolatingMotionEffectType") public static final long UIInterpolatingMotionEffectTypeTiltAlongHorizontalAxis = 0L;
    @ObjCEnumValue(enumname="UIInterpolatingMotionEffectType") public static final long UIInterpolatingMotionEffectTypeTiltAlongVerticalAxis = 1L;
    @ObjCEnumValue(enumname="UIPageViewControllerNavigationOrientation") public static final long UIPageViewControllerNavigationOrientationHorizontal = 0L;
    @ObjCEnumValue(enumname="UIPageViewControllerNavigationOrientation") public static final long UIPageViewControllerNavigationOrientationVertical = 1L;
    @ObjCEnumValue(enumname="UIPageViewControllerSpineLocation") public static final long UIPageViewControllerSpineLocationNone = 0L;
    @ObjCEnumValue(enumname="UIPageViewControllerSpineLocation") public static final long UIPageViewControllerSpineLocationMin = 1L;
    @ObjCEnumValue(enumname="UIPageViewControllerSpineLocation") public static final long UIPageViewControllerSpineLocationMid = 2L;
    @ObjCEnumValue(enumname="UIPageViewControllerSpineLocation") public static final long UIPageViewControllerSpineLocationMax = 3L;
    @ObjCEnumValue(enumname="UIPageViewControllerNavigationDirection") public static final long UIPageViewControllerNavigationDirectionForward = 0L;
    @ObjCEnumValue(enumname="UIPageViewControllerNavigationDirection") public static final long UIPageViewControllerNavigationDirectionReverse = 1L;
    @ObjCEnumValue(enumname="UIPageViewControllerTransitionStyle") public static final long UIPageViewControllerTransitionStylePageCurl = 0L;
    @ObjCEnumValue(enumname="UIPageViewControllerTransitionStyle") public static final long UIPageViewControllerTransitionStyleScroll = 1L;
    @ObjCEnumValue(enumname="UIPopoverArrowDirection") public static final long UIPopoverArrowDirectionUp = 1L;
    @ObjCEnumValue(enumname="UIPopoverArrowDirection") public static final long UIPopoverArrowDirectionDown = 2L;
    @ObjCEnumValue(enumname="UIPopoverArrowDirection") public static final long UIPopoverArrowDirectionLeft = 4L;
    @ObjCEnumValue(enumname="UIPopoverArrowDirection") public static final long UIPopoverArrowDirectionRight = 8L;
    @ObjCEnumValue(enumname="UIPopoverArrowDirection") public static final long UIPopoverArrowDirectionAny = 15L;
    @ObjCEnumValue(enumname="UIPopoverArrowDirection") public static final long UIPopoverArrowDirectionUnknown = -1L;
    @ObjCEnumValue(enumname="UIPrintError") public static final int UIPrintingNotAvailableError = 1;
    @ObjCEnumValue(enumname="UIPrintError") public static final int UIPrintNoContentError = 2;
    @ObjCEnumValue(enumname="UIPrintError") public static final int UIPrintUnknownImageFormatError = 3;
    @ObjCEnumValue(enumname="UIPrintError") public static final int UIPrintJobFailedError = 4;
    @ObjCEnumValue(enumname="UIPrintInfoOutputType") public static final long UIPrintInfoOutputGeneral = 0L;
    @ObjCEnumValue(enumname="UIPrintInfoOutputType") public static final long UIPrintInfoOutputPhoto = 1L;
    @ObjCEnumValue(enumname="UIPrintInfoOutputType") public static final long UIPrintInfoOutputGrayscale = 2L;
    @ObjCEnumValue(enumname="UIPrintInfoOutputType") public static final long UIPrintInfoOutputPhotoGrayscale = 3L;
    @ObjCEnumValue(enumname="UIPrintInfoOrientation") public static final long UIPrintInfoOrientationPortrait = 0L;
    @ObjCEnumValue(enumname="UIPrintInfoOrientation") public static final long UIPrintInfoOrientationLandscape = 1L;
    @ObjCEnumValue(enumname="UIPrintInfoDuplex") public static final long UIPrintInfoDuplexNone = 0L;
    @ObjCEnumValue(enumname="UIPrintInfoDuplex") public static final long UIPrintInfoDuplexLongEdge = 1L;
    @ObjCEnumValue(enumname="UIPrintInfoDuplex") public static final long UIPrintInfoDuplexShortEdge = 2L;
    @ObjCEnumValue(enumname="UIProgressViewStyle") public static final long UIProgressViewStyleDefault = 0L;
    @ObjCEnumValue(enumname="UIProgressViewStyle") public static final long UIProgressViewStyleBar = 1L;
    @ObjCEnumValue(enumname="UIScreenOverscanCompensation") public static final long UIScreenOverscanCompensationScale = 0L;
    @ObjCEnumValue(enumname="UIScreenOverscanCompensation") public static final long UIScreenOverscanCompensationInsetBounds = 1L;
    @ObjCEnumValue(enumname="UIScreenOverscanCompensation") public static final long UIScreenOverscanCompensationInsetApplicationFrame = 2L;
    @ObjCEnumValue(enumname="UISearchBarIcon") public static final long UISearchBarIconSearch = 0L;
    @ObjCEnumValue(enumname="UISearchBarIcon") public static final long UISearchBarIconClear = 1L;
    @ObjCEnumValue(enumname="UISearchBarIcon") public static final long UISearchBarIconBookmark = 2L;
    @ObjCEnumValue(enumname="UISearchBarIcon") public static final long UISearchBarIconResultsList = 3L;
    @ObjCEnumValue(enumname="UISearchBarStyle") public static final long UISearchBarStyleDefault = 0L;
    @ObjCEnumValue(enumname="UISearchBarStyle") public static final long UISearchBarStyleProminent = 1L;
    @ObjCEnumValue(enumname="UISearchBarStyle") public static final long UISearchBarStyleMinimal = 2L;
    @ObjCEnumValue(enumname="UISegmentedControlStyle") public static final long UISegmentedControlStylePlain = 0L;
    @ObjCEnumValue(enumname="UISegmentedControlStyle") public static final long UISegmentedControlStyleBordered = 1L;
    @ObjCEnumValue(enumname="UISegmentedControlStyle") public static final long UISegmentedControlStyleBar = 2L;
    @ObjCEnumValue(enumname="UISegmentedControlStyle") public static final long UISegmentedControlStyleBezeled = 3L;
    @ObjCEnumValue(enumname="") public static final int UISegmentedControlNoSegment = -1;
    @ObjCEnumValue(enumname="UISegmentedControlSegment") public static final long UISegmentedControlSegmentAny = 0L;
    @ObjCEnumValue(enumname="UISegmentedControlSegment") public static final long UISegmentedControlSegmentLeft = 1L;
    @ObjCEnumValue(enumname="UISegmentedControlSegment") public static final long UISegmentedControlSegmentCenter = 2L;
    @ObjCEnumValue(enumname="UISegmentedControlSegment") public static final long UISegmentedControlSegmentRight = 3L;
    @ObjCEnumValue(enumname="UISegmentedControlSegment") public static final long UISegmentedControlSegmentAlone = 4L;
    @ObjCEnumValue(enumname="UITabBarItemPositioning") public static final long UITabBarItemPositioningAutomatic = 0L;
    @ObjCEnumValue(enumname="UITabBarItemPositioning") public static final long UITabBarItemPositioningFill = 1L;
    @ObjCEnumValue(enumname="UITabBarItemPositioning") public static final long UITabBarItemPositioningCentered = 2L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemMore = 0L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemFavorites = 1L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemFeatured = 2L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemTopRated = 3L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemRecents = 4L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemContacts = 5L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemHistory = 6L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemBookmarks = 7L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemSearch = 8L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemDownloads = 9L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemMostRecent = 10L;
    @ObjCEnumValue(enumname="UITabBarSystemItem") public static final long UITabBarSystemItemMostViewed = 11L;
    @ObjCEnumValue(enumname="UITouchPhase") public static final long UITouchPhaseBegan = 0L;
    @ObjCEnumValue(enumname="UITouchPhase") public static final long UITouchPhaseMoved = 1L;
    @ObjCEnumValue(enumname="UITouchPhase") public static final long UITouchPhaseStationary = 2L;
    @ObjCEnumValue(enumname="UITouchPhase") public static final long UITouchPhaseEnded = 3L;
    @ObjCEnumValue(enumname="UITouchPhase") public static final long UITouchPhaseCancelled = 4L;
    @ObjCEnumValue(enumname="UIWebViewNavigationType") public static final long UIWebViewNavigationTypeLinkClicked = 0L;
    @ObjCEnumValue(enumname="UIWebViewNavigationType") public static final long UIWebViewNavigationTypeFormSubmitted = 1L;
    @ObjCEnumValue(enumname="UIWebViewNavigationType") public static final long UIWebViewNavigationTypeBackForward = 2L;
    @ObjCEnumValue(enumname="UIWebViewNavigationType") public static final long UIWebViewNavigationTypeReload = 3L;
    @ObjCEnumValue(enumname="UIWebViewNavigationType") public static final long UIWebViewNavigationTypeFormResubmitted = 4L;
    @ObjCEnumValue(enumname="UIWebViewNavigationType") public static final long UIWebViewNavigationTypeOther = 5L;
    @ObjCEnumValue(enumname="UIWebPaginationMode") public static final long UIWebPaginationModeUnpaginated = 0L;
    @ObjCEnumValue(enumname="UIWebPaginationMode") public static final long UIWebPaginationModeLeftToRight = 1L;
    @ObjCEnumValue(enumname="UIWebPaginationMode") public static final long UIWebPaginationModeTopToBottom = 2L;
    @ObjCEnumValue(enumname="UIWebPaginationMode") public static final long UIWebPaginationModeBottomToTop = 3L;
    @ObjCEnumValue(enumname="UIWebPaginationMode") public static final long UIWebPaginationModeRightToLeft = 4L;
    @ObjCEnumValue(enumname="UIWebPaginationBreakingMode") public static final long UIWebPaginationBreakingModePage = 0L;
    @ObjCEnumValue(enumname="UIWebPaginationBreakingMode") public static final long UIWebPaginationBreakingModeColumn = 1L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlineStyleNone = 0L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlineStyleSingle = 1L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlineStyleThick = 2L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlineStyleDouble = 9L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlinePatternSolid = 0L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlinePatternDot = 256L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlinePatternDash = 512L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlinePatternDashDot = 768L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlinePatternDashDotDot = 1024L;
    @ObjCEnumValue(enumname="NSUnderlineStyle") public static final long NSUnderlineByWord = 32768L;
    @ObjCEnumValue(enumname="NSTextWritingDirection") public static final long NSTextWritingDirectionEmbedding = 0L;
    @ObjCEnumValue(enumname="NSTextWritingDirection") public static final long NSTextWritingDirectionOverride = 2L;
    @ObjCEnumValue(enumname="NSTextStorageEditActions") public static final long NSTextStorageEditedAttributes = 1L;
    @ObjCEnumValue(enumname="NSTextStorageEditActions") public static final long NSTextStorageEditedCharacters = 2L;
    @ObjCEnumValue(enumname="NSTextLayoutOrientation") public static final long NSTextLayoutOrientationHorizontal = 0L;
    @ObjCEnumValue(enumname="NSTextLayoutOrientation") public static final long NSTextLayoutOrientationVertical = 1L;
    @ObjCEnumValue(enumname="NSGlyphProperty") public static final long NSGlyphPropertyNull = 1L;
    @ObjCEnumValue(enumname="NSGlyphProperty") public static final long NSGlyphPropertyControlCharacter = 2L;
    @ObjCEnumValue(enumname="NSGlyphProperty") public static final long NSGlyphPropertyElastic = 4L;
    @ObjCEnumValue(enumname="NSGlyphProperty") public static final long NSGlyphPropertyNonBaseCharacter = 8L;
    @ObjCEnumValue(enumname="NSControlCharacterAction") public static final long NSControlCharacterZeroAdvancementAction = 1L;
    @ObjCEnumValue(enumname="NSControlCharacterAction") public static final long NSControlCharacterWhitespaceAction = 2L;
    @ObjCEnumValue(enumname="NSControlCharacterAction") public static final long NSControlCharacterHorizontalTabAction = 4L;
    @ObjCEnumValue(enumname="NSControlCharacterAction") public static final long NSControlCharacterLineBreakAction = 8L;
    @ObjCEnumValue(enumname="NSControlCharacterAction") public static final long NSControlCharacterParagraphBreakAction = 16L;
    @ObjCEnumValue(enumname="NSControlCharacterAction") public static final long NSControlCharacterContainerBreakAction = 32L;
    @ObjCEnumValue(enumname="NSStringDrawingOptions") public static final long NSStringDrawingTruncatesLastVisibleLine = 32L;
    @ObjCEnumValue(enumname="NSStringDrawingOptions") public static final long NSStringDrawingUsesLineFragmentOrigin = 1L;
    @ObjCEnumValue(enumname="NSStringDrawingOptions") public static final long NSStringDrawingUsesFontLeading = 2L;
    @ObjCEnumValue(enumname="NSStringDrawingOptions") public static final long NSStringDrawingUsesDeviceMetrics = 8L;
    @ObjCEnumValue(enumname="") public static final int NSAttachmentCharacter = 65532;
    @ObjCEnumValue(enumname="UIPushBehaviorMode") public static final long UIPushBehaviorModeContinuous = 0L;
    @ObjCEnumValue(enumname="UIPushBehaviorMode") public static final long UIPushBehaviorModeInstantaneous = 1L;
    @ObjCEnumValue(enumname="UIAttachmentBehaviorType") public static final long UIAttachmentBehaviorTypeItems = 0L;
    @ObjCEnumValue(enumname="UIAttachmentBehaviorType") public static final long UIAttachmentBehaviorTypeAnchor = 1L;
    @ObjCEnumValue(enumname="UICollisionBehaviorMode") public static final long UICollisionBehaviorModeItems = 1L;
    @ObjCEnumValue(enumname="UICollisionBehaviorMode") public static final long UICollisionBehaviorModeBoundaries = 2L;
    @ObjCEnumValue(enumname="UICollisionBehaviorMode") public static final long UICollisionBehaviorModeEverything = -1L;
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIKeyInputUpArrow")
    public static NSString UIKeyInputUpArrow;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIKeyInputDownArrow")
    public static NSString UIKeyInputDownArrow;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIKeyInputLeftArrow")
    public static NSString UIKeyInputLeftArrow;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIKeyInputRightArrow")
    public static NSString UIKeyInputRightArrow;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIKeyInputEscape")
    public static NSString UIKeyInputEscape;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorFamilyAttribute")
    public static NSString UIFontDescriptorFamilyAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorNameAttribute")
    public static NSString UIFontDescriptorNameAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorFaceAttribute")
    public static NSString UIFontDescriptorFaceAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorSizeAttribute")
    public static NSString UIFontDescriptorSizeAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorVisibleNameAttribute")
    public static NSString UIFontDescriptorVisibleNameAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorMatrixAttribute")
    public static NSString UIFontDescriptorMatrixAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorCharacterSetAttribute")
    public static NSString UIFontDescriptorCharacterSetAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorCascadeListAttribute")
    public static NSString UIFontDescriptorCascadeListAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorTraitsAttribute")
    public static NSString UIFontDescriptorTraitsAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorFixedAdvanceAttribute")
    public static NSString UIFontDescriptorFixedAdvanceAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorFeatureSettingsAttribute")
    public static NSString UIFontDescriptorFeatureSettingsAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontDescriptorTextStyleAttribute")
    public static NSString UIFontDescriptorTextStyleAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontSymbolicTrait")
    public static NSString UIFontSymbolicTrait;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontWeightTrait")
    public static NSString UIFontWeightTrait;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontWidthTrait")
    public static NSString UIFontWidthTrait;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontSlantTrait")
    public static NSString UIFontSlantTrait;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontFeatureTypeIdentifierKey")
    public static NSString UIFontFeatureTypeIdentifierKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontFeatureSelectorIdentifierKey")
    public static NSString UIFontFeatureSelectorIdentifierKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontTextStyleHeadline")
    public static NSString UIFontTextStyleHeadline;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontTextStyleBody")
    public static NSString UIFontTextStyleBody;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontTextStyleSubheadline")
    public static NSString UIFontTextStyleSubheadline;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontTextStyleFootnote")
    public static NSString UIFontTextStyleFootnote;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontTextStyleCaption1")
    public static NSString UIFontTextStyleCaption1;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIFontTextStyleCaption2")
    public static NSString UIFontTextStyleCaption2;

    @GlobalVariable(name="UIEdgeInsetsZero")
    public static @ObjCByValue UIEdgeInsets UIEdgeInsetsZero;

    @GlobalVariable(name="UIOffsetZero")
    public static @ObjCByValue UIOffset UIOffsetZero;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIViewNoIntrinsicMetric")
    public static float UIViewNoIntrinsicMetric;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UILayoutFittingCompressedSize")
    public static @ObjCByValue CGSize UILayoutFittingCompressedSize;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UILayoutFittingExpandedSize")
    public static @ObjCByValue CGSize UILayoutFittingExpandedSize;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIScrollViewDecelerationRateNormal")
    public static float UIScrollViewDecelerationRateNormal;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIScrollViewDecelerationRateFast")
    public static float UIScrollViewDecelerationRateFast;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTabColumnTerminatorsAttributeName")
    public static NSString NSTabColumnTerminatorsAttributeName;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="UITextAttributeFont")
    public static NSString UITextAttributeFont;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="UITextAttributeTextColor")
    public static NSString UITextAttributeTextColor;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="UITextAttributeTextShadowColor")
    public static NSString UITextAttributeTextShadowColor;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="UITextAttributeTextShadowOffset")
    public static NSString UITextAttributeTextShadowOffset;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UITableViewIndexSearch")
    public static NSString UITableViewIndexSearch;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UITableViewAutomaticDimension")
    public static float UITableViewAutomaticDimension;

    @GlobalVariable(name="UITableViewSelectionDidChangeNotification")
    public static NSString UITableViewSelectionDidChangeNotification;

    @GlobalVariable(name="UIAccessibilityTraitNone")
    public static @Unsigned @LongLong long UIAccessibilityTraitNone;

    @GlobalVariable(name="UIAccessibilityTraitButton")
    public static @Unsigned @LongLong long UIAccessibilityTraitButton;

    @GlobalVariable(name="UIAccessibilityTraitLink")
    public static @Unsigned @LongLong long UIAccessibilityTraitLink;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityTraitHeader")
    public static @Unsigned @LongLong long UIAccessibilityTraitHeader;

    @GlobalVariable(name="UIAccessibilityTraitSearchField")
    public static @Unsigned @LongLong long UIAccessibilityTraitSearchField;

    @GlobalVariable(name="UIAccessibilityTraitImage")
    public static @Unsigned @LongLong long UIAccessibilityTraitImage;

    @GlobalVariable(name="UIAccessibilityTraitSelected")
    public static @Unsigned @LongLong long UIAccessibilityTraitSelected;

    @GlobalVariable(name="UIAccessibilityTraitPlaysSound")
    public static @Unsigned @LongLong long UIAccessibilityTraitPlaysSound;

    @GlobalVariable(name="UIAccessibilityTraitKeyboardKey")
    public static @Unsigned @LongLong long UIAccessibilityTraitKeyboardKey;

    @GlobalVariable(name="UIAccessibilityTraitStaticText")
    public static @Unsigned @LongLong long UIAccessibilityTraitStaticText;

    @GlobalVariable(name="UIAccessibilityTraitSummaryElement")
    public static @Unsigned @LongLong long UIAccessibilityTraitSummaryElement;

    @GlobalVariable(name="UIAccessibilityTraitNotEnabled")
    public static @Unsigned @LongLong long UIAccessibilityTraitNotEnabled;

    @GlobalVariable(name="UIAccessibilityTraitUpdatesFrequently")
    public static @Unsigned @LongLong long UIAccessibilityTraitUpdatesFrequently;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityTraitStartsMediaSession")
    public static @Unsigned @LongLong long UIAccessibilityTraitStartsMediaSession;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityTraitAdjustable")
    public static @Unsigned @LongLong long UIAccessibilityTraitAdjustable;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityTraitAllowsDirectInteraction")
    public static @Unsigned @LongLong long UIAccessibilityTraitAllowsDirectInteraction;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityTraitCausesPageTurn")
    public static @Unsigned @LongLong long UIAccessibilityTraitCausesPageTurn;

    @GlobalVariable(name="UIAccessibilityScreenChangedNotification")
    public static @Unsigned int UIAccessibilityScreenChangedNotification;

    @GlobalVariable(name="UIAccessibilityLayoutChangedNotification")
    public static @Unsigned int UIAccessibilityLayoutChangedNotification;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityAnnouncementNotification")
    public static @Unsigned int UIAccessibilityAnnouncementNotification;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityAnnouncementDidFinishNotification")
    public static NSString UIAccessibilityAnnouncementDidFinishNotification;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityAnnouncementKeyStringValue")
    public static NSString UIAccessibilityAnnouncementKeyStringValue;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityAnnouncementKeyWasSuccessful")
    public static NSString UIAccessibilityAnnouncementKeyWasSuccessful;

    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalVariable(name="UIAccessibilityPageScrolledNotification")
    public static @Unsigned int UIAccessibilityPageScrolledNotification;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIAccessibilitySpeechAttributePunctuation")
    public static NSString UIAccessibilitySpeechAttributePunctuation;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIAccessibilitySpeechAttributeLanguage")
    public static NSString UIAccessibilitySpeechAttributeLanguage;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIAccessibilitySpeechAttributePitch")
    public static NSString UIAccessibilitySpeechAttributePitch;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityVoiceOverStatusChanged")
    public static NSString UIAccessibilityVoiceOverStatusChanged;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityMonoAudioStatusDidChangeNotification")
    public static NSString UIAccessibilityMonoAudioStatusDidChangeNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityClosedCaptioningStatusDidChangeNotification")
    public static NSString UIAccessibilityClosedCaptioningStatusDidChangeNotification;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityInvertColorsStatusDidChangeNotification")
    public static NSString UIAccessibilityInvertColorsStatusDidChangeNotification;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIAccessibilityGuidedAccessStatusDidChangeNotification")
    public static NSString UIAccessibilityGuidedAccessStatusDidChangeNotification;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypePostToFacebook")
    public static NSString UIActivityTypePostToFacebook;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypePostToTwitter")
    public static NSString UIActivityTypePostToTwitter;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypePostToWeibo")
    public static NSString UIActivityTypePostToWeibo;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypeMessage")
    public static NSString UIActivityTypeMessage;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypeMail")
    public static NSString UIActivityTypeMail;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypePrint")
    public static NSString UIActivityTypePrint;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypeCopyToPasteboard")
    public static NSString UIActivityTypeCopyToPasteboard;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypeAssignToContact")
    public static NSString UIActivityTypeAssignToContact;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIActivityTypeSaveToCameraRoll")
    public static NSString UIActivityTypeSaveToCameraRoll;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIActivityTypeAddToReadingList")
    public static NSString UIActivityTypeAddToReadingList;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIActivityTypePostToFlickr")
    public static NSString UIActivityTypePostToFlickr;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIActivityTypePostToVimeo")
    public static NSString UIActivityTypePostToVimeo;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIActivityTypePostToTencentWeibo")
    public static NSString UIActivityTypePostToTencentWeibo;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIActivityTypeAirDrop")
    public static NSString UIActivityTypeAirDrop;

    @GlobalVariable(name="UIDeviceOrientationDidChangeNotification")
    public static NSString UIDeviceOrientationDidChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIDeviceBatteryStateDidChangeNotification")
    public static NSString UIDeviceBatteryStateDidChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIDeviceBatteryLevelDidChangeNotification")
    public static NSString UIDeviceBatteryLevelDidChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIDeviceProximityStateDidChangeNotification")
    public static NSString UIDeviceProximityStateDidChangeNotification;

    @GlobalVariable(name="UITextInputTextBackgroundColorKey")
    public static NSString UITextInputTextBackgroundColorKey;

    @GlobalVariable(name="UITextInputTextColorKey")
    public static NSString UITextInputTextColorKey;

    @GlobalVariable(name="UITextInputTextFontKey")
    public static NSString UITextInputTextFontKey;

    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalVariable(name="UITextInputCurrentInputModeDidChangeNotification")
    public static NSString UITextInputCurrentInputModeDidChangeNotification;

    @GlobalVariable(name="UITextFieldTextDidBeginEditingNotification")
    public static NSString UITextFieldTextDidBeginEditingNotification;

    @GlobalVariable(name="UITextFieldTextDidEndEditingNotification")
    public static NSString UITextFieldTextDidEndEditingNotification;

    @GlobalVariable(name="UITextFieldTextDidChangeNotification")
    public static NSString UITextFieldTextDidChangeNotification;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIApplicationInvalidInterfaceOrientationException")
    public static NSString UIApplicationInvalidInterfaceOrientationException;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIBackgroundTaskInvalid")
    public static @NSUInteger long UIBackgroundTaskInvalid;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIMinimumKeepAliveTimeout")
    public static double UIMinimumKeepAliveTimeout;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationBackgroundFetchIntervalMinimum")
    public static double UIApplicationBackgroundFetchIntervalMinimum;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationBackgroundFetchIntervalNever")
    public static double UIApplicationBackgroundFetchIntervalNever;

    @GlobalVariable(name="UITrackingRunLoopMode")
    public static NSString UITrackingRunLoopMode;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIApplicationDidEnterBackgroundNotification")
    public static NSString UIApplicationDidEnterBackgroundNotification;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIApplicationWillEnterForegroundNotification")
    public static NSString UIApplicationWillEnterForegroundNotification;

    @GlobalVariable(name="UIApplicationDidFinishLaunchingNotification")
    public static NSString UIApplicationDidFinishLaunchingNotification;

    @GlobalVariable(name="UIApplicationDidBecomeActiveNotification")
    public static NSString UIApplicationDidBecomeActiveNotification;

    @GlobalVariable(name="UIApplicationWillResignActiveNotification")
    public static NSString UIApplicationWillResignActiveNotification;

    @GlobalVariable(name="UIApplicationDidReceiveMemoryWarningNotification")
    public static NSString UIApplicationDidReceiveMemoryWarningNotification;

    @GlobalVariable(name="UIApplicationWillTerminateNotification")
    public static NSString UIApplicationWillTerminateNotification;

    @GlobalVariable(name="UIApplicationSignificantTimeChangeNotification")
    public static NSString UIApplicationSignificantTimeChangeNotification;

    @GlobalVariable(name="UIApplicationWillChangeStatusBarOrientationNotification")
    public static NSString UIApplicationWillChangeStatusBarOrientationNotification;

    @GlobalVariable(name="UIApplicationDidChangeStatusBarOrientationNotification")
    public static NSString UIApplicationDidChangeStatusBarOrientationNotification;

    @GlobalVariable(name="UIApplicationStatusBarOrientationUserInfoKey")
    public static NSString UIApplicationStatusBarOrientationUserInfoKey;

    @GlobalVariable(name="UIApplicationWillChangeStatusBarFrameNotification")
    public static NSString UIApplicationWillChangeStatusBarFrameNotification;

    @GlobalVariable(name="UIApplicationDidChangeStatusBarFrameNotification")
    public static NSString UIApplicationDidChangeStatusBarFrameNotification;

    @GlobalVariable(name="UIApplicationStatusBarFrameUserInfoKey")
    public static NSString UIApplicationStatusBarFrameUserInfoKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationBackgroundRefreshStatusDidChangeNotification")
    public static NSString UIApplicationBackgroundRefreshStatusDidChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsURLKey")
    public static NSString UIApplicationLaunchOptionsURLKey;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsSourceApplicationKey")
    public static NSString UIApplicationLaunchOptionsSourceApplicationKey;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsRemoteNotificationKey")
    public static NSString UIApplicationLaunchOptionsRemoteNotificationKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsLocalNotificationKey")
    public static NSString UIApplicationLaunchOptionsLocalNotificationKey;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsAnnotationKey")
    public static NSString UIApplicationLaunchOptionsAnnotationKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIApplicationProtectedDataWillBecomeUnavailable")
    public static NSString UIApplicationProtectedDataWillBecomeUnavailable;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIApplicationProtectedDataDidBecomeAvailable")
    public static NSString UIApplicationProtectedDataDidBecomeAvailable;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsLocationKey")
    public static NSString UIApplicationLaunchOptionsLocationKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsNewsstandDownloadsKey")
    public static NSString UIApplicationLaunchOptionsNewsstandDownloadsKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsBluetoothCentralsKey")
    public static NSString UIApplicationLaunchOptionsBluetoothCentralsKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationLaunchOptionsBluetoothPeripheralsKey")
    public static NSString UIApplicationLaunchOptionsBluetoothPeripheralsKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryExtraSmall")
    public static NSString UIContentSizeCategoryExtraSmall;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategorySmall")
    public static NSString UIContentSizeCategorySmall;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryMedium")
    public static NSString UIContentSizeCategoryMedium;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryLarge")
    public static NSString UIContentSizeCategoryLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryExtraLarge")
    public static NSString UIContentSizeCategoryExtraLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryExtraExtraLarge")
    public static NSString UIContentSizeCategoryExtraExtraLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryExtraExtraExtraLarge")
    public static NSString UIContentSizeCategoryExtraExtraExtraLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryAccessibilityMedium")
    public static NSString UIContentSizeCategoryAccessibilityMedium;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryAccessibilityLarge")
    public static NSString UIContentSizeCategoryAccessibilityLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryAccessibilityExtraLarge")
    public static NSString UIContentSizeCategoryAccessibilityExtraLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryAccessibilityExtraExtraLarge")
    public static NSString UIContentSizeCategoryAccessibilityExtraExtraLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryAccessibilityExtraExtraExtraLarge")
    public static NSString UIContentSizeCategoryAccessibilityExtraExtraExtraLarge;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryDidChangeNotification")
    public static NSString UIContentSizeCategoryDidChangeNotification;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIContentSizeCategoryNewValueKey")
    public static NSString UIContentSizeCategoryNewValueKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationUserDidTakeScreenshotNotification")
    public static NSString UIApplicationUserDidTakeScreenshotNotification;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIStateRestorationViewControllerStoryboardKey")
    public static NSString UIStateRestorationViewControllerStoryboardKey;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIApplicationStateRestorationBundleVersionKey")
    public static NSString UIApplicationStateRestorationBundleVersionKey;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIApplicationStateRestorationUserInterfaceIdiomKey")
    public static NSString UIApplicationStateRestorationUserInterfaceIdiomKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationStateRestorationTimestampKey")
    public static NSString UIApplicationStateRestorationTimestampKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UIApplicationStateRestorationSystemVersionKey")
    public static NSString UIApplicationStateRestorationSystemVersionKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIViewControllerHierarchyInconsistencyException")
    public static NSString UIViewControllerHierarchyInconsistencyException;

    @GlobalVariable(name="UICollectionElementKindSectionHeader")
    public static NSString UICollectionElementKindSectionHeader;

    @GlobalVariable(name="UICollectionElementKindSectionFooter")
    public static NSString UICollectionElementKindSectionFooter;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIDocumentStateChangedNotification")
    public static NSString UIDocumentStateChangedNotification;

    @GlobalVariable(name="UINavigationControllerHideShowBarDuration")
    public static float UINavigationControllerHideShowBarDuration;

    @GlobalVariable(name="UIImagePickerControllerMediaType")
    public static NSString UIImagePickerControllerMediaType;

    @GlobalVariable(name="UIImagePickerControllerOriginalImage")
    public static NSString UIImagePickerControllerOriginalImage;

    @GlobalVariable(name="UIImagePickerControllerEditedImage")
    public static NSString UIImagePickerControllerEditedImage;

    @GlobalVariable(name="UIImagePickerControllerCropRect")
    public static NSString UIImagePickerControllerCropRect;

    @GlobalVariable(name="UIImagePickerControllerMediaURL")
    public static NSString UIImagePickerControllerMediaURL;

    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalVariable(name="UIImagePickerControllerReferenceURL")
    public static NSString UIImagePickerControllerReferenceURL;

    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalVariable(name="UIImagePickerControllerMediaMetadata")
    public static NSString UIImagePickerControllerMediaMetadata;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="UILocalNotificationDefaultSoundName")
    public static NSString UILocalNotificationDefaultSoundName;

    @GlobalVariable(name="UIMenuControllerWillShowMenuNotification")
    public static NSString UIMenuControllerWillShowMenuNotification;

    @GlobalVariable(name="UIMenuControllerDidShowMenuNotification")
    public static NSString UIMenuControllerDidShowMenuNotification;

    @GlobalVariable(name="UIMenuControllerWillHideMenuNotification")
    public static NSString UIMenuControllerWillHideMenuNotification;

    @GlobalVariable(name="UIMenuControllerDidHideMenuNotification")
    public static NSString UIMenuControllerDidHideMenuNotification;

    @GlobalVariable(name="UIMenuControllerMenuFrameDidChangeNotification")
    public static NSString UIMenuControllerMenuFrameDidChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UINibExternalObjects")
    public static NSString UINibExternalObjects;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @GlobalVariable(name="UINibProxiedObjectsKey")
    public static NSString UINibProxiedObjectsKey;

    @GlobalVariable(name="UIPageViewControllerOptionSpineLocationKey")
    public static NSString UIPageViewControllerOptionSpineLocationKey;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="UIPageViewControllerOptionInterPageSpacingKey")
    public static NSString UIPageViewControllerOptionInterPageSpacingKey;

    @GlobalVariable(name="UIPasteboardNameGeneral")
    public static NSString UIPasteboardNameGeneral;

    @GlobalVariable(name="UIPasteboardNameFind")
    public static NSString UIPasteboardNameFind;

    @GlobalVariable(name="UIPasteboardChangedNotification")
    public static NSString UIPasteboardChangedNotification;

    @GlobalVariable(name="UIPasteboardChangedTypesAddedKey")
    public static NSString UIPasteboardChangedTypesAddedKey;

    @GlobalVariable(name="UIPasteboardChangedTypesRemovedKey")
    public static NSString UIPasteboardChangedTypesRemovedKey;

    @GlobalVariable(name="UIPasteboardRemovedNotification")
    public static NSString UIPasteboardRemovedNotification;

    @GlobalVariable(name="UIPasteboardTypeListString")
    public static NSArray UIPasteboardTypeListString;

    @GlobalVariable(name="UIPasteboardTypeListURL")
    public static NSArray UIPasteboardTypeListURL;

    @GlobalVariable(name="UIPasteboardTypeListImage")
    public static NSArray UIPasteboardTypeListImage;

    @GlobalVariable(name="UIPasteboardTypeListColor")
    public static NSArray UIPasteboardTypeListColor;

    @GlobalVariable(name="UIPrintErrorDomain")
    public static NSString UIPrintErrorDomain;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalVariable(name="UIScreenDidConnectNotification")
    public static NSString UIScreenDidConnectNotification;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalVariable(name="UIScreenDidDisconnectNotification")
    public static NSString UIScreenDidDisconnectNotification;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalVariable(name="UIScreenModeDidChangeNotification")
    public static NSString UIScreenModeDidChangeNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIScreenBrightnessDidChangeNotification")
    public static NSString UIScreenBrightnessDidChangeNotification;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UITransitionContextFromViewControllerKey")
    public static NSString UITransitionContextFromViewControllerKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="UITransitionContextToViewControllerKey")
    public static NSString UITransitionContextToViewControllerKey;

    @GlobalVariable(name="UITextViewTextDidBeginEditingNotification")
    public static NSString UITextViewTextDidBeginEditingNotification;

    @GlobalVariable(name="UITextViewTextDidChangeNotification")
    public static NSString UITextViewTextDidChangeNotification;

    @GlobalVariable(name="UITextViewTextDidEndEditingNotification")
    public static NSString UITextViewTextDidEndEditingNotification;

    @GlobalVariable(name="UIWindowLevelNormal")
    public static float UIWindowLevelNormal;

    @GlobalVariable(name="UIWindowLevelAlert")
    public static float UIWindowLevelAlert;

    @GlobalVariable(name="UIWindowLevelStatusBar")
    public static float UIWindowLevelStatusBar;

    @GlobalVariable(name="UIWindowDidBecomeVisibleNotification")
    public static NSString UIWindowDidBecomeVisibleNotification;

    @GlobalVariable(name="UIWindowDidBecomeHiddenNotification")
    public static NSString UIWindowDidBecomeHiddenNotification;

    @GlobalVariable(name="UIWindowDidBecomeKeyNotification")
    public static NSString UIWindowDidBecomeKeyNotification;

    @GlobalVariable(name="UIWindowDidResignKeyNotification")
    public static NSString UIWindowDidResignKeyNotification;

    @GlobalVariable(name="UIKeyboardWillShowNotification")
    public static NSString UIKeyboardWillShowNotification;

    @GlobalVariable(name="UIKeyboardDidShowNotification")
    public static NSString UIKeyboardDidShowNotification;

    @GlobalVariable(name="UIKeyboardWillHideNotification")
    public static NSString UIKeyboardWillHideNotification;

    @GlobalVariable(name="UIKeyboardDidHideNotification")
    public static NSString UIKeyboardDidHideNotification;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalVariable(name="UIKeyboardFrameBeginUserInfoKey")
    public static NSString UIKeyboardFrameBeginUserInfoKey;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalVariable(name="UIKeyboardFrameEndUserInfoKey")
    public static NSString UIKeyboardFrameEndUserInfoKey;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIKeyboardAnimationDurationUserInfoKey")
    public static NSString UIKeyboardAnimationDurationUserInfoKey;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="UIKeyboardAnimationCurveUserInfoKey")
    public static NSString UIKeyboardAnimationCurveUserInfoKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIKeyboardWillChangeFrameNotification")
    public static NSString UIKeyboardWillChangeFrameNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="UIKeyboardDidChangeFrameNotification")
    public static NSString UIKeyboardDidChangeFrameNotification;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.2.
     */
    @Deprecated
    @GlobalVariable(name="UIKeyboardCenterBeginUserInfoKey")
    public static NSString UIKeyboardCenterBeginUserInfoKey;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.2.
     */
    @Deprecated
    @GlobalVariable(name="UIKeyboardCenterEndUserInfoKey")
    public static NSString UIKeyboardCenterEndUserInfoKey;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.2.
     */
    @Deprecated
    @GlobalVariable(name="UIKeyboardBoundsUserInfoKey")
    public static NSString UIKeyboardBoundsUserInfoKey;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSFontAttributeName")
    public static NSString NSFontAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSParagraphStyleAttributeName")
    public static NSString NSParagraphStyleAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSForegroundColorAttributeName")
    public static NSString NSForegroundColorAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSBackgroundColorAttributeName")
    public static NSString NSBackgroundColorAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSLigatureAttributeName")
    public static NSString NSLigatureAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSKernAttributeName")
    public static NSString NSKernAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSStrikethroughStyleAttributeName")
    public static NSString NSStrikethroughStyleAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSUnderlineStyleAttributeName")
    public static NSString NSUnderlineStyleAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSStrokeColorAttributeName")
    public static NSString NSStrokeColorAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSStrokeWidthAttributeName")
    public static NSString NSStrokeWidthAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSShadowAttributeName")
    public static NSString NSShadowAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTextEffectAttributeName")
    public static NSString NSTextEffectAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSAttachmentAttributeName")
    public static NSString NSAttachmentAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSLinkAttributeName")
    public static NSString NSLinkAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSBaselineOffsetAttributeName")
    public static NSString NSBaselineOffsetAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSUnderlineColorAttributeName")
    public static NSString NSUnderlineColorAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSStrikethroughColorAttributeName")
    public static NSString NSStrikethroughColorAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSObliquenessAttributeName")
    public static NSString NSObliquenessAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSExpansionAttributeName")
    public static NSString NSExpansionAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSWritingDirectionAttributeName")
    public static NSString NSWritingDirectionAttributeName;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSVerticalGlyphFormAttributeName")
    public static NSString NSVerticalGlyphFormAttributeName;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTextEffectLetterpressStyle")
    public static NSString NSTextEffectLetterpressStyle;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSPlainTextDocumentType")
    public static NSString NSPlainTextDocumentType;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSRTFTextDocumentType")
    public static NSString NSRTFTextDocumentType;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSRTFDTextDocumentType")
    public static NSString NSRTFDTextDocumentType;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSHTMLTextDocumentType")
    public static NSString NSHTMLTextDocumentType;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTextLayoutSectionOrientation")
    public static NSString NSTextLayoutSectionOrientation;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTextLayoutSectionRange")
    public static NSString NSTextLayoutSectionRange;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSDocumentTypeDocumentAttribute")
    public static NSString NSDocumentTypeDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSCharacterEncodingDocumentAttribute")
    public static NSString NSCharacterEncodingDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSDefaultAttributesDocumentAttribute")
    public static NSString NSDefaultAttributesDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSPaperSizeDocumentAttribute")
    public static NSString NSPaperSizeDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSPaperMarginDocumentAttribute")
    public static NSString NSPaperMarginDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSViewSizeDocumentAttribute")
    public static NSString NSViewSizeDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSViewZoomDocumentAttribute")
    public static NSString NSViewZoomDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSViewModeDocumentAttribute")
    public static NSString NSViewModeDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSReadOnlyDocumentAttribute")
    public static NSString NSReadOnlyDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSBackgroundColorDocumentAttribute")
    public static NSString NSBackgroundColorDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSHyphenationFactorDocumentAttribute")
    public static NSString NSHyphenationFactorDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSDefaultTabIntervalDocumentAttribute")
    public static NSString NSDefaultTabIntervalDocumentAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTextLayoutSectionsAttribute")
    public static NSString NSTextLayoutSectionsAttribute;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTextStorageWillProcessEditingNotification")
    public static NSString NSTextStorageWillProcessEditingNotification;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSTextStorageDidProcessEditingNotification")
    public static NSString NSTextStorageDidProcessEditingNotification;

    
    @InlineFunction(name="UIEdgeInsetsMake")
    @GlobalFunction(name="UIEdgeInsetsMake")
    public static native @ObjCByValue UIEdgeInsets UIEdgeInsetsMake(float top, float left, float bottom, float right);

    @InlineFunction(name="UIEdgeInsetsInsetRect")
    @GlobalFunction(name="UIEdgeInsetsInsetRect")
    public static native @ObjCByValue CGRect UIEdgeInsetsInsetRect(@ObjCByValue CGRect rect, @ObjCByValue UIEdgeInsets insets);

    @InlineFunction(name="UIOffsetMake")
    @GlobalFunction(name="UIOffsetMake")
    public static native @ObjCByValue UIOffset UIOffsetMake(float horizontal, float vertical);

    @InlineFunction(name="UIEdgeInsetsEqualToEdgeInsets")
    @GlobalFunction(name="UIEdgeInsetsEqualToEdgeInsets")
    public static native boolean UIEdgeInsetsEqualToEdgeInsets(@ObjCByValue UIEdgeInsets insets1, @ObjCByValue UIEdgeInsets insets2);

    @InlineFunction(name="UIOffsetEqualToOffset")
    @GlobalFunction(name="UIOffsetEqualToOffset")
    public static native boolean UIOffsetEqualToOffset(@ObjCByValue UIOffset offset1, @ObjCByValue UIOffset offset2);

    @GlobalFunction(name="NSStringFromCGPoint")
    public static native NSString NSStringFromCGPoint(@ObjCByValue CGPoint point);

    @GlobalFunction(name="NSStringFromCGSize")
    public static native NSString NSStringFromCGSize(@ObjCByValue CGSize size);

    @GlobalFunction(name="NSStringFromCGRect")
    public static native NSString NSStringFromCGRect(@ObjCByValue CGRect rect);

    @GlobalFunction(name="NSStringFromCGAffineTransform")
    public static native NSString NSStringFromCGAffineTransform(@ObjCByValue CGAffineTransform transform);

    @GlobalFunction(name="NSStringFromUIEdgeInsets")
    public static native NSString NSStringFromUIEdgeInsets(@ObjCByValue UIEdgeInsets insets);

    @GlobalFunction(name="NSStringFromUIOffset")
    public static native NSString NSStringFromUIOffset(@ObjCByValue UIOffset offset);

    @GlobalFunction(name="CGPointFromString")
    public static native @ObjCByValue CGPoint CGPointFromString(NSString string);

    @GlobalFunction(name="CGSizeFromString")
    public static native @ObjCByValue CGSize CGSizeFromString(NSString string);

    @GlobalFunction(name="CGRectFromString")
    public static native @ObjCByValue CGRect CGRectFromString(NSString string);

    @GlobalFunction(name="CGAffineTransformFromString")
    public static native @ObjCByValue CGAffineTransform CGAffineTransformFromString(NSString string);

    @GlobalFunction(name="UIEdgeInsetsFromString")
    public static native @ObjCByValue UIEdgeInsets UIEdgeInsetsFromString(NSString string);

    @GlobalFunction(name="UIOffsetFromString")
    public static native @ObjCByValue UIOffset UIOffsetFromString(NSString string);

    @GlobalFunction(name="UIImagePNGRepresentation")
    public static native NSData UIImagePNGRepresentation(UIImage image);

    @GlobalFunction(name="UIImageJPEGRepresentation")
    public static native NSData UIImageJPEGRepresentation(UIImage image, float compressionQuality);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityZoomFocusChanged")
    public static native void UIAccessibilityZoomFocusChanged(UIAccessibilityZoomType type, @ObjCByValue CGRect frame, UIView view);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityRegisterGestureConflictWithZoom")
    public static native void UIAccessibilityRegisterGestureConflictWithZoom();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction(name="UIGuidedAccessRestrictionStateForIdentifier")
    public static native UIGuidedAccessRestrictionState UIGuidedAccessRestrictionStateForIdentifier(NSString restrictionIdentifier);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityConvertFrameToScreenCoordinates")
    public static native @ObjCByValue CGRect UIAccessibilityConvertFrameToScreenCoordinates(@ObjCByValue CGRect rect, UIView view);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityConvertPathToScreenCoordinates")
    public static native UIBezierPath UIAccessibilityConvertPathToScreenCoordinates(UIBezierPath path, UIView view);

    @GlobalFunction(name="UIAccessibilityPostNotification")
    public static native void UIAccessibilityPostNotification(@Unsigned int notification, NSObject argument);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityIsVoiceOverRunning")
    public static native boolean UIAccessibilityIsVoiceOverRunning();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityIsMonoAudioEnabled")
    public static native boolean UIAccessibilityIsMonoAudioEnabled();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityIsClosedCaptioningEnabled")
    public static native boolean UIAccessibilityIsClosedCaptioningEnabled();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityIsInvertColorsEnabled")
    public static native boolean UIAccessibilityIsInvertColorsEnabled();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityIsGuidedAccessEnabled")
    public static native boolean UIAccessibilityIsGuidedAccessEnabled();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction(name="UIAccessibilityRequestGuidedAccessSession")
    public static native void UIAccessibilityRequestGuidedAccessSession(boolean enable, ObjCBlock completionHandler);

    @GlobalFunction(name="UIApplicationMain")
    public static native int UIApplicationMain(int argc, byte[][] argv, NSString principalClassName, NSString delegateClassName);

    @GlobalFunction(name="UIGraphicsGetCurrentContext")
    public static native CGContextRef UIGraphicsGetCurrentContext();

    @GlobalFunction(name="UIGraphicsPushContext")
    public static native void UIGraphicsPushContext(CGContextRef context);

    @GlobalFunction(name="UIGraphicsPopContext")
    public static native void UIGraphicsPopContext();

    @GlobalFunction(name="UIRectFillUsingBlendMode")
    public static native void UIRectFillUsingBlendMode(@ObjCByValue CGRect rect, CGBlendMode blendMode);

    @GlobalFunction(name="UIRectFill")
    public static native void UIRectFill(@ObjCByValue CGRect rect);

    @GlobalFunction(name="UIRectFrameUsingBlendMode")
    public static native void UIRectFrameUsingBlendMode(@ObjCByValue CGRect rect, CGBlendMode blendMode);

    @GlobalFunction(name="UIRectFrame")
    public static native void UIRectFrame(@ObjCByValue CGRect rect);

    @GlobalFunction(name="UIRectClip")
    public static native void UIRectClip(@ObjCByValue CGRect rect);

    @GlobalFunction(name="UIGraphicsBeginImageContext")
    public static native void UIGraphicsBeginImageContext(@ObjCByValue CGSize size);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction(name="UIGraphicsBeginImageContextWithOptions")
    public static native void UIGraphicsBeginImageContextWithOptions(@ObjCByValue CGSize size, boolean opaque, float scale);

    @GlobalFunction(name="UIGraphicsGetImageFromCurrentImageContext")
    public static native UIImage UIGraphicsGetImageFromCurrentImageContext();

    @GlobalFunction(name="UIGraphicsEndImageContext")
    public static native void UIGraphicsEndImageContext();

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsBeginPDFContextToFile")
    public static native boolean UIGraphicsBeginPDFContextToFile(NSString path, @ObjCByValue CGRect bounds, NSDictionary documentInfo);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsBeginPDFContextToData")
    public static native void UIGraphicsBeginPDFContextToData(NSMutableData data, @ObjCByValue CGRect bounds, NSDictionary documentInfo);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsEndPDFContext")
    public static native void UIGraphicsEndPDFContext();

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsBeginPDFPage")
    public static native void UIGraphicsBeginPDFPage();

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsBeginPDFPageWithInfo")
    public static native void UIGraphicsBeginPDFPageWithInfo(@ObjCByValue CGRect bounds, NSDictionary pageInfo);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsGetPDFContextBounds")
    public static native @ObjCByValue CGRect UIGraphicsGetPDFContextBounds();

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsSetPDFContextURLForRect")
    public static native void UIGraphicsSetPDFContextURLForRect(NSURL url, @ObjCByValue CGRect rect);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsAddPDFContextDestinationAtPoint")
    public static native void UIGraphicsAddPDFContextDestinationAtPoint(NSString name, @ObjCByValue CGPoint point);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction(name="UIGraphicsSetPDFContextDestinationForRect")
    public static native void UIGraphicsSetPDFContextDestinationForRect(NSString name, @ObjCByValue CGRect rect);

    @GlobalFunction(name="UIImageWriteToSavedPhotosAlbum")
    public static native void UIImageWriteToSavedPhotosAlbum(UIImage image, NSObject completionTarget, ObjCSelector completionSelector, @VoidPointer() Object contextInfo);

    /**
     * @since Available in iOS 3.1 and later.
     */
    @GlobalFunction(name="UIVideoAtPathIsCompatibleWithSavedPhotosAlbum")
    public static native boolean UIVideoAtPathIsCompatibleWithSavedPhotosAlbum(NSString videoPath);

    /**
     * @since Available in iOS 3.1 and later.
     */
    @GlobalFunction(name="UISaveVideoAtPathToSavedPhotosAlbum")
    public static native void UISaveVideoAtPathToSavedPhotosAlbum(NSString videoPath, NSObject completionTarget, ObjCSelector completionSelector, @VoidPointer() Object contextInfo);
}
