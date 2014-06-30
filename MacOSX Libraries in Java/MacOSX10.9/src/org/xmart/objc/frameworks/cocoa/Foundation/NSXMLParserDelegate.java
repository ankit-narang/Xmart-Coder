package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSXMLParserDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)parserDidStartDocument:(NSXMLParser *)parser;", selector = "parserDidStartDocument:")
    void parserDidStartDocument$(NSXMLParser parser);

    @ObjCMethodSign(sign = "- (void)parserDidEndDocument:(NSXMLParser *)parser;", selector = "parserDidEndDocument:")
    void parserDidEndDocument$(NSXMLParser parser);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundNotationDeclarationWithName:(NSString *)name publicID:(NSString *)publicID systemID:(NSString *)systemID;", selector = "parser:foundNotationDeclarationWithName:publicID:systemID:")
    void parser$foundNotationDeclarationWithName$publicID$systemID$(NSXMLParser parser, NSString name, NSString publicID, NSString systemID);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundUnparsedEntityDeclarationWithName:(NSString *)name publicID:(NSString *)publicID systemID:(NSString *)systemID notationName:(NSString *)notationName;", selector = "parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:")
    void parser$foundUnparsedEntityDeclarationWithName$publicID$systemID$notationName$(NSXMLParser parser, NSString name, NSString publicID, NSString systemID, NSString notationName);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundAttributeDeclarationWithName:(NSString *)attributeName forElement:(NSString *)elementName type:(NSString *)type defaultValue:(NSString *)defaultValue;", selector = "parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:")
    void parser$foundAttributeDeclarationWithName$forElement$type$defaultValue$(NSXMLParser parser, NSString attributeName, NSString elementName, NSString type, NSString defaultValue);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundElementDeclarationWithName:(NSString *)elementName model:(NSString *)model;", selector = "parser:foundElementDeclarationWithName:model:")
    void parser$foundElementDeclarationWithName$model$(NSXMLParser parser, NSString elementName, NSString model);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundInternalEntityDeclarationWithName:(NSString *)name value:(NSString *)value;", selector = "parser:foundInternalEntityDeclarationWithName:value:")
    void parser$foundInternalEntityDeclarationWithName$value$(NSXMLParser parser, NSString name, NSString value);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundExternalEntityDeclarationWithName:(NSString *)name publicID:(NSString *)publicID systemID:(NSString *)systemID;", selector = "parser:foundExternalEntityDeclarationWithName:publicID:systemID:")
    void parser$foundExternalEntityDeclarationWithName$publicID$systemID$(NSXMLParser parser, NSString name, NSString publicID, NSString systemID);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser didStartElement:(NSString *)elementName namespaceURI:(NSString *)namespaceURI qualifiedName:(NSString *)qName attributes:(NSDictionary *)attributeDict;", selector = "parser:didStartElement:namespaceURI:qualifiedName:attributes:")
    void parser$didStartElement$namespaceURI$qualifiedName$attributes$(NSXMLParser parser, NSString elementName, NSString namespaceURI, NSString qName, NSDictionary attributeDict);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser didEndElement:(NSString *)elementName namespaceURI:(NSString *)namespaceURI qualifiedName:(NSString *)qName;", selector = "parser:didEndElement:namespaceURI:qualifiedName:")
    void parser$didEndElement$namespaceURI$qualifiedName$(NSXMLParser parser, NSString elementName, NSString namespaceURI, NSString qName);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser didStartMappingPrefix:(NSString *)prefix toURI:(NSString *)namespaceURI;", selector = "parser:didStartMappingPrefix:toURI:")
    void parser$didStartMappingPrefix$toURI$(NSXMLParser parser, NSString prefix, NSString namespaceURI);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser didEndMappingPrefix:(NSString *)prefix;", selector = "parser:didEndMappingPrefix:")
    void parser$didEndMappingPrefix$(NSXMLParser parser, NSString prefix);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundCharacters:(NSString *)string;", selector = "parser:foundCharacters:")
    void parser$foundCharacters$(NSXMLParser parser, NSString string);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundIgnorableWhitespace:(NSString *)whitespaceString;", selector = "parser:foundIgnorableWhitespace:")
    void parser$foundIgnorableWhitespace$(NSXMLParser parser, NSString whitespaceString);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundProcessingInstructionWithTarget:(NSString *)target data:(NSString *)data;", selector = "parser:foundProcessingInstructionWithTarget:data:")
    void parser$foundProcessingInstructionWithTarget$data$(NSXMLParser parser, NSString target, NSString data);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundComment:(NSString *)comment;", selector = "parser:foundComment:")
    void parser$foundComment$(NSXMLParser parser, NSString comment);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser foundCDATA:(NSData *)CDATABlock;", selector = "parser:foundCDATA:")
    void parser$foundCDATA$(NSXMLParser parser, NSData CDATABlock);

    @ObjCMethodSign(sign = "- (NSData *)parser:(NSXMLParser *)parser resolveExternalEntityName:(NSString *)name systemID:(NSString *)systemID;", selector = "parser:resolveExternalEntityName:systemID:")
    NSData parser$resolveExternalEntityName$systemID$(NSXMLParser parser, NSString name, NSString systemID);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser parseErrorOccurred:(NSError *)parseError;", selector = "parser:parseErrorOccurred:")
    void parser$parseErrorOccurred$(NSXMLParser parser, NSError parseError);

    @ObjCMethodSign(sign = "- (void)parser:(NSXMLParser *)parser validationErrorOccurred:(NSError *)validationError;", selector = "parser:validationErrorOccurred:")
    void parser$validationErrorOccurred$(NSXMLParser parser, NSError validationError);
}
