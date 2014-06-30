package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITableViewController extends UIViewController implements UITableViewDelegate, UITableViewDataSource {
    
    public UITableViewController() {}
    @ObjCPropertyGetter(selector = "tableView")
    public native UITableView getTableView();
    @ObjCPropertySetter(selector = "setTableView:")
    public native void setTableView(UITableView v);
    @ObjCProperty public UITableView tableView;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "clearsSelectionOnViewWillAppear")
    public native boolean isClearsSelectionOnViewWillAppear();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean v);
    @ObjCProperty public boolean clearsSelectionOnViewWillAppear;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "refreshControl")
    public native UIRefreshControl getRefreshControl();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setRefreshControl:")
    public native void setRefreshControl(UIRefreshControl v);
    @ObjCProperty public UIRefreshControl refreshControl;
    
    @ObjCMethodSign(sign = "- (id)initWithStyle:(UITableViewStyle)style;", selector = "initWithStyle:")
    public native UITableViewController initWithStyle$(UITableViewStyle style);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView willDisplayCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:willDisplayCell:forRowAtIndexPath:")
    public native void tableView$willDisplayCell$forRowAtIndexPath$(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView willDisplayHeaderView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:willDisplayHeaderView:forSection:")
    public native void tableView$willDisplayHeaderView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView willDisplayFooterView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:willDisplayFooterView:forSection:")
    public native void tableView$willDisplayFooterView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didEndDisplayingCell:(UITableViewCell *)cell forRowAtIndexPath:(NSIndexPath*)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:didEndDisplayingCell:forRowAtIndexPath:")
    public native void tableView$didEndDisplayingCell$forRowAtIndexPath$(UITableView tableView, UITableViewCell cell, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didEndDisplayingHeaderView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:didEndDisplayingHeaderView:forSection:")
    public native void tableView$didEndDisplayingHeaderView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didEndDisplayingFooterView:(UIView *)view forSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "tableView:didEndDisplayingFooterView:forSection:")
    public native void tableView$didEndDisplayingFooterView$forSection$(UITableView tableView, UIView view, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:heightForRowAtIndexPath:")
    public native float tableView$heightForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView heightForHeaderInSection:(NSInteger)section;", selector = "tableView:heightForHeaderInSection:")
    public native float tableView$heightForHeaderInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView heightForFooterInSection:(NSInteger)section;", selector = "tableView:heightForFooterInSection:")
    public native float tableView$heightForFooterInSection$(UITableView tableView, @NSInteger long section);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView estimatedHeightForRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(7_0);", selector = "tableView:estimatedHeightForRowAtIndexPath:")
    public native float tableView$estimatedHeightForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView estimatedHeightForHeaderInSection:(NSInteger)section NS_AVAILABLE_IOS(7_0);", selector = "tableView:estimatedHeightForHeaderInSection:")
    public native float tableView$estimatedHeightForHeaderInSection$(UITableView tableView, @NSInteger long section);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)tableView:(UITableView *)tableView estimatedHeightForFooterInSection:(NSInteger)section NS_AVAILABLE_IOS(7_0);", selector = "tableView:estimatedHeightForFooterInSection:")
    public native float tableView$estimatedHeightForFooterInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UIView *)tableView:(UITableView *)tableView viewForHeaderInSection:(NSInteger)section;", selector = "tableView:viewForHeaderInSection:")
    public native UIView tableView$viewForHeaderInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UIView *)tableView:(UITableView *)tableView viewForFooterInSection:(NSInteger)section;", selector = "tableView:viewForFooterInSection:")
    public native UIView tableView$viewForFooterInSection$(UITableView tableView, @NSInteger long section);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (UITableViewCellAccessoryType)tableView:(UITableView *)tableView accessoryTypeForRowWithIndexPath:(NSIndexPath *)indexPath NS_DEPRECATED_IOS(2_0, 3_0);", selector = "tableView:accessoryTypeForRowWithIndexPath:")
    public native UITableViewCellAccessoryType tableView$accessoryTypeForRowWithIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView accessoryButtonTappedForRowWithIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:accessoryButtonTappedForRowWithIndexPath:")
    public native void tableView$accessoryButtonTappedForRowWithIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView shouldHighlightRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:shouldHighlightRowAtIndexPath:")
    public native boolean tableView$shouldHighlightRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didHighlightRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:didHighlightRowAtIndexPath:")
    public native void tableView$didHighlightRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didUnhighlightRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(6_0);", selector = "tableView:didUnhighlightRowAtIndexPath:")
    public native void tableView$didUnhighlightRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSIndexPath *)tableView:(UITableView *)tableView willSelectRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:willSelectRowAtIndexPath:")
    public native NSIndexPath tableView$willSelectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSIndexPath *)tableView:(UITableView *)tableView willDeselectRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(3_0);", selector = "tableView:willDeselectRowAtIndexPath:")
    public native NSIndexPath tableView$willDeselectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:didSelectRowAtIndexPath:")
    public native void tableView$didSelectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView didDeselectRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(3_0);", selector = "tableView:didDeselectRowAtIndexPath:")
    public native void tableView$didDeselectRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (UITableViewCellEditingStyle)tableView:(UITableView *)tableView editingStyleForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:editingStyleForRowAtIndexPath:")
    public native UITableViewCellEditingStyle tableView$editingStyleForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForDeleteConfirmationButtonForRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(3_0);", selector = "tableView:titleForDeleteConfirmationButtonForRowAtIndexPath:")
    public native NSString tableView$titleForDeleteConfirmationButtonForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView shouldIndentWhileEditingRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:shouldIndentWhileEditingRowAtIndexPath:")
    public native boolean tableView$shouldIndentWhileEditingRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView*)tableView willBeginEditingRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:willBeginEditingRowAtIndexPath:")
    public native void tableView$willBeginEditingRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView*)tableView didEndEditingRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:didEndEditingRowAtIndexPath:")
    public native void tableView$didEndEditingRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSIndexPath *)tableView:(UITableView *)tableView targetIndexPathForMoveFromRowAtIndexPath:(NSIndexPath *)sourceIndexPath toProposedIndexPath:(NSIndexPath *)proposedDestinationIndexPath;", selector = "tableView:targetIndexPathForMoveFromRowAtIndexPath:toProposedIndexPath:")
    public native NSIndexPath tableView$targetIndexPathForMoveFromRowAtIndexPath$toProposedIndexPath$(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath proposedDestinationIndexPath);

    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView indentationLevelForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:indentationLevelForRowAtIndexPath:")
    public native @NSInteger long tableView$indentationLevelForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView shouldShowMenuForRowAtIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(5_0);", selector = "tableView:shouldShowMenuForRowAtIndexPath:")
    public native boolean tableView$shouldShowMenuForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canPerformAction:(SEL)action forRowAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "tableView:canPerformAction:forRowAtIndexPath:withSender:")
    public native boolean tableView$canPerformAction$forRowAtIndexPath$withSender$(UITableView tableView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView performAction:(SEL)action forRowAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "tableView:performAction:forRowAtIndexPath:withSender:")
    public native void tableView$performAction$forRowAtIndexPath$withSender$(UITableView tableView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);

    @ObjCMethodSign(sign = "- (void)scrollViewDidScroll:(UIScrollView *)scrollView;", selector = "scrollViewDidScroll:")
    public native void scrollViewDidScroll$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewDidZoom:(UIScrollView *)scrollView NS_AVAILABLE_IOS(3_2);", selector = "scrollViewDidZoom:")
    public native void scrollViewDidZoom$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDragging:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging$(UIScrollView scrollView);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillEndDragging:(UIScrollView *)scrollView withVelocity:(CGPoint)velocity targetContentOffset:(inout CGPoint *)targetContentOffset NS_AVAILABLE_IOS(5_0);", selector = "scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDragging$withVelocity$targetContentOffset$(UIScrollView scrollView, @ObjCByValue CGPoint velocity, CGPoint targetContentOffset);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDragging:(UIScrollView *)scrollView willDecelerate:(BOOL)decelerate;", selector = "scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDragging$willDecelerate$(UIScrollView scrollView, boolean decelerate);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndScrollingAnimation:(UIScrollView *)scrollView;", selector = "scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (UIView *)viewForZoomingInScrollView:(UIScrollView *)scrollView;", selector = "viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginZooming:(UIScrollView *)scrollView withView:(UIView *)view NS_AVAILABLE_IOS(3_2);", selector = "scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZooming$withView$(UIScrollView scrollView, UIView view);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndZooming:(UIScrollView *)scrollView withView:(UIView *)view atScale:(CGFloat)scale;", selector = "scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZooming$withView$atScale$(UIScrollView scrollView, UIView view, float scale);

    @ObjCMethodSign(sign = "- (BOOL)scrollViewShouldScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section;", selector = "tableView:numberOfRowsInSection:")
    public native @NSInteger long tableView$numberOfRowsInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:cellForRowAtIndexPath:")
    public native UITableViewCell tableView$cellForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView;", selector = "numberOfSectionsInTableView:")
    public native @NSInteger long numberOfSectionsInTableView$(UITableView tableView);

    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)section;", selector = "tableView:titleForHeaderInSection:")
    public native NSString tableView$titleForHeaderInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForFooterInSection:(NSInteger)section;", selector = "tableView:titleForFooterInSection:")
    public native NSString tableView$titleForFooterInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:canEditRowAtIndexPath:")
    public native boolean tableView$canEditRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canMoveRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:canMoveRowAtIndexPath:")
    public native boolean tableView$canMoveRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSArray *)sectionIndexTitlesForTableView:(UITableView *)tableView;", selector = "sectionIndexTitlesForTableView:")
    public native NSArray sectionIndexTitlesForTableView$(UITableView tableView);

    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView sectionForSectionIndexTitle:(NSString *)title atIndex:(NSInteger)index;", selector = "tableView:sectionForSectionIndexTitle:atIndex:")
    public native @NSInteger long tableView$sectionForSectionIndexTitle$atIndex$(UITableView tableView, NSString title, @NSInteger long index);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void tableView$commitEditingStyle$forRowAtIndexPath$(UITableView tableView, UITableViewCellEditingStyle editingStyle, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView moveRowAtIndexPath:(NSIndexPath *)sourceIndexPath toIndexPath:(NSIndexPath *)destinationIndexPath;", selector = "tableView:moveRowAtIndexPath:toIndexPath:")
    public native void tableView$moveRowAtIndexPath$toIndexPath$(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
}
