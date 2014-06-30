package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPasteboard extends NSObject  {
    
    public UIPasteboard() {}
    @ObjCPropertyGetter(selector = "name")
    public native NSString getName();
    @ObjCProperty public NSString name;

    @ObjCPropertyGetter(selector = "isPersistent")
    public native boolean isPersistent();
    @ObjCPropertySetter(selector = "setPersistent:")
    public native void setPersistent(boolean v);
    @ObjCProperty public boolean persistent;

    @ObjCPropertyGetter(selector = "changeCount")
    public native @NSInteger long getChangeCount();
    @ObjCProperty public @NSInteger long changeCount;

    @ObjCPropertyGetter(selector = "numberOfItems")
    public native @NSInteger long getNumberOfItems();
    @ObjCProperty public @NSInteger long numberOfItems;

    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCPropertySetter(selector = "setItems:")
    public native void setItems(NSArray v);
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "string")
    public native NSString getString();
    @ObjCPropertySetter(selector = "setString:")
    public native void setString(NSString v);
    @ObjCProperty public NSString string;

    @ObjCPropertyGetter(selector = "strings")
    public native NSArray getStrings();
    @ObjCPropertySetter(selector = "setStrings:")
    public native void setStrings(NSArray v);
    @ObjCProperty public NSArray strings;

    @ObjCPropertyGetter(selector = "URL")
    public native NSURL getURL();
    @ObjCPropertySetter(selector = "setURL:")
    public native void setURL(NSURL v);
    @ObjCProperty public NSURL URL;

    @ObjCPropertyGetter(selector = "URLs")
    public native NSArray getURLs();
    @ObjCPropertySetter(selector = "setURLs:")
    public native void setURLs(NSArray v);
    @ObjCProperty public NSArray URLs;

    @ObjCPropertyGetter(selector = "image")
    public native UIImage getImage();
    @ObjCPropertySetter(selector = "setImage:")
    public native void setImage(UIImage v);
    @ObjCProperty public UIImage image;

    @ObjCPropertyGetter(selector = "images")
    public native NSArray getImages();
    @ObjCPropertySetter(selector = "setImages:")
    public native void setImages(NSArray v);
    @ObjCProperty public NSArray images;

    @ObjCPropertyGetter(selector = "color")
    public native UIColor getColor();
    @ObjCPropertySetter(selector = "setColor:")
    public native void setColor(UIColor v);
    @ObjCProperty public UIColor color;

    @ObjCPropertyGetter(selector = "colors")
    public native NSArray getColors();
    @ObjCPropertySetter(selector = "setColors:")
    public native void setColors(NSArray v);
    @ObjCProperty public NSArray colors;
    
    @ObjCMethodSign(sign = "- (NSArray *)pasteboardTypes;", selector = "pasteboardTypes")
    public native NSArray pasteboardTypes();

    @ObjCMethodSign(sign = "- (BOOL)containsPasteboardTypes:(NSArray *)pasteboardTypes;", selector = "containsPasteboardTypes:")
    public native boolean containsPasteboardTypes$(NSArray pasteboardTypes);

    @ObjCMethodSign(sign = "- (NSData *)dataForPasteboardType:(NSString *)pasteboardType;", selector = "dataForPasteboardType:")
    public native NSData dataForPasteboardType$(NSString pasteboardType);

    @ObjCMethodSign(sign = "- (id)valueForPasteboardType:(NSString *)pasteboardType;", selector = "valueForPasteboardType:")
    public native NSObject valueForPasteboardType$(NSString pasteboardType);

    @ObjCMethodSign(sign = "- (void)setValue:(id)value forPasteboardType:(NSString *)pasteboardType;", selector = "setValue:forPasteboardType:")
    public native void setValue$forPasteboardType$(NSObject value, NSString pasteboardType);

    @ObjCMethodSign(sign = "- (void)setData:(NSData *)data forPasteboardType:(NSString *)pasteboardType;", selector = "setData:forPasteboardType:")
    public native void setData$forPasteboardType$(NSData data, NSString pasteboardType);

    @ObjCMethodSign(sign = "- (NSArray *)pasteboardTypesForItemSet:(NSIndexSet*)itemSet;", selector = "pasteboardTypesForItemSet:")
    public native NSArray pasteboardTypesForItemSet$(NSIndexSet itemSet);

    @ObjCMethodSign(sign = "- (BOOL)containsPasteboardTypes:(NSArray *)pasteboardTypes inItemSet:(NSIndexSet *)itemSet;", selector = "containsPasteboardTypes:inItemSet:")
    public native boolean containsPasteboardTypes$inItemSet$(NSArray pasteboardTypes, NSIndexSet itemSet);

    @ObjCMethodSign(sign = "- (NSIndexSet *)itemSetWithPasteboardTypes:(NSArray *)pasteboardTypes;", selector = "itemSetWithPasteboardTypes:")
    public native NSIndexSet itemSetWithPasteboardTypes$(NSArray pasteboardTypes);

    @ObjCMethodSign(sign = "- (NSArray *)valuesForPasteboardType:(NSString *)pasteboardType inItemSet:(NSIndexSet *)itemSet;", selector = "valuesForPasteboardType:inItemSet:")
    public native NSArray valuesForPasteboardType$inItemSet$(NSString pasteboardType, NSIndexSet itemSet);

    @ObjCMethodSign(sign = "- (NSArray *)dataForPasteboardType:(NSString *)pasteboardType inItemSet:(NSIndexSet *)itemSet;", selector = "dataForPasteboardType:inItemSet:")
    public native NSArray dataForPasteboardType$inItemSet$(NSString pasteboardType, NSIndexSet itemSet);

    @ObjCMethodSign(sign = "- (void)addItems:(NSArray *)items;", selector = "addItems:")
    public native void addItems$(NSArray items);

    @ObjCMethodSign(sign = "+ (UIPasteboard *)generalPasteboard;", selector = "generalPasteboard")
    public static native UIPasteboard generalPasteboard();

    @ObjCMethodSign(sign = "+ (UIPasteboard *)pasteboardWithName:(NSString *)pasteboardName create:(BOOL)create;", selector = "pasteboardWithName:create:")
    public static native UIPasteboard pasteboardWithName$create$(NSString pasteboardName, boolean create);

    @ObjCMethodSign(sign = "+ (UIPasteboard *)pasteboardWithUniqueName;", selector = "pasteboardWithUniqueName")
    public static native UIPasteboard pasteboardWithUniqueName();

    @ObjCMethodSign(sign = "+ (void)removePasteboardWithName:(NSString *)pasteboardName;", selector = "removePasteboardWithName:")
    public static native void removePasteboardWithName$(NSString pasteboardName);
}
