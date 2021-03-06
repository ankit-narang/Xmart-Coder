package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UICollectionViewScrollDirection {
    UICollectionViewScrollDirectionVertical($UIKit.UICollectionViewScrollDirectionVertical),
    UICollectionViewScrollDirectionHorizontal($UIKit.UICollectionViewScrollDirectionHorizontal);

    private final long value;

    private UICollectionViewScrollDirection(long value) { this.value = value; }
}
