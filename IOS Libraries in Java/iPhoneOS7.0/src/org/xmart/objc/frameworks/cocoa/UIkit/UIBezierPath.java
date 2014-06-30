package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIBezierPath extends NSObject implements NSCopying, NSCoding {
    
    public UIBezierPath() {}
    @ObjCPropertyGetter(selector = "CGPath")
    public native CGPath getCGPath();
    @ObjCPropertySetter(selector = "setCGPath:")
    public native void setCGPath(CGPath v);
    @ObjCProperty public CGPath CGPath;

    @ObjCPropertyGetter(selector = "isEmpty")
    public native boolean isEmpty();
    @ObjCProperty public boolean empty;

    @ObjCPropertyGetter(selector = "bounds")
    public native @ObjCByValue CGRect getBounds();
    @ObjCProperty public @ObjCByValue CGRect bounds;

    @ObjCPropertyGetter(selector = "currentPoint")
    public native @ObjCByValue CGPoint getCurrentPoint();
    @ObjCProperty public @ObjCByValue CGPoint currentPoint;

    @ObjCPropertyGetter(selector = "lineWidth")
    public native float getLineWidth();
    @ObjCPropertySetter(selector = "setLineWidth:")
    public native void setLineWidth(float v);
    @ObjCProperty public float lineWidth;

    @ObjCPropertyGetter(selector = "lineCapStyle")
    public native CGLineCap getLineCapStyle();
    @ObjCPropertySetter(selector = "setLineCapStyle:")
    public native void setLineCapStyle(CGLineCap v);
    @ObjCProperty public CGLineCap lineCapStyle;

    @ObjCPropertyGetter(selector = "lineJoinStyle")
    public native CGLineJoin getLineJoinStyle();
    @ObjCPropertySetter(selector = "setLineJoinStyle:")
    public native void setLineJoinStyle(CGLineJoin v);
    @ObjCProperty public CGLineJoin lineJoinStyle;

    @ObjCPropertyGetter(selector = "miterLimit")
    public native float getMiterLimit();
    @ObjCPropertySetter(selector = "setMiterLimit:")
    public native void setMiterLimit(float v);
    @ObjCProperty public float miterLimit;

    @ObjCPropertyGetter(selector = "flatness")
    public native float getFlatness();
    @ObjCPropertySetter(selector = "setFlatness:")
    public native void setFlatness(float v);
    @ObjCProperty public float flatness;

    @ObjCPropertyGetter(selector = "usesEvenOddFillRule")
    public native boolean isUsesEvenOddFillRule();
    @ObjCPropertySetter(selector = "setUsesEvenOddFillRule:")
    public native void setUsesEvenOddFillRule(boolean v);
    @ObjCProperty public boolean usesEvenOddFillRule;
    
    @ObjCMethodSign(sign = "- (void)moveToPoint:(CGPoint)point;", selector = "moveToPoint:")
    public native void moveToPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (void)addLineToPoint:(CGPoint)point;", selector = "addLineToPoint:")
    public native void addLineToPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (void)addCurveToPoint:(CGPoint)endPoint controlPoint1:(CGPoint)controlPoint1 controlPoint2:(CGPoint)controlPoint2;", selector = "addCurveToPoint:controlPoint1:controlPoint2:")
    public native void addCurveToPoint$controlPoint1$controlPoint2$(@ObjCByValue CGPoint endPoint, @ObjCByValue CGPoint controlPoint1, @ObjCByValue CGPoint controlPoint2);

    @ObjCMethodSign(sign = "- (void)addQuadCurveToPoint:(CGPoint)endPoint controlPoint:(CGPoint)controlPoint;", selector = "addQuadCurveToPoint:controlPoint:")
    public native void addQuadCurveToPoint$controlPoint$(@ObjCByValue CGPoint endPoint, @ObjCByValue CGPoint controlPoint);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)addArcWithCenter:(CGPoint)center radius:(CGFloat)radius startAngle:(CGFloat)startAngle endAngle:(CGFloat)endAngle clockwise:(BOOL)clockwise NS_AVAILABLE_IOS(4_0);", selector = "addArcWithCenter:radius:startAngle:endAngle:clockwise:")
    public native void addArcWithCenter$radius$startAngle$endAngle$clockwise$(@ObjCByValue CGPoint center, float radius, float startAngle, float endAngle, boolean clockwise);

    @ObjCMethodSign(sign = "- (void)closePath;", selector = "closePath")
    public native void closePath();

    @ObjCMethodSign(sign = "- (void)removeAllPoints;", selector = "removeAllPoints")
    public native void removeAllPoints();

    @ObjCMethodSign(sign = "- (void)appendPath:(UIBezierPath *)bezierPath;", selector = "appendPath:")
    public native void appendPath$(UIBezierPath bezierPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIBezierPath *)bezierPathByReversingPath NS_AVAILABLE_IOS(6_0);", selector = "bezierPathByReversingPath")
    public native UIBezierPath bezierPathByReversingPath();

    @ObjCMethodSign(sign = "- (void)applyTransform:(CGAffineTransform)transform;", selector = "applyTransform:")
    public native void applyTransform$(@ObjCByValue CGAffineTransform transform);

    @ObjCMethodSign(sign = "- (BOOL)containsPoint:(CGPoint)point;", selector = "containsPoint:")
    public native boolean containsPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (void)setLineDash:(const CGFloat *)pattern count:(NSInteger)count phase:(CGFloat)phase;", selector = "setLineDash:count:phase:")
    public native void setLineDash$count$phase$(float[] pattern, @NSInteger long count, float phase);

    @ObjCMethodSign(sign = "- (void)getLineDash:(CGFloat *)pattern count:(NSInteger *)count phase:(CGFloat *)phase;", selector = "getLineDash:count:phase:")
    public native void getLineDash$count$phase$(float[] pattern, @NSInteger long[] count, float[] phase);

    @ObjCMethodSign(sign = "- (void)fill;", selector = "fill")
    public native void fill();

    @ObjCMethodSign(sign = "- (void)stroke;", selector = "stroke")
    public native void stroke();

    @ObjCMethodSign(sign = "- (void)fillWithBlendMode:(CGBlendMode)blendMode alpha:(CGFloat)alpha;", selector = "fillWithBlendMode:alpha:")
    public native void fillWithBlendMode$alpha$(CGBlendMode blendMode, float alpha);

    @ObjCMethodSign(sign = "- (void)strokeWithBlendMode:(CGBlendMode)blendMode alpha:(CGFloat)alpha;", selector = "strokeWithBlendMode:alpha:")
    public native void strokeWithBlendMode$alpha$(CGBlendMode blendMode, float alpha);

    @ObjCMethodSign(sign = "- (void)addClip;", selector = "addClip")
    public native void addClip();

    @ObjCMethodSign(sign = "+ (UIBezierPath *)bezierPath;", selector = "bezierPath")
    public static native UIBezierPath bezierPath();

    @ObjCMethodSign(sign = "+ (UIBezierPath *)bezierPathWithRect:(CGRect)rect;", selector = "bezierPathWithRect:")
    public static native UIBezierPath bezierPathWithRect$(@ObjCByValue CGRect rect);

    @ObjCMethodSign(sign = "+ (UIBezierPath *)bezierPathWithOvalInRect:(CGRect)rect;", selector = "bezierPathWithOvalInRect:")
    public static native UIBezierPath bezierPathWithOvalInRect$(@ObjCByValue CGRect rect);

    @ObjCMethodSign(sign = "+ (UIBezierPath *)bezierPathWithRoundedRect:(CGRect)rect cornerRadius:(CGFloat)cornerRadius;", selector = "bezierPathWithRoundedRect:cornerRadius:")
    public static native UIBezierPath bezierPathWithRoundedRect$cornerRadius$(@ObjCByValue CGRect rect, float cornerRadius);

    @ObjCMethodSign(sign = "+ (UIBezierPath *)bezierPathWithRoundedRect:(CGRect)rect byRoundingCorners:(UIRectCorner)corners cornerRadii:(CGSize)cornerRadii;", selector = "bezierPathWithRoundedRect:byRoundingCorners:cornerRadii:")
    public static native UIBezierPath bezierPathWithRoundedRect$byRoundingCorners$cornerRadii$(@ObjCByValue CGRect rect, UIRectCorner corners, @ObjCByValue CGSize cornerRadii);

    @ObjCMethodSign(sign = "+ (UIBezierPath *)bezierPathWithArcCenter:(CGPoint)center radius:(CGFloat)radius startAngle:(CGFloat)startAngle endAngle:(CGFloat)endAngle clockwise:(BOOL)clockwise;", selector = "bezierPathWithArcCenter:radius:startAngle:endAngle:clockwise:")
    public static native UIBezierPath bezierPathWithArcCenter$radius$startAngle$endAngle$clockwise$(@ObjCByValue CGPoint center, float radius, float startAngle, float endAngle, boolean clockwise);

    @ObjCMethodSign(sign = "+ (UIBezierPath *)bezierPathWithCGPath:(CGPathRef)CGPath;", selector = "bezierPathWithCGPath:")
    public static native UIBezierPath bezierPathWithCGPath$(CGPath CGPath);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIBezierPath initWithCoder$(NSCoder aDecoder);
}
