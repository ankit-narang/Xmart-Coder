package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITableViewDataSource 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section;", selector = "tableView:numberOfRowsInSection:")
    @NSInteger long tableView$numberOfRowsInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:cellForRowAtIndexPath:")
    UITableViewCell tableView$cellForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView;", selector = "numberOfSectionsInTableView:")
    @NSInteger long numberOfSectionsInTableView$(UITableView tableView);

    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)section;", selector = "tableView:titleForHeaderInSection:")
    NSString tableView$titleForHeaderInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForFooterInSection:(NSInteger)section;", selector = "tableView:titleForFooterInSection:")
    NSString tableView$titleForFooterInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:canEditRowAtIndexPath:")
    boolean tableView$canEditRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canMoveRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:canMoveRowAtIndexPath:")
    boolean tableView$canMoveRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSArray *)sectionIndexTitlesForTableView:(UITableView *)tableView;", selector = "sectionIndexTitlesForTableView:")
    NSArray sectionIndexTitlesForTableView$(UITableView tableView);

    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView sectionForSectionIndexTitle:(NSString *)title atIndex:(NSInteger)index;", selector = "tableView:sectionForSectionIndexTitle:atIndex:")
    @NSInteger long tableView$sectionForSectionIndexTitle$atIndex$(UITableView tableView, NSString title, @NSInteger long index);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:commitEditingStyle:forRowAtIndexPath:")
    void tableView$commitEditingStyle$forRowAtIndexPath$(UITableView tableView, UITableViewCellEditingStyle editingStyle, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView moveRowAtIndexPath:(NSIndexPath *)sourceIndexPath toIndexPath:(NSIndexPath *)destinationIndexPath;", selector = "tableView:moveRowAtIndexPath:toIndexPath:")
    void tableView$moveRowAtIndexPath$toIndexPath$(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
}
