package mygwtproject.client.testApp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;

public class TestApp extends Composite {

	private static TestAppUiBinder uiBinder = GWT.create(TestAppUiBinder.class);
	@UiField Hyperlink MusicLink;
	@UiField Hyperlink DanceLink;
	@UiField Hyperlink HomeLink;

	interface TestAppUiBinder extends UiBinder<Widget, TestApp> {
	}

	public TestApp() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setPage(String token){
	     if(token.isEmpty()){	  
	          History.newItem("homePG");
	      } else {
	    	  changePage(token);
	      }
	}
	
	public void onValueChange(ValueChangeEvent event) {
	    changePage(History.getToken());
	}
	
	// Navigation through the links
	
	public void changePage(String token) {
		 if(token.equals("homePG")) { 
			 RootPanel.get().clear();
		     RootPanel.get().getElement().getStyle().setPosition(Position.RELATIVE); 
		     RootPanel.get().add(new TestApp());
		     RootPanel.get().add(new testAppHome());
			 
	      }  else if (token.equals("musicPG")) {
	    	  
	    	     RootPanel.get().clear();
			     RootPanel.get().getElement().getStyle().setPosition(Position.RELATIVE); 
			     RootPanel.get().add(new TestApp());
			     RootPanel.get().add(new testAppMusic());
	    	  
	      }  else if (token.equals("dancePG")) {
	    	     RootPanel.get().clear();
			     RootPanel.get().getElement().getStyle().setPosition(Position.RELATIVE); 
			     RootPanel.get().add(new TestApp());
			     RootPanel.get().add(new testAppDance());
	      }
		
	}
	
	@UiHandler("HomeLink")
	void onHomeLinkClick(ClickEvent event) {
		setPage("homePG");
		
	}
	@UiHandler("MusicLink")
	void onMusicLinkClick(ClickEvent event) {
		setPage("musicPG");
	//System.out.println(History.getToken());
	}
	@UiHandler("DanceLink")
	void onDanceLinkClick(ClickEvent event) {
		setPage("dancePG");
	}
}
