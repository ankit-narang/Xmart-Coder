package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UILocalizedIndexedCollation extends NSObject  {
    
    public UILocalizedIndexedCollation() {}
    @ObjCPropertyGetter(selector = "sectionTitles")
    public native NSArray getSectionTitles();
    @ObjCProperty public NSArray sectionTitles;

    @ObjCPropertyGetter(selector = "sectionIndexTitles")
    public native NSArray getSectionIndexTitles();
    @ObjCProperty public NSArray sectionIndexTitles;
    
    @ObjCMethodSign(sign = "- (NSInteger)sectionForSectionIndexTitleAtIndex:(NSInteger)indexTitleIndex;", selector = "sectionForSectionIndexTitleAtIndex:")
    public native @NSInteger long sectionForSectionIndexTitleAtIndex$(@NSInteger long indexTitleIndex);

    @ObjCMethodSign(sign = "- (NSInteger)sectionForObject:(id)object collationStringSelector:(SEL)selector;", selector = "sectionForObject:collationStringSelector:")
    public native @NSInteger long sectionForObject$collationStringSelector$(NSObject object, ObjCSelector selector);

    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayFromArray:(NSArray *)array collationStringSelector:(SEL)selector;", selector = "sortedArrayFromArray:collationStringSelector:")
    public native NSArray sortedArrayFromArray$collationStringSelector$(NSArray array, ObjCSelector selector);

    @ObjCMethodSign(sign = "+ (id)currentCollation;", selector = "currentCollation")
    public static native NSObject currentCollation();
}
