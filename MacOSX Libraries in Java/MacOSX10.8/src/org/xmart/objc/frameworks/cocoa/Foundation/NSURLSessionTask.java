package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLSessionTask extends NSObject implements NSCopying {
    
    public NSURLSessionTask() {}
    @ObjCPropertyGetter(selector = "taskIdentifier")
    public native @NSUInteger long getTaskIdentifier();
    @ObjCProperty public @NSUInteger long taskIdentifier;

    @ObjCPropertyGetter(selector = "originalRequest")
    public native NSURLRequest getOriginalRequest();
    @ObjCProperty public NSURLRequest originalRequest;

    @ObjCPropertyGetter(selector = "currentRequest")
    public native NSURLRequest getCurrentRequest();
    @ObjCProperty public NSURLRequest currentRequest;

    @ObjCPropertyGetter(selector = "response")
    public native NSURLResponse getResponse();
    @ObjCProperty public NSURLResponse response;

    @ObjCPropertyGetter(selector = "countOfBytesReceived")
    public native @LongLong long getCountOfBytesReceived();
    @ObjCProperty public @LongLong long countOfBytesReceived;

    @ObjCPropertyGetter(selector = "countOfBytesSent")
    public native @LongLong long getCountOfBytesSent();
    @ObjCProperty public @LongLong long countOfBytesSent;

    @ObjCPropertyGetter(selector = "countOfBytesExpectedToSend")
    public native @LongLong long getCountOfBytesExpectedToSend();
    @ObjCProperty public @LongLong long countOfBytesExpectedToSend;

    @ObjCPropertyGetter(selector = "countOfBytesExpectedToReceive")
    public native @LongLong long getCountOfBytesExpectedToReceive();
    @ObjCProperty public @LongLong long countOfBytesExpectedToReceive;

    @ObjCPropertyGetter(selector = "taskDescription")
    public native NSString getTaskDescription();
    @ObjCPropertySetter(selector = "setTaskDescription:")
    public native void setTaskDescription(NSString v);
    @ObjCProperty public NSString taskDescription;

    @ObjCPropertyGetter(selector = "state")
    public native NSURLSessionTaskState getState();
    @ObjCProperty public NSURLSessionTaskState state;

    @ObjCPropertyGetter(selector = "error")
    public native NSError getError();
    @ObjCProperty public NSError error;
    
    @ObjCMethodSign(sign = "- (void)cancel;", selector = "cancel")
    public native void cancel();

    @ObjCMethodSign(sign = "- (void)suspend;", selector = "suspend")
    public native void suspend();

    @ObjCMethodSign(sign = "- (void)resume;", selector = "resume")
    public native void resume();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
