<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Save RevisionSave and Check InDiscard _52ac35_1</name>
   <tag></tag>
   <elementGuidId>927f90db-7232-4108-b1d5-f4b23c2a9e4c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#ext-gen1018</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//body[@id='ext-gen1018']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>x-body x-webkit x-chrome x-layout-fit x-border-box x-container x-container-default</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>ext-gen1018</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>Save Revision Save and Check In Discard Changes Close   Smart Document            SECTION  ShortFormArticle1   Teaser   Body Loading...HomeInsertReviewReferencesRegionTable UndoKeyboard shortcut Ctrl+Z RedoKeyboard shortcut Ctrl+YNormalNormal BoldKeyboard shortcut Ctrl+B ItalicKeyboard shortcut Ctrl+I UnderlineKeyboard shortcut Ctrl+U Strikethrough Subscript Superscript Insert/Remove Bulleted ListKeyboard shortcut Alt+Shift+U Insert/Remove Numbered ListKeyboard shortcut Alt+Shift+O Align Image Left Align Image Right Remove Text Wrapping Increase Indent Decrease Indent FindKeyboard shortcut Alt+Shift+F ReplaceKeyboard shortcut Alt+Shift+H Refresh XML Article Tagging Component Tagging Insert Fundamental Table  Article Number: 357229Document InvalidatedYour recent changes caused an error in validating the content of this document against the permitted structure for this document type.Click here to recover the last valid version - While this document is in an invalid state all content changes will be periodically backed up on your local storage and will be accessible via the History pane even after you close and re-open the editor.Click here to access your document save historyView Details|Copy Error DetailsError Saving DocumentThe document could not be saved due to an error.Changes will be backed up on your local storage and will be accessible via the History pane even after you close and re-open the editor.View Error DetailsRich Text Editor, xml_editor_panelEditor toolbars Insert Region Insert Region from Server Insert Image Insert symbol Attach File Add CommentKeyboard shortcut Alt+Shift+C Remove Comment Hide All Comments Show Previous Comment Show Next Comment Track ChangesKeyboard shortcut Alt+Shift+E Highlight Changes Show Previous Change Show Next Change Accept and Move to NextKeyboard shortcut Ctrl+Alt+A Reject and Move to NextKeyboard shortcut Ctrl+Alt+R Accept Reject Spelling and Grammar LinkKeyboard shortcut Ctrl+K Insert Cross Reference Synchronize Cross Reference Create Table Component Replace Table from Server Create Region Component Replace Region from Server Edit Component Save Component Save &amp; Close Component Discard Changes Remove Component Reference Pin Component Reference Unpin Component ReferenceRegion TypesNone Region Title Insert Paragraph AfterKeyboard shortcut Ctrl+Enter Remove RegionTable TypesNormal Caption Description Insert Paragraph After Insert Row Above Insert Row Below Insert Column to the Left Insert Column to the Right Split Cell Horizontally Split Cell Vertically Merge Cells Delete Rows Delete Columns Delete TableShortFormArticle1TeaserSample teaeserBodySample body test textPress ALT 0 for help Words: 9PreviewChangesPropertiesHistoryRefers toWhere used        Click to generate preview.TeTestQA1Editing Since Today, 15:47AuthoringLoading...  NameValueLast ModifiedLast ModifierChecked Out by  NameValueLast ModifiedLast ModifierChecked Out by
		 QXmlEditorCore.init(null,'qpp://assets/357229', 'Short Form Article','/workspace/editor/config/Short Form Article/editor-config.js', false,false, 'en', '');
	

	
		var selectedLanguage = &quot;en&quot;;
		var loggedInUserId = &quot;40&quot;;
		var userSessionId = &quot;0191ae1c-e6d6-4e75-8a5a-8d4e6e35d992&quot;;
		
		var interval;
		
			var enableAutoSave = true;
			
				interval = 300000;
			
			QXmlEditorEx.setAutoSave(enableAutoSave, interval);
			QXmlEditorEx.setAutoSaveRevisionStorage('local');
		
		QXmlEditorEx.configureSnapshot(10);
		QXmlEditorEx.setLoggedInUserId(loggedInUserId);
		QXmlEditorEx.setLoggedInUserName(Ext.util.Format.htmlDecode('TestQA1'));
		QXmlEditorEx.setLoggedInUserTrackColor(&quot;#000000&quot;);
		QXmlEditorEx.setLoggedInUserTrackDeletionColor(&quot;#000000&quot;);
		QXmlEditorEx.setLocale(&quot;en&quot;);
		
				QXmlEditorEx.setEnableTrackingByDefault(false);
		
		
				QXmlEditorEx.setEnableHighlightingByDefault(false);
		
		QXmlEditorEx.setTrackingColorMap(colorMap);
		QXmlEditorEx.setAllTrackedDeletionInOneColor(false);

		QXmlEditorUtils.setRootContext(&quot;/workspace&quot;);
		PlatformSessionManager.init(2700000);
		
			PrivilegeManager.setPrivilege(&quot;LIVE_PREVIEW&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;CHECKIN_WITHOUT_DIALOG&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;VIEW_ALL_REVISIONS&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;PUBLISH_AS_PDF&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;PUBLISH_AS_HTML5_PUBLICATION&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;CREATE_MODIFY_QUERIES&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;ENABLE_DISABLE_TRACKING&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;ACCEPT_REJECT_REDLINE_CHANGES&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;ALLOW_COLLECTION_BROWSING&quot;, true);
		
			PrivilegeManager.setPrivilege(&quot;PUBLISH_AS_HTML&quot;, true);
		
		// Confirmation prompt will be shown if exitStatus is false.
		// Make exitStatus as true for all cases where the prompt is not desired.
		var exitStatus = false;
		// Do not show warning in IE only as S&amp;P don't require it
		//if(!Ext.isIE) {
			window.onbeforeunload = function() {
	  	 		if(exitStatus || !(QXmlEditorEx.isDirty())){
					return;
				}else{
					return &quot;YOU HAVE NOT SAVED YOUR CHANGES\n\nTo SAVE click Cancel / Stay on this page and click Save before proceeding\n\nTo continue WITHOUT SAVING, click OK / Leave this page&quot;;
				}
			};
		//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	

id(&quot;checkInDlg-1161-ghost_header_hd&quot;) Upgrading old attachments...Loading...Loading...Loading... EditSaveSave and CloseDiscard ChangesCreate ComponentRefresh ComponentPin Component ReferenceUnpin Component ReferenceRemove Component ReferenceDeleteReplace from ServerPromoteDemoteConvert ToInsert BeforeInsert AfterCheck In  Collections/Home/CreditSights/Short Form ArticleNameCollectionsHomeCreditSightsAggregatesArchivesCompany PageCovenant ReportDraft EmailLegacy TearSheetsLong Form ArticleMediaMorning CommentShared ResourcesShort Form ArticleSnippetsTempMonitoringNew RelicPerformance TestingTemplates    NameContent TypeWorkflowStatusRouted toCollectionNameFile Name:Major Version (1.0)Minor Version (0.2)More OptionsContent Type:Status:Workflow:Route to:Revision Comment:Target Publish Date:Reviewed By:SaveCancelLoading...Check In</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;ext-gen1018&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//body[@id='ext-gen1018']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//html[@id='ext-gen1086']/body</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
