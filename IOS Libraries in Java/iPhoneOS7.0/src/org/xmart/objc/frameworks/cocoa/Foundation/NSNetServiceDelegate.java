package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSNetServiceDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)netServiceWillPublish:(NSNetService *)sender;", selector = "netServiceWillPublish:")
    void netServiceWillPublish$(NSNetService sender);

    @ObjCMethodSign(sign = "- (void)netServiceDidPublish:(NSNetService *)sender;", selector = "netServiceDidPublish:")
    void netServiceDidPublish$(NSNetService sender);

    @ObjCMethodSign(sign = "- (void)netService:(NSNetService *)sender didNotPublish:(NSDictionary *)errorDict;", selector = "netService:didNotPublish:")
    void netService$didNotPublish$(NSNetService sender, NSDictionary errorDict);

    @ObjCMethodSign(sign = "- (void)netServiceWillResolve:(NSNetService *)sender;", selector = "netServiceWillResolve:")
    void netServiceWillResolve$(NSNetService sender);

    @ObjCMethodSign(sign = "- (void)netServiceDidResolveAddress:(NSNetService *)sender;", selector = "netServiceDidResolveAddress:")
    void netServiceDidResolveAddress$(NSNetService sender);

    @ObjCMethodSign(sign = "- (void)netService:(NSNetService *)sender didNotResolve:(NSDictionary *)errorDict;", selector = "netService:didNotResolve:")
    void netService$didNotResolve$(NSNetService sender, NSDictionary errorDict);

    @ObjCMethodSign(sign = "- (void)netServiceDidStop:(NSNetService *)sender;", selector = "netServiceDidStop:")
    void netServiceDidStop$(NSNetService sender);

    @ObjCMethodSign(sign = "- (void)netService:(NSNetService *)sender didUpdateTXTRecordData:(NSData *)data;", selector = "netService:didUpdateTXTRecordData:")
    void netService$didUpdateTXTRecordData$(NSNetService sender, NSData data);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)netService:(NSNetService *)sender didAcceptConnectionWithInputStream:(NSInputStream *)inputStream outputStream:(NSOutputStream *)outputStream NS_AVAILABLE(10_9, 7_0);", selector = "netService:didAcceptConnectionWithInputStream:outputStream:")
    void netService$didAcceptConnectionWithInputStream$outputStream$(NSNetService sender, NSInputStream inputStream, NSOutputStream outputStream);
}
