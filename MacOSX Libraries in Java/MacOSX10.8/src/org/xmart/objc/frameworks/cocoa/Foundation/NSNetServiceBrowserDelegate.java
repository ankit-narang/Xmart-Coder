package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSNetServiceBrowserDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)netServiceBrowserWillSearch:(NSNetServiceBrowser *)aNetServiceBrowser;", selector = "netServiceBrowserWillSearch:")
    void netServiceBrowserWillSearch$(NSNetServiceBrowser aNetServiceBrowser);

    @ObjCMethodSign(sign = "- (void)netServiceBrowserDidStopSearch:(NSNetServiceBrowser *)aNetServiceBrowser;", selector = "netServiceBrowserDidStopSearch:")
    void netServiceBrowserDidStopSearch$(NSNetServiceBrowser aNetServiceBrowser);

    @ObjCMethodSign(sign = "- (void)netServiceBrowser:(NSNetServiceBrowser *)aNetServiceBrowser didNotSearch:(NSDictionary *)errorDict;", selector = "netServiceBrowser:didNotSearch:")
    void netServiceBrowser$didNotSearch$(NSNetServiceBrowser aNetServiceBrowser, NSDictionary errorDict);

    @ObjCMethodSign(sign = "- (void)netServiceBrowser:(NSNetServiceBrowser *)aNetServiceBrowser didFindDomain:(NSString *)domainString moreComing:(BOOL)moreComing;", selector = "netServiceBrowser:didFindDomain:moreComing:")
    void netServiceBrowser$didFindDomain$moreComing$(NSNetServiceBrowser aNetServiceBrowser, NSString domainString, boolean moreComing);

    @ObjCMethodSign(sign = "- (void)netServiceBrowser:(NSNetServiceBrowser *)aNetServiceBrowser didFindService:(NSNetService *)aNetService moreComing:(BOOL)moreComing;", selector = "netServiceBrowser:didFindService:moreComing:")
    void netServiceBrowser$didFindService$moreComing$(NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService, boolean moreComing);

    @ObjCMethodSign(sign = "- (void)netServiceBrowser:(NSNetServiceBrowser *)aNetServiceBrowser didRemoveDomain:(NSString *)domainString moreComing:(BOOL)moreComing;", selector = "netServiceBrowser:didRemoveDomain:moreComing:")
    void netServiceBrowser$didRemoveDomain$moreComing$(NSNetServiceBrowser aNetServiceBrowser, NSString domainString, boolean moreComing);

    @ObjCMethodSign(sign = "- (void)netServiceBrowser:(NSNetServiceBrowser *)aNetServiceBrowser didRemoveService:(NSNetService *)aNetService moreComing:(BOOL)moreComing;", selector = "netServiceBrowser:didRemoveService:moreComing:")
    void netServiceBrowser$didRemoveService$moreComing$(NSNetServiceBrowser aNetServiceBrowser, NSNetService aNetService, boolean moreComing);
}
