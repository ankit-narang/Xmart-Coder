package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UISearchBarDelegate 
    extends UIBarPositioningDelegate {

    
    
    @ObjCMethodSign(sign = "- (BOOL)searchBarShouldBeginEditing:(UISearchBar *)searchBar;", selector = "searchBarShouldBeginEditing:")
    boolean searchBarShouldBeginEditing$(UISearchBar searchBar);

    @ObjCMethodSign(sign = "- (void)searchBarTextDidBeginEditing:(UISearchBar *)searchBar;", selector = "searchBarTextDidBeginEditing:")
    void searchBarTextDidBeginEditing$(UISearchBar searchBar);

    @ObjCMethodSign(sign = "- (BOOL)searchBarShouldEndEditing:(UISearchBar *)searchBar;", selector = "searchBarShouldEndEditing:")
    boolean searchBarShouldEndEditing$(UISearchBar searchBar);

    @ObjCMethodSign(sign = "- (void)searchBarTextDidEndEditing:(UISearchBar *)searchBar;", selector = "searchBarTextDidEndEditing:")
    void searchBarTextDidEndEditing$(UISearchBar searchBar);

    @ObjCMethodSign(sign = "- (void)searchBar:(UISearchBar *)searchBar textDidChange:(NSString *)searchText;", selector = "searchBar:textDidChange:")
    void searchBar$textDidChange$(UISearchBar searchBar, NSString searchText);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)searchBar:(UISearchBar *)searchBar shouldChangeTextInRange:(NSRange)range replacementText:(NSString *)text NS_AVAILABLE_IOS(3_0);", selector = "searchBar:shouldChangeTextInRange:replacementText:")
    boolean searchBar$shouldChangeTextInRange$replacementText$(UISearchBar searchBar, @ObjCByValue NSRange range, NSString text);

    @ObjCMethodSign(sign = "- (void)searchBarSearchButtonClicked:(UISearchBar *)searchBar;", selector = "searchBarSearchButtonClicked:")
    void searchBarSearchButtonClicked$(UISearchBar searchBar);

    @ObjCMethodSign(sign = "- (void)searchBarBookmarkButtonClicked:(UISearchBar *)searchBar;", selector = "searchBarBookmarkButtonClicked:")
    void searchBarBookmarkButtonClicked$(UISearchBar searchBar);

    @ObjCMethodSign(sign = "- (void)searchBarCancelButtonClicked:(UISearchBar *) searchBar;", selector = "searchBarCancelButtonClicked:")
    void searchBarCancelButtonClicked$(UISearchBar searchBar);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)searchBarResultsListButtonClicked:(UISearchBar *)searchBar NS_AVAILABLE_IOS(3_2);", selector = "searchBarResultsListButtonClicked:")
    void searchBarResultsListButtonClicked$(UISearchBar searchBar);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)searchBar:(UISearchBar *)searchBar selectedScopeButtonIndexDidChange:(NSInteger)selectedScope NS_AVAILABLE_IOS(3_0);", selector = "searchBar:selectedScopeButtonIndexDidChange:")
    void searchBar$selectedScopeButtonIndexDidChange$(UISearchBar searchBar, @NSInteger long selectedScope);
}
