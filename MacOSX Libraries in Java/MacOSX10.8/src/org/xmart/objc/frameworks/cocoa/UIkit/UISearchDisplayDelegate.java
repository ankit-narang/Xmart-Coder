package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UISearchDisplayDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void) searchDisplayControllerWillBeginSearch:(UISearchDisplayController *)controller;", selector = "searchDisplayControllerWillBeginSearch:")
    void searchDisplayControllerWillBeginSearch$(UISearchDisplayController controller);

    @ObjCMethodSign(sign = "- (void) searchDisplayControllerDidBeginSearch:(UISearchDisplayController *)controller;", selector = "searchDisplayControllerDidBeginSearch:")
    void searchDisplayControllerDidBeginSearch$(UISearchDisplayController controller);

    @ObjCMethodSign(sign = "- (void) searchDisplayControllerWillEndSearch:(UISearchDisplayController *)controller;", selector = "searchDisplayControllerWillEndSearch:")
    void searchDisplayControllerWillEndSearch$(UISearchDisplayController controller);

    @ObjCMethodSign(sign = "- (void) searchDisplayControllerDidEndSearch:(UISearchDisplayController *)controller;", selector = "searchDisplayControllerDidEndSearch:")
    void searchDisplayControllerDidEndSearch$(UISearchDisplayController controller);

    @ObjCMethodSign(sign = "- (void)searchDisplayController:(UISearchDisplayController *)controller didLoadSearchResultsTableView:(UITableView *)tableView;", selector = "searchDisplayController:didLoadSearchResultsTableView:")
    void searchDisplayController$didLoadSearchResultsTableView$(UISearchDisplayController controller, UITableView tableView);

    @ObjCMethodSign(sign = "- (void)searchDisplayController:(UISearchDisplayController *)controller willUnloadSearchResultsTableView:(UITableView *)tableView;", selector = "searchDisplayController:willUnloadSearchResultsTableView:")
    void searchDisplayController$willUnloadSearchResultsTableView$(UISearchDisplayController controller, UITableView tableView);

    @ObjCMethodSign(sign = "- (void)searchDisplayController:(UISearchDisplayController *)controller willShowSearchResultsTableView:(UITableView *)tableView;", selector = "searchDisplayController:willShowSearchResultsTableView:")
    void searchDisplayController$willShowSearchResultsTableView$(UISearchDisplayController controller, UITableView tableView);

    @ObjCMethodSign(sign = "- (void)searchDisplayController:(UISearchDisplayController *)controller didShowSearchResultsTableView:(UITableView *)tableView;", selector = "searchDisplayController:didShowSearchResultsTableView:")
    void searchDisplayController$didShowSearchResultsTableView$(UISearchDisplayController controller, UITableView tableView);

    @ObjCMethodSign(sign = "- (void)searchDisplayController:(UISearchDisplayController *)controller willHideSearchResultsTableView:(UITableView *)tableView;", selector = "searchDisplayController:willHideSearchResultsTableView:")
    void searchDisplayController$willHideSearchResultsTableView$(UISearchDisplayController controller, UITableView tableView);

    @ObjCMethodSign(sign = "- (void)searchDisplayController:(UISearchDisplayController *)controller didHideSearchResultsTableView:(UITableView *)tableView;", selector = "searchDisplayController:didHideSearchResultsTableView:")
    void searchDisplayController$didHideSearchResultsTableView$(UISearchDisplayController controller, UITableView tableView);

    @ObjCMethodSign(sign = "- (BOOL)searchDisplayController:(UISearchDisplayController *)controller shouldReloadTableForSearchString:(NSString *)searchString;", selector = "searchDisplayController:shouldReloadTableForSearchString:")
    boolean searchDisplayController$shouldReloadTableForSearchString$(UISearchDisplayController controller, NSString searchString);

    @ObjCMethodSign(sign = "- (BOOL)searchDisplayController:(UISearchDisplayController *)controller shouldReloadTableForSearchScope:(NSInteger)searchOption;", selector = "searchDisplayController:shouldReloadTableForSearchScope:")
    boolean searchDisplayController$shouldReloadTableForSearchScope$(UISearchDisplayController controller, @NSInteger long searchOption);
}
