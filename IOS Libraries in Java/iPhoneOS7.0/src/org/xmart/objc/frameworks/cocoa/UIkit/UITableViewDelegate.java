package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITableViewDelegate 
    extends NSObjectProtocol, UIScrollViewDelegate {

    
    
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView willDisplayCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:willDisplayCell:forRowAtIndexPath:")
    void tableView$willDisplayCell$forRowAtIndexPath$(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView willDisplayHeaderView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:willDisplayHeaderView:forSection:")
    void tableView$willDisplayHeaderView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView willDisplayFooterView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:willDisplayFooterView:forSection:")
    void tableView$willDisplayFooterView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didEndDisplayingCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath*)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:didEndDisplayingCell:forRowAtIndexPath:")
    void tableView$didEndDisplayingCell$forRowAtIndexPath$(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didEndDisplayingHeaderView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:didEndDisplayingHeaderView:forSection:")
    void tableView$didEndDisplayingHeaderView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didEndDisplayingFooterView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:didEndDisplayingFooterView:forSection:")
    void tableView$didEndDisplayingFooterView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:heightForRowAtIndexPath:")
    float tableView$heightForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView heightForHeaderInSection:(NSInteger)section;", selector = "tableView:heightForHeaderInSection:")
    float tableView$heightForHeaderInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView heightForFooterInSection:(NSInteger)section;", selector = "tableView:heightForFooterInSection:")
    float tableView$heightForFooterInSection$(UITableView tableView, @NSInteger long section);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView estimatedHeightForRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(7_0);", selector = "tableView:estimatedHeightForRowAtIndexPath:")
    float tableView$estimatedHeightForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView estimatedHeightForHeaderInSection:(NSInteger)section NS_AVAILABLE_IOS(7_0);", selector = "tableView:estimatedHeightForHeaderInSection:")
    float tableView$estimatedHeightForHeaderInSection$(UITableView tableView, @NSInteger long section);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView estimatedHeightForFooterInSection:(NSInteger)section NS_AVAILABLE_IOS(7_0);", selector = "tableView:estimatedHeightForFooterInSection:")
    float tableView$estimatedHeightForFooterInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UIView *)tableView:(UITableView *)tableView viewForHeaderInSection:(NSInteger)section;", selector = "tableView:viewForHeaderInSection:")
    UIView tableView$viewForHeaderInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UIView *)tableView:(UITableView *)tableView viewForFooterInSection:(NSInteger)section;", selector = "tableView:viewForFooterInSection:")
    UIView tableView$viewForFooterInSection$(UITableView tableView, @NSInteger long section);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (UITableViewCellAccessoryType)tableView:(UITableView *)tableView accessoryTypeForRowWithIndexPath:(NSIndexPath *)indexPath NS_DEPRECATED_IOS(2_0, 3_0);", selector = "tableView:accessoryTypeForRowWithIndexPath:")
    UITableViewCellAccessoryType tableView$accessoryTypeForRowWithIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView accessoryButtonTappedForRowWithIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:accessoryButtonTappedForRowWithIndexPath:")
    void tableView$accessoryButtonTappedForRowWithIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView shouldHighlightRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:shouldHighlightRowAtIndexPath:")
    boolean tableView$shouldHighlightRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didHighlightRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:didHighlightRowAtIndexPath:")
    void tableView$didHighlightRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didUnhighlightRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:didUnhighlightRowAtIndexPath:")
    void tableView$didUnhighlightRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSIndexPath *)tableView:(UITableView *)tableView willSelectRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:willSelectRowAtIndexPath:")
    NSIndexPath tableView$willSelectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSIndexPath *)tableView:(UITableView *)tableView willDeselectRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(3_0);", selector = "tableView:willDeselectRowAtIndexPath:")
    NSIndexPath tableView$willDeselectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:didSelectRowAtIndexPath:")
    void tableView$didSelectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didDeselectRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(3_0);", selector = "tableView:didDeselectRowAtIndexPath:")
    void tableView$didDeselectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (UITableViewCellEditingStyle)tableView:(UITableView *)tableView editingStyleForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:editingStyleForRowAtIndexPath:")
    UITableViewCellEditingStyle tableView$editingStyleForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForDeleteConfirmationButtonForRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(3_0);", selector = "tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    NSString tableView$titleForDeleteConfirmationButtonForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView shouldIndentWhileEditingRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:shouldIndentWhileEditingRowAtIndexPath:")
    boolean tableView$shouldIndentWhileEditingRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView*)tableView willBeginEditingRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:willBeginEditingRowAtIndexPath:")
    void tableView$willBeginEditingRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView*)tableView didEndEditingRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:didEndEditingRowAtIndexPath:")
    void tableView$didEndEditingRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSIndexPath *)tableView:(UITableView *)tableView targetIndexPathForMoveFromRowAtIndexPath:(NSIndexPath *)sourceIndexPath toProposedIndexPath:(NSIndexPath *)proposedDestinationIndexPath;", selector = "tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    NSIndexPath tableView$targetIndexPathForMoveFromRowAtIndexPath$toProposedIndexPath$(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath);

    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView indentationLevelForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:indentationLevelForRowAtIndexPath:")
    @NSInteger long tableView$indentationLevelForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView shouldShowMenuForRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(5_0);", selector = "tableView:shouldShowMenuForRowAtIndexPath:")
    boolean tableView$shouldShowMenuForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canPerformAction:(SEL)action forRowAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "tableView:canPerformAction:forRowAtIndexPath:withSender:")
    boolean tableView$canPerformAction$forRowAtIndexPath$withSender$(UITableView tableView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView performAction:(SEL)action forRowAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "tableView:performAction:forRowAtIndexPath:withSender:")
    void tableView$performAction$forRowAtIndexPath$withSender$(UITableView tableView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);
}
