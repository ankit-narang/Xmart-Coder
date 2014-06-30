package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIWebViewDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (BOOL)webView:(UIWebView *)webView shouldStartLoadWithRequest:(NSURLRequest *)request navigationType:(UIWebViewNavigationType)navigationType;", selector = "webView:shouldStartLoadWithRequest:navigationType:")
    boolean webView$shouldStartLoadWithRequest$navigationType$(UIWebView webView, NSURLRequest request, UIWebViewNavigationType navigationType);

    @ObjCMethodSign(sign = "- (void)webViewDidStartLoad:(UIWebView *)webView;", selector = "webViewDidStartLoad:")
    void webViewDidStartLoad$(UIWebView webView);

    @ObjCMethodSign(sign = "- (void)webViewDidFinishLoad:(UIWebView *)webView;", selector = "webViewDidFinishLoad:")
    void webViewDidFinishLoad$(UIWebView webView);

    @ObjCMethodSign(sign = "- (void)webView:(UIWebView *)webView didFailLoadWithError:(NSError *)error;", selector = "webView:didFailLoadWithError:")
    void webView$didFailLoadWithError$(UIWebView webView, NSError error);
}
