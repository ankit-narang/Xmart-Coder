package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CALayer extends NSObject implements NSCoding {
    
    public CALayer() {}
    @ObjCPropertyGetter(selector = "bounds")
    public native @ObjCByValue CGRect getBounds();
    @ObjCPropertySetter(selector = "setBounds:")
    public native void setBounds(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect bounds;

    @ObjCPropertyGetter(selector = "position")
    public native @ObjCByValue CGPoint getPosition();
    @ObjCPropertySetter(selector = "setPosition:")
    public native void setPosition(@ObjCByValue CGPoint v);
    @ObjCProperty public @ObjCByValue CGPoint position;

    @ObjCPropertyGetter(selector = "zPosition")
    public native float getZPosition();
    @ObjCPropertySetter(selector = "setZPosition:")
    public native void setZPosition(float v);
    @ObjCProperty public float zPosition;

    @ObjCPropertyGetter(selector = "anchorPoint")
    public native @ObjCByValue CGPoint getAnchorPoint();
    @ObjCPropertySetter(selector = "setAnchorPoint:")
    public native void setAnchorPoint(@ObjCByValue CGPoint v);
    @ObjCProperty public @ObjCByValue CGPoint anchorPoint;

    @ObjCPropertyGetter(selector = "anchorPointZ")
    public native float getAnchorPointZ();
    @ObjCPropertySetter(selector = "setAnchorPointZ:")
    public native void setAnchorPointZ(float v);
    @ObjCProperty public float anchorPointZ;

    @ObjCPropertyGetter(selector = "transform")
    public native @ObjCByValue CATransform3D getTransform();
    @ObjCPropertySetter(selector = "setTransform:")
    public native void setTransform(@ObjCByValue CATransform3D v);
    @ObjCProperty public @ObjCByValue CATransform3D transform;

    @ObjCPropertyGetter(selector = "frame")
    public native @ObjCByValue CGRect getFrame();
    @ObjCPropertySetter(selector = "setFrame:")
    public native void setFrame(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect frame;

    @ObjCPropertyGetter(selector = "isHidden")
    public native boolean isHidden();
    @ObjCPropertySetter(selector = "setHidden:")
    public native void setHidden(boolean v);
    @ObjCProperty public boolean hidden;

    @ObjCPropertyGetter(selector = "isDoubleSided")
    public native boolean isDoubleSided();
    @ObjCPropertySetter(selector = "setDoubleSided:")
    public native void setDoubleSided(boolean v);
    @ObjCProperty public boolean doubleSided;

    @ObjCPropertyGetter(selector = "isGeometryFlipped")
    public native boolean isGeometryFlipped();
    @ObjCPropertySetter(selector = "setGeometryFlipped:")
    public native void setGeometryFlipped(boolean v);
    @ObjCProperty public boolean geometryFlipped;

    @ObjCPropertyGetter(selector = "superlayer")
    public native CALayer getSuperlayer();
    @ObjCProperty public CALayer superlayer;

    @ObjCPropertyGetter(selector = "sublayers")
    public native NSArray getSublayers();
    @ObjCPropertySetter(selector = "setSublayers:")
    public native void setSublayers(NSArray v);
    @ObjCProperty public NSArray sublayers;

    @ObjCPropertyGetter(selector = "sublayerTransform")
    public native @ObjCByValue CATransform3D getSublayerTransform();
    @ObjCPropertySetter(selector = "setSublayerTransform:")
    public native void setSublayerTransform(@ObjCByValue CATransform3D v);
    @ObjCProperty public @ObjCByValue CATransform3D sublayerTransform;

    @ObjCPropertyGetter(selector = "mask")
    public native CALayer getMask();
    @ObjCPropertySetter(selector = "setMask:")
    public native void setMask(CALayer v);
    @ObjCProperty public CALayer mask;

    @ObjCPropertyGetter(selector = "masksToBounds")
    public native boolean isMasksToBounds();
    @ObjCPropertySetter(selector = "setMasksToBounds:")
    public native void setMasksToBounds(boolean v);
    @ObjCProperty public boolean masksToBounds;

    @ObjCPropertyGetter(selector = "contents")
    public native NSObject getContents();
    @ObjCPropertySetter(selector = "setContents:")
    public native void setContents(NSObject v);
    @ObjCProperty public NSObject contents;

    @ObjCPropertyGetter(selector = "contentsRect")
    public native @ObjCByValue CGRect getContentsRect();
    @ObjCPropertySetter(selector = "setContentsRect:")
    public native void setContentsRect(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect contentsRect;

    @ObjCPropertyGetter(selector = "contentsGravity")
    public native NSString getContentsGravity();
    @ObjCPropertySetter(selector = "setContentsGravity:")
    public native void setContentsGravity(NSString v);
    @ObjCProperty public NSString contentsGravity;

    @ObjCPropertyGetter(selector = "contentsScale")
    public native float getContentsScale();
    @ObjCPropertySetter(selector = "setContentsScale:")
    public native void setContentsScale(float v);
    @ObjCProperty public float contentsScale;

    @ObjCPropertyGetter(selector = "contentsCenter")
    public native @ObjCByValue CGRect getContentsCenter();
    @ObjCPropertySetter(selector = "setContentsCenter:")
    public native void setContentsCenter(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect contentsCenter;

    @ObjCPropertyGetter(selector = "minificationFilter")
    public native NSString getMinificationFilter();
    @ObjCPropertySetter(selector = "setMinificationFilter:")
    public native void setMinificationFilter(NSString v);
    @ObjCProperty public NSString minificationFilter;

    @ObjCPropertyGetter(selector = "magnificationFilter")
    public native NSString getMagnificationFilter();
    @ObjCPropertySetter(selector = "setMagnificationFilter:")
    public native void setMagnificationFilter(NSString v);
    @ObjCProperty public NSString magnificationFilter;

    @ObjCPropertyGetter(selector = "minificationFilterBias")
    public native float getMinificationFilterBias();
    @ObjCPropertySetter(selector = "setMinificationFilterBias:")
    public native void setMinificationFilterBias(float v);
    @ObjCProperty public float minificationFilterBias;

    @ObjCPropertyGetter(selector = "isOpaque")
    public native boolean isOpaque();
    @ObjCPropertySetter(selector = "setOpaque:")
    public native void setOpaque(boolean v);
    @ObjCProperty public boolean opaque;

    @ObjCPropertyGetter(selector = "needsDisplayOnBoundsChange")
    public native boolean isNeedsDisplayOnBoundsChange();
    @ObjCPropertySetter(selector = "setNeedsDisplayOnBoundsChange:")
    public native void setNeedsDisplayOnBoundsChange(boolean v);
    @ObjCProperty public boolean needsDisplayOnBoundsChange;

    @ObjCPropertyGetter(selector = "drawsAsynchronously")
    public native boolean isDrawsAsynchronously();
    @ObjCPropertySetter(selector = "setDrawsAsynchronously:")
    public native void setDrawsAsynchronously(boolean v);
    @ObjCProperty public boolean drawsAsynchronously;

    @ObjCPropertyGetter(selector = "edgeAntialiasingMask")
    public native @Unsigned int getEdgeAntialiasingMask();
    @ObjCPropertySetter(selector = "setEdgeAntialiasingMask:")
    public native void setEdgeAntialiasingMask(@Unsigned int v);
    @ObjCProperty public @Unsigned int edgeAntialiasingMask;

    @ObjCPropertyGetter(selector = "allowsEdgeAntialiasing")
    public native boolean isAllowsEdgeAntialiasing();
    @ObjCPropertySetter(selector = "setAllowsEdgeAntialiasing:")
    public native void setAllowsEdgeAntialiasing(boolean v);
    @ObjCProperty public boolean allowsEdgeAntialiasing;

    @ObjCPropertyGetter(selector = "backgroundColor")
    public native CGColor getBackgroundColor();
    @ObjCPropertySetter(selector = "setBackgroundColor:")
    public native void setBackgroundColor(CGColor v);
    @ObjCProperty public CGColor backgroundColor;

    @ObjCPropertyGetter(selector = "cornerRadius")
    public native float getCornerRadius();
    @ObjCPropertySetter(selector = "setCornerRadius:")
    public native void setCornerRadius(float v);
    @ObjCProperty public float cornerRadius;

    @ObjCPropertyGetter(selector = "borderWidth")
    public native float getBorderWidth();
    @ObjCPropertySetter(selector = "setBorderWidth:")
    public native void setBorderWidth(float v);
    @ObjCProperty public float borderWidth;

    @ObjCPropertyGetter(selector = "borderColor")
    public native CGColor getBorderColor();
    @ObjCPropertySetter(selector = "setBorderColor:")
    public native void setBorderColor(CGColor v);
    @ObjCProperty public CGColor borderColor;

    @ObjCPropertyGetter(selector = "opacity")
    public native float getOpacity();
    @ObjCPropertySetter(selector = "setOpacity:")
    public native void setOpacity(float v);
    @ObjCProperty public float opacity;

    @ObjCPropertyGetter(selector = "allowsGroupOpacity")
    public native boolean isAllowsGroupOpacity();
    @ObjCPropertySetter(selector = "setAllowsGroupOpacity:")
    public native void setAllowsGroupOpacity(boolean v);
    @ObjCProperty public boolean allowsGroupOpacity;

    @ObjCPropertyGetter(selector = "compositingFilter")
    public native NSObject getCompositingFilter();
    @ObjCPropertySetter(selector = "setCompositingFilter:")
    public native void setCompositingFilter(NSObject v);
    @ObjCProperty public NSObject compositingFilter;

    @ObjCPropertyGetter(selector = "filters")
    public native NSArray getFilters();
    @ObjCPropertySetter(selector = "setFilters:")
    public native void setFilters(NSArray v);
    @ObjCProperty public NSArray filters;

    @ObjCPropertyGetter(selector = "backgroundFilters")
    public native NSArray getBackgroundFilters();
    @ObjCPropertySetter(selector = "setBackgroundFilters:")
    public native void setBackgroundFilters(NSArray v);
    @ObjCProperty public NSArray backgroundFilters;

    @ObjCPropertyGetter(selector = "shouldRasterize")
    public native boolean isShouldRasterize();
    @ObjCPropertySetter(selector = "setShouldRasterize:")
    public native void setShouldRasterize(boolean v);
    @ObjCProperty public boolean shouldRasterize;

    @ObjCPropertyGetter(selector = "rasterizationScale")
    public native float getRasterizationScale();
    @ObjCPropertySetter(selector = "setRasterizationScale:")
    public native void setRasterizationScale(float v);
    @ObjCProperty public float rasterizationScale;

    @ObjCPropertyGetter(selector = "shadowColor")
    public native CGColor getShadowColor();
    @ObjCPropertySetter(selector = "setShadowColor:")
    public native void setShadowColor(CGColor v);
    @ObjCProperty public CGColor shadowColor;

    @ObjCPropertyGetter(selector = "shadowOpacity")
    public native float getShadowOpacity();
    @ObjCPropertySetter(selector = "setShadowOpacity:")
    public native void setShadowOpacity(float v);
    @ObjCProperty public float shadowOpacity;

    @ObjCPropertyGetter(selector = "shadowOffset")
    public native @ObjCByValue CGSize getShadowOffset();
    @ObjCPropertySetter(selector = "setShadowOffset:")
    public native void setShadowOffset(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize shadowOffset;

    @ObjCPropertyGetter(selector = "shadowRadius")
    public native float getShadowRadius();
    @ObjCPropertySetter(selector = "setShadowRadius:")
    public native void setShadowRadius(float v);
    @ObjCProperty public float shadowRadius;

    @ObjCPropertyGetter(selector = "shadowPath")
    public native CGPath getShadowPath();
    @ObjCPropertySetter(selector = "setShadowPath:")
    public native void setShadowPath(CGPath v);
    @ObjCProperty public CGPath shadowPath;

    @ObjCPropertyGetter(selector = "actions")
    public native NSDictionary getActions();
    @ObjCPropertySetter(selector = "setActions:")
    public native void setActions(NSDictionary v);
    @ObjCProperty public NSDictionary actions;

    @ObjCPropertyGetter(selector = "name")
    public native NSString getName();
    @ObjCPropertySetter(selector = "setName:")
    public native void setName(NSString v);
    @ObjCProperty public NSString name;

    @ObjCPropertyGetter(selector = "delegate")
    public native NSObject getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSObject v);
    @ObjCProperty public NSObject delegate;

    @ObjCPropertyGetter(selector = "style")
    public native NSDictionary getStyle();
    @ObjCPropertySetter(selector = "setStyle:")
    public native void setStyle(NSDictionary v);
    @ObjCProperty public NSDictionary style;

    @ObjCPropertyGetter(selector = "visibleRect")
    public native @ObjCByValue CGRect getVisibleRect();
    @ObjCProperty public @ObjCByValue CGRect visibleRect;
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native CALayer init();

    @ObjCMethodSign(sign = "- (id)initWithLayer:(id)layer;", selector = "initWithLayer:")
    public native CALayer initWithLayer$(NSObject layer);

    @ObjCMethodSign(sign = "- (id)presentationLayer;", selector = "presentationLayer")
    public native NSObject presentationLayer();

    @ObjCMethodSign(sign = "- (id)modelLayer;", selector = "modelLayer")
    public native NSObject modelLayer();

    @ObjCMethodSign(sign = "- (BOOL)shouldArchiveValueForKey:(NSString *)key;", selector = "shouldArchiveValueForKey:")
    public native boolean shouldArchiveValueForKey$(NSString key);

    @ObjCMethodSign(sign = "- (CGAffineTransform)affineTransform;", selector = "affineTransform")
    public native @ObjCByValue CGAffineTransform affineTransform();

    @ObjCMethodSign(sign = "- (void)setAffineTransform:(CGAffineTransform)m;", selector = "setAffineTransform:")
    public native void setAffineTransform(@ObjCByValue CGAffineTransform m);

    @ObjCMethodSign(sign = "- (BOOL)contentsAreFlipped;", selector = "contentsAreFlipped")
    public native boolean contentsAreFlipped();

    @ObjCMethodSign(sign = "- (void)removeFromSuperlayer;", selector = "removeFromSuperlayer")
    public native void removeFromSuperlayer();

    @ObjCMethodSign(sign = "- (void)addSublayer:(CALayer *)layer;", selector = "addSublayer:")
    public native void addSublayer$(CALayer layer);

    @ObjCMethodSign(sign = "- (void)insertSublayer:(CALayer *)layer atIndex:(unsigned)idx;", selector = "insertSublayer:atIndex:")
    public native void insertSublayer$atIndex$(CALayer layer, @Unsigned int idx);

    @ObjCMethodSign(sign = "- (void)insertSublayer:(CALayer *)layer below:(CALayer *)sibling;", selector = "insertSublayer:below:")
    public native void insertSublayer$below$(CALayer layer, CALayer sibling);

    @ObjCMethodSign(sign = "- (void)insertSublayer:(CALayer *)layer above:(CALayer *)sibling;", selector = "insertSublayer:above:")
    public native void insertSublayer$above$(CALayer layer, CALayer sibling);

    @ObjCMethodSign(sign = "- (void)replaceSublayer:(CALayer *)layer with:(CALayer *)layer2;", selector = "replaceSublayer:with:")
    public native void replaceSublayer$with$(CALayer layer, CALayer layer2);

    @ObjCMethodSign(sign = "- (CGPoint)convertPoint:(CGPoint)p fromLayer:(CALayer *)l;", selector = "convertPoint:fromLayer:")
    public native @ObjCByValue CGPoint convertPoint$fromLayer$(@ObjCByValue CGPoint p, CALayer l);

    @ObjCMethodSign(sign = "- (CGPoint)convertPoint:(CGPoint)p toLayer:(CALayer *)l;", selector = "convertPoint:toLayer:")
    public native @ObjCByValue CGPoint convertPoint$toLayer$(@ObjCByValue CGPoint p, CALayer l);

    @ObjCMethodSign(sign = "- (CGRect)convertRect:(CGRect)r fromLayer:(CALayer *)l;", selector = "convertRect:fromLayer:")
    public native @ObjCByValue CGRect convertRect$fromLayer$(@ObjCByValue CGRect r, CALayer l);

    @ObjCMethodSign(sign = "- (CGRect)convertRect:(CGRect)r toLayer:(CALayer *)l;", selector = "convertRect:toLayer:")
    public native @ObjCByValue CGRect convertRect$toLayer$(@ObjCByValue CGRect r, CALayer l);

    @ObjCMethodSign(sign = "- (CFTimeInterval)convertTime:(CFTimeInterval)t fromLayer:(CALayer *)l;", selector = "convertTime:fromLayer:")
    public native double convertTime$fromLayer$(double t, CALayer l);

    @ObjCMethodSign(sign = "- (CFTimeInterval)convertTime:(CFTimeInterval)t toLayer:(CALayer *)l;", selector = "convertTime:toLayer:")
    public native double convertTime$toLayer$(double t, CALayer l);

    @ObjCMethodSign(sign = "- (CALayer *)hitTest:(CGPoint)p;", selector = "hitTest:")
    public native CALayer hitTest$(@ObjCByValue CGPoint p);

    @ObjCMethodSign(sign = "- (BOOL)containsPoint:(CGPoint)p;", selector = "containsPoint:")
    public native boolean containsPoint$(@ObjCByValue CGPoint p);

    @ObjCMethodSign(sign = "- (void)display;", selector = "display")
    public native void display();

    @ObjCMethodSign(sign = "- (void)setNeedsDisplay;", selector = "setNeedsDisplay")
    public native void setNeedsDisplay();

    @ObjCMethodSign(sign = "- (void)setNeedsDisplayInRect:(CGRect)r;", selector = "setNeedsDisplayInRect:")
    public native void setNeedsDisplayInRect(@ObjCByValue CGRect r);

    @ObjCMethodSign(sign = "- (BOOL)needsDisplay;", selector = "needsDisplay")
    public native boolean needsDisplay();

    @ObjCMethodSign(sign = "- (void)displayIfNeeded;", selector = "displayIfNeeded")
    public native void displayIfNeeded();

    @ObjCMethodSign(sign = "- (void)drawInContext:(CGContextRef)ctx;", selector = "drawInContext:")
    public native void drawInContext$(CGContextRef ctx);

    @ObjCMethodSign(sign = "- (void)renderInContext:(CGContextRef)ctx;", selector = "renderInContext:")
    public native void renderInContext$(CGContextRef ctx);

    @ObjCMethodSign(sign = "- (CGSize)preferredFrameSize;", selector = "preferredFrameSize")
    public native @ObjCByValue CGSize preferredFrameSize();

    @ObjCMethodSign(sign = "- (void)setNeedsLayout;", selector = "setNeedsLayout")
    public native void setNeedsLayout();

    @ObjCMethodSign(sign = "- (BOOL)needsLayout;", selector = "needsLayout")
    public native boolean needsLayout();

    @ObjCMethodSign(sign = "- (void)layoutIfNeeded;", selector = "layoutIfNeeded")
    public native void layoutIfNeeded();

    @ObjCMethodSign(sign = "- (void)layoutSublayers;", selector = "layoutSublayers")
    public native void layoutSublayers();

    @ObjCMethodSign(sign = "- (id<CAAction>)actionForKey:(NSString *)event;", selector = "actionForKey:")
    public native CAAction actionForKey$(NSString event);

    @ObjCMethodSign(sign = "- (void)addAnimation:(CAAnimation *)anim forKey:(NSString *)key;", selector = "addAnimation:forKey:")
    public native void addAnimation$forKey$(CAAnimation anim, NSString key);

    @ObjCMethodSign(sign = "- (void)removeAllAnimations;", selector = "removeAllAnimations")
    public native void removeAllAnimations();

    @ObjCMethodSign(sign = "- (void)removeAnimationForKey:(NSString *)key;", selector = "removeAnimationForKey:")
    public native void removeAnimationForKey$(NSString key);

    @ObjCMethodSign(sign = "- (NSArray *)animationKeys;", selector = "animationKeys")
    public native NSArray animationKeys();

    @ObjCMethodSign(sign = "- (CAAnimation *)animationForKey:(NSString *)key;", selector = "animationForKey:")
    public native CAAnimation animationForKey$(NSString key);

    @ObjCMethodSign(sign = "+ (id)layer;", selector = "layer")
    public static native NSObject layer();

    @ObjCMethodSign(sign = "+ (id)defaultValueForKey:(NSString *)key;", selector = "defaultValueForKey:")
    public static native NSObject defaultValueForKey$(NSString key);

    @ObjCMethodSign(sign = "+ (BOOL)needsDisplayForKey:(NSString *)key;", selector = "needsDisplayForKey:")
    public static native boolean needsDisplayForKey$(NSString key);

    @ObjCMethodSign(sign = "+ (id<CAAction>)defaultActionForKey:(NSString *)event;", selector = "defaultActionForKey:")
    public static native CAAction defaultActionForKey$(NSString event);

    @ObjCCategoryMethod(catname = "CALayerScrolling", catownername = "CALayer")
    @ObjCMethodSign(sign = "- (void)scrollPoint:(CGPoint)p;", selector = "scrollPoint:")
    public native void scrollPoint$(@ObjCByValue CGPoint p);

    @ObjCCategoryMethod(catname = "CALayerScrolling", catownername = "CALayer")
    @ObjCMethodSign(sign = "- (void)scrollRectToVisible:(CGRect)r;", selector = "scrollRectToVisible:")
    public native void scrollRectToVisible$(@ObjCByValue CGRect r);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native CALayer initWithCoder$(NSCoder aDecoder);
}
