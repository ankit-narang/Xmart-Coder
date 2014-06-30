package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITabBarSystemItem {
    UITabBarSystemItemMore($UIKit.UITabBarSystemItemMore),
    UITabBarSystemItemFavorites($UIKit.UITabBarSystemItemFavorites),
    UITabBarSystemItemFeatured($UIKit.UITabBarSystemItemFeatured),
    UITabBarSystemItemTopRated($UIKit.UITabBarSystemItemTopRated),
    UITabBarSystemItemRecents($UIKit.UITabBarSystemItemRecents),
    UITabBarSystemItemContacts($UIKit.UITabBarSystemItemContacts),
    UITabBarSystemItemHistory($UIKit.UITabBarSystemItemHistory),
    UITabBarSystemItemBookmarks($UIKit.UITabBarSystemItemBookmarks),
    UITabBarSystemItemSearch($UIKit.UITabBarSystemItemSearch),
    UITabBarSystemItemDownloads($UIKit.UITabBarSystemItemDownloads),
    UITabBarSystemItemMostRecent($UIKit.UITabBarSystemItemMostRecent),
    UITabBarSystemItemMostViewed($UIKit.UITabBarSystemItemMostViewed);

    private final long value;

    private UITabBarSystemItem(long value) { this.value = value; }
}
