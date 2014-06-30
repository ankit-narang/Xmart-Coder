package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UICollectionElementCategory {
    UICollectionElementCategoryCell($UIKit.UICollectionElementCategoryCell),
    UICollectionElementCategorySupplementaryView($UIKit.UICollectionElementCategorySupplementaryView),
    UICollectionElementCategoryDecorationView($UIKit.UICollectionElementCategoryDecorationView);

    private final long value;

    private UICollectionElementCategory(long value) { this.value = value; }
}
