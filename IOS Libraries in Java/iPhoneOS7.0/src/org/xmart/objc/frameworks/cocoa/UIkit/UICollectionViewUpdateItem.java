package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewUpdateItem extends NSObject  {
    
    public UICollectionViewUpdateItem() {}
    @ObjCPropertyGetter(selector = "indexPathBeforeUpdate")
    public native NSIndexPath getIndexPathBeforeUpdate();
    @ObjCProperty public NSIndexPath indexPathBeforeUpdate;

    @ObjCPropertyGetter(selector = "indexPathAfterUpdate")
    public native NSIndexPath getIndexPathAfterUpdate();
    @ObjCProperty public NSIndexPath indexPathAfterUpdate;

    @ObjCPropertyGetter(selector = "updateAction")
    public native UICollectionUpdateAction getUpdateAction();
    @ObjCProperty public UICollectionUpdateAction updateAction;
    
    
}
