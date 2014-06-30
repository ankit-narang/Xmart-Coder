package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UICollectionViewScrollPosition {
    UICollectionViewScrollPositionNone($UIKit.UICollectionViewScrollPositionNone),
    UICollectionViewScrollPositionTop($UIKit.UICollectionViewScrollPositionTop),
    UICollectionViewScrollPositionCenteredVertically($UIKit.UICollectionViewScrollPositionCenteredVertically),
    UICollectionViewScrollPositionBottom($UIKit.UICollectionViewScrollPositionBottom),
    UICollectionViewScrollPositionLeft($UIKit.UICollectionViewScrollPositionLeft),
    UICollectionViewScrollPositionCenteredHorizontally($UIKit.UICollectionViewScrollPositionCenteredHorizontally),
    UICollectionViewScrollPositionRight($UIKit.UICollectionViewScrollPositionRight);

    private final long value;

    private UICollectionViewScrollPosition(long value) { this.value = value; }
}
