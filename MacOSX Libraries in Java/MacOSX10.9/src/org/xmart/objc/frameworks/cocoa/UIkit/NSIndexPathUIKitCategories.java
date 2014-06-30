package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSIndexPath")
@ObjCFramework("UIKit")
public final class NSIndexPathUIKitCategories extends NSIndexPath  {
    
    private NSIndexPathUIKitCategories() {}
    @ObjCPropertyGetter(selector = "section")
    public static native @NSInteger long getSection();
    @ObjCProperty public static @NSInteger long section;

    @ObjCPropertyGetter(selector = "row")
    public static native @NSInteger long getRow();
    @ObjCProperty public static @NSInteger long row;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "item")
    public static native @NSInteger long getItem();
    @ObjCProperty public static @NSInteger long item;
    
    @ObjCCategoryMethod(catname = "UITableView", catownername = "NSIndexPath")
    @ObjCMethodSign(sign = "+ (NSIndexPath *)indexPathForRow:(NSInteger)row inSection:(NSInteger)section;", selector = "indexPathForRow:inSection:")
    public static native NSIndexPath indexPathForRow$inSection$(@NSInteger long row, @NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UICollectionViewAdditions", catownername = "NSIndexPath")
    @ObjCMethodSign(sign = "+ (NSIndexPath *)indexPathForItem:(NSInteger)item inSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "indexPathForItem:inSection:")
    public static native NSIndexPath indexPathForItem$inSection$(@NSInteger long item, @NSInteger long section);
}
