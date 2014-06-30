package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIWebView extends UIView implements NSCoding, UIScrollViewDelegate {
    
    public UIWebView() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UIWebViewDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIWebViewDelegate v);
    @ObjCProperty public UIWebViewDelegate delegate;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "scrollView")
    public native UIScrollView getScrollView();
    @ObjCProperty public UIScrollView scrollView;

    @ObjCPropertyGetter(selector = "request")
    public native NSURLRequest getRequest();
    @ObjCProperty public NSURLRequest request;

    @ObjCPropertyGetter(selector = "canGoBack")
    public native boolean isCanGoBack();
    @ObjCProperty public boolean canGoBack;

    @ObjCPropertyGetter(selector = "canGoForward")
    public native boolean isCanGoForward();
    @ObjCProperty public boolean canGoForward;

    @ObjCPropertyGetter(selector = "isLoading")
    public native boolean isLoading();
    @ObjCProperty public boolean loading;

    @ObjCPropertyGetter(selector = "scalesPageToFit")
    public native boolean isScalesPageToFit();
    @ObjCPropertySetter(selector = "setScalesPageToFit:")
    public native void setScalesPageToFit(boolean v);
    @ObjCProperty public boolean scalesPageToFit;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "detectsPhoneNumbers")
    public native boolean isDetectsPhoneNumbers();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setDetectsPhoneNumbers:")
    public native void setDetectsPhoneNumbers(boolean v);
    @ObjCProperty public boolean detectsPhoneNumbers;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "dataDetectorTypes")
    public native UIDataDetectorTypes getDataDetectorTypes();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setDataDetectorTypes:")
    public native void setDataDetectorTypes(UIDataDetectorTypes v);
    @ObjCProperty public UIDataDetectorTypes dataDetectorTypes;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "allowsInlineMediaPlayback")
    public native boolean isAllowsInlineMediaPlayback();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setAllowsInlineMediaPlayback:")
    public native void setAllowsInlineMediaPlayback(boolean v);
    @ObjCProperty public boolean allowsInlineMediaPlayback;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "mediaPlaybackRequiresUserAction")
    public native boolean isMediaPlaybackRequiresUserAction();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setMediaPlaybackRequiresUserAction:")
    public native void setMediaPlaybackRequiresUserAction(boolean v);
    @ObjCProperty public boolean mediaPlaybackRequiresUserAction;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "mediaPlaybackAllowsAirPlay")
    public native boolean isMediaPlaybackAllowsAirPlay();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setMediaPlaybackAllowsAirPlay:")
    public native void setMediaPlaybackAllowsAirPlay(boolean v);
    @ObjCProperty public boolean mediaPlaybackAllowsAirPlay;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "suppressesIncrementalRendering")
    public native boolean isSuppressesIncrementalRendering();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setSuppressesIncrementalRendering:")
    public native void setSuppressesIncrementalRendering(boolean v);
    @ObjCProperty public boolean suppressesIncrementalRendering;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "keyboardDisplayRequiresUserAction")
    public native boolean isKeyboardDisplayRequiresUserAction();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setKeyboardDisplayRequiresUserAction:")
    public native void setKeyboardDisplayRequiresUserAction(boolean v);
    @ObjCProperty public boolean keyboardDisplayRequiresUserAction;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "paginationMode")
    public native UIWebPaginationMode getPaginationMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setPaginationMode:")
    public native void setPaginationMode(UIWebPaginationMode v);
    @ObjCProperty public UIWebPaginationMode paginationMode;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "paginationBreakingMode")
    public native UIWebPaginationBreakingMode getPaginationBreakingMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setPaginationBreakingMode:")
    public native void setPaginationBreakingMode(UIWebPaginationBreakingMode v);
    @ObjCProperty public UIWebPaginationBreakingMode paginationBreakingMode;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "pageLength")
    public native float getPageLength();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setPageLength:")
    public native void setPageLength(float v);
    @ObjCProperty public float pageLength;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "gapBetweenPages")
    public native float getGapBetweenPages();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setGapBetweenPages:")
    public native void setGapBetweenPages(float v);
    @ObjCProperty public float gapBetweenPages;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "pageCount")
    public native @NSUInteger long getPageCount();
    @ObjCProperty public @NSUInteger long pageCount;
    
    @ObjCMethodSign(sign = "- (void)loadRequest:(NSURLRequest *)request;", selector = "loadRequest:")
    public native void loadRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "- (void)loadHTMLString:(NSString *)string baseURL:(NSURL *)baseURL;", selector = "loadHTMLString:baseURL:")
    public native void loadHTMLString$baseURL$(NSString string, NSURL baseURL);

    @ObjCMethodSign(sign = "- (void)loadData:(NSData *)data MIMEType:(NSString *)MIMEType textEncodingName:(NSString *)textEncodingName baseURL:(NSURL *)baseURL;", selector = "loadData:MIMEType:textEncodingName:baseURL:")
    public native void loadData$MIMEType$textEncodingName$baseURL$(NSData data, NSString MIMEType, NSString textEncodingName, NSURL baseURL);

    @ObjCMethodSign(sign = "- (void)reload;", selector = "reload")
    public native void reload();

    @ObjCMethodSign(sign = "- (void)stopLoading;", selector = "stopLoading")
    public native void stopLoading();

    @ObjCMethodSign(sign = "- (void)goBack;", selector = "goBack")
    public native void goBack();

    @ObjCMethodSign(sign = "- (void)goForward;", selector = "goForward")
    public native void goForward();

    @ObjCMethodSign(sign = "- (NSString *)stringByEvaluatingJavaScriptFromString:(NSString *)script;", selector = "stringByEvaluatingJavaScriptFromString:")
    public native NSString stringByEvaluatingJavaScriptFromString$(NSString script);

    @ObjCMethodSign(sign = "- (void)scrollViewDidScroll:(UIScrollView *)scrollView;", selector = "scrollViewDidScroll:")
    public native void scrollViewDidScroll$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewDidZoom:(UIScrollView *)scrollView NS_AVAILABLE_IOS(3_2);", selector = "scrollViewDidZoom:")
    public native void scrollViewDidZoom$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDragging:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging$(UIScrollView scrollView);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillEndDragging:(UIScrollView *)scrollView withVelocity:(CGPoint)velocity targetContentOffset:(inout CGPoint *)targetContentOffset NS_AVAILABLE_IOS(5_0);", selector = "scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDragging$withVelocity$targetContentOffset$(UIScrollView scrollView, @ObjCByValue CGPoint velocity, CGPoint targetContentOffset);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDragging:(UIScrollView *)scrollView willDecelerate:(BOOL)decelerate;", selector = "scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDragging$willDecelerate$(UIScrollView scrollView, boolean decelerate);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndScrollingAnimation:(UIScrollView *)scrollView;", selector = "scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (UIView *)viewForZoomingInScrollView:(UIScrollView *)scrollView;", selector = "viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginZooming:(UIScrollView *)scrollView withView:(UIView *)view NS_AVAILABLE_IOS(3_2);", selector = "scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZooming$withView$(UIScrollView scrollView, UIView view);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndZooming:(UIScrollView *)scrollView withView:(UIView *)view atScale:(CGFloat)scale;", selector = "scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZooming$withView$atScale$(UIScrollView scrollView, UIView view, float scale);

    @ObjCMethodSign(sign = "- (BOOL)scrollViewShouldScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop$(UIScrollView scrollView);
}
