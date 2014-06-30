package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISearchDisplayController extends NSObject  {
    
    public UISearchDisplayController() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UISearchDisplayDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISearchDisplayDelegate v);
    @ObjCProperty public UISearchDisplayDelegate delegate;

    @ObjCPropertyGetter(selector = "isActive")
    public native boolean isActive();
    @ObjCPropertySetter(selector = "setActive:")
    public native void setActive(boolean v);
    @ObjCProperty public boolean active;

    @ObjCPropertyGetter(selector = "searchBar")
    public native UISearchBar getSearchBar();
    @ObjCProperty public UISearchBar searchBar;

    @ObjCPropertyGetter(selector = "searchContentsController")
    public native UIViewController getSearchContentsController();
    @ObjCProperty public UIViewController searchContentsController;

    @ObjCPropertyGetter(selector = "searchResultsTableView")
    public native UITableView getSearchResultsTableView();
    @ObjCProperty public UITableView searchResultsTableView;

    @ObjCPropertyGetter(selector = "searchResultsDataSource")
    public native UITableViewDataSource getSearchResultsDataSource();
    @ObjCPropertySetter(selector = "setSearchResultsDataSource:", strongRef = true)
    public native void setSearchResultsDataSource(UITableViewDataSource v);
    @ObjCProperty public UITableViewDataSource searchResultsDataSource;

    @ObjCPropertyGetter(selector = "searchResultsDelegate")
    public native UITableViewDelegate getSearchResultsDelegate();
    @ObjCPropertySetter(selector = "setSearchResultsDelegate:", strongRef = true)
    public native void setSearchResultsDelegate(UITableViewDelegate v);
    @ObjCProperty public UITableViewDelegate searchResultsDelegate;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "searchResultsTitle")
    public native NSString getSearchResultsTitle();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setSearchResultsTitle:")
    public native void setSearchResultsTitle(NSString v);
    @ObjCProperty public NSString searchResultsTitle;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "displaysSearchBarInNavigationBar")
    public native boolean isDisplaysSearchBarInNavigationBar();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setDisplaysSearchBarInNavigationBar:")
    public native void setDisplaysSearchBarInNavigationBar(boolean v);
    @ObjCProperty public boolean displaysSearchBarInNavigationBar;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "navigationItem")
    public native UINavigationItem getNavigationItem();
    @ObjCProperty public UINavigationItem navigationItem;
    
    @ObjCMethodSign(sign = "- (id)initWithSearchBar:(UISearchBar *)searchBar contentsController:(UIViewController *)viewController;", selector = "initWithSearchBar:contentsController:")
    public native UISearchDisplayController initWithSearchBar$contentsController$(UISearchBar searchBar, UIViewController viewController);

    @ObjCMethodSign(sign = "- (void)setActive:(BOOL)visible animated:(BOOL)animated;", selector = "setActive:animated:")
    public native void setActive$animated$(boolean visible, boolean animated);
}
