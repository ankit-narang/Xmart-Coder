package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIBarButtonSystemItem {
    UIBarButtonSystemItemDone($UIKit.UIBarButtonSystemItemDone),
    UIBarButtonSystemItemCancel($UIKit.UIBarButtonSystemItemCancel),
    UIBarButtonSystemItemEdit($UIKit.UIBarButtonSystemItemEdit),
    UIBarButtonSystemItemSave($UIKit.UIBarButtonSystemItemSave),
    UIBarButtonSystemItemAdd($UIKit.UIBarButtonSystemItemAdd),
    UIBarButtonSystemItemFlexibleSpace($UIKit.UIBarButtonSystemItemFlexibleSpace),
    UIBarButtonSystemItemFixedSpace($UIKit.UIBarButtonSystemItemFixedSpace),
    UIBarButtonSystemItemCompose($UIKit.UIBarButtonSystemItemCompose),
    UIBarButtonSystemItemReply($UIKit.UIBarButtonSystemItemReply),
    UIBarButtonSystemItemAction($UIKit.UIBarButtonSystemItemAction),
    UIBarButtonSystemItemOrganize($UIKit.UIBarButtonSystemItemOrganize),
    UIBarButtonSystemItemBookmarks($UIKit.UIBarButtonSystemItemBookmarks),
    UIBarButtonSystemItemSearch($UIKit.UIBarButtonSystemItemSearch),
    UIBarButtonSystemItemRefresh($UIKit.UIBarButtonSystemItemRefresh),
    UIBarButtonSystemItemStop($UIKit.UIBarButtonSystemItemStop),
    UIBarButtonSystemItemCamera($UIKit.UIBarButtonSystemItemCamera),
    UIBarButtonSystemItemTrash($UIKit.UIBarButtonSystemItemTrash),
    UIBarButtonSystemItemPlay($UIKit.UIBarButtonSystemItemPlay),
    UIBarButtonSystemItemPause($UIKit.UIBarButtonSystemItemPause),
    UIBarButtonSystemItemRewind($UIKit.UIBarButtonSystemItemRewind),
    UIBarButtonSystemItemFastForward($UIKit.UIBarButtonSystemItemFastForward),
    UIBarButtonSystemItemUndo($UIKit.UIBarButtonSystemItemUndo),
    UIBarButtonSystemItemRedo($UIKit.UIBarButtonSystemItemRedo),
    UIBarButtonSystemItemPageCurl($UIKit.UIBarButtonSystemItemPageCurl);

    private final long value;

    private UIBarButtonSystemItem(long value) { this.value = value; }
}
