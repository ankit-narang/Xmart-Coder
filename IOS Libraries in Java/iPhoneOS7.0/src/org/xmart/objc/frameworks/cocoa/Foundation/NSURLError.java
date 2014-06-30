package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLError {
    NSURLErrorUnknown($Foundation.NSURLErrorUnknown),
    NSURLErrorCancelled($Foundation.NSURLErrorCancelled),
    NSURLErrorBadURL($Foundation.NSURLErrorBadURL),
    NSURLErrorTimedOut($Foundation.NSURLErrorTimedOut),
    NSURLErrorUnsupportedURL($Foundation.NSURLErrorUnsupportedURL),
    NSURLErrorCannotFindHost($Foundation.NSURLErrorCannotFindHost),
    NSURLErrorCannotConnectToHost($Foundation.NSURLErrorCannotConnectToHost),
    NSURLErrorNetworkConnectionLost($Foundation.NSURLErrorNetworkConnectionLost),
    NSURLErrorDNSLookupFailed($Foundation.NSURLErrorDNSLookupFailed),
    NSURLErrorHTTPTooManyRedirects($Foundation.NSURLErrorHTTPTooManyRedirects),
    NSURLErrorResourceUnavailable($Foundation.NSURLErrorResourceUnavailable),
    NSURLErrorNotConnectedToInternet($Foundation.NSURLErrorNotConnectedToInternet),
    NSURLErrorRedirectToNonExistentLocation($Foundation.NSURLErrorRedirectToNonExistentLocation),
    NSURLErrorBadServerResponse($Foundation.NSURLErrorBadServerResponse),
    NSURLErrorUserCancelledAuthentication($Foundation.NSURLErrorUserCancelledAuthentication),
    NSURLErrorUserAuthenticationRequired($Foundation.NSURLErrorUserAuthenticationRequired),
    NSURLErrorZeroByteResource($Foundation.NSURLErrorZeroByteResource),
    NSURLErrorCannotDecodeRawData($Foundation.NSURLErrorCannotDecodeRawData),
    NSURLErrorCannotDecodeContentData($Foundation.NSURLErrorCannotDecodeContentData),
    NSURLErrorCannotParseResponse($Foundation.NSURLErrorCannotParseResponse),
    NSURLErrorFileDoesNotExist($Foundation.NSURLErrorFileDoesNotExist),
    NSURLErrorFileIsDirectory($Foundation.NSURLErrorFileIsDirectory),
    NSURLErrorNoPermissionsToReadFile($Foundation.NSURLErrorNoPermissionsToReadFile),
    /**
     * @since Available in iOS 2.0 and later.
     */
    NSURLErrorDataLengthExceedsMaximum($Foundation.NSURLErrorDataLengthExceedsMaximum),
    NSURLErrorSecureConnectionFailed($Foundation.NSURLErrorSecureConnectionFailed),
    NSURLErrorServerCertificateHasBadDate($Foundation.NSURLErrorServerCertificateHasBadDate),
    NSURLErrorServerCertificateUntrusted($Foundation.NSURLErrorServerCertificateUntrusted),
    NSURLErrorServerCertificateHasUnknownRoot($Foundation.NSURLErrorServerCertificateHasUnknownRoot),
    NSURLErrorServerCertificateNotYetValid($Foundation.NSURLErrorServerCertificateNotYetValid),
    NSURLErrorClientCertificateRejected($Foundation.NSURLErrorClientCertificateRejected),
    NSURLErrorClientCertificateRequired($Foundation.NSURLErrorClientCertificateRequired),
    NSURLErrorCannotLoadFromNetwork($Foundation.NSURLErrorCannotLoadFromNetwork),
    NSURLErrorCannotCreateFile($Foundation.NSURLErrorCannotCreateFile),
    NSURLErrorCannotOpenFile($Foundation.NSURLErrorCannotOpenFile),
    NSURLErrorCannotCloseFile($Foundation.NSURLErrorCannotCloseFile),
    NSURLErrorCannotWriteToFile($Foundation.NSURLErrorCannotWriteToFile),
    NSURLErrorCannotRemoveFile($Foundation.NSURLErrorCannotRemoveFile),
    NSURLErrorCannotMoveFile($Foundation.NSURLErrorCannotMoveFile),
    NSURLErrorDownloadDecodingFailedMidStream($Foundation.NSURLErrorDownloadDecodingFailedMidStream),
    NSURLErrorDownloadDecodingFailedToComplete($Foundation.NSURLErrorDownloadDecodingFailedToComplete),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSURLErrorInternationalRoamingOff($Foundation.NSURLErrorInternationalRoamingOff),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSURLErrorCallIsActive($Foundation.NSURLErrorCallIsActive),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSURLErrorDataNotAllowed($Foundation.NSURLErrorDataNotAllowed),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSURLErrorRequestBodyStreamExhausted($Foundation.NSURLErrorRequestBodyStreamExhausted);

    private final long value;

    private NSURLError(long value) { this.value = value; }
}
