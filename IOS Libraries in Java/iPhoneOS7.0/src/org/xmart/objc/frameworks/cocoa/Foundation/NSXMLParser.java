package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSXMLParser extends NSObject  {
    
    public NSXMLParser() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithContentsOfURL:(NSURL *)url;", selector = "initWithContentsOfURL:")
    public native NSXMLParser initWithContentsOfURL$(NSURL url);

    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data;", selector = "initWithData:")
    public native NSXMLParser initWithData$(NSData data);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithStream:(NSInputStream *)stream NS_AVAILABLE(10_7, 5_0);", selector = "initWithStream:")
    public native NSXMLParser initWithStream$(NSInputStream stream);

    @ObjCMethodSign(sign = "- (id <NSXMLParserDelegate>)delegate;", selector = "delegate")
    public native NSXMLParserDelegate delegate();

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSXMLParserDelegate>)delegate;", selector = "setDelegate:")
    public native void setDelegate(NSXMLParserDelegate delegate);

    @ObjCMethodSign(sign = "- (void)setShouldProcessNamespaces:(BOOL)shouldProcessNamespaces;", selector = "setShouldProcessNamespaces:")
    public native void setShouldProcessNamespaces(boolean shouldProcessNamespaces);

    @ObjCMethodSign(sign = "- (void)setShouldReportNamespacePrefixes:(BOOL)shouldReportNamespacePrefixes;", selector = "setShouldReportNamespacePrefixes:")
    public native void setShouldReportNamespacePrefixes(boolean shouldReportNamespacePrefixes);

    @ObjCMethodSign(sign = "- (void)setShouldResolveExternalEntities:(BOOL)shouldResolveExternalEntities;", selector = "setShouldResolveExternalEntities:")
    public native void setShouldResolveExternalEntities(boolean shouldResolveExternalEntities);

    @ObjCMethodSign(sign = "- (BOOL)shouldProcessNamespaces;", selector = "shouldProcessNamespaces")
    public native boolean shouldProcessNamespaces();

    @ObjCMethodSign(sign = "- (BOOL)shouldReportNamespacePrefixes;", selector = "shouldReportNamespacePrefixes")
    public native boolean shouldReportNamespacePrefixes();

    @ObjCMethodSign(sign = "- (BOOL)shouldResolveExternalEntities;", selector = "shouldResolveExternalEntities")
    public native boolean shouldResolveExternalEntities();

    @ObjCMethodSign(sign = "- (BOOL)parse;", selector = "parse")
    public native boolean parse();

    @ObjCMethodSign(sign = "- (void)abortParsing;", selector = "abortParsing")
    public native void abortParsing();

    @ObjCMethodSign(sign = "- (NSError *)parserError;", selector = "parserError")
    public native NSError parserError();

    @ObjCCategoryMethod(catname = "NSXMLParserLocatorAdditions", catownername = "NSXMLParser")
    @ObjCMethodSign(sign = "- (NSString *)publicID;", selector = "publicID")
    public native NSString publicID();

    @ObjCCategoryMethod(catname = "NSXMLParserLocatorAdditions", catownername = "NSXMLParser")
    @ObjCMethodSign(sign = "- (NSString *)systemID;", selector = "systemID")
    public native NSString systemID();

    @ObjCCategoryMethod(catname = "NSXMLParserLocatorAdditions", catownername = "NSXMLParser")
    @ObjCMethodSign(sign = "- (NSInteger)lineNumber;", selector = "lineNumber")
    public native @NSInteger long lineNumber();

    @ObjCCategoryMethod(catname = "NSXMLParserLocatorAdditions", catownername = "NSXMLParser")
    @ObjCMethodSign(sign = "- (NSInteger)columnNumber;", selector = "columnNumber")
    public native @NSInteger long columnNumber();
}
